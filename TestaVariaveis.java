import java.util.Scanner;

public class TestaVariaveis {
    public static void main(String[]args){
        System.out.println("Exercicio Variavel int");
        Scanner pergIdade = new Scanner(System.in);
        System.out.println("Insira sua idade");
        int idade = pergIdade.nextInt();
        System.out.println("Sua idade é "+ idade + " anos");
    }
}
