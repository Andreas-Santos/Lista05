package Lista05Exercicio01;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;

    public AlunoPosGraduacao() {

    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusao) {
        super.setRa(ra);
        super.setNome(nome);
        super.setCurso(curso);
        this.anoConclusaoGraduacao = anoConclusao;
    }

    @Override
    public String toString() {
        return "RA: " + super.getRa() +
               "\nNome: " + super.getNome() +
               "\nCurso: " + super.getCurso() +
               "\nConclusão Graduação: " + anoConclusaoGraduacao +
               "\nNota 1: " + nota1 +
               "\nNota 2: " + nota2 +
               "\nMédia: " + calcularMedia() +
               "\nResultado: " + verificarAprovacao() + 
               "\n";
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
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

    @Override
    public double calcularMedia() {
        return (nota1 + nota2)/2;
    }

    @Override
    public String verificarAprovacao() {
        String resultado = "";
        if(calcularMedia() >= 5){
            resultado += "Aprovado";
        }else{
            resultado += "Reprovado";
        }
        
        return resultado;
    }
}
