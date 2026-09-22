/* 

 * Taller N.2 - Programacion 1 

 * Grupo: ___   Fecha: 21/09/2026

 * Integrante 1: Abdiel Valiente - Cedula 8-1042-953 

 * Integrante 2: Jesús Santos - Cedula 8-1054-1568

 */ 

public class FacturaTienda {
    public static void main(String[] args) { 
 String nombreProducto= "camisa"; 
 int cantidad= 3; 
 double precioUnitario= 15.5;
 boolean aplicaDescuento = true;
 final double TASA_ITBMS = 0.07;
//Ejercicio 2 

 double subtotal = cantidad * precioUnitario; 
double montoITBMS = subtotal * TASA_ITBMS;
double totalAPagar = subtotal + montoITBMS;  

System.out.println("Resultado 3");
System.out.println("Subtotal: B/" + subtotal);
System.out.println("Monto ITBMS: B/ " + montoITBMS);
System.out.println("Total a pagar: B/ " + totalAPagar);  
System.out.println ();
 
//Ejercicio 3 

double descuento = 0.0;
        double total = 0.0;

        if (aplicaDescuento) {
            descuento = subtotal * 0.10;
            total = subtotal + (subtotal * TASA_ITBMS) - (subtotal * 0.10);
        }

        System.out.println("EJERCICIO 3");
        System.out.println("Total final con descuento (Java): $" + total);
        System.out.println(); 

        //Ejercicio 4 
        int a = 7, b = 4, c = 2, d = 5;
        boolean resultadoBooleano = (a % b == 3) && ((c * d > 8) || (a - b <= c));
        System.out.println(" Resultado 4 ");
        System.out.println("Resultado de la expresión booleana: " + resultadoBooleano);
        System.out.println(); 
    
    //Ejercicio 5 
    
    int retoFinal = a + b * c - d;

        System.out.println("    Resultado 5  ");
        System.out.println("Resultado de retoFinal: " + retoFinal);
 /*1. Primero se hace la multiplicacio 
   2. Luego se hace la suma
   3. Por ultimo se hace la resta   
  */
    }
}

