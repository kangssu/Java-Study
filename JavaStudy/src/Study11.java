
public class Study11 {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.p.x = 1;
    c.p.y = 2;
    c.r = 3;
    System.out.println("c.p.x = " + c.p.x);
    System.out.println("c.p.y = " + c.p.y);
    System.out.println("c.r = " + c.r);
  }
}


class Point {
  int x;
  int y;
}


// class Circle extends Point { // 상속
// int r;
// }


class Circle { // 포함
  // 객체가 만들어져서 p에 명시적 초기화!
  // 즉 p,r은 0x100 주소값, 해당 p는 다시 객체가 생성되어 0x200 주소값을 넣어줌!!
  Point p = new Point(); // 참조변수의 초기화
  int r;
}
