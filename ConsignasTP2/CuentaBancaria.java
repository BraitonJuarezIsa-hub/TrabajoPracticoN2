class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void infoCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("N° de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    void depositar(double monto) {
        saldo += monto;
        System.out.println("Su nuevo saldo actual es: " + saldo);
    }

    void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo -= monto;
            System.out.println("Su nuevo saldo actual es: " + saldo);
        }
    }

    double consultarSaldo() {
        System.out.println("Saldo: " + saldo);
        return saldo;
    }
}


  void main() {
        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);

        miCuenta.infoCuenta();
        miCuenta.consultarSaldo();
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        miCuenta.retirar(2000);
    }