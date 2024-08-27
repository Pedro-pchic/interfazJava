package com.pc.ActividaInterfaz;


public class Main {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado empleado1 = new Empleado(1, "Pedro  Alvardo ", "Gerente General", 5800.00, "2023-01-15", "Dasarrollador");
        Empleado empleado2 = new Empleado(2, " Esteban Herrera ", "Secretaria ", 4500.00, "2022-03-10", " Produccion ");

        empleadoService.registrarEmpleado(empleado1);
        empleadoService.registrarEmpleado(empleado2);

        System.out.println("Lista de empleados:");
        for (Empleado emp : empleadoService.listarEmpleados()) {
            System.out.println(emp.getNombre());
        }

        empleadoService.agregarBono(empleado1, 500);
        empleadoService.agregarDescuento(empleado2, 200);

        System.out.println("IGSS para " + empleado1.getNombre() + ": " + empleadoService.calcularIgss(empleado1));
        System.out.println("IRTRA para " + empleado1.getNombre() + ": " + empleadoService.calcularIrtra(empleado1));

        empleadoService.bajarEmpleado(1);

        System.out.println("Lista de empleados después de baja:");
        for (Empleado emp : empleadoService.listarEmpleados()) {
            System.out.println(emp.getNombre());
        }
    }
}

