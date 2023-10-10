import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner terminal = new Scanner(System.in);
                System.out.println("Digite o primeiro numero");
                int param1 = terminal.nextInt();
                System.out.println("Digite o segundo numero");
                int param2 = terminal.nextInt();

                try {

                    contar(param1, param2);

                }catch (ParametrosInvalidosException exception) {
                    System.out.println("O segundo numero deve ser maior que o primeiro");

                }
            }


            private static void contar(int param1, int param2) throws ParametrosInvalidosException {
                if (param1 >= param2) {
                    throw new ParametrosInvalidosException();
                }
                for (int i = param1; i <= param2; i++) {
                    System.out.println(i);}
            }
        }

