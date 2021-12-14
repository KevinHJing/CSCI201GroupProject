package com.myfirsttest.testing.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;


@Document(collection = "users")
public class User {
    //defines as unique identifier
    @Id
    private String id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String username;
    private String password;
    private String email;
    private String fname;
    private String lname;
    private Integer age;
    private String driversLicense;
    private List<Listing> likedListings;
    //logged on
    private boolean enabled;
    @DBRef
    private Set<Role> roles;

    public User(String username, String password, String email,
                String fname, String lname, Integer age, String driversLicense) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.driversLicense = driversLicense;
        this.likedListings = null;
    }

    public User(){
        this.username = "test";
        this.password = "test";
        this.email = "test";
        this.fname = "test";
        this.lname = "test";
        this.age = 1;
        this.driversLicense = "test";
        this.likedListings = null;
    }


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {this.email = email;}
    public void setAge(Integer age) {this.age = age;}
    public void setDriversLicense(String driversLicense) {this.driversLicense = driversLicense;}
    public void setFname(String fname) {this.fname = fname;}
    public void setLname(String lname) {this.lname = lname;}
    public void setLikedListings(List<Listing> likedListings) {this.likedListings = likedListings;}
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
    public List<Listing> getLikedListings() {return likedListings;}
    public void addFavListing(Listing listing){likedListings.add(listing);}
}





