public class Calculadora {

    double operandoA;
    double operandoB;
    double resultado;

    Calculadora() {
        this.operandoA = 0;
        this.operandoB = 0;
        this.resultado = 0;
    }

    double sumar(double a, double b) {
        operandoA = a;
        operandoB = b;
        resultado = a + b;
        return resultado;
    }

    double restar(double a, double b) {
        operandoA = a;
        operandoB = b;
        resultado = a - b;
        return resultado;
    }

    double multiplicar(double a, double b) {
        operandoA = a;
        operandoB = b;
        resultado = a * b;
        return resultado;
    }

    double dividir(double a, double b) {
        if (b == 0) {
           System.out.printf("Error: No se puede dividir entre cero.");
        }
        operandoA = a;
        operandoB = b;
        resultado = a / b;
        return resultado;
    }
}
    void main() {
        Calculadora MiCalculadora = new Calculadora();

        double resultadoSuma = MiCalculadora.sumar(5, 3);
        System.out.println("Suma = " + resultadoSuma);

        double resultadoResta = MiCalculadora.restar(10, 4);
        System.out.println("Resta = " + resultadoResta);

        double resultadoMulti = MiCalculadora.multiplicar(6, 7);
        System.out.println("Multiplicación = " + resultadoMulti);

        double resultadoDiv = MiCalculadora.dividir(10, 2);
        System.out.println("División = " + resultadoDiv);
    }