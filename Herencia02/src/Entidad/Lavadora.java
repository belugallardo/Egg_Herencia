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
public class  Lavadora extends Electrodomestico{
   private Integer carga;
   
   
    public Lavadora() {
    }


    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

   
 
   public Lavadora crearLavadora(){
       Scanner leer = new Scanner(System.in);
       Electrodomestico ne = crearElectrodomestico();
      
       System.out.println("Ingrese la carga de la lavadora");
       Integer carga = leer.nextInt();
       leer.nextLine();
       
       Double precioLav = precioLavadora(carga);
       Double precioFinal = ne.getPrecio() + precioLav;
       Lavadora lav = new Lavadora (carga, precioFinal, ne.color, ne.getConsumoEnergetico(), ne.getPeso());
       
       return lav;
   }
   
   
   
   private Double precioLavadora(Integer carga){
       if(carga > 30){
           return 500d;
       }else {
           return 0d;
       }
   }
   
}
