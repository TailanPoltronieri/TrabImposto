public class Conta {
    private Cliente cliente;
    private final double precoIngressoHomem = 10.0;
    private final double precoIngressoMulher = 8.0;
    private final double precoCerveja = 5.0;
    private final double precoRefrigerante = 3.0;
    private final double precoEspetinho = 7.0;
    private final double couvertArtistico = 4.0;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    // Cálculo do consumo total
    public double calcularConsumo() {
        return (cliente.getQtdCervejas() * precoCerveja) +
                (cliente.getQtdRefrigerantes() * precoRefrigerante) +
                (cliente.getQtdEspetinhos() * precoEspetinho);
    }

    // Cálculo do couvert artístico
    public double calcularCouvert() {
        if (calcularConsumo() > 30.0) {
            return 0.0;  // Isento de couvert
        }
        return couvertArtistico;
    }

    // Cálculo do ingresso
    public double calcularIngresso() {
        if (cliente.getSexo().equalsIgnoreCase("M")) {
            return precoIngressoHomem;
        } else {
            return precoIngressoMulher;
        }
    }

    // Cálculo do valor total a pagar
    public double calcularValorTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }

    // Geração do relatório
    public void gerarRelatorio() {
        System.out.println("\n### RELATÓRIO ###");
        System.out.printf("Consumo = R$ %.2f\n", calcularConsumo());

        if (calcularCouvert() == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", calcularCouvert());
        }

        System.out.printf("Ingresso = R$ %.2f\n", calcularIngresso());
        System.out.printf("Valor a pagar = R$ %.2f\n", calcularValorTotal());
    }
}
