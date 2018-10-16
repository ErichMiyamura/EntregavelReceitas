package com.example.user.entregavelreceitas.entregavel.Model;

public class Receitas {

    private int image;
    private String name, place;

    public Receitas(int image, String name, String place) {
        this.image = image;
        this.name = name;
        this.place = place;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
