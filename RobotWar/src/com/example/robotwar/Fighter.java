package com.example.robotwar;
import java.util.Random;
import java.util.Scanner;

public class Fighter extends Robot {
	Robot bili =new Robot ("");
    private String nom1;
    public String getNom1 (){
        return nom1;
    }
    public void setNom1(String nom1) {
    	this.nom1=nom1;
    }

    public Fighter(String nom) {
        super(nom);
    }

    String affiche() {

        return "Le combattant "+nom1;
    }
    public void fight(Robot u, String v) {

        u.point=10;
        int point2=10;
        Scanner sc= new Scanner(System.in);

        System.out.println("appuis '1' pour que le robot "+u.nom+" tirer sur le combattant " +v);
        System.out.println("appuis '2' pour que le combattant "+v+" tirer sur le robot " +u.nom);

        do {
            int b =sc.nextInt();
            while (b!=1 && b!=2) {
                System.out.println("entrer la valeur '1' ou '2' svp");
                b=sc.nextInt();
            }
            if(b==1) {
                System.out.println("le combattant  "+v+ " a été touché par le robot " + u.nom);
                point2-=2;
                isDead();
            }
            else {

                Random r=new Random();
                if(r.nextBoolean()==true) {
                    u.point-=2;
                    System.out.println("le robot "+u.nom+" a été touché par le combattant "+v);
                    isDead();
                }
                else {
                    System.out.println("le combattant "+v+" a raté le robot "+u.nom);

                }
            }

        }
        while(u.point>0 && point2>0);
        if(u.point==0) {
            bili.nom=v;
            System.out.println("Le combattant "+bili.nom+" est vainqueur");
        }else if(point2==0){
            bili.nom=u.nom;
            System.out.println("Le robot "+bili.nom+" est vainqueur");}
        
    }



    public String toString(String s) {
        return s;
    }
}
