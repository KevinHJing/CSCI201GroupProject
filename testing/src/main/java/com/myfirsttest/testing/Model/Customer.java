package com.myfirsttest.testing.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document("customers")
public class Customer {
        //defines as unique identifier
        @Id
        private String id;

        //@Indexed(unique = true)
        private String username;
        private String password;
        private String email;
        private String fname;
        private String lname;
        private Integer age;
        private String driversLicense;
        private List<String> likedListings;

        public Customer(String id, String username, String password, String email,
                        String fname, String lname, Integer age, String driversLicense) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.fname = fname;
            this.lname = lname;
            this.age = age;
            this.driversLicense = driversLicense;
            this.likedListings = null;
        }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {this.email = email;}
    public void setId(String id) {this.id = id;}
    public void setAge(Integer age) {this.age = age;}
    public void setDriversLicense(String driversLicense) {this.driversLicense = driversLicense;}
    public void setFname(String fname) {this.fname = fname;}
    public void setLname(String lname) {this.lname = lname;}

    public void setLikedListings(List<String> likedListings) {this.likedListings = likedListings;}

    public String getEmail() {return email;}
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public Integer getAge() {return age;}
    public String getDriversLicense() {return driversLicense;}
    public String getFname() {return fname;}
    public String getLname() {return lname;}
    public List<String> getLikedListings() {return likedListings;}

}
