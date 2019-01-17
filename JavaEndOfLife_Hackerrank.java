/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaendoflife_hackerrank;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class JavaEndOfLife_Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        //String inputFile = scan.nextLine();
        String inputFile;
        while(scan.hasNextLine() && (inputFile = scan.nextLine()) != null){
            counter++;
            System.out.printf("%d %s%n",counter,inputFile);
        }
        scan.close();
    }
    
}

