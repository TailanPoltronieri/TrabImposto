class Imposto {
    private Pessoa pessoa;

    public Imposto(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Cálculo do imposto sobre salário
    public double calcularImpostoSalario() {
        double salarioMensal = pessoa.getRendaSalario() / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return pessoa.getRendaSalario() * 0.10;
        } else {
            return pessoa.getRendaSalario() * 0.20;
        }
    }

    // Cálculo do imposto sobre prestação de serviço
    public double calcularImpostoServico() {
        return pessoa.getRendaServico() * 0.15;
    }

    // Cálculo do imposto sobre ganho de capital
    public double calcularImpostoGanhoCapital() {
        return pessoa.getRendaGanhoCapital() * 0.20;
    }

    // Cálculo do imposto bruto total
    public double calcularImpostoBrutoTotal() {
        return calcularImpostoSalario() + calcularImpostoServico() + calcularImpostoGanhoCapital();
    }

    // Cálculo das deduções
    public double calcularAbatimento() {
        double impostoBrutoTotal = calcularImpostoBrutoTotal();
        double maximoDedutivel = impostoBrutoTotal * 0.30;
        double gastosDedutiveis = pessoa.getGastosMedicos() + pessoa.getGastosEducacionais();
        return Math.min(maximoDedutivel, gastosDedutiveis);
    }

    // Cálculo do imposto final devido
    public double calcularImpostoDevido() {
        return calcularImpostoBrutoTotal() - calcularAbatimento();
    }

    // Cálculo do máximo dedutível
    public double calcularMaximoDedutivel() {
        return calcularImpostoBrutoTotal() * 0.30;
    }

    // Total de gastos dedutíveis
    public double calcularGastosDedutiveis() {
        return pessoa.getGastosMedicos() + pessoa.getGastosEducacionais();
    }
}
