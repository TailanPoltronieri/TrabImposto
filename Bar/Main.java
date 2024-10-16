import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 0;
        do {
            // Entrada dos dados do cliente
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();

            System.out.print("Quantidade de cervejas: ");
            int qtdCervejas = scanner.nextInt();

            System.out.print("Quantidade de refrigerantes: ");
            int qtdRefrigerantes = scanner.nextInt();

            System.out.print("Quantidade de espetinhos: ");
            int qtdEspetinhos = scanner.nextInt();

            // Criando o objeto Cliente
            Cliente cliente = new Cliente(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

            // Criando o objeto Conta
            Conta conta = new Conta(cliente);

            // Gerando o relatório
            conta.gerarRelatorio();

            // Perguntar se deseja fazer outra consulta
            System.out.print("\nDeseja fazer outra consulta? ( (1) para sim/ (0) para não): ");
            continuar = scanner.nextInt();

        } while (continuar == 1);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
