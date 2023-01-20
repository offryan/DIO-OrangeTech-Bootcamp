import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int real;

        real = doce * 2;
        System.out.println ( "O cliente obteve " +real+ " doces");
    }
}