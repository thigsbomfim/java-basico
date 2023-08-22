public class TiposVariaveis {
  public static void main(String[] args) throws Exception {
    // Tipos Primitivos
    // Estudar a classe String que representa texto na aplicação

    String meuNome = "Thiago";

    double salarioMinimo = 2500;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;

    // Usando casting explícito "()" para definir o tipo de uma variavel no seu valor
    // casting explícito é pouco usado e pode levar a perda de informação
    short numertoCurto2 = (short) numeroNormal; 

    int numero = 5;

    numero = 10;

    System.out.print(numero);
    
    // Declara a variavel para constante, onde não poderá ser alterada
    final double VALOR_DE_PI = 3.14; 

  }
}
