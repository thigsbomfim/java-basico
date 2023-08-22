public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume(); //
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    smartTv.mudarCanal(13); // 13

    smartTv.aumentarCanal(); // 14

    smartTv.diminuirCanal(); // 13

    smartTv.ligar(); // true

    smartTv.desligar(); // false
  }
}
