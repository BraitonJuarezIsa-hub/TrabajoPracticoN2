class Empleado {

    private int legajo;
    private String nombre;
    private double salario;
    private static int cantidadEmpleados = 0;

    Empleado(String nombre, double salario) {
        cantidadEmpleados++;
        this.legajo  = cantidadEmpleados;
        this.nombre  = nombre;
        this.salario = salario;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void setCantidadEmpleados(int cantidadEmpleados) {
        Empleado.cantidadEmpleados = cantidadEmpleados;
    }

    static int getCantidadEmpleados() { return cantidadEmpleados; }

    // Aumento por porcentaje
    void aumentarPorPorcentaje(double porcentaje, String motivo) {
        double aumento = salario * porcentaje / 100;
        salario += aumento;
        System.out.println("Aumento por porcentaje a " + nombre);
        System.out.println("Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }

    // Aumento por monto fijo
    void aumentarPorMonto(double monto, String motivo) {
        salario += monto;
        System.out.println("Aumento por monto fijo a " + nombre);
        System.out.println("Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }

    void mostrarInformacion() {
        System.out.println("Legajo: "  + legajo);
        System.out.println("Nombre: "  + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("                      ");
    }
}

    void main() {
        Empleado emp1 = new Empleado("Juan Pérez", 1000);
        Empleado emp2 = new Empleado("María García", 1500);
        Empleado emp3 = new Empleado("Carlos López", 2000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        emp3.mostrarInformacion();

        emp1.aumentarPorPorcentaje(10, "Buen desempeño");
        emp2.aumentarPorMonto(300, "Años de antigüedad");

        System.out.println("                   ");
        System.out.println("Total de empleados: " + Empleado.getCantidadEmpleados());
    }