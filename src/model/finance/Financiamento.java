package model.finance;

// Classe model.finance.Financiamento
public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel(){
        return valorImovel;
    }

    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return  taxaJurosAnual;
    }

    // Método para calcular o pagamento mensal
    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12.0 / 100.0;
        return (valorImovel / prazoFinanciamento) * (1 + taxaMensal);
    }

    // Método para calcular o total do pagamento
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento;
    }

    public void mostrarDadosFinanciamento(){
        System.out.println("Dados do financiamento:");
        System.out.println("Valor do Imóvel: R$" + valorImovel);
        System.out.println("Prazo do Financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + taxaJurosAnual + "%");
        System.out.println("Pagamento Mensal: R$" + calcularPagamentoMensal());
        System.out.println("Total do Pagamento: R$" + calcularTotalPagamento());
    }
}
