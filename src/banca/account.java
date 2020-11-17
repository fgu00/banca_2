/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca_2;

/**
 *
 * @author russo.salvatore
 */
public class account {
      private int soldi;
    private String nome;
    private String cognome;
    private String mail;
    private String telefono;
    private String password;
    private String login;
    private String[] a;
    private String []b;
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
     a=new String [10];
     b=new String [1];
     attiva=false;
     f=new codice();
     codice=f.genera();
    }
    public void aggiungi(int a){
        if(attiva==true){
        soldi=soldi+a;
        b[0]="sono stati depositati "+a+" euro nel proprio conto";
        }else{
            System.out.println("account non attivato");
        }
    }
    public void togli(int a){
        if(attiva==true){
        soldi=soldi-a;
         b[0]="sono stati prelevati "+a+" euro dal proprio conto";
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
         b[0]="si è cambiato nome da "+h+" a "+a;
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
         b[0]="si è cambiato cognome da "+h+" a "+a;
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
        b[0]="si è cambiato nome da "+h+" a "+a;
    }else{
              System.out.println("account non attivato");
         }
     }
    public String getMail(){
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
        b[0]="si è cambiato numero di telefono da "+h+" a "+a;
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
        b[0]="si è cambiato password da"+h+" a "+a;
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
    public String getCodice(){
          return codice;
        
    }
     public void setlogin(String  a){
         if(attiva==true){
         String h=login;
        login=a;
        b[0]="si è cambiato login da "+h+" a "+a;
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
        String f=a[0];
        a[0]=b[0];
        String m=a[1];
        a[1]=f;
        f=a[2];
        a[2]=m;  
        m=a[3];
        a[3]=f;
        f=a[4];
        a[4]=m;
        m=a[5];
        a[5]=f;
        f=a[6];
        a[6]=m;
        m=a[7];
        a[7]=f;
        f=a[8];
        a[8]=m;
        m=a[9];
        a[9]=f;
        }else{
             System.out.println("account non attivato");
        }
        
        
        
        
    }
    public void stampagronologia(){
        if(attiva==true){
        for(int y=0;y<a.length;y++){
            if(a[y]!=null)
            System.out.println(a[y]);
        }
    }else{
             System.out.println("account non attivato");
        }
    }
    public void attiva(String a){
        if(a.equals(attiva)){
            attiva=true;
        }else{
            System.out.println("codice sbagnato riprovare");
        }
    }
    public String codice(){
        return codice;
    }
}


