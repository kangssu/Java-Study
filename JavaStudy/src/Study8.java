
public class Study8 {
  public static void main(String[] args) {
    Data_1 d1 = new Data_1();
    Data_2 d2 = new Data_2();
  }
}


// 클래스를 만들때 기본 생성자를 넣는걸 습관으로 만들자!
class Data_1 {
  int value;
  // 만약 생성자가 없다면 컴파일러가 자동으로 생성자 만들어줌
  // Data_1(){} 이렇게 기본 생성자 넣어줌
  // 만약 생성자가 1개라도 있으면 기본 생성자를 넣어주지 않음
}


class Data_2 {
  int value;

  Data_2() {} // 기본 생성자

  Data_2(int x) { // 매개변수가 있는 생성자!
    value = x;
  }
}
