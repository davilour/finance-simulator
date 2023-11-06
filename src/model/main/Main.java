package model.main;

import model.finance.Financiamento;
import model.userinterface.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<>();

        // Adicione os financiamentos (você pode fazer isso em um loop, se necessário)
        double valorTotalImoveis = 0;
        double valorTotalFinanciamentos = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Financiamento " + i + ":");
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentos.add(financiamento);

            valorTotalImoveis += valorImovel;
            valorTotalFinanciamentos += financiamento.calcularTotalPagamento();

            System.out.println(String.format("Financiamento %d - valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f", i, valorImovel, financiamento.calcularTotalPagamento()));
        }

        System.out.println(String.format("Total de todos os imóveis: R$ %.2f", valorTotalImoveis));
        System.out.println(String.format("Total de todos os financiamentos: R$ %.2f", valorTotalFinanciamentos));
    }
}


