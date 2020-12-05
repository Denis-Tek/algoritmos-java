import java.util.ArrayList;
import java.util.List;

public class estatisticas {

  static double Soma(Double vetor[]) {
    int tamanhoVetor = vetor.length;

    double soma = 0;

    for (int i = 0; i < tamanhoVetor; i++)
      soma += vetor[i];

    return soma;
  }

  static double Media(Double vetor[]) {
    int tamanhoVetor = vetor.length;

    return Soma(vetor) / (double) tamanhoVetor;
  }

  static double Variancia(Double vetor[]) {
    int tamanhoVetor = vetor.length;

    double media = Media(vetor);

    double QuadradoDiferenca = 0;

    for (int i = 0; i < tamanhoVetor; i++)
      QuadradoDiferenca += Math.pow(vetor[i] - media, 2);

    return QuadradoDiferenca / tamanhoVetor;
  }

  static double DesvioPadrao(Double vetor[]) {
    return Math.sqrt(Variancia(vetor));
  }

  public static void main (String[] args) {

    List<Double> numeros = new ArrayList<>();

    for (int i = 0; i < args.length; i++)
      numeros.add(Double.parseDouble(args[i]));

    Double[] vetor = numeros.toArray(new Double[0]);

    System.out.print("Números: ");
    for (int i = 0; i < vetor.length; i++)
      System.out.print(vetor[i] + "  ");

    System.out.println();
    System.out.println("Qtde de Número: " + vetor.length);
    System.out.println("Soma: " + Soma(vetor));
    System.out.println("Média: " + Media(vetor));
    System.out.println("Variância: " + Variancia(vetor));
    System.out.println("Desvio Padrão: " + DesvioPadrao(vetor));
  }
}
