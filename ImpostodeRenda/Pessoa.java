class Pessoa {
    private double rendaSalario;
    private double rendaServico;
    private double rendaGanhoCapital;
    private double gastosMedicos;
    private double gastosEducacionais;

    public Pessoa(double rendaSalario, double rendaServico, double rendaGanhoCapital, double gastosMedicos, double gastosEducacionais) {
        this.rendaSalario = rendaSalario;
        this.rendaServico = rendaServico;
        this.rendaGanhoCapital = rendaGanhoCapital;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    public double getRendaSalario() {
        return rendaSalario;
    }

    public double getRendaServico() {
        return rendaServico;
    }

    public double getRendaGanhoCapital() {
        return rendaGanhoCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}