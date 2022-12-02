package com.example.robotwar;

import java.util.Scanner;

public class MainActivity {

        public static void main(String[] args) {
            int a;
            do {
            	Runtime. getRuntime();
                Scanner sc=new Scanner(System.in);
                System.out.println("bienvenue dans Robot War \n Quel genre de combat voulez vous jouer ? \n");
                System.out.println("1. Robot1 vs machine \n");
                System.out.println("2. Robot 1 vs robot 2 \n");
                System.out.println("3. Joueur  vs robot \n ");
                int k= sc.nextInt();
                while (k!=1 && k!=2 &&k!=3) {
                    System.out.println("entrer la valeur '1' , '2' ou '3' svp \n");
                    k=sc.nextInt();

                }
                switch(k) {
                    case 1:
                    	
                        Scanner se=new Scanner(System.in);
                        Robot bob= new Robot("");
                        Robot boss= new Robot("");
                        System.out.println("entrer le nom de votre robot");
                        bob.setNom(se.nextLine());
                        System.out.println("Feu !");
                        boss.fire(bob);
                        
                        break;
                    case 2:
                        Scanner sp=new Scanner(System.in);
                        Robot bo= new Robot("");
                        Robot bos= new Robot("");
                        System.out.println("entrer le nom du robot 1");
                        bo.setNom(sp.nextLine());
                        System.out.println("entrer le nom du robot 2");
                        bos.setNom(sp.nextLine());
                        System.out.println("Feu !");
                        Arena nn=new Arena("");
                        bo.afficher();
                        bos.afficher();
                        nn.fight(bo, bos);
                        
                        break;
                    case 3:
                        Scanner sh=new Scanner(System.in);
                        Robot bu= new Robot("");
                        System.out.println("entrer le nom du combattant");
                        String g=sh.nextLine();
                        Fighter kl= new Fighter("");
                        System.out.println("entrer le nom du robot ");
                        bu.setNom(sh.nextLine());
                        bu.afficher();
                        kl.affiche();
                        System.out.println("Feu !");
                        kl.fight(bu,g);
                        break;
                }

                Scanner po=new Scanner(System.in);
                System.out.println("Le jeux est terminé voulez vous une nouvelle partie ? \n'1'=oui \n'2'= non");
                a=po.nextInt();
                while (a!=1 && a!=2) {
                    System.out.println("entrer la valeur '1' ou '2' svp");
                    a=sc.nextInt();
                }
                if(a==2 ) {
                    System.out.println("Fin du jeu");
                    System.out.println("Made by Mz");
                }


            }while(a!=2 );


        }

    }

