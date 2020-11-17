/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca_2;

import java.io.File;
  import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author super
 */
public class gestore_account {
  private account[]t;
    private Scanner sc=new Scanner(System.in);
    private int p=0;
   public void gestore_account(){
       t=new account[20];
   }
   public void genera_account(){
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
                for(int w=1;w<t.length;w++){
                    if(t[w]==null){
                 t[w]=a; 
                 p=w;
                 break;
   }
}
                
                
   }
   public void attiva() throws IOException{
       int jj=0;
      // MIneMessage tt=new MineMessage();
            System.out.println("inserisci il codice");
                String bb=sc.next();
                for(int p=0;p<t.length;p++){
                    try{
                      t[p].attiva(bb);
                      jj=p;
                    }catch(Exception n){
                        boolean nn=false;
                        while(nn==false){
                            System.out.println("inserisci il codice");
                            bb=sc.next();
                        t[p].attiva(bb);
                        jj=p;
                        }
                    }
                }
                String patrh="C:\\Users\\russo.salvatore\\Desktop\\account_banca";
                File m=new File(patrh+"\\"+t[jj].getLogin()+"_"+t[jj].getPassword()+"_"+t[jj].getCodice());
                m.createNewFile();
           }
   }
   
  

