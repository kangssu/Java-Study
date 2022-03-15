abstract class Player { // 추상 메서드를 가지고 있는 추상 클래스(미완성 클래스, 미완성 설계도)
  abstract void play(int pos); // 구현부{}가 없는 추상 메서드(미완성 메서드)

  abstract void stop(); // 추상 메서드
}


// 추상 클래스는 상속을 통해 완성을 해야 객체 생성이 가능함
class AudioPlayer extends Player {
  // 만약 아래 2개 메서드중 1개라도 구현을 안하면 오류 발생
  // Player를 상속받았기 때문에 전부 들어있기 때문!
  // 2개 다 구현하거나 abstract를 class 앞에 붙여야함!
  // 그러면 메인 메서드에서 객체 생성이 불가능해짐
  void play(int pos) {
    System.out.println(pos + "위치부터 Play 합니다.");
  }

  void stop() {
    System.out.println("재생을 멈춥니다.");
  }
}


public class Stusy19 {
  public static void main(String[] args) {
    // Player p = new Player(); //추상 클래스의 객체 생성할 수 없음(미완성 클래스이기 때문!)
    // AudioPlayer ap = new AudioPlayer(); // 추상 클래스를 상속받아서 구현부를 완성해주면 객체 생성 가능함
    Player ap = new AudioPlayer(); // 다형성! Player은 리모컨이라고 생각하면 되고 실제 가르키는 객체는 AudioPlayer!
    ap.play(100);
    ap.stop();
  }
}
