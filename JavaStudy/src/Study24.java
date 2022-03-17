
public class Study24 {
  class InstanceInner {
    int iv = 100;
    // static int ca = 100; //인스턴스 내부 클래스는 static 변수 선언 안됨
    final static int CONST = 100; // final static은 상수여서 가능
  }

  static class StaticInner {
    int iv = 200;
    static int cv = 200; // static 클래스만 static 멤버를 정의 가능
  }

  void myMethod() {
    class LocalInner {
      int iv = 300;
      // static int cv = 300; //여기도 static 불가능
      final static int CONST = 300;
    }

    int i = LocalInner.CONST; // 해당 메서드 안에서만 사용 가능하고 메인 메서드 즉 밖에서는 사용 불가능!
  }

  public static void main(String[] args) {
    System.out.println(InstanceInner.CONST);
    System.out.println(StaticInner.cv);
    // System.out.println(LocalInner.CONST); //이건 에러!
  }

}
