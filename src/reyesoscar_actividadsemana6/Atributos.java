package reyesoscar_actividadsemana6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Atributos {
    String Autor, Titulo;
    Double Precio, ISBN;
    
    public Atributos(String Titulo, String Autor, double Precio, double ISBN){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
        this.ISBN = ISBN;
    }
    
    public void DetallesLibro(){
        System.out.println(Titulo + "\n Autor: " + Autor + "\n Codigo (ISBN): " + ISBN + "\n Precio: Lps." + Precio);
    }
}
