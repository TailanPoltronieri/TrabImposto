import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 0;
        do {
        // Entrada dos dados
        System.out.print("Renda anual com salário: ");
        double rendaSalario = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServico = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaGanhoCapital = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        // Criando o objeto Pessoa
        Pessoa pessoa = new Pessoa(rendaSalario, rendaServico, rendaGanhoCapital, gastosMedicos, gastosEducacionais);

        // Criando o objeto Imposto
        Imposto imposto = new Imposto(pessoa);

        // Criando o relatório
        Relatorio relatorio = new Relatorio(imposto);
        relatorio.gerarRelatorio();

        // Perguntar se deseja continuar
        System.out.print("\nDeseja fazer outra consulta? ( (1) para sim/ (0) para não): ");
        continuar = scanner.nextInt();

        }while(continuar == 1);
        scanner.close();
    }
}
