/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbob;

/**
 *
 * @author ARNI NAZIRA | NIM=21104410077 | Kelas=TI-B
 */
public class Penyanyi {
    
    public static void main(String[]args){
        Pop pop = new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.singer("Via Vallen");
        dangdut.song("Kopi Dangdut");
        dangdut.cetakLabel();
    }
}
