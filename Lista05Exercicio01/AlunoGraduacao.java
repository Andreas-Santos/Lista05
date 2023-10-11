package Lista05Exercicio01;

public class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;
    private double ac1;
    private double ac2;
    private double af;
    private double ag;

    public AlunoGraduacao() {

    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusao) {
        super.setRa(ra);
        super.setNome(nome);
        super.setCurso(curso);
        this.anoConclusaoEnsinoMedio = anoConclusao;
    }
    
    @Override
    public String toString() {
        return "RA: " + super.getRa() +
               "\nNome: " + super.getNome() +
               "\nCurso: " + super.getCurso() +
               "\nConclusão Ensino Médio: " + anoConclusaoEnsinoMedio +
               "\nNota AC1: " + ac1 +
               "\nNota AC2: " + ac2 +
               "\nNota AF: " + af +
               "\nNota AG: " + ag +
               "\nMédia: " + calcularMedia() +
               "\nResultado: " + verificarAprovacao() + 
               "\n";
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

    @Override
    public double calcularMedia() {
        return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
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