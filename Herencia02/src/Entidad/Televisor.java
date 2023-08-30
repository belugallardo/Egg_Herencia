/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Televisor extends Electrodomestico{
    
    private Integer resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public Televisor crearTelevisor(){
       Scanner leer = new Scanner(System.in);
       Electrodomestico ne = crearElectrodomestico();
      
       System.out.println("Ingrese las pulgadas del televisor");
       Integer resolucion = leer.nextInt();
       leer.nextLine();
       
         System.out.println("¿Tiene sintonizador? S/N");
         String respuesta = leer.nextLine();
         boolean resp;
         resp = respuesta.equalsIgnoreCase("S");
       Double precio = ne.getPrecio();  
       Double precioTv = precioTelevisor(resolucion,resp,precio);
       
       Televisor tv = new Televisor (resolucion,resp, precioTv, ne.color, ne.getConsumoEnergetico(), ne.getPeso());
       
       return tv;
   }
    
    private Double precioTelevisor(Integer resolucion, boolean resp, Double precio){

        Double suma ;
        if (resolucion > 40){
            suma = precio * 1.3;
        }else {
            suma = precio;
        }
        
        if(resp){
            suma += 500d;
        }
        return suma;
    }
}
