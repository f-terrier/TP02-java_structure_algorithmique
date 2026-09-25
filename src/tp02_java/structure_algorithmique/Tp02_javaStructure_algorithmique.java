/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02_java.structure_algorithmique;

/**
 *
 * @author fterrier
 */

import java.util.Scanner;

public class Tp02_javaStructure_algorithmique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = "admin123"; 
        Scanner take_s = new Scanner(System.in);
        String s;
        while (true) {
            System.out.print("Mot de passe : ");
            s = take_s.nextLine(); 
            if (s.equals(password)) {
                break;
            }
            System.out.println("Mauvais mot de passe, recommencez");
        }
        
        System.out.println("Bon mot de passe !");
    }
    
}
