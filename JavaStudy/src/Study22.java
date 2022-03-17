class A {
  // public void method(B b) 만약 B일 경우에 C를 사용하면 A클래스도 바꾸고 메인메서드도 바꿔야함
  public void method(I i) { // 인터페이스 I로 구현하면 더 이상 이 클래스는 수정 안해도됨
    i.method();
  }
}


// b클래스의 선언과 구현을 분리
interface I {
  public void method(); // 선언부
}


// B와 C 클래스에 I 인터페이스를 상속(구현)하면 오버라이딩을 통해 구현시킴
class B implements I {
  public void method() {
    System.out.println("b 클래스의 메서드");
  }
}


class C implements I {
  public void method() {
    System.out.println("c 클래스의 메서드");
  }
}


public class Study22 {

  public static void main(String[] args) {
    A a = new A();
    a.method(new C()); // A가 B를 사용(의존)
  }

}
