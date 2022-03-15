abstract class Unit2 {
  int x, y;

  abstract void move(int x, int y);

  void stop() {
    System.out.println("멈춥니다.");
  }
}


interface Fightable { // 인터페이스의 모든 메서드는 public abstract, 예외없음
  void move(int x, int y); // public abstract가 생략됨

  void attack(Fightable f); // public abstract가 생략됨
}


class Fighter extends Unit2 implements Fightable {
  // 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안됨
  // 만약 아래에 안 써주면 default 이기 때문에 자손보다 접근제어자가 좁아지기 때문에 에러남
  public void move(int x, int y) {
    System.out.println("[" + x + "," + y + "]로 이동");
  }

  public void attack(Fightable f) {
    System.out.println(f + "를 공격");
  }

  Fightable getFightable() {
    Fighter f = new Fighter(); // Fighter를 생성해서 반환
    return f; // (Fightable)이 f 앞에 생략된 것임! 형변환!
  }
}


public class Study21 {
  public static void main(String[] args) {
    Fighter f = new Fighter();
    Fightable f2 = f.getFightable(); // getFightable()의 반환 타입이 일치 해야함

    Unit2 u = new Fighter();
    Fightable fi = new Fighter();
    u.move(100, 200);
    // u.attack(new Fighter()); //Unit2에는 attack()이 없어서 호출불가
    u.stop();

    fi.move(100, 200);
    fi.attack(new Fighter());
    // f.stop(); // Fightable에는 stop()이 없어서 호출불가
  }
}
