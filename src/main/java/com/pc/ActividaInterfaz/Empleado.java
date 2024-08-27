package com.pc.ActividaInterfaz;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salarioBase;
    private String fechaIngreso;
    private String departamento;
    private double igss;
    private double deducciones;
    private double irtra;

    public Empleado(int id, String nombre, String puesto, double salarioBase, String fechaIngreso, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getIgss() {
        return igss;
    }

    public void setIgss(double igss) {
        this.igss = igss;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getIrtra() {
        return irtra;
    }

    public void setIrtra(double irtra) {
        this.irtra = irtra;
    }
}

