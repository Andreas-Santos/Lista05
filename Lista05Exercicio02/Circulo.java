package Lista05Exercicio02;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo() {

    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public String toString() {
        return "Forma: Círculo" +
               "Raio: " + raio +
               "\nÁrea: " + calcularArea() +
               "\n";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
