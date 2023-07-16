package src.main.java.com.jb.javaexcepcions.models;

public abstract class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    /**
     * Este es el contructor de cuenta con comprobacion que la agencia y numero sean
     * validos
     * 
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero) {
        if (agencia < 0 || numero < 0) {

            throw new IllegalArgumentException("La agencio y/o el numero son invalidos");
        }
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);
        Cuenta.total++;
    }

    public abstract void deposita(double valor);
/**
 * Metodo para retirar dinero de cuentas
 * @param valor
 * @throws SaldoInsuficienteException
 */
    public void saca(double valor) throws SaldoInsuficienteException {

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException(
                    "El saldo es insufuciente no se puede realizar el retiro, intente con otra cantidad");
        } else {
            this.saldo -= valor;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
