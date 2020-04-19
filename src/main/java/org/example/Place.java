package org.example;

public class Place extends Address {
    private int id;
    private String subname;
    private String name;

    Place() {
        super();
        this.id = 0;
        this.subname = "ex-subname";
        this.name = "ex-name";
    }

    Place(int id, String street, String zipcode, String city, double lat, double lng) {
        super(street, zipcode, city, lat, lng);
        this.id = id;
        this.subname = "fill";
        this.name = "fill";
    }

    Place(int id, String name, String street, String zipcode, String city, double lat, double lng) {
        super(street, zipcode, city, lat, lng);
        this.id = id;
        this.subname = "fill";
        this.name = name;
    }

    Place(int id, String subname, String name, String street, String zipcode, String city, double lat, double lng) {
        super(street, zipcode, city, lat, lng);
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
}
/*
* public class address {
    private String street;
    private String zipcode;
    private String city;
    private double lat;
    private double lng;
    final private String fill="empty";
    address(){
        this.street="ex-street";
        this.zipcode="XX-XXX";
        this.city="ex-city";
        this.lat=00.00;
        this.lng=00.00;
    }
    address(String street, String zipcode, String city, double lat, double lng){
        this.street=street;
        this.zipcode=zipcode;
        this.city=city;
        this.lat=lat;
        this.lng=lng;
    }
    address(String zipcode, String city, double lat, double lng){
        this.street=fill;
        this.zipcode=zipcode;
        this.city=city;
        this.lat=lat;
        this.lng=lng;
    }
    address(String city, double lat, double lng){
        this.street=fill;
        this.zipcode=fill;
        this.city=city;
        this.lat=lat;
        this.lng=lng;
    }
    address(double lat, double lng){
        this.street=fill;
        this.zipcode=fill;
        this.city=fill;
        this.lat=lat;
        this.lng=lng;
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
}

* */

