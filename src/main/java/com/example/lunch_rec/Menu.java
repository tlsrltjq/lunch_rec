package com.example.lunch_rec;

public class Menu {
    private String m_name;
    private String spice;
    private String price;
    public Menu(String m_name, String spice, String price) {
        this.m_name = m_name;
        this.spice = spice;
        this.price = price;
    }

    public String getM_name(){
        return m_name;
    }
    public String getSpice(){
        return spice;
    }
    public String getPrice(){
        return price;
    }
}
