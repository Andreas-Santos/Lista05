package Lista05Exercicio02;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    
    public Retangulo() {

    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public String toString() {
        return "Forma: Retangulo" +
               "Largura: " + largura +
               "\nAltura: " + altura +
               "\nÁrea: " + calcularArea() +
               "\n";
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
