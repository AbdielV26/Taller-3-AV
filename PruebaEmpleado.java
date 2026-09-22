/*
 * Taller N.2 - Programación 1
 * Grupo: ____  Fecha: 09/21/2026
 * Integrante 1: Abdiel Valiente Cedula 8-1042-953
 * Integrante 2: Jesús Santos - Cédula 8-1054-1568
 */

public class PruebaEmpleado {
    public static void main(String[] args) {
      
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Ana Pérez";
        empleado1.cedula = "8-123-4567";
        empleado1.cargo = "Analista de Datos";
        empleado1.salarioBase = 900.0;
        empleado1.anosServicio = 3;
        empleado1.esSupervisor = false;

        Empleado empleado2 = new Empleado();
        empleado2.nombre = "Carlos Mendoza";
        empleado2.cedula = "8-765-4321";
        empleado2.cargo = "Líder de Proyecto";
        empleado2.salarioBase = 1200.0;
        empleado2.anosServicio = 5;
        empleado2.esSupervisor = true; // Reto Ejercicio 5

       
        // Empleado 1
        double bonoAntiguedad1 = empleado1.salarioBase * 0.05 * empleado1.anosServicio;
        double bonoSupervisor1 = empleado1.esSupervisor ? 150.0 : 0.0; // Reto Ejercicio 5
        double totalEmpleado1 = empleado1.salarioBase + bonoAntiguedad1 + bonoSupervisor1;

        // Empleado 2
        double bonoAntiguedad2 = empleado2.salarioBase * 0.05 * empleado2.anosServicio;
        double bonoSupervisor2 = empleado2.esSupervisor ? 150.0 : 0.0; // Reto Ejercicio 5
        double totalEmpleado2 = empleado2.salarioBase + bonoAntiguedad2 + bonoSupervisor2;

        // Mostrar datos ordenados
        System.out.println(" DATOS DE EMPLEADOS ");
        System.out.println("Empleado 1: " + empleado1.nombre + " (Cédula: " + empleado1.cedula + ")");
        System.out.println("Cargo: " + empleado1.cargo + " | Es supervisor: " + empleado1.esSupervisor);
        System.out.println("Salario Base: $" + empleado1.salarioBase);
        System.out.println("Bono Antigüedad: $" + bonoAntiguedad1);
        System.out.println("Bono Supervisor: $" + bonoSupervisor1);
        System.out.println("Salario Total: $" + totalEmpleado1);
        System.out.println();

        System.out.println("Empleado 2: " + empleado2.nombre + " (Cédula: " + empleado2.cedula + ")");
        System.out.println("Cargo: " + empleado2.cargo + " | Es supervisor: " + empleado2.esSupervisor);
        System.out.println("Salario Base: $" + empleado2.salarioBase);
        System.out.println("Bono Antigüedad: $" + bonoAntiguedad2);
        System.out.println("Bono Supervisor: $" + bonoSupervisor2);
        System.out.println("Salario Total: $" + totalEmpleado2);
        System.out.println();

       
        // EJERCICIO 4: Comparación de salarios
     
        System.out.println(" COMPARACIÓN DE SALARIOS ");
        if (totalEmpleado1 > totalEmpleado2) {
            System.out.println("El empleado con el salario total más alto es: " + empleado1.nombre + " con $" + totalEmpleado1);
        } else if (totalEmpleado2 > totalEmpleado1) {
            System.out.println("El empleado con el salario total más alto es: " + empleado2.nombre + " con $" + totalEmpleado2);
        } else {
            System.out.println("Ambos empleados tienen el mismo salario total: $" + totalEmpleado1);
        }
    }
}