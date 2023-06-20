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
                email = teclado.nextLine();
                System.out.println("Digite seu numero de celular:");
                numero = teclado.nextInt();
                System.out.println("Digite seu novo Login de usuario:");
                usuario = teclado.nextLine();
                usuario = teclado.nextLine();
                do {
                    System.out.println("Digite a sua senha!");
                    senha = teclado.nextLine();
                    System.out.println("Confirme a sua senha!");
                    senha1 = teclado.nextLine();
                    if (senha != senha1){
                        System.out.println("Senhas diferentes!");
                    }
                }while (senha != senha1);
                do {
                    System.out.println("Essas são as suas informações:");
                    System.out.println(usuario);
                    System.out.println(email);
                    System.out.println(numero);
                    System.out.println("Os dados estão corretos?");
                    opcao = teclado.nextInt();
                }while (opcao != 1);

                if (opcao==1){
                    cliente.trocaremail(email);
                    cliente.trocarnumero(numero);
                    cliente.trocarnome(usuario);
                    cliente.trocarsenha(senha);
                    System.out.println("Conta criada com sucesso!.");
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
                                nivel=opcao;
                                System.out.println("PLANO BRONZE.");
                                System.out.println("Qualidade de imagem de 480p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 1 mes apos o lançamento.");
                                System.out.println("Sem compartilhamento de conta.");
                                System.out.println("O senhor(a) deseja assinar este seviço?1-sim, 2-não");
                                opcao = teclado.nextInt();
                                if(opcao == 1){
                                    cliente.trocarnivel(nivel);
                                    System.out.println("Assinatura realizada com sucesso!.");
                                }
                                break;
                            case 2:
                                nivel=opcao;
                                System.out.println("PLANO PRATA.");
                                System.out.println("Qualidade de imagem de 720p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 15 dias apos o lançamento.");
                                System.out.println("Compartilhamento de conta com 1 pessoa.");
                                if(opcao == 1){
                                    cliente.trocarnivel(nivel);
                                    System.out.println("Assinatura realizada com sucesso!.");
                                }
                                break;
                            case 3:
                                nivel=opcao;
                                System.out.println("PLANO GOLD.");
                                System.out.println("Qualidade de imagem de 1080p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 7 dias apos o lançamento.");
                                System.out.println("Compartilhamento de conta com ate 3 pessoas.");
                                if(opcao == 1){
                                    cliente.trocarnivel(nivel);
                                    System.out.println("Assinatura realizada com sucesso!.");
                                }
                                break;
                            case 4:
                                nivel=opcao;
                                System.out.println("PLANO DIAMANTE.");
                                System.out.println("Qualidade de imagem de 480p.");
                                System.out.println("Ascesso aos nossos produtos a partir de 1 mes apos o lançamento.");
                                System.out.println("Sem compartilhamento de conta.");
                                if(opcao == 1){
                                    cliente.trocarnivel(nivel);
                                    System.out.println("Assinatura realizada com sucesso!.");
                                }
                                break;
                            default:
                                System.out.println("opção invalida");
                        }
                    }while (opcao != 1);

                }else{
                System.out.println("Insira seu login.");
                usuario = teclado.nextLine();
                    System.out.println("insira a sua senha.");
                    senha = teclado.nextLine();

                if (usuario == cliente.getUsuario() || senha == cliente.getSenha()){
                    System.out.println("Login efetuado com sucesso!");
                    System.out.println("");
                }
            }

        }while(opcao!=3);
    }
}