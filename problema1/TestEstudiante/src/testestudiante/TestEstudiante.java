package testestudiante;

/**
 *
 * @author joseph
 */
class Estudiante{
    private String nomnbre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String nomnbre, double nota1, double nota2, double nota3) {
        this.nomnbre = nomnbre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void CalcularPromedio() {
        this.promedio = (getNota1() + getNota2() + getNota3()) / 3;
    }

    @Override
    public String toString() {
        return String.format("Estudiante"
                + "\nNombre del estudiante: %s"
                + "\nNota1: %.2f"
                + "\nNota2: %.2f"
                + "\nNota3: %.2f"
                + "\nPromedio: %.2f",
                this.getNomnbre(), this.getNota1(),
                this.getNota2(), this.getNota3(),
                this.getPromedio());
    }
    
    
}
public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Joseph",10,10,10);
        estudiante1.CalcularPromedio();
        System.out.println(estudiante1);
    }
    
}
