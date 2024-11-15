/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reyesoscar_actividadsemana6;

/**
 *
 * @author LENOVO
 */
public class Empleado extends Bonificacion{
    String Nombre, Genero;
    int Edad, antiguedad; 
    double salario;
    
    public Empleado(String Nombre, String Genero, int Edad, double salario, int antiguedad){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.antiguedad = antiguedad;
        this.salario = salario;
    }
    
    //Proceso - imprime resusltados
    public void Presentar(){
        System.out.println(" Calculo completo!! \n Nombre: " + Nombre + "\n Edad: " + Edad + "\n Genero: " + Genero + "\n Tiempo trabajado en la empresa: " + antiguedad + " años \n Salario: Lps." + salario + "\n \nSalario Final: Lps." + calculoBoni(salario, antiguedad) );
    }
}
