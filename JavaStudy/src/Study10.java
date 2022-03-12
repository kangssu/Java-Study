
public class Study10 {
  public static void main(String[] args) {

    SmartTv stv = new SmartTv();

    // 만약 부모 클래스인 Tv의 값이 없다면 아래 오류 발생!
    // 즉 부모(조상) 클래스의 변경은 자식 클래스에 영향을 미치지만
    // 자식 클래스 변경은 부모(조상) 클래스에 영향을 미치지 않음!!
    stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
    stv.channelUp(); // 조상 클래스로부터 상속받은 멤버
    System.out.println(stv.channel);
    stv.displavCaption("Hello, World");
    stv.caption = true;
    stv.displavCaption("Hello, World");
  }
}


// 부모 멤버는 5개!
class Tv {
  boolean power; // 전원상태(on/off)
  int channel; // 채널

  void power() {
    power = !power;
  }

  void channelUp() {
    ++channel;
  }

  void channelDown() {
    --channel;
  }
}


// 자식의 멤버는 2개와 부모 멤버 5개해서 총 7개!
class SmartTv extends Tv {
  boolean caption;

  void displavCaption(String text) {
    if (caption) {
      System.out.println(text);
    }
  }
}
