public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
    System.out.println("TV ligada");
  }

  public void desligar() {
    ligada = false;
    System.out.println("TV desligada");
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void mudarCanal(int novoCanal) {
      canal = novoCanal;
      System.out.println("Você está no canal: " + canal);
  }

  public void aumentarCanal() {
    canal++;
    System.out.println("Você está no canal: " + canal);
  }

  public void diminuirCanal() {
    canal--;
    System.out.println("Você está no canal: " + canal);
  }
}
