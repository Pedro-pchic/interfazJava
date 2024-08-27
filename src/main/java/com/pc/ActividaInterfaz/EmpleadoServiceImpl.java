package com.pc.ActividaInterfaz;


import com.pc.interfaz.EmpleadoService;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements EmpleadoService {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getNombre());
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
        System.out.println("Empleado con ID " + id + " dado de baja.");
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        double igss = empleado.getSalarioBase() * 0.0483; 
        empleado.setIgss(igss);
        return igss;
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        double irtra = empleado.getSalarioBase() * 0.01; 
        empleado.setIrtra(irtra);
        return irtra;
    }

    @Override
    public void agregarBono(Empleado empleado, double bono) {
        empleado.setDeducciones(empleado.getDeducciones() + bono);
        System.out.println("Bono de " + bono + " agregado al empleado: " + empleado.getNombre());
    }

    @Override
    public void agregarDescuento(Empleado empleado, double descuento) {
        empleado.setDeducciones(empleado.getDeducciones() - descuento);
        System.out.println("Descuento de " + descuento + " aplicado al empleado: " + empleado.getNombre());
    }
}

