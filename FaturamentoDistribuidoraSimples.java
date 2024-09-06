import java.util.Arrays;

public class FaturamentoDistribuidoraSimples {

    public static void main(String[] args) {
        double[] faturamento = {1200.50, 0.0, 3200.75, 0.0, 1500.00, 2200.25, 0.0, 3000.60};

        double[] faturamentoValido = Arrays.stream(faturamento)
                                           .filter(f -> f > 0)
                                           .toArray();

        if (faturamentoValido.length == 0) {
            System.out.println("Não há faturamento válido.");
            return;
        }

        double menorFaturamento = Arrays.stream(faturamentoValido).min().getAsDouble();
        double maiorFaturamento = Arrays.stream(faturamentoValido).max().getAsDouble();
        double mediaAnual = Arrays.stream(faturamentoValido).average().getAsDouble();

        long diasAcimaDaMedia = Arrays.stream(faturamentoValido).filter(f -> f > mediaAnual).count();

        // Exibe os resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}