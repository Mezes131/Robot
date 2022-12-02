package com.example.robotwar;


import java.util.Scanner;

public class Robot {
    protected String nom;
    protected int point;
    protected Robot bob;
    protected Robot bili;
    public int getPoint (){
        return point;
    }
    public String getNom (){
        return nom;
    }
    public void setPoint(int point) {
    }
    public void setNom(String nom) {
    	this.nom = nom;
    }



    public Robot (String nom){
        this.nom= nom;
        this.point= 10;
        System.out.println("Robot "+nom);
    }
    String afficher (){
        return "Robot "+nom;
    }
    int fire (Robot bob) {
        if (bob.getPoint() <= 0) {
            System.out.println(bob.getPoint() + " est deja mort");
        } else {
            bob.setPoint(bob.getPoint() - 2);
            System.out.println(bob.getNom() + " a ete touche par le robot " + this.nom);

        }
        return bob.point;
    }

    String isDead () {
        if (point == 0) {
            System.out.println("le robot " + nom + " est mort");
        }
        return nom;
    }

}



