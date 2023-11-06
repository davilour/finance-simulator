package model.userinterface;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    // Método para pedir ao usuário o valor do imóvel


    public double pedirValorImovel() {
        double ValorImovel;
        do {
            System.out.print("Digite o valor do imóvel: ");
            ValorImovel = scanner.nextDouble();
            if (ValorImovel <= 0) {
                System.out.println("O valor do imóvel deve ser positivo. Tente novamente.");

            }

        }   while (ValorImovel <= 0);
        return ValorImovel;
    }

    // Método para pedir ao usuário o prazo do financiamento
    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        do{
            System.out.print("Digite o prazo de financiamento (em anos): ");
            prazoFinanciamento = scanner.nextInt();
            if(prazoFinanciamento <= 0){
                System.out.println("O prazo precisa ser maior que 0, digite novamente!");
            }
        }   while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }

    // Método para pedir ao usuário a taxa de juros
    public double pedirTaxaJuros() {
        double TaxaJuros;
        do{
            System.out.print("Digite a taxa de juros anual (%): ");
            TaxaJuros = scanner.nextDouble();
            System.out.println();
            if (TaxaJuros <= 0){
                System.out.println("A taxa de juros precisa ser maior que 0, digite novamente");
            }
        }  while (TaxaJuros < 0);
        return TaxaJuros;
    }
}
