// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String usuario = null, senha = null;
        int opcao, nivel;
        Scanner teclado = new Scanner(System.in);
        cliente cliente = new cliente();

        do{
            System.out.println("1-Logar em uma conta. /n 2- Criar conta./n 3-Sair.");
            opcao = teclado.nextInt();
            do {if (opcao == 1) {
                System.out.println("Insira seu login.");
                usuario = teclado.nextLine();
                System.out.println("insira a sua senha.");
                senha = teclado.nextLine();
                }
                if (usuario == cliente.usuario || senha == cliente.senha){
                    System.out.println("Login efetuado com sucesso!");
                    System.out.println("");
                }
            }while(usuario != cliente.usuario || senha != cliente.senha);

        }while(opcao!=3);
    }
}