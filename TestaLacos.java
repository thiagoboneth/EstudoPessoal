public class TestaLacos {
    public static void main(String[] args) {
        for(int multiplicado = 1 ; multiplicado <= 10; multiplicado++){
            for (int contador = 0; contador <= 10; contador++){
                System.out.print(multiplicado*contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
