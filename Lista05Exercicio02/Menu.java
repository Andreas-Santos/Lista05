package Lista05Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        do{
            System.out.println("Menu");
            System.out.println("------------");
            System.out.println("1 - Inserir e Calcular Área");
            System.out.println("2 - Mostrar todas as formas inseridas");
            System.out.println("3 - Sair");
            escolha = Integer.parseInt(teclado.nextLine());

            switch(escolha){
                case 1:
                    int tipoCurso;

                    System.out.println("Qual forma deseja inserir?");
                    System.out.println("1 - Retangulo");
                    System.out.println("2 - Círculo");
                    tipoCurso = Integer.parseInt(teclado.nextLine());

                    switch(tipoCurso){
                        case 1:
                            Retangulo r = new Retangulo();
                            
                            System.out.println("Digite a altura do retangulo:");
                            r.setAltura(Double.parseDouble(teclado.nextLine()));
                            System.out.println("Digite a largura do retangulo:");
                            r.setLargura(Double.parseDouble(teclado.nextLine()));
                            
                            formas.add(r);

                            break;
                        case 2:
                            Circulo c = new Circulo();
                            
                            System.out.println("Digite o raio do Círculo:");
                            c.setRaio(Double.parseDouble(teclado.nextLine()));

                            formas.add(c);

                            break;
                        default:
                            System.out.println("O número digitado não é válido");
                            break;
                    }

                    break;
                case 2:
                    for(FormaGeometrica f : formas) {
                        System.out.println(f.toString());
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
