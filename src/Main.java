import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Cliente> clientes = new ArrayList<>();

    // Variavel para atualização dos IDs dos clientes
    private static int idClente = 0;
    static List<Banco> bancos = new ArrayList<>();
    private static int IdBanco= 0;


    //-----------------------------------------------
    // Método para listagem dos objetos existentes na lista de clientes
    private static void listarCliente() {

        System.out.println("Lista dos clientes Cadastrados");
        System.out.println("------------------------------");
        for (int i = 0; i < clientes.size(); ++i) {
            Cliente obj = (Cliente) clientes.get(i);
            System.out.println("Id: " +

                    obj.getIdCliente() + "\n Nome:" + obj.getNome() + "\n CPF:" + obj.getCpf()+"\n Cidade: "+obj.getEndereco().getCidade()+"\n Bairro: "+obj.getEndereco().getBairro()+"\n Logradouro: "+obj.getEndereco().getLogradouro());

        }
        System.out.println("------------------------------\n");
    }

    // Método para recepção dos dados para Classe Cliente
    private static void cadastrarCliente() {
        Scanner leitorC = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Endereco endereco= new Endereco();
        System.out.print("Nome do cliente: ");
        cliente.setNome(leitorC.nextLine());
        System.out.println("Endereço");
        System.out.println("Cidade:");
        endereco.setCidade(leitorC.nextLine());
        System.out.println("Bairro:");
        endereco.setBairro(leitorC.nextLine());
        System.out.println("Logradouro:");
        endereco.setLogradouro(leitorC.nextLine());
        cliente.setEndereco(endereco);
        System.out.print("CPF............: ");
        cliente.setCpf(leitorC.nextLine());


        // Validação do CPF digitado e inclusão na lista de clientes
        if (cliente.isCPF(cliente.getCpf()) == true) {
            // atualiza id do cliente automaticamente e grava na lista
            idClente++;
            cliente.setIdCliente(idClente);
            clientes.add(cliente);
        } else {
            System.out.printf("Erro, CPF invalido, prestenção !!!\n");
        }
    }
    public static void CadastrarBanco(){
        Banco banco= new Banco();
        Scanner leitorC = new Scanner(System.in);
        String Banco;
        System.out.println("Cadastrar banco:");
        banco.setNome(leitorC.nextLine());
        System.out.println("Número do banco:");
        banco.setNumero(leitorC.nextInt());
        IdBanco++;
        banco.setIdBanco(IdBanco);
        banco.setNome(banco.nome);
        bancos.add(banco);


    }
    public static void ListarBanco(){

        System.out.println("------------------------------\n");
        System.out.println("Lista dos Bancos");
        System.out.println("------------------------------");
        for (int i = 0; i < bancos.size(); ++i) {
            Banco obj = (Banco) bancos.get(i);
            System.out.println("Id: " + obj.getIdBanco() + " \nNome do banco: " + obj.getNome()+" \nNumero do Banco: "+obj.getNumero());

        }
        System.out.println("------------------------------\n");
    }



    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc1;
        while (true) {
            //clearConsole();
            System.out.println("-------------------------------|");
            System.out.println("|      Escolha uma opção:      |");
            System.out.println("| 1- CLIENTES                  |");
            System.out.println("| 2- BANCO                     |");
            System.out.println("| 3- SAIR                      |");
            System.out.println("|------------------------------|");
            int opcao;
            try {
                sc1 = new Scanner(System.in);
                opcao = sc1.nextInt();
                sc1.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Caracter inserido não compatível!");
                continue;
            }

            if (opcao == 3) {

                break;
            } else {
                switch (opcao) {
                    case 1:
                        // loop para cotrolar o encadeamento das telas
                        while (true) {

                            System.out.println("-------------------------------|");
                            System.out.println("|      Escolha uma opção:      |");
                            System.out.println("| 1- CADASTRAR CLIENTE         |");
                            System.out.println("| 2- LISTAR CLIENTE            |");
                            System.out.println("| 3- VOLTAR                    |");
                            System.out.println("|------------------------------|");

                            try {
                                opcao = sc1.nextInt();
                                sc1.nextLine();
                            } catch (InputMismatchException exception) {
                                System.out.println("Opção Inválida!");
                                continue;
                            }
                            if (opcao == 3) {

                                break;
                            }
                            else {
                                switch (opcao) {
                                    case 1:
                                        cadastrarCliente();
                                        break;
                                    case 2:
                                        listarCliente();
                                        break;
                                    default:
                                        System.out.println("Opção invalida");
                                }
                            }
                        }

                    case 2:

                        while (true) {
                            System.out.println("-------------------------------|");
                            System.out.println("|      Escolha uma opção:      |");
                            System.out.println("| 1- CADASTRAR BANCO           |");
                            System.out.println("| 2- LISTAR BANCO              |");
                            System.out.println("| 3- VOLTAR                    |");
                            System.out.println("|------------------------------|");

                            try {
                                opcao = sc1.nextInt();

                            } catch (InputMismatchException exception) {
                                System.out.println("Opção Inválida!");
                                continue;
                            }
                            if (opcao == 3) {
                                break;
                            } else {
                                switch (opcao) {
                                    case 1:
                                        CadastrarBanco();
                                        break;
                                    case 2:
                                        ListarBanco();
                                        break;
                                    case 3:

                                        break;
                                    default:
                                        System.out.println("Opção invalida");
                                }
                            }
                        }
                }
            }
        }
    }
}