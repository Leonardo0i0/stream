// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String usuario = null, email = null, senha = null, senha1 = null;
        int opcao, nivel, numero;
        Scanner teclado = new Scanner(System.in);
        cliente cliente = new cliente();

        do{
            System.out.println("1-Criar conta. /n 2- Logar em uma conta./n 3-Sair.");
            opcao = teclado.nextInt();
            if (opcao == 1) {
                System.out.println("Digite seu e-mail:");
                email = teclado.nextLine();
                System.out.println("Digite seu numero de celular:");
                numero = teclado.nextInt();
                System.out.println("Digite seu novo Login de usuario:");
                usuario = teclado.nextLine();
                do {
                    System.out.println("Digite sua nova Senha");
                    senha = teclado.nextLine();
                    System.out.println("Confirme a sua senha:");
                    senha1 = teclado.nextLine();
                    if (senha != senha1){
                        System.out.println("Senhas diferentes!");
                    }
                    do {
                        System.out.println("Qual dos nossos planos o senhos deseja?");
                        System.out.println("1- Plano Bronze");
                        System.out.println("2- Plano Prata");
                        System.out.println("3- plano Gold");
                        System.out.println("4- plano Diamante");
                        System.out.println("Selecione uma das opções para ter mais detalhes");

                        switch (opcao){
                            case 1:
                                System.out.println("PLANO BRONZE.");
                                System.out.println("Qualidade de imagem de 480p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 1 mes apos o lançamento.");
                                System.out.println("Sem compartilhamento de conta.");
                                break;
                            case 2:
                                System.out.println("PLANO PRATA.");
                                System.out.println("Qualidade de imagem de 720p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 15 dias apos o lançamento.");
                                System.out.println("Compartilhamento de conta com 1 pessoa.");
                                break;
                            case 3:
                                System.out.println("PLANO GOLD.");
                                System.out.println("Qualidade de imagem de 1080p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 7 dias apos o lançamento.");
                                System.out.println("Compartilhamento de conta com ate 3 pessoas.");
                                break;
                            case 4:
                                System.out.println("PLANO DIAMANTE.");
                                System.out.println("Qualidade de imagem de 480p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 1 mes apos o lançamento.");
                                System.out.println("Sem compartilhamento de conta.");
                                break;
                        }
                    }while (opcao != 1);

                }while (senha != senha1);

                }else{
                System.out.println("Insira seu login.");
                usuario = teclado.nextLine();
                    System.out.println("insira a sua senha.");
                    senha = teclado.nextLine();

                if (usuario == cliente.usuario || senha == cliente.senha){
                    System.out.println("Login efetuado com sucesso!");
                    System.out.println("");
                }
            }

        }while(opcao!=3);
    }
}