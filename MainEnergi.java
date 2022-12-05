/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbob;
import java.util.Scanner;

/**
 *
 * @author ARNI NAZIRA | NIM=21104410077 | Kelas=TI-B
 */
import java.util.Scanner;
import static utspbob.Kinetic.kinetic;
public class MainEnergi {
    public static void main(String[]args){
        System.out.println("Masukkan m = ");
        Scanner m = new Scanner(System.in);
        double M = m.nextDouble();
        System.out.println("Masukkan v = ");
        Scanner v = new Scanner(System.in);
        double V = v.nextDouble();
        
        
        System.out.println("Energi Kinetik ="+kinetic(M,V));
    }
}
