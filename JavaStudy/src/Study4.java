
public class Study4 {

  // 아래의 예시로 확인할 수 있는 것은 기본형 매개변수는 읽기만 가능함
  public static void main(String[] args) {
    // 객체를 생성!
    Data d = new Data();
    // x의 변수에 10을 대입!
    d.x = 10;
    // 출력은 당연히 10!
    System.out.println("기본 x 값 : " + d.x);

    // change 메서드 호출! 여기선 x는 1000!
    change(d.x);
    // 다시 change 메서드가 종료하면 기존의 x 값 호출됨!
    System.out.println("다시 기본 x 값 : " + d.x);

  }

  static void change(int x) {
    x = 1000;
    System.out.println("change의 x 값 : " + x);
  }
}


class Data {
  int x;
}
