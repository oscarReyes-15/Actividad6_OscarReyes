/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reyesoscar_actividadsemana6;

import java.util.Scanner;

public class ProgramaEmpleados {

        
    public static void main(String[] args) {
        //Diccionario de Variables
        Empleado E = new Empleado("", "", 0, 0, 0);
        Scanner S = new Scanner(System.in);
        
        //Entrada - Ingreso de Datos
            
            //Bienvenida
            System.out.print("Calculadora de Bonificacion\n");
            
            //Ingreso Nombre
            System.out.println("\nIngrese su nombre: ");
            E.Nombre = S.nextLine(); 
            
            //Ingreso Genero
            System.out.println("Ingrese su genero: ");
            E.Genero = S.nextLine();
            
            //Ingreso Edad
            System.out.println("Ingrese su edad: ");
            E.Edad = S.nextInt();

            //Ingreso Salario
            System.out.println("Ingrese su salario: ");
            E.salario  = S.nextDouble();

            //Ingreso antiguedad
            System.out.println("Ingrese los anos trabajando en la compania: ");
            E.antiguedad = S.nextInt();
        
        //Proceso - Caluclo de bonificacion
        System.out.println("====================================================");
        E.Presentar();  
        
            
            
    }
    
}
