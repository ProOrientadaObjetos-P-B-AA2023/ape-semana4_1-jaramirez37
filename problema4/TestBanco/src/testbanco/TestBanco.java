package testbanco;

/**
 *
 * @author joseph
 */
class Banco {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Banco() {
    }

    public Banco(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void CalcularComision() {
        this.comision = this.valorCheque * 0.00003;
    }

    @Override
    public String toString() {
        return String.format("Banco"
                + "\nNombre Banco: %s"
                + "\nNombre Cliente: %s"
                + "\nValor Cheque: %.2f"
                + "\nValor Comision: %.2f",
                this.getNombreBanco(), this.getNombreCliente(),
                this.getValorCheque(), this.getComision());
    }

}

public class TestBanco {

    public static void main(String[] args) {
        Banco cheque1 = new Banco("Joseph", "Banco de Loja", 20000);
        cheque1.CalcularComision();
        System.out.println(cheque1);
    }

}
