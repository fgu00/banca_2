/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
      // t=new account[20];
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
                    File m=new File(s+"\\"+h+".txt");
            {
                try {
                    m.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(gestore_account.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         
               
      
           }
   public void modifica(int u){  
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
                        System.out.println("inserisci nuovo login");
                        String cv=sc.next();
                        t[u].setlogin(cv);
                         t[u].cronologia();
                        break;
                    case 7:
                       t[u].stampagronologia();
                        break;
                    case 8:
                        bu1=true;
                        u=t.length;
                        break;
            }   
   }
   

}
                    
                
   

   public void azioni_banca(int u){
                boolean bu1=false;
                while(bu1==false){
                System.out.println("1 per depositare i soldi");
                System.out.println("2 per ritirare i soldi");
                System.out.println("3 visualizzare i soldi");
                System.out.println("4 per uscire");
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
                        System.out.println(t[u].soldi());
                        break;
                    case 4:
                        bu1=true;
                        break;
            }   
   

                        
                        
                     
                }
   }
   
   //quando creare gli account da i file ricordarsi attiva e una stringa e davi trasformarla in un boolean
   public void salva() throws IOException{
       for(int fd=0;fd<t.length;fd++){
           if(t[fd]!=null){
           File file=new File("C:\\Users\\super\\OneDrive\\Desktop\\account_bamca"+"\\"+t[fd].codice()+".txt");
           FileWriter fw=new FileWriter(file);
           fw.write(t[fd].getNome());
           fw.write("\n");
           fw.write(t[fd].getCognome());
           fw.write("\n");
           fw.write(t[fd].getMaio());
           fw.write("\n");
           fw.write(t[fd].getTelefono());
           fw.write("\n");
           fw.write(t[fd].getLogin());
           fw.write("\n");
           fw.write(t[fd].getPassword());
           fw.write("\n");
           String soldi="";
           soldi=soldi+t[fd].soldi();
           fw.write(soldi);
           fw.write("\n");
           fw.write(t[fd].codice());
           fw.write("\n");
            fw.write(t[fd].getAttiva());
            fw.write("\n");
            a=t[fd].ritornocronologia();
            for(int bb=0;bb<a.size();bb++){
               fw.write(a.get(bb));
               fw.write("\n");
            }
              fw.flush();
              fw.close();
       }
   }
}
   public void leggi() throws FileNotFoundException{
      t=new account[20];
       Scanner leggi;
       File[]listafile;
       File file=new File("C:\\Users\\super\\OneDrive\\Desktop\\account_bamca");  
          listafile=file.listFiles();
        for(int f=0;f<listafile.length;f++){
            account prova;
            boolean att;
           leggi=new Scanner(listafile[f]);
           String nome=leggi.nextLine();
           String cognome=leggi.nextLine();
           String mail=leggi.nextLine();
           String telefono=leggi.nextLine();
           String login=leggi.nextLine();
           String password=leggi.nextLine();
           int soldi=Integer.parseInt(leggi.nextLine());
           String codice=leggi.nextLine();
           String attivazione=leggi.nextLine();
           if(attivazione.equals("attiva")){
            att=true;   
           }else{
               att=false;
           }
           ArrayList<String>crono= new ArrayList<String>();
           for(int hh=0;hh<1;){
               if(leggi.hasNextLine()!=false){
               String azione=leggi.nextLine();
               crono.add(azione);
           }else{
                   hh++;
               }
        }
           prova=new account(nome,cognome,mail,telefono,password,login,att,codice,soldi,crono);
           t[f]=prova;
          
           
   }
}
   public void stampaLista(){
       for(int ss=0;ss<t.length;ss++){
           System.out.println(t[ss].getNome());
       }
   }
   public int login(){
         int j=0;
     boolean vb=false;
                while(vb==false){
                    System.out.println("inserire login");
                    String sd=sc.next();
                    System.out.println("inserire password");
                    String bh=sc.next();
                    System.out.println("inserisci codice");
                    String codice2=sc.next();
                    for(int u=0;u<t.length;u++){
                        if(t[0]!=null){
                        if(sd.equals(t[u].getLogin()) && bh.equals(t[u].getPassword())&& codice2.equals(t[u].codice())){
                            j=u;
                            vb=true;
                            break;
                        }
}
                    }
                }
      return j;
   }
   public void recupero(){
       System.out.println("1 per recuperare il login e la password");
       System.out.println("2 per recuperare il codice alfanumerico");
       int recupero=sc.nextInt();
       switch(recupero){
           case 1:
               System.out.println("inserire l'email");
               String email=sc.next();
               System.out.println("inserire il codice");
               String codice=sc.next();
               for(int u=0;u<t.length;u++){
                        if(t[0]!=null){
                        if(email.equals(t[u].getMaio()) && codice.equals(t[u].codice())){
                            System.out.println(t[u].getLogin()); 
                             System.out.println(t[u].getPassword()); 
                             u=t.length;
                            break;
       }
   }
}
           break;
           case 2:
            System.out.println("inserire il login");
               String login=sc.next();
               System.out.println("inserire la password");
               String password=sc.next();
               for(int u=0;u<t.length;u++){
                        if(t[0]!=null){
                        if(password.equals(t[u].getPassword()) && login.equals(t[u].getLogin())){
                            System.out.println(t[u].codice()); 
                             u=t.length;
                            break;
       }
   }
}   
       }
   }
   public void crecartella(){
     File file=new File("C:\\Users\\super\\OneDrive\\Desktop\\account_bamca");
     if(file.exists()==false){
         file.mkdir();
     }
   }
}

   


                     
