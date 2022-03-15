
public class Stusy20 {
  public static void main(String[] args) {
    // Unit[] group = {new Marine(), new Tank(), new Dropship() };
    // 위에 코드는 간략하게! 아래 코드와 동일하다고 보면됨
    // 객체 배열은 참조변수를 묶은 것!!!!!
    Unit[] group = new Unit[3];
    group[0] = new Marine();
    group[1] = new Tank();
    group[2] = new Dropship();

    // group의 타입은 Unit[]. group[0],group[1],group[2]의 타입은 Unit
    for (int i = 0; i < group.length; i++) {
      group[i].move(100, 200);
    }
  }
}


// 추상 메서드를 포함하기 때문에 Unit은 추상 클래스!
// 공통적으로 사용하는 객체들을 모으면 코드가 간결해짐
abstract class Unit {
  int x, y;

  // move는 공통적으로 선언부는 동일하되 구현부는 다르기 때문에 추상 메서드로 생성
  abstract void move(int x, int y);

  void stop() {}
}


class Marine extends Unit {
  void move(int x, int y) {
    System.out.println("Marine의 x:" + x + ", y :" + y);
  }

  void stimPack() {}
}


class Tank extends Unit {
  void move(int x, int y) {
    System.out.println("Tank의 x:" + x + ", y" + y);
  }

  void chabgeMode() {}
}


class Dropship extends Unit {
  void move(int x, int y) {
    System.out.println("Dropship의 x:" + x + ", y" + y);
  }

  void load() {}

  void unload() {}
}
