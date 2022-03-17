class AA { // AA는 BB의 외부 클래스(BB 클래스는 AA 클래스 안에서만 사용!)
  int i;
  BB b = new BB();

  class BB { // BB 클래스는 AA의 내부 클래스
    void method() {
      AA a = new AA();
      // 객체 생성 없이 외부 클래스의 멤버 접근 가능함
      // 원래 외부 클래스에 분리되어 있을때는 객체를 생성해서 접근 가능했었음
      System.out.println(a.i);
    }
  }
}


// CC 클래스에서 BB b = new BB(); 이런식으로 객체를 생성해서 사용할 수 없음
class CC {
}


public class Study23 {
  public static void main(String[] args) {

  }
}
