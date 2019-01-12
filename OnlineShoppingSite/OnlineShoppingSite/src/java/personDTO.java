/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa
 */
public class personDTO {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public personDTO(String name, String password, String email, String hobby, String qualification) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.hobby = hobby;
        this.qualification = qualification;
    }

    public personDTO() {
    }
       String name;
       String password;
       String email;
       String hobby;
       String qualification;
}
