import java.util.List;

public  abstract class  Empleado {


    private String nombre;
    private String documento;
    private int edad;
    private double salarioBase;
    private CategoriaEmpleado categoria;
    private double descuentoSalud;
    private double descuentoPension;
    private List<Empleado> Empleados;

    public Empleado(String nombre, String documento, int edad, double salarioBase,  CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;





        if(salarioBase>=0){
            this.salarioBase=salarioBase;
        }
        else{
            System.out.println("salario base invalido");
            this.salarioBase=0;
        }
        if(descuentoSalud>=0 && descuentoSalud<=100){
            this.descuentoSalud = descuentoSalud;

        }
        else{
            System.out.println("descuento de salud invalido");
            this.descuentoSalud = 0;
        }
        if (descuentoPension >= 0 && descuentoPension <= 100) {
            this.descuentoPension = descuentoPension;
        } else {
            System.out.println("Descuento pensión inválido");
            this.descuentoPension = 0;
        }
    }

    public abstract double calcularSalarioBruto();

    public  double calcularBonificacionCategoria(){
        double bonificacion=0;
        if (categoria==CategoriaEmpleado.junior){
            bonificacion=salarioBase*0.05;

        }
        else if(categoria == CategoriaEmpleado.semiSenior){
            bonificacion=salarioBase*0.10;


        }
        else{
            bonificacion=salarioBase*0.15;

        }
        return bonificacion;
    }
    public double calcularDescuentos(){
        double bruto=calcularSalarioBruto();
        double total=0;
        total=bruto*(descuentoSalud+descuentoPension)/100;
        return total;
    }
    public double calcularSalarioNeto() {
        double totalSalario=0;
        totalSalario=calcularSalarioBruto() - calcularDescuentos();
        return totalSalario;

    }

    public ResumenPago generarResumenPago() {
        return new ResumenPago(
                documento,
                nombre,
                this.getClass().getSimpleName(),
                calcularSalarioBruto(),
                calcularDescuentos(),
                calcularSalarioNeto()
        );
    }

    public void mostrarInformacion() {
        System.out.println("-------------------------------");
        System.out.println("Nombre       : " + nombre);
        System.out.println("Documento    : " + documento);
        System.out.println("Edad         : " + edad);
        System.out.println("Categoría    : " + categoria);
        System.out.println ("Salario Base : "+ salarioBase);
        System.out.println ("Salario Bruto: "+calcularSalarioBruto());
        System.out.println ("Descuentos   : "+ calcularDescuentos());
        System.out.println ("Salario Neto : "+calcularSalarioNeto());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public double getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(double descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public double getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(double descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

}