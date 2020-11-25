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
        gestore_account a=new gestore_account();
        a.genera_account();
        a.attiva();
        a.modifica();
}
}
