package org.example;

public class Place2 {
    private int id;
    private String subname;
    private String name;
    private Address address;

    Place2() {
        super();
        this.id = 0;
        this.subname = "ex-subname";
        this.name = "ex-name";
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

    public Address getAddress() {
        return address;
    }
}

