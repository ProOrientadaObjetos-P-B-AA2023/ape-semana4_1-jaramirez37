package testsueldo;

/**
 *
 * @author joseph
 */
class Profesor{
    private String nombre;
    private String Apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String Apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void CalcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.20);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return String.format("Profesor"
                + "\nNombre: %s"
                + "\nApellido: %s"
                + "\nSueldo Basico: %.2f"
                + "\nSueldo Total: %.2f"
                + "\nCedula: %s",
                this.getNombre(), this.getApellido(),
                this.getSueldoBasico(), this.getSueldoTotal(),
                this.getCedula());
    }
    
}

public class TestSueldo {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Joseph", "Ramirez", 400, "1900775972");
        profesor1.CalcularSueldoTotal();
        System.out.println(profesor1);
    }
    
}
