public class ContaTerminal {
    
    private int numero;
    private String agencia;
    private String nomeDoCliente;
    private double saldo;

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString(){

        return "sua agência é " + getAgencia() + ", conta " + getNumero() + " e seu saldo " + getSaldo();
    }

}
