/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
/**
 *
 * @author belugallardo
 */
public class Herencia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        ArrayList<Lavadora> listaLavadoras = new ArrayList();
        ArrayList<Televisor> listaTelevisores = new ArrayList();

        Integer opcion;

        do {
            menu();
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos de la lavadora");
                    Lavadora la = new Lavadora();
                    la = la.crearLavadora();
                    listaElectrodomesticos.add(la);
                    listaLavadoras.add(la);
                    System.out.println("El precio de la lavadora es de " + la.getPrecio());
                    break;
                case 2:
                    System.out.println("Ingrese los daots del televisor");
                    Televisor tv = new Televisor();
                    tv = tv.crearTelevisor();
                    listaElectrodomesticos.add(tv);
                    listaTelevisores.add(tv);
                    System.out.println("El precio del televisor es de " + tv.getPrecio());
                    break;
                case 3:
                    Double sumaLav = 0d;
                    for (Lavadora lista : listaLavadoras) {
                        sumaLav += lista.getPrecio();
                    }
                    System.out.println("El precio total de las lavadoras es " + sumaLav);
                    break;
                case 4:
                    Double sumaTv = 0d;
                    for (Televisor lista : listaTelevisores) {
                        sumaTv += lista.getPrecio();
                    }
                    System.out.println("El precio total de los televisores es " + sumaTv);
                    break;
                case 5:
                    Double sumaTotal = 0d;
                    for (Electrodomestico lista : listaElectrodomesticos) {
                        sumaTotal += lista.getPrecio();
                    }
                    System.out.println("El precio total de los televisores es " + sumaTotal);
                    break;
                case 6:
                    System.out.println("Salida exitosa");
            }
            
        }while (opcion != 6);
        
     }

    public static void menu() {
        System.out.println("Ingrese la opcion deseada:\n"
                + "1 - Cargar una Lavadora\n"
                + "2 - Cargar un Televisor\n"
                + "3 - Mostrar precio total de Lavadoras\n"
                + "4 - Mostrar precio total de Televisores\n"
                + "5 - Mostrar precio final\n"
                + "6 - Salir");
    }

}
