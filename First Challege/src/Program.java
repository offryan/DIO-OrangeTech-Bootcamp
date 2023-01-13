// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
// Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int res; int mesada = 50;

            int entrada = leitor.nextInt();

            res = entrada * mesada;
            System.out.print(res);
        }
    }
}
