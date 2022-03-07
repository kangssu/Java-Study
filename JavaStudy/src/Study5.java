
public class Study5 {

  // 아래의 예시로 확인할 수 있는 것은 참조형 매개변수는 읽기,쓰기 가능함
  public static void main(String[] args) {
    Data2 d = new Data2();
    d.x = 10;
    System.out.println("x : " + d.x);

    // 여기서 참조형 매개변수가 변경됨!
    change(d);
    System.out.println("change 메서드 이후 x : " + d.x);

  }

  // 참조형 매개변수는 아예 복사를 해준다고 생각하면됨!
  // 즉 리모컨 통째로 주기 때문에 해당 값을 읽거나 쓰기가 가능함!
  static void change(Data2 d) {
    d.x = 1000;
    System.out.println("변경된 x : " + d.x);
  }

}


class Data2 {
  int x;
}
