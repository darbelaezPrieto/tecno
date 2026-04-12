public class EmpleadoTemporal extends Empleado {

    private int diasTrabajados;
    private double valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, double salarioBase, String categoria, double descuentoSalud, double descuentoPension,int diasTrabajados,double valorDia){


        super(nombre,documento,edad,salarioBase,descuentoSalud,descuentoPension);

        this.diasTrabajados=diasTrabajados;
        this.valorDia=valorDia;

    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }


}
