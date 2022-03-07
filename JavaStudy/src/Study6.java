
public class Study6 {

  public static void main(String[] args) {
    Data3 d = new Data3();
    d.x = 10;

    // d2가 먼저 생성후 copy 메서드를 호출
    // copy는 복사한 객체의 주소를 가져와서 d2에 넣어줌
    // copy 메서드가 참조형 반환타입이기 때문에 변수의 타입과 일치해야함
    // 즉, 참조형 반환타입은 받는 것도 참조형이여야함!!!
    Data3 d2 = copy(d);
    System.out.println("기존 x : " + d.x);
    System.out.println("copy 이후 x : " + d2.x);
  }

  // 반환타입이 참조형!
  static Data3 copy(Data3 d) {
    // tmp에 새로운 객체를 저장
    Data3 tmp = new Data3();
    // d.x의 값을 tmp.x의 값으로 넣어줌! 즉 10을 넣음
    tmp.x = d.x;
    // 복사한 객체의 주소를 반환
    return tmp;
  }
}


class Data3 {
  int x;
}
