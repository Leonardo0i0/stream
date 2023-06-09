import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String usuario = null, email = null, senha, senha1;
        String nomeSerie, nomeAnime = null, nomeFilme, sinopse, categoria;
        int ano;
        float tempo,nota;
        int opcao, nivel, numero, x, c = 0, f = 0, s = 0, a = 0, resposta=0, temporada, epsodios;
        boolean loginEfetuado;

        Scanner teclado = new Scanner(System.in);

        ArrayList<cliente> clientes = new ArrayList<>();
        ArrayList<filme> filmes = new ArrayList<>();
        ArrayList<serie> series = new ArrayList<>();
        ArrayList<serie> animes = new ArrayList<>();

        cliente novoCliente = new cliente();
        cliente clienteLogado = null;

        filme filmeAtual = null;

        serie novaSerie = new serie();
        serie serieAtual = null;


        novoCliente.trocarnome("Leonardo");
        novoCliente.trocarnumero(123456);
        novoCliente.trocaremail("Leonardo@gmail.com");
        novoCliente.trocarsenha("654321");
        novoCliente.trocarnivel(5);
        clientes.add(novoCliente);


        do {
            System.out.println("1-Criar conta. \n2- Logar em uma conta.\n3-Sair.");
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
                    if (!senha.equals(senha1)) {
                        System.out.println("Senhas diferentes!");
                    }
                } while (!senha.equals(senha1));
                do {
                    System.out.println("Essas são as suas informações:");
                    System.out.println(usuario);
                    System.out.println(email);
                    System.out.println(numero);
                    System.out.println("Os dados estão corretos?");
                    opcao = teclado.nextInt();
                } while (opcao != 1);

                if (opcao == 1) {
                    novoCliente.trocarnome(usuario);
                    novoCliente.trocarnumero(numero);
                    novoCliente.trocarnome(usuario);
                    novoCliente.trocarsenha(senha);
                    clientes.add(novoCliente);
                    System.out.println("Conta criada com sucesso!.");
                }
                teclado.nextLine();
                do {
                    System.out.println("Qual dos nossos planos o senhos deseja?");
                    System.out.println("1- Plano Bronze");
                    System.out.println("2- Plano Prata");
                    System.out.println("3- plano Gold");
                    System.out.println("4- plano Diamante");
                    System.out.println("Selecione uma das opções para ter mais detalhes");
                    opcao = teclado.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("PLANO BRONZE.");
                            System.out.println("Qualidade de imagem de 480p.");
                            System.out.println("Acesso aos nossos produtos a partir de 1 mês após o lançamento.");
                            System.out.println("Sem compartilhamento de conta.");
                            System.out.println("Deseja assinar este serviço? 1 - Sim, 2 - Não");
                            resposta = teclado.nextInt();
                            if (resposta == 1) {
                                novoCliente.trocarnivel(opcao);
                                System.out.println("Assinatura realizada com sucesso!");
                            }
                            break;
                        case 2:
                            System.out.println("PLANO PRATA.");
                            System.out.println("Qualidade de imagem de 720p.");
                            System.out.println("Acesso aos nossos produtos a partir de 15 dias após o lançamento.");
                            System.out.println("Compartilhamento de conta com 1 pessoa.");
                            System.out.println("Deseja assinar este serviço? 1 - Sim, 2 - Não");
                            resposta = teclado.nextInt();
                            if (resposta == 1) {
                                novoCliente.trocarnivel(opcao);
                                System.out.println("Assinatura realizada com sucesso!");
                            }
                            break;
                        case 3:
                            System.out.println("PLANO GOLD.");
                            System.out.println("Qualidade de imagem de 1080p.");
                            System.out.println("Acesso aos nossos produtos a partir de 7 dias após o lançamento.");
                            System.out.println("Compartilhamento de conta com até 3 pessoas.");
                            System.out.println("Deseja assinar este serviço? 1 - Sim, 2 - Não");
                            resposta = teclado.nextInt();
                            if (resposta == 1) {
                                novoCliente.trocarnivel(opcao);
                                System.out.println("Assinatura realizada com sucesso!");
                            }
                            break;
                        case 4:
                            System.out.println("PLANO DIAMANTE.");
                            System.out.println("Qualidade de imagem de 480p.");
                            System.out.println("Acesso aos nossos produtos a partir de 1 mês após o lançamento.");
                            System.out.println("Sem compartilhamento de conta.");
                            System.out.println("Deseja assinar este serviço? 1 - Sim, 2 - Não");
                            resposta = teclado.nextInt();
                            if (resposta == 1) {
                                novoCliente.trocarnivel(opcao);
                                System.out.println("Assinatura realizada com sucesso!");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                } while (resposta != 1);

            } else {
                do {
                    System.out.println("Insira seu login.");
                    usuario = teclado.nextLine();
                    usuario = teclado.nextLine();

                    System.out.println("insira a sua senha.");
                    senha = teclado.nextLine();

                    loginEfetuado = false;
                    for (cliente cliente : clientes) {
                        if (usuario.equals(cliente.getUsuario()) && senha.equals(cliente.getSenha())) {
                            // Login efetuado com sucesso
                            System.out.println("Login efetuado com sucesso!");
                            clienteLogado = cliente;
                            loginEfetuado = true;
                            break;
                        }
                    }

                    if (loginEfetuado == false) {
                        System.out.println("Credenciais inválidas. Tente novamente.");
                    }
                }while (loginEfetuado != true);
                System.out.println("Nosso catalogo de:\n1-Filmes\n2-Series\n3-Animes\n4-Pesquisar Catalogo");
                if (clienteLogado.getNivel() == 5){
                    System.out.println("5-Editar catalogo");
                }
                System.out.println("Escolha qual o senhor deseja ver para ascessar o catalogo completo.");
                opcao = teclado.nextInt();

                do {
                    switch (opcao){
                        case 1:
                            for (x=0; x < filmes.size(); x++) {
                                filmeAtual = filmes.get(x);
                                nomeFilme = filmeAtual.getNome();
                                System.out.println(x + "-" + nomeFilme);
                            }
                            System.out.println("Qual filme deseja ascessar?");
                            opcao = teclado.nextInt();
                            filmeAtual = filmes.get(opcao);
                            System.out.println(filmeAtual.getNome());
                            System.out.println(filmeAtual.getAno());
                            System.out.println(filmeAtual.getCategoria());
                            System.out.println(filmeAtual.getSinopse());
                            System.out.println(filmeAtual.getTempo()+"H");
                            System.out.println("1-Iniciar\n2-Sair");
                            opcao = teclado.nextInt();
                            if (opcao == 1){
                                System.out.println("Reprodozindo filme");
                            }
                            System.out.println("1-Sair");
                            resposta = teclado.nextInt();
                            break;
                        case 2:
                            for (x=0; x < series.size(); x++) {
                                serieAtual = series.get(x);
                                nomeSerie = serieAtual.getNome();
                                System.out.println(x + "-" + nomeSerie);
                            }
                            System.out.println("Qual Serie deseja ascessar?");
                            opcao = teclado.nextInt();

                            serieAtual = series.get(opcao);
                            System.out.println(serieAtual.getNome());
                            System.out.println(serieAtual.getAno());
                            System.out.println(serieAtual.getCategoria());
                            System.out.println(serieAtual.getSinopse());
                            System.out.println(serieAtual.getTempo()+"H");
                            System.out.println("1-Iniciar\n2-Sair");
                            opcao = teclado.nextInt();
                            if (opcao == 1){
                                System.out.println(serieAtual.getTemporada()+"Temporadas.");
                                System.out.println("Qual temporada deseja assistir?");
                                opcao = teclado.nextInt();
                                temporada = opcao;

                                if (temporada > 0 && temporada <= serieAtual.getTemporada()){
                                    System.out.println(serieAtual.getEpsodio() + "Epsodios");
                                    System.out.println("Qual ep deseja assistir?");
                                    opcao = teclado.nextInt();
                                    if (opcao > 0 && opcao <= serieAtual.getEpsodio()){
                                        System.out.println("Reproduzir temporada" + temporada + "Epsodio" + opcao);
                                    }else {
                                        System.out.println("Epsodio inexistente");
                                    }
                                }

                            }
                            System.out.println("1-Sair");
                            resposta = teclado.nextInt();
                            break;
                        case 3:
                            for (x=0; x < animes.size(); x++) {
                                serieAtual = animes.get(x);
                                nomeSerie = serieAtual.getNome();
                                System.out.println(x + "-" + nomeSerie);
                            }
                            System.out.println("Qual anime deseja ascessar?");
                            opcao = teclado.nextInt();

                            serieAtual = animes.get(opcao);
                            System.out.println(serieAtual.getNome());
                            System.out.println(serieAtual.getAno());
                            System.out.println(serieAtual.getCategoria());
                            System.out.println(serieAtual.getSinopse());
                            System.out.println(serieAtual.getTempo()+"H");
                            System.out.println("1-Iniciar\n2-Sair");
                            opcao = teclado.nextInt();
                            if (opcao == 1){
                                System.out.println(serieAtual.getTemporada()+"Temporadas.");
                                System.out.println("Qual temporada deseja assistir?");
                                opcao = teclado.nextInt();
                                temporada = opcao;

                                if (temporada > 0 && temporada <= serieAtual.getTemporada()){
                                    System.out.println(serieAtual.getEpsodio() + "Epsodios");
                                    System.out.println("Qual ep deseja assistir?");
                                    opcao = teclado.nextInt();
                                    if (opcao > 0 && opcao <= serieAtual.getEpsodio()){
                                        System.out.println("Reproduzir temporada" + temporada + "Epsodio" + opcao);
                                    }else {
                                        System.out.println("Epsodio inexistente");
                                    }
                                }

                            }
                            System.out.println("1-Sair");
                            resposta = teclado.nextInt();
                            break;
                        case 4:
                            break;
                        case 5:
                            filme novoFilme = new filme();
                            if (clienteLogado.getNivel() == 5){
                                System.out.println("Seja bem vindo ADM:" + clienteLogado.getUsuario());
                                System.out.println("O senhor deseja: \n1-Adcionar ao catalogo\n2-Editar o catalogo\n3-excluir um item do catalogo");
                                opcao = teclado.nextInt();
                                switch (opcao){
                                    case 1:
                                        System.out.println("Ira adcionar \n1-Filme\n2-Serie\n3-Anome");
                                        resposta = teclado.nextInt();
                                        if (resposta == 1){
                                            do {
                                                System.out.println("nome do filme:");
                                                nomeFilme = teclado.nextLine();
                                                System.out.println("Sinopse:");
                                                sinopse = teclado.nextLine();
                                                System.out.println("Categoria:");
                                                categoria = teclado.nextLine();
                                                System.out.println("Ano de lançamento:");
                                                ano = teclado.nextInt();
                                                System.out.println("Duração do filme:");
                                                tempo = teclado.nextFloat();
                                                System.out.println("Nota atual do filme");
                                                nota = teclado.nextFloat();

                                                System.out.println("Verifique as informações a seguir");
                                                System.out.println("Nome: "+ nomeFilme);
                                                System.out.println("Snopse: " + sinopse);
                                                System.out.println("Categoria: " + categoria);
                                                System.out.println("Ano de lançamento: " + ano);
                                                System.out.println("Duração do filme: " + tempo);
                                                System.out.println("Nota do filme: " + nota );
                                                System.out.println("Estão corretas?1-Sim 2-Não");
                                                resposta = teclado.nextInt();
                                            }while (resposta != 1);

                                            novoFilme.trocarnome(nomeAnime);
                                            novoFilme.trocarsinopse(sinopse);
                                            novoFilme.trocarcategoria(categoria);
                                            novoFilme.trocarano(ano);
                                            novoFilme.trocartempo(tempo);
                                            novoFilme.trocarnota(nota);
                                            filmes.add(novoFilme);
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                }
                            }else {
                                System.out.println("Opção invalida");
                            }
                            break;
                        default:
                            System.out.println("Opção invalida");
                    }

                }while(resposta != 1);

            }

        } while (opcao != 3);
    }
}