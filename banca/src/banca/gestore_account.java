/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author super
 */
public class gestore_account {
  private account[]t;
    private Scanner sc=new Scanner(System.in);
    private int p=0;
    ArrayList<String> a;
   public void gestore_account(){
       t=new account[20];
       a=new ArrayList<String>();
   }
   public void genera_account(){
        t=new account[20];
        System.out.println("inserisci il tuo nome");
                String s=sc.next();
                System.out.println("inserisci il tuo cognome");
                String c=sc.next();
                System.out.println("inserisci la tua mail");
                String z=sc.next();
                System.out.println("inserisci il tuo numero di telefono");
                String v=sc.next();
                System.out.println("inserisci un login");
                String x=sc.next();
                System.out.println("inserisci una password");
                String j=sc.next();
                account a=new account (s,c,z,v,j,x);
                for(int w=0;w<t.length;w++){
                    if(t[w]==null){
                 t[w]=a; 
                 p=w;
                 break;
   }
}
                
                
   }
   public void attiva() {
     
          int jj = 0 ;
          System . out . println ( " inserisci il codice " );
          for ( int p = 0 ; p < t . length; p ++ ) {
              if(t[p]!=null){
                   System.out.println(t[0].codice());
                   String bb = sc.next();
                  if(bb.equals(t[p].codice())){
                      t[p].attiva(bb);
                      jj=p;
                      break;
                  }
              }
          }
          System.out.println("aggiungi percorso");
                    String s="C:\\Users\\super\\OneDrive\\Desktop\\account_bamca";
                    String h=t[jj].getLogin()+"_"+t[jj].getPassword()+"_"+t[jj].codice();
                    File m=new File(s+"\\"+h);
            {
                try {
                    m.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(gestore_account.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         
               
      
           }
   public void modifica(){  
       int j=0;
     boolean vb=false;
                while(vb==false){
                    System.out.println("inserire login");
                    String sd=sc.next();
                    System.out.println("inserire password");
                    String bh=sc.next();
                    for(int u=0;u<t.length;u++){
                        if(t[0]!=null){
                        if(sd.equals(t[0].getLogin()) && bh.equals(t[0].getPassword())){
                            j=u;
                          boolean bu1=false;
                while(bu1==false){
                System.out.println("1 per cambiare nome al intestato del conto");
                System.out.println("2 per cambiare il cognome del interessato del conto");
                    System.out.println("3 per cambiare la mail del conto");
                    System.out.println("4 per cambiare il numero di telefono del conto");
                    System.out.println("5 per cambbiare la password del conto");
                    System.out.println("6 per cambiare il login del conto");
                    System.out.println("7 per visualizzare la cronologia");
                    System.out.println("8 per uscire ");
                int ww=sc.nextInt();
                
                switch(ww){
                    case 1:
                        System.out.println("inserire nuovo nome");
                        String nn=sc.next();
                        t[u].setNome(nn);
                         t[u].cronologia();
                        break;
                    case 2:
                         System.out.println("inserire nuovo cognome");
                        String nj=sc.next();
                        t[u].setCognome(nj);
                         t[u].cronologia();
                        break;
                    case 3:
                         System.out.println("inserire nuova mail");
                        String nk=sc.next();
                        t[u].setMail(nk);
                         t[u].cronologia();
                        break;
                    case 4:
                         System.out.println("inserire nuovo numero telefonico");
                        String xc=sc.next();
                        t[u].setTelefono(xc);
                         t[u].cronologia();
                        break;
                    case 5:
                         System.out.println("inserire nuova password");
                       String xe=sc.next();
                        t[u].setPassword(xe);
                         t[u].cronologia();
                        break; 
                    case 6:
                        
                        String cv=sc.next();
                        t[u].setlogin(cv);
                         t[u].cronologia();
                        break;
                    case 7:
                       t[u].stampagronologia();
                        break;
                    case 8:
                        bu1=true;
                        break;
            }   
   }
   

}
                    }
                }
   }
}
   public void azioni_banca(){
       int j=0;
       int conta=0;
        boolean vb=false;
                while(vb==false){
                    if(conta==5){
                        break;
                    }
                    System.out.println("inserire login");
                    String sd=sc.next();
                    System.out.println("inserire password");
                    String bh=sc.next();
                     for(int u=0;u<t.length;u++){
                        if(t[0]!=null){
                        if(sd.equals(t[0].getLogin()) && bh.equals(t[0].getPassword())){
                            j=u;
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
                      t[u].aggiungi(cc);
                      t[u].cronologia();
                        break;
                    case 2:
                        System.out.println("inserire numero soldi da prelevare");
                        int cl=sc.nextInt();
                        t[u].togli(cl);
                         t[u].cronologia();
                        break;
                    case 3:
                        System.out.println("inserire nuovo nome");
                        String nn=sc.next();
                        t[u].setNome(nn);
                         t[u].cronologia();
                        break;
                    case 4:
                         System.out.println("inserire nuovo cognome");
                        String nj=sc.next();
                        t[u].setCognome(nj);
                         t[u].cronologia();
                        break;
                    case 5:
                         System.out.println("inserire nuova mail");
                        String nk=sc.next();
                        t[u].setMail(nk);
                         t[u].cronologia();
                        break;
                    case 6:
                         System.out.println("inserire nuovo numero telefonico");
                        String xc=sc.next();
                        t[u].setTelefono(xc);
                         t[u].cronologia();
                        break;
                    case 7:
                         System.out.println("inserire nuova password");
                       String xe=sc.next();
                        t[u].setPassword(xe);
                         t[u].cronologia();
                        break; 
                    case 8:
                        
                        String cv=sc.next();
                        t[u].setlogin(cv);
                         t[u].cronologia();
                        break;
                    case 9:
                       t[u].stampagronologia();
                        break;
                    case 10:
                        bu1=true;
                        break;
            }   
   }
}else{
                            conta++;
                        }
                        }
                     }
                }
   }
   //quando creare gli account da i file ricordarsi attiva e una stringa e davi trasformarla in un boolean
   public void salva() throws IOException{
       for(int fd=0;fd<t.length;fd++){
           if(t[fd]!=null){
           File file=new File("C:\\Users\\super\\OneDrive\\Desktop\\account_bamca"+"\\"+t[fd].getLogin()+"_"+t[fd].getPassword()+"_"+t[fd].codice());
           FileWriter fw=new FileWriter(file);
           fw.write(t[fd].getNome());
           fw.write(t[fd].getCognome());
           fw.write(t[fd].getMaio());
           fw.write(t[fd].getTelefono());
           fw.write(t[fd].getLogin());
           fw.write(t[fd].getPassword());
           fw.write(t[fd].soldi());
           fw.write(t[fd].codice());
            fw.write(t[fd].getAttiva());
            a=t[fd].ritornocronologia();
            for(int bb=0;bb<a.size();bb++){
               fw.write(a.get(bb));  
            }
       }
   }
}
}

                     
