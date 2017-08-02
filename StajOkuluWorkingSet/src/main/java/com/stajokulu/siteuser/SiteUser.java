package com.stajokulu.siteuser;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Table(name = "SiteUser")
@Entity
public class SiteUser implements Serializable {

    public SiteUser(String id, String userName, String firstName, String lastName, String email, String mobilePhone) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }
    
    public SiteUser(String userName, String email, String mobilePhone) {
        this.userName = userName;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }

    public SiteUser(String id) {
        this.id = id;
    }

    public SiteUser() {
    }

    @Id
    @GeneratedValue(generator = "uuid"  )
    private String id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String mobilePhone;
    
   
    private String password;
    
    @Transient
    private String passwordMatch;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordMatch() {
        return passwordMatch;
    }

    public void setPasswordMatch(String passwordMatch) {
        this.passwordMatch = passwordMatch;
    }
    
    
    
    

}