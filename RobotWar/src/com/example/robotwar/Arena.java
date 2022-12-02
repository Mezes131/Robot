package com.example.robotwar;

import java.util.Scanner;

public class Arena extends Robot {
	
	Robot bili =new Robot ("");
    Arena(String nom)
    {
        super(nom);
    }

    public Robot fight (Robot a, Robot bob){
        Scanner sc= new Scanner(System.in);

        System.out.println("Appuyez '1' pour que le robot "+a.nom+" tirer sur le robot " +bob.nom);
        System.out.println("Appuyez '2' pour que le robot "+bob.nom+" tirer sur le robot " +a.nom);

        do {
            int b=sc.nextInt();
            while (b!=1 && b!=2) {
                System.out.println("Entrer la valeur '1' ou '2' svp");
                b=sc.nextInt();
            }
            if(b==1) {
                System.out.println("le robot "+bob.nom+ " a été touché par le robot " + a.nom);
                bob.point-=2;
                bob.isDead();
            }
            else {
                System.out.println("le robot "+a.nom+ " a été touché par le robot " +bob.nom);
                a.point-=2;
                a.isDead();
            }

        }
        while(a.point>0 && bob.point>0);
        if(a.point==0) {
            bili.nom=bob.nom;
            System.out.println("Le robot "+bili.nom+" est vainqueur");
        }else if(bob.point==0){
            bili.nom=a.nom;
            System.out.println("Le robot "+bili.nom+" est vainqueur");
        }
        return bili;
    }



}
