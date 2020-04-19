package org.example;

public class Place2 {
    private int id;
    private String street;
    private String zipcode;
    private String city;
    private double lat;
    private double lng;
    private String subname;
    private String name;

    Place2() {
        super();
        this.id = 0;
        this.subname = "ex-subname";
        this.name = "ex-name";
    }

    Place2(int id, String street, String zipcode, String city, double lat, double lng) {
        this.id = id;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.subname = "fill";
        this.name = "fill";
    }

    Place2(int id, String name, String street, String zipcode, String city, double lat, double lng) {
        this.id = id;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.subname = "fill";
        this.name = name;
    }

    Place2(int id, String subname, String name, String street, String zipcode, String city, double lat, double lng) {
        this.id = id;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.id = id;
        this.subname = subname;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getSubname() {
        return subname;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}

