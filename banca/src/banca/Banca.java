/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author super
 */
public class Banca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        gestore_account a=new gestore_account();
        a.crecartella();
        a.leggi();
        boolean f=false;
        while(f==false){
        System.out.println("1 per accedere");
        System.out.println("2 per recuperare");
        System.out.println("3 per creare un nuovo account");
        System.out.println("4 per attivare l'account");
        System.out.println("5 per uscire");
        int b=sc.nextInt();
       // a.recupero();
       switch(b){
           case 1:
              int h=a.login();
               boolean p=false;
               while(p==false){
               System.out.println("1 per modificare il proprio account");
               System.out.println("2 per interagire con il proprio account");
               System.out.println("3 per uscire");
               int s=sc.nextInt();
                switch(s){
                    case 1:
                        a.modifica(h);
                        break;
                    case 2:
                        a.azioni_banca(h);
                        break;
                    case 3:
                        p=true;
                        break;
                }
               }
           break;
           case 2:
               a.recupero();
               break;
           case 3:
             a.genera_account();
               break;
           case 4:
               a.attiva();
               break;
           case 5:
               a.salva();
               f=true;
       }
}
}
}
