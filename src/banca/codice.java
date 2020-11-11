/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author super
 */
public class codice {
    String []a;
    
    public void codice(){
        a=new String[36];
        a[0]="0";
        a[1]="1";
        a[2]="2";
        a[3]="3";
        a[4]="4";
        a[5]="5";
        a[6]="6";
        a[7]="7";
        a[8]="8";
        a[9]="9";
        a[10]="a";
        a[11]="b";
        a[12]="c";
        a[13]="d";
        a[14]="e";
        a[15]="f";
        a[16]="g";
        a[17]="h";
        a[18]="i";
        a[19]="l";
        a[20]="m";
        a[21]="n";
        a[22]="o";
        a[23]="p";
        a[24]="q";
        a[24]="r";
        a[26]="s";
        a[27]="t";
        a[28]="u";
        a[29]="v";
        a[30]="z";
        a[31]="w";
        a[32]="y";
        a[33]="j";
        a[34]="k";
        a[35]="x";
    }
    public String genera(){
        String g="";
        for(int s=0;s<6;s++){
     int b=(int)(Math.random()*36);
     g=g+a[b];
        }
        return g;
    }
}
