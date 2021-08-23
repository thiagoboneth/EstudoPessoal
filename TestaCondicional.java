import java.util.Scanner;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = pergunta.nextInt();
        Scanner menorAcompanhado = new Scanner(System.in);
        System.out.println("Voce esta acompanhado?");
        boolean acompanhado = menorAcompanhado.nextBoolean();

            if (idade >= 18){
                System.out.println("Voce é maior de idade!");
                System.out.println("Voce pode entrar");
            } else if(acompanhado){
                System.out.println("Voce esta acompanhado!");
                System.out.println("Pode entrar");
            }else {
                System.out.println("Voce é menor de idade!");
                System.out.println("Nao pode entrar");
            }
    }
}
