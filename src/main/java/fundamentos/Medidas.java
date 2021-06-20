// Pacote
package fundamentos;

// Bibliotecas
import java.util.Scanner;

// Classe
public class Medidas {
    // Atributos
    static Scanner entrada = new Scanner(System.in); // instancia o objeto de leitura do console

    // Métodos e Funções
    public static void main(String[] args) {
        String opcao;
        int area = 0; // recebe o resultado dos cálculos de área

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(3) - Area do Círculo");

        opcao = entrada.nextLine(); // leitura da opção
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                // ToDo: calcular área do retânagulo
                break;
            case "3":
                // ToDo: calcular área do triânuglo
                break;
            case "4":
                // ToDo: calcular área do círculo
                break;
            default:
                System.out.println("Opção Inválida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado(){
        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt();
        return lado * lado; // retorna a área do quadrado
    }
}