/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;




/**
 *
 * @author super
 */
public class account {
    Scanner sc=new Scanner(System.in);
    GregorianCalendar gc=new GregorianCalendar();
    private int soldi;
    private String nome;
    private String cognome;
    private String mail;
    private String telefono;
    private String password;
    private String login;
    private ArrayList<String> a;
    private String b;
    private boolean attiva;
    private codice f;
    private String codice;
    
    public  account(String nome,String cognome,String mail,String telefono,String password,String login){
     this.nome=nome;  
     this.cognome=cognome;
     this.mail=mail;
     this.telefono=telefono;
     this.password=password;
     this.login=login;
     a=new ArrayList<String>();
     b="";
     attiva=false;
     f=new codice();
     f.genera();
     codice=f.getcodice();
     soldi=0;
    }
     public  account(String nome,String cognome,String mail,String telefono,String password,String login,boolean attiva,String codice,int soldi, ArrayList<String> a){
     this.nome=nome;  
     this.cognome=cognome;
     this.mail=mail;
     this.telefono=telefono;
     this.password=password;
     this.login=login;
     b="";
     this.attiva=attiva;
     this.codice=codice;
     this.soldi=soldi;
     this.a=a;
    }
    public void aggiungi(int a){
        if(attiva==true){
        soldi=soldi+a;
        b="sono stati depositati "+a+" euro nel proprio conto"+" alle "+gc.getTime();
        }else{
            System.out.println("account non attivato");
        }
    }
    public void togli(int a){
        if(attiva==true){
        if(soldi!=0){
        if(soldi-a>=0){  
        
        soldi=soldi-a;
         b="sono stati prelevati "+a+" euro dal proprio conto"+" alle "+gc.getTime();
        }else{
            System.out.println("stai ritirando più soldi di quanti nei hai sull account");  
        }
        }else{
            System.out.println("non ci sono soldi da ritirare");
        }
        }else{
            System.out.println("account non attivato");
        }
        
    }
    public int soldi(){
        if(attiva==true){
        return soldi;
        }else{
            System.out.println("account non attivato");
        }
        return 0;
    }
     public void setNome(String  a){
         if(attiva==true){
         String h=nome;
        nome=a;
         b="si è cambiato nome da "+h+" a "+a+" alle "+gc.getTime();
         }else{
              System.out.println("account non attivato");
         }
    }
    public String getNome(){
        if(attiva==true){
        return nome;
        }else{
             System.out.println("account non attivato");
        }
        return null;
    } 
     public void setCognome(String  a){
         if(attiva==true){
          String h=cognome;
        cognome=a;
         b="si è cambiato cognome da "+h+" a "+a+" alle "+gc.getTime();
    }else{
              System.out.println("account non attivato");
         }
     }
    public String getCognome(){
        if(attiva==true){
        return cognome;
    }else{
             System.out.println("account non attivato");
        }
        return null;
    }
     public void setMail(String  a){
         if(attiva==true){
         String h=mail;
        mail=a;
        b="si è cambiato nome da "+h+" a "+a+" alle "+gc.getTime();
    }else{
              System.out.println("account non attivato");
         }
     }
    public String getMaio(){
        if(attiva==true){
        return mail;
    }else{
             System.out.println("account non attivato");
        }
        return null;
}
     public void setTelefono(String  a){
         if(attiva==true){
         String h=telefono;
        telefono=a;
        b="si è cambiato numero di telefono da "+h+" a "+a+" alle "+gc.getTime();
         }else{
              System.out.println("account non attivato");
         }
    }
    public String getTelefono(){
        if(attiva==true){
        return telefono;
    }else{
             System.out.println("account non attivato");
        }
        return null;
    }
     public void setPassword(String  a){
         if(attiva==true){
         String h=password;
        password=a;
        b="si è cambiato password da"+h+" a "+a+" alle "+gc.getTime();
    }else{
              System.out.println("account non attivato");
         }
     }
    public String getPassword(){
        if(attiva==true){
        return password;
    }else{
             System.out.println("account non attivato");
        }  
        return null;
    }
     public void setlogin(String  a){
         if(attiva==true){
         String h=login;
        login=a;
        b="si è cambiato login da "+h+" a "+a+" alle "+gc.getTime();
    }else{
              System.out.println("account non attivato");
         }
     }
    public String getLogin(){
        if(attiva==true){
        return login;
    }else{
             System.out.println("account non attivato");
        }
        return null;
    }
    public void cronologia(){
        if(attiva==true){
      a.add(b);
        }else{
             System.out.println("account non attivato");
        } 
    }
    public void stampagronologia(){
        if(attiva==true){
            int pp=0;
        for(int y=0;y<a.size();y++){
         System.out.println(a.get(y));
         if(y==9+pp){
            System.out.println("1 per andare indietro nella tua cronologia");
            System.out.println("2 per uscire");
            int kk=sc.nextInt();
            switch(kk){
                case 1:
                    pp=pp+10;
                    break;
                case 2:
                    y=a.size();
                    break;
                    
            }
        }
        }
    }else{
             System.out.println("account non attivato");
        }
    }
    public void attiva(String a){
        if(a.equals(codice)){
            attiva=true;
        }else{
            System.out.println("codice sbagnato riprovare");
        }
    }
    public String codice(){
        return codice;
    }
    public String getAttiva(){
        return "attiva";
        
    }
    public ArrayList ritornocronologia(){
        return a;
        
    }
}
