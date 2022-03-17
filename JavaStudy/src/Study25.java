
public class Study25 {
  private int outerIv = 0;
  static int outerCv = 0;

  class InstanceInner {
    // 외부 클래스의 private 멤버도 가능한 이유는 결국 같은 클래스안에 들어있기 때문!
    int liv = outerIv;
    int liv2 = outerCv;
  }

  static class StaticInner {
    // static 클래스는 외부 클래스의 인스턴스에 접근 불가능!
    // int siv = outerIv;
    static int scv = outerCv;
  }

  void myMethod() {
    // JDK1.8부터 final 생략 가능!
    int lv = 0; // 값이 바뀌지 않은 변수는 상수로 간주함, 만약 값을 바꾸면 상수가 아니게 되서 아래 코드에서 에러 발생
    final int LV = 0;

    // 지역 내부 클래스는 변수는 안되고 상수만 가능함!
    // 지역변수는 메서드 종료와 함께 소멸됨
    class LocalInner {
      // 내부 클래스의 객체가 더 오래 존재 가능함(지역변수보다)
      int liv = outerIv;
      int liv2 = outerCv;

      // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능함
      // 현재는 전부 final이 생략되어서 들어가 있기 때문에 상관없이 가능함(값만 변경안되면!)
      int liv3 = lv;
      int liv4 = LV;
    }
  }
}
