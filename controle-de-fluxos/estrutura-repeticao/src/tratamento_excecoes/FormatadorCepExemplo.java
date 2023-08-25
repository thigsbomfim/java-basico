package tratamento_excecoes;

public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formataCep("2376064");
      System.out.println(cepFormatado);

    } catch (CepInvalidoException e) {
      System.out.println("O cep não corresponde com as regras do negócio.");
    }
  }

  static String formataCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8) throw new CepInvalidoException();

    // simulando um cep formatado
    return "23.765-064";
  }
}
