public class Operadores {
  public static void main(String[] args) {
    // String nomeCompleto = "LINGUAGEM " + "JAVA";
    // System.out.println(nomeCompleto);

    // String concatenacao = "?"; 

    // concatenacao = 1+1+1+"1"; // 31

    // concatenacao = 1+"1"+1+1; // 1111

    // concatenacao = 1+"1"+1+"1"; // 1111

    // concatenacao = "1"+1+1+1; // 1111

    // concatenacao = "1"+(1+1+1); // 13

    // -------------------------------

    int numero = 5;

    // tornando o numero negativo
    numero = - numero; // -5

    // tornando o numero positivo
    numero = numero * -1; // 5

    // -------------------------------

    // Unarios

    // no exemplo abaixo, acontecem as mesmas coisas com a subtracao

    int iteracao = 5;

    iteracao++; // 8
    // é igual a
    iteracao = iteracao + 1; // 9


    // Usando o operador de incrementação antes (++iteracao),
    // o valor é incrementado antes da impressão.
    System.out.println(++iteracao); // Output: 10

    // Agora, o valor de iteracao é 9, e ao imprimi-lo, o valor será 9.
    System.out.println(iteracao); // Output: 10

    // Usando o operador de incrementação depois (iteracao++),
    // o valor é incrementado após a impressão.
    System.out.println(iteracao++); // Output: 10

    // Agora, o valor de iteracao é 10, pois foi incrementado na linha anterior.
    System.out.println(iteracao); // Output: 11


    // -------------------------------
    

    boolean variavel = true;

    // inverte o valor da variavel
    System.out.println(!variavel); // Output: false

    // ela continua sendo true, pois não reatribuimos ela dessa forma: variavel = !variavel;
    System.out.println(variavel); // Output: true


    // -------------------------------


    // Ternarios

    int a, b;

    a = 5;
    b = 6;

    // Forma sem usar ternarios
    // String resultado = "";
    // if(a==b)
    //   resultado = "verdadeiro";
    // else
    //   resultado = "falso";

    // Usando ternarios
    String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado); // falso


    // -------------------------------


    // Relacionais

    String nomeUm = "THIAGO";
    String nomeDois = new String("THIAGO");

    System.out.println(nomeUm == nomeDois); // false
    
    // método equals compara conteúdos, compara se o conteúdo dos dois objetos são iguais
    System.out.println(nomeUm.equals(nomeDois)); // true


    int numero1 = 1;
    int numero2 = 2;
    
    boolean simNao = numero1 == numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao); // false

    simNao = numero1 != numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao); // true

    simNao = numero1 > numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao); // false


    // -------------------------------


    // Lógicos

    boolean condicao1=true;

    boolean condicao2=false;

    /* 
      Aqui estamos utilizando o operador lógico E para fazer a união de duas 
      expressões. 
      É como se estivesse escrito:
      "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
    */

    if(condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");;

    //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");
    
  }
}
