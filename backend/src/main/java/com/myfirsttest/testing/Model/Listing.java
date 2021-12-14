package com.myfirsttest.testing.Model;

import org.springframework.data.annotation.Id;

//@Entity
//@Table(name="listing")
public class Listing {
    @Id
    private String ListingID;

    private String listingAddress;
    private String State;
    private String City;
    private Integer Zip;
    private String Street;
    private String Unit;
    private String listingEmail;
    private String listingName;
    private String listingPhone;
    private String listingStartDate;
    private String Url;
    private Integer Beds;
    private Integer Baths;
    private Integer sqFeet;

    public Listing(String listingID, String listingAddress, String state,
                   String city, Integer zip, String street, String unit,
                   String listingEmail, String listingName, String listingPhone,
                   String listingStartDate, String url, Integer beds, Integer baths,
                   Integer sqFeet) {
        ListingID = listingID;
        this.listingAddress = listingAddress;
        State = state;
        City = city;
        Zip = zip;
        Street = street;
        Unit = unit;
        this.listingEmail = listingEmail;
        this.listingName = listingName;
        this.listingPhone = listingPhone;
        this.listingStartDate = listingStartDate;
        Url = url;
        Beds = beds;
        Baths = baths;
        this.sqFeet = sqFeet;
    }

    public Integer getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(Integer sqFeet) {
        this.sqFeet = sqFeet;
    }

    public Integer getBaths() {
        return Baths;
    }

    public void setBaths(Integer baths) {
        Baths = baths;
    }

    public Integer getBeds() {
        return Beds;
    }

    public void setBeds(Integer beds) {
        Beds = beds;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getListingStartDate() {
        return listingStartDate;
    }

    public void setListingStartDate(String listingStartDate) {
        this.listingStartDate = listingStartDate;
    }

    public String getListingPhone() {
        return listingPhone;
    }

    public void setListingPhone(String listingPhone) {
        this.listingPhone = listingPhone;
    }

    public String getListingName() {
        return listingName;
    }

    public void setListingName(String listingName) {
        this.listingName = listingName;
    }

    public String getListingEmail() {
        return listingEmail;
    }

    public void setListingEmail(String listingEmail) {
        this.listingEmail = listingEmail;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer zip) {
        Zip = zip;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getListingAddress() {
        return listingAddress;
    }

    public void setListingAddress(String listingAddress) {
        this.listingAddress = listingAddress;
    }

    public String getListingID() {
        return ListingID;
    }

    public void setListingID(String listingID) {
        ListingID = listingID;
    }
}
