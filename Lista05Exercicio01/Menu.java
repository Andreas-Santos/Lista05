package Lista05Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        ArrayList<Aluno> alunos = new ArrayList<>();

        do{
            System.out.println("Menu");
            System.out.println("------------");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Exibir Aluno");
            System.out.println("3 - Sair");
            escolha = Integer.parseInt(teclado.nextLine());

            switch(escolha){
                case 1:
                    int tipoCurso;

                    System.out.println("O aluno está cursando Graduação ou pós graduação?");
                    System.out.println("1 - Graduação");
                    System.out.println("2 - Pós Graduação");
                    tipoCurso = Integer.parseInt(teclado.nextLine());

                    switch(tipoCurso){
                        case 1:
                            AlunoGraduacao ag = new AlunoGraduacao();
                            
                            System.out.println("Digite o RA do aluno:");
                            ag.setRa(teclado.nextLine());
                            System.out.println("Digite o nome do aluno:");
                            ag.setNome(teclado.nextLine());
                            System.out.println("Digite o curso do aluno:");
                            ag.setCurso(teclado.nextLine());
                            System.out.println("Digite o ano de conclusão do ensino médio:");
                            ag.setAnoConclusaoEnsinoMedio(teclado.nextLine());
                            System.out.println("Digite a nota da AC1 do aluno:");
                            ag.setAc1(Double.parseDouble(teclado.nextLine()));
                            System.out.println("Digite a nota da AC2 do aluno:");
                            ag.setAc2(Double.parseDouble(teclado.nextLine()));
                            System.out.println("Digite a nota da AF do aluno:");
                            ag.setAf(Double.parseDouble(teclado.nextLine()));
                            System.out.println("Digite a nota da AG do aluno:");
                            ag.setAg(Double.parseDouble(teclado.nextLine()));

                            alunos.add(ag);

                            break;
                        case 2:
                            AlunoPosGraduacao apg = new AlunoPosGraduacao();
                            
                            System.out.println("Digite o RA do aluno:");
                            apg.setRa(teclado.nextLine());
                            System.out.println("Digite o nome do aluno:");
                            apg.setNome(teclado.nextLine());
                            System.out.println("Digite o curso do aluno:");
                            apg.setCurso(teclado.nextLine());
                            System.out.println("Digite o ano de conclusão da Graduação:");
                            apg.setAnoConclusaoGraduacao(teclado.nextLine());
                            System.out.println("Digite a primeira nota do aluno:");
                            apg.setNota1(Double.parseDouble(teclado.nextLine()));
                            System.out.println("Digite a segunda nota do aluno:");
                            apg.setNota2(Double.parseDouble(teclado.nextLine()));

                            alunos.add(apg);

                            break;
                        default:
                            System.out.println("O número digitado não é válido");
                            break;
                    }

                    break;
                case 2:
                    for(Aluno a : alunos) {
                        System.out.println(a.toString());
                    }

                    break;
                case 3:
                    System.out.println("O sistema será encerrado!");

                    break;
                default:
                    System.out.println("O número digitado não é válido");
                    
                    break;
            }
        }while(escolha != 3);
    }
}
