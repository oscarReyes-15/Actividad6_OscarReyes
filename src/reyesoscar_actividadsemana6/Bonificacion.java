/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reyesoscar_actividadsemana6;

/**
 *
 * @author LENOVO
 */
public class Bonificacion {
    
    static double Bonificacion, salarioTotal;
    
    static double calculoBoni(double salario, double antiguedad){
        
        if(salario > 45000){
            Bonificacion = salario * 0.20;
            salarioTotal = salario + Bonificacion;
        }
        else if ((salario > 25000 || 45000 > salario) && antiguedad > 7){
            Bonificacion = salario * 0.15;
            salarioTotal = salario + Bonificacion;
        }
        else if (salario > 18900 && antiguedad > 5){
            Bonificacion = salario * 0.10;
            salarioTotal = salario + Bonificacion;
        }
        
        System.out.println("Su bono es de: Lps." + Bonificacion  );
        
        return salarioTotal;
    }
    
}
