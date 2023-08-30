/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


import java.util.Scanner;

/*atributos: precio, color,
consumo energético (letras entre A y F) y peso.*/
/**
 *
 * @author belugallardo
 */
public class Electrodomestico {
    
    
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;
    
    
    public Electrodomestico() {
        
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        
        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D'|| letra == 'E' || letra == 'F'){
            return letra;
        }else {
            return 'F';
        }
    }

    private String comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco")|| color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")|| color.equalsIgnoreCase("azul")|| color.equalsIgnoreCase("gris")){
            return color;
        } else {
            return "blanco";
        }
    }
    

    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.nextLine();
        
        System.out.println("Ingrese el letra  desde la A a la F el consumo energético");
        char consumo = leer.next().charAt(0);
        
        System.out.println("Ingese el peso en kg del electrodomestico");
        Integer peso = leer.nextInt();
        leer.nextLine();
        
        Double precioConsumo = precioFinalConsumo(consumo);
        Double precioPeso = precioFinalPeso(peso);
        Double precioFinal = 1000d + precioConsumo + precioPeso;
        
        Electrodomestico e1 = new Electrodomestico(precioFinal, color, consumo, peso);
        
        return e1;
    }
    
    private Double precioFinalConsumo(char consumo){
        switch (consumo){
            case 'A': 
                    return 1000d;
            case 'B': 
                    return 800d;
            case 'C': 
                    return 600d;
            case 'D': 
                    return 500d;
            case 'E': 
                    return 300d;
            case 'F': 
                    return 100d;
        }
        return null;
        
    }
    
    private Double precioFinalPeso(Integer peso){
        if(peso<=19){
            return 100d;
        }else if(peso <=49){
            return 500d;
        }else if(peso <=79){
            return 800d;
        }else{
            return 1000d;
        }
    }
    
    
}
