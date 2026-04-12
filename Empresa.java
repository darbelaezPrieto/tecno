import java.util.List;

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

    public String getDireccion() {
        return direccion;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String crearEmpleadoVentas(String nombre, String documento, int edad, double salarioBase, CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension, int totalVentas, double porcentajeComsion) {
        String respuesta = "";
        if (buscarEmpleado(documento)) {
            respuesta = "El empleado ya existe con el mismo numero de cedula";
        } else {
            EmpleadoVenta empleadoNuevo = new EmpleadoVenta(nombre, documento, edad, salarioBase,categoriaempleado, descuentoSalud,descuentoPension, totalVentas, porcentajeComsion);
            listEmpleados.add(empleadoNuevo);
            respuesta = "El empleado " + empleadoNuevo.getNombre() + " se registro exitosamente en las sesión de ventas";
        }
        return respuesta;
    }


    public boolean buscarEmpleado(String documento) {
        boolean existe = false;
        for (Cliente cl : listClientes) {
            if (cl.getDocumento().equals(documento)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

}
