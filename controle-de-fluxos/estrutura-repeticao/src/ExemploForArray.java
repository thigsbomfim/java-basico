public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "THIAGO", "RIAN", "MATHEUS", "THAIS" };

    // for clássico
    for(int i=0; i < alunos.length; i++) {
      System.out.println("O aluno do indice i = " + i + " é " + alunos[i]);
    }

    // for / each
    int indice = 0;
    for(String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
      indice++;
    }
  }
}
