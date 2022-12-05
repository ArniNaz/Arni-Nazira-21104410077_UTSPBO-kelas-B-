/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbob;

/**
 *
 * @author ARNI NAZIRA | NIM=21104410077 | Kelas=TI-B
 */

public class Kinetic {
    private double M;
    private double V;
    
    public double getM(){
        return M;
    }
    
    public void setM(){
        this.M = M;
    }
    
    public double getV(){
        return V;
    }
    
    public void setV(){
        this.V = V;
    }
    static double kinetic(double M, double V){
        double kinetic;
        kinetic = 0.5 *M*V*V;
        
        return kinetic;
    }
}
