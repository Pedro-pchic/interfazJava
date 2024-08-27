package com.pc.interfaz;
import java.util.List;

import com.pc.ActividaInterfaz.Empleado;

public interface EmpleadoService {
    void registrarEmpleado(Empleado empleado);
    List<Empleado> listarEmpleados();
    void bajarEmpleado(int id);
    double calcularIgss(Empleado empleado);
    double calcularIrtra(Empleado empleado);
    void agregarBono(Empleado empleado, double bono);
    void agregarDescuento(Empleado empleado, double descuento);
}
