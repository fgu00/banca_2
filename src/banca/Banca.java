/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.Scanner;

/**
 *
 * @author super
 */
public class Banca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        account b[]=new account[20];
        int ee=0;
        boolean tt=false;
        while(tt==false){
        System.out.println("1 per creare un nuovo account");
        System.out.println("2 per accedere al tuo account");
            System.out.println("3 per uscire");
        int h=sc.nextInt();
        switch(h){
            case 1:
                System.out.println("inserisci il tuo nome");
                String s=sc.next();
                System.out.println("inserisci il tuo cognome");
                String c=sc.next();
                System.out.println("inserisci la tua mail");
                String z=sc.next();
                System.out.println("inserisci il tuo numero di telefono");
                int v=sc.nextInt();
                System.out.println("inserisci un login");
                String x=sc.next();
                System.out.println("inserisci una password");
                String j=sc.next();
                account a=new account (s,c,z,v,j,x);
                for(int w=1;w<b.length;w++){
                    if(b[w]==null){
                // account a=new account (s,c,z,v,j,x);
                 b[w]=a;
                 ee=w;
                 break;
                }
                }
                boolean bu=false;
                while(bu==false){
                System.out.println("1 per depositare i soldi");
                System.out.println("2 per ritirare i soldi");
                System.out.println("3 per cambiare nome al intestato del conto");
                System.out.println("4 per cambiare il cognome del interessato del conto");
                    System.out.println("5 per cambiare la mail del conto");
                    System.out.println("6 per cambiare il numero di telefono del conto");
                    System.out.println("7 per cambbiare la password del conto");
                    System.out.println("8 per cambiare il login del conto");
                    System.out.println("9 per visualizzare la cronologia");
                    System.out.println("10 per uscire ");
                int ww=sc.nextInt();
                
                switch(ww){
                    case 1:
                        System.out.println("inserire numero soldi da depositare");
                        int cc=sc.nextInt();
                      b[ee].aggiungi(cc);
                      b[ee].cronologia();
                        break;
                    case 2:
                        System.out.println("inserire numero soldi da prelevare");
                        int cl=sc.nextInt();
                        b[ee].togli(cl);
                         b[ee].cronologia();
                        break;
                    case 3:
                        System.out.println("inserire nuovo nome");
                        String nn=sc.next();
                        b[ee].setNome(nn);
                         b[ee].cronologia();
                        break;
                    case 4:
                         System.out.println("inserire nuovo cognome");
                        String nj=sc.next();
                        b[ee].setCognome(nj);
                         b[ee].cronologia();
                        break;
                    case 5:
                         System.out.println("inserire nuova mail");
                        String nk=sc.next();
                        b[ee].setMail(nk);
                         b[ee].cronologia();
                        break;
                    case 6:
                         System.out.println("inserire nuovo numero telefonico");
                        int xc=sc.nextInt();
                        b[ee].setTelefono(xc);
                         b[ee].cronologia();
                        break;
                    case 7:
                         System.out.println("inserire nuova password");
                       String xe=sc.next();
                        b[ee].setPassword(xe);
                         b[ee].cronologia();
                        break; 
                    case 8:
                        
                        String cv=sc.next();
                        b[ee].setlogin(cv);
                         b[ee].cronologia();
                        break;
                    case 9:
                       b[ee].stampagronologia();
                        break;
                    case 10:
                        bu=true;
                        break;
            }
            
                       
    }
            break;
            case 2:
             boolean vb=false;
                while(vb==false){
                    System.out.println("inserire login");
                    String sd=sc.next();
                    System.out.println("inserire password");
                    String bh=sc.next();
                    for(int u=0;u<b.length;u++){
                        if(sd.equals(b[u].getLogin()) && bh.equals(b[u].getPassword())){
                          boolean bu1=false;
                while(bu1==false){
                System.out.println("1 per depositare i soldi");
                System.out.println("2 per ritirare i soldi");
                System.out.println("3 per cambiare nome al intestato del conto");
                System.out.println("4 per cambiare il cognome del interessato del conto");
                    System.out.println("5 per cambiare la mail del conto");
                    System.out.println("6 per cambiare il numero di telefono del conto");
                    System.out.println("7 per cambbiare la password del conto");
                    System.out.println("8 per cambiare il login del conto");
                    System.out.println("9 per visualizzare la cronologia");
                    System.out.println("10 per uscire ");
                int ww=sc.nextInt();
                
                switch(ww){
                    case 1:
                        System.out.println("inserire numero soldi da depositare");
                        int cc=sc.nextInt();
                      b[ee].aggiungi(cc);
                      b[ee].cronologia();
                        break;
                    case 2:
                        System.out.println("inserire numero soldi da prelevare");
                        int cl=sc.nextInt();
                        b[ee].togli(cl);
                         b[ee].cronologia();
                        break;
                    case 3:
                        System.out.println("inserire nuovo nome");
                        String nn=sc.next();
                        b[ee].setNome(nn);
                         b[ee].cronologia();
                        break;
                    case 4:
                         System.out.println("inserire nuovo cognome");
                        String nj=sc.next();
                        b[ee].setCognome(nj);
                         b[ee].cronologia();
                        break;
                    case 5:
                         System.out.println("inserire nuova mail");
                        String nk=sc.next();
                        b[ee].setMail(nk);
                         b[ee].cronologia();
                        break;
                    case 6:
                         System.out.println("inserire nuovo numero telefonico");
                        int xc=sc.nextInt();
                        b[ee].setTelefono(xc);
                         b[ee].cronologia();
                        break;
                    case 7:
                         System.out.println("inserire nuova password");
                       String xe=sc.next();
                        b[ee].setPassword(xe);
                         b[ee].cronologia();
                        break; 
                    case 8:
                        
                        String cv=sc.next();
                        b[ee].setlogin(cv);
                         b[ee].cronologia();
                        break;
                    case 9:
                       b[ee].stampagronologia();
                        break;
                    case 10:
                        bu=true;
                        break;
            }   
                        }
                    }else{
                            System.out.println("password o login sbagliati");
                        }
                }
    } 
            break;
            case 3:
             tt=true;   
        }  
    }
    
}
}
