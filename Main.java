import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // EMPRESA
        String nombreEmpresa = JOptionPane.showInputDialog("Ingrese nombre de la empresa:");
        String nit = JOptionPane.showInputDialog("Ingrese NIT:");
        String direccion = JOptionPane.showInputDialog("Ingrese dirección:");

        Empresa empresa = new Empresa(nombreEmpresa, nit, direccion);

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "----- MENU -----\n"
                            + " 1. Agregar empleado planta\n"
                            + " 2.Agregar empleado ventas\n"
                            + " 3. Agregar empleado de ventas\n"
                            + " 4 . Mostrar empleados\n"
                            + " 5 . Buscar empleado\n"
                            + " 6. Empleado con mayor salario\n"
                            + " 7 . Nómina total\n"
                            + " 8. Mostrar resúmenes\n"
                            + " 9 . Salir"
            ));

            switch (opcion) {

                case 1:

                    //
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String documento = JOptionPane.showInputDialog("Documento:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Salario base:"));

                    int opcionCategoria = Integer.parseInt(JOptionPane.showInputDialog(
                            "Categoría:\n1. JUNIOR\n2. SEMI SENIOR\n3. SENIOR"
                    ));

                    CategoriaEmpleado categoria;

                    if (opcionCategoria == 1) {
                        categoria = CategoriaEmpleado.junior;
                    } else if (opcionCategoria == 2) {
                        categoria = CategoriaEmpleado.semiSenior;
                    } else {
                        categoria = CategoriaEmpleado.senior;
                    }

                    double salud = Double.parseDouble(JOptionPane.showInputDialog("Descuento salud (%):"));
                    double pension = Double.parseDouble(JOptionPane.showInputDialog("Descuento pensión (%):"));


                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Horas extra:"));
                    double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora extra:"));
                    double auxilio = Double.parseDouble(JOptionPane.showInputDialog("Auxilio transporte:"));


                    EmpleadoPlanta emp = new EmpleadoPlanta(
                            nombre, documento, edad, salarioBase, categoria,
                            salud, pension,
                            cargo, horasExtra, valorHora, auxilio
                    );

                    empresa.agregarEmpleadoPlanta(emp);

                    JOptionPane.showMessageDialog(null, "Empleado registrado correctamente");
                    break;

                case 2:
                    empresa.mostrarEmpleados();
                    break;

                case 3:
                    String docBuscar = JOptionPane.showInputDialog("Ingrese documento:");
                    Empleado encontrado = empresa.buscarEmpleado(docBuscar);

                    if (encontrado != null) {
                        encontrado.mostrarInformacion();
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                    break;

                case 4:
                    Empleado mayor = empresa.empleadoMayorSalario();

                    if (mayor != null) {
                        mayor.mostrarInformacion();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay empleados");
                    }
                    break;

                case 5:
                    double total = empresa.calcularNominaTotal();
                    JOptionPane.showMessageDialog(null, "Nómina total: " + total);
                    break;

                case 6:
                    empresa.mostrarResumenes();
                    break;

            }

        } while (opcion != 9);
    }
}