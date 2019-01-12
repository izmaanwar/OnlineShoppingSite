/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author aa
 */
public class dbhandle {
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
         public boolean insertRecord(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into women values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	
          public boolean insertRecordm(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into men values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
            public boolean insertRecordp(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into media values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean insertRecorde(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into electonics values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean insertRecordb(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into health values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean insertRecordk(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into kids values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	
          public boolean insertRecords(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into sports values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	
           public boolean insertRecordd(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into dailyuses values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean insertRecorda(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into automobiles values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean insertRecordc(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "insert into kitchen values(?,?,?,?)";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	    public boolean updateRecorda(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE 	automobiles  SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	  public boolean updateRecordb(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE health  SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	  public boolean updateRecordd(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE  dailyuses  SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	 public boolean updateRecorde(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE  electonics  SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
	   public boolean updateRecordk(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE  kids  SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
  public boolean updateRecordc(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE  kitchen SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
         
          public boolean updateRecordm(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE men SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
           public boolean updateRecordp(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE media SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
             public boolean updateRecords(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE sports SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
             public boolean updateRecordw(String n,String p,String m,String q){
		boolean flag = false;
		openConnection();
                System.out.println(m);
		String query = "UPDATE women SET  quantity = ? and price = ?  WHERE name = ? and type = ?;";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                        pstmt.setString(3,m);
                        pstmt.setString(4,q);
                      
                      
                        
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
              public boolean deleteRecorda(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM automobiles WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
         public boolean deleteRecordd(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM dailyuses WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
         public boolean deleteRecordb(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM health WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
           public boolean deleteRecorde(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM electonics WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
           public boolean deleteRecordk(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM kids WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
           public boolean deleteRecordc(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM kitchen WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
              public boolean deleteRecordm(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM men WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
              public boolean deleteRecordp(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM media WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
               public boolean deleteRecords(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM sports WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
                public boolean deleteRecordw(String n,String p){
		boolean flag = false;
		openConnection();
                
		String query = "DELETE FROM women WHERE n=? and p = ?";
               // String query1 = "insert into contacts (name,phone,email,profession,city,weburl) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null ;
               // PreparedStatement pstmt1 = null ;
		try{
	
			pstmt = conn.prepareStatement(query);
                      //  pstmt1 = conn.prepareStatement(query1);
                        
			pstmt.setString(1,n);
			pstmt.setString(2,p);
                       
                      
                      
                        
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
	public static void main(String[] args) {
            
        
            
            
		
	}
}
