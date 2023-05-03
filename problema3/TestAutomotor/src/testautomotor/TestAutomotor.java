package testautomotor;

/**
 *
 * @author joseph
 */
class Automotor{
    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
    }

    public Automotor(String cedula, String marca, int anioFabricacion, double valorVehiculo) {
        this.cedula = cedula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void CalcularValorMatricula() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * this.anioFabricacion;
    }

    @Override
    public String toString() {
        return String.format("Automotor"
                + "\nCedula: %s"
                + "\nMarca: %s"
                + "\nAnio Fabricacion: %d"
                + "\nValor Vehiculo: %.2f"
                + "\nValor Matricula: %.2f",
                this.getCedula(), this.getMarca(),
                this.getAnioFabricacion(), this.getValorVehiculo(),
                this.getValorMatricula());
    }
    
}

public class TestAutomotor {
    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("1900775972", "Nissan", 2000, 30000);
        automotor1.CalcularValorMatricula();
        System.out.println(automotor1);
    }
    
}
