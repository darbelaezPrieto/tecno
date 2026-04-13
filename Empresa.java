import java.util.List;
import java.util.ArrayList;

public class Empresa {


    private String nombre;
    private String nit;
    private String direccion;
    private List<Empleado> listEmpleados;

    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }


    public void agregarEmpleadoPlanta(Empleado e) {
        listEmpleados.add(e);
    }
    public void agregarEmpleadoVentas(Empleado e) {
        listEmpleados.add(e);
    }
    public void agregarEmpleadoTemporal(Empleado e) {
        listEmpleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : listEmpleados) {
            e.mostrarInformacion();
        }
    }

    public Empleado buscarEmpleado(String documento) {
        Empleado encontrado = null;
        for (Empleado e : listEmpleados) {
            if (e.getDocumento().equals(documento)) {
                encontrado = e;
            }
        }
        return encontrado;
    }

    public Empleado empleadoMayorSalario() {
        Empleado mayor = null;
        for (Empleado e : listEmpleados) {
            if (e.calcularSalarioNeto() > mayor.calcularSalarioNeto()) {
                mayor = e;
            }
        }
        return mayor;
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado e : listEmpleados) {
            total += e.calcularSalarioNeto();
        }
        return total;
    }

    public void mostrarResumenes() {
        for (Empleado e : listEmpleados) {
            System.out.println(e.generarResumenPago());
        }
    }
}
