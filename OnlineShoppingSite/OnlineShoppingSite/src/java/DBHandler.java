
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa
 */
public class DBHandler {
          private static final String DB_URL = "jdbc:mysql://localhost/omega";
	private static final String DB_User = "root";
	private static final String DB_PWD = "1234";
	//private static final String UPDATE_CITY_BY_NAME = "update "
	private Connection conn = null;
	private void openConnection(){
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_User, DB_PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void closeConnection(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
         public boolean insertRecord(String n,String p,String m){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into contact (name,password,mail) values(?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                      
                      
                        
			int rows = pstmt.executeUpdate();
                      //  int rows1 = pstmt1.executeUpdate();
			if(rows > 0){
				
				flag = true;
			}
                       /* if(rows1 > 0){
				
				flag = true;
			}*/
		}
               
                      catch(SQLException e1){
			
			e1.printStackTrace();
		}finally{
			
			try {
				if (pstmt != null){
					pstmt.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeConnection();
			return flag;
		}
 }
	public personDTO getrecord(String name,String pwd){
		int r = -1;
		openConnection();
                ResultSet rs = null;
		PreparedStatement pst = null;
                String hobby;
                String qua;
                String mail;
                 personDTO p= new personDTO();
		try{
			String q = "select mail from contact where name = ? and password = ?;";
			if(conn!=null){
				pst = conn.prepareStatement(q);
				
                                pst.setString(1,name );
                                 pst.setString(2,pwd);
                                
                rs = pst.executeQuery();
                rs.next();
                
                   mail = rs.getString(1);
                  
                  
                   p.setEmail(mail);
                   
                 
                     System.out.println("mail is " + p.getEmail());
                 }
			
			
                }catch(SQLException e){
			e.printStackTrace();
		}
                finally{
                
                 return p;
             }
	
        }

	public static void main(String[] args) {
            DBHandler db=new DBHandler();
            
		
	}
}
