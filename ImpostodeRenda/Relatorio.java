class Relatorio {
    private Imposto imposto;

    public Relatorio(Imposto imposto) {
        this.imposto = imposto;
    }

    public void gerarRelatorio() {
        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", imposto.calcularImpostoSalario());
        System.out.printf("Imposto sobre serviços: %.2f\n", imposto.calcularImpostoServico());
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", imposto.calcularImpostoGanhoCapital());

        System.out.println("* DEDUÇÕES:");
        double impostoBrutoTotal = imposto.calcularImpostoBrutoTotal();
        double maximoDedutivel = imposto.calcularMaximoDedutivel();
        double gastosDedutiveis = imposto.calcularGastosDedutiveis();
        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);

        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f\n", imposto.calcularAbatimento());
        System.out.printf("Imposto devido: %.2f\n", imposto.calcularImpostoDevido());
    }
}