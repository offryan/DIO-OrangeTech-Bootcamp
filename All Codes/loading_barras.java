import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        switch(tamanho){
            case 1:
                tamanho = 1;
                System.out.print("/");
                break;

                case 2:
                tamanho = 2;
                System.out.print("//");
                break;

            case 3:
                tamanho = 3;
                System.out.print("///");
                break;

            case 4:
                tamanho = 4;
                System.out.print("////");
                break;

            case 5:
                tamanho = 5;
                System.out.print("/////");
                break;


            case 6:
                tamanho = 6;
                System.out.print("//////");
                break;


            case 7:
                tamanho = 7;
                System.out.print("///////");
                break;

            case 8:
                tamanho = 8;
                System.out.print("////////");
                break;

            case 9:
                tamanho = 9;
                System.out.print("/////////");
                break;

            case 10:
                tamanho = 10;
                System.out.print("//////////");
                break;

            default:
                System.out.print("Deu ruim");
        }
    }
}