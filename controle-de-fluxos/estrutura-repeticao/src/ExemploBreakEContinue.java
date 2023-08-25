public class ExemploBreakEContinue {
  public static void main(String[] args) {
    for(int numero = 1; numero <= 5; numero++) {
      // break quebra o código, para a execução ao satisfazer a condição, nesse caso seria, 1,2
      // if(numero == 3) break;

      // Já o continue, pula a execução ao satisfazer a condição, nesse caso seria 1,2,4,5
      if(numero == 3) continue;


      System.out.println(numero);
    }
  }
}
