
public class Study13 { // Study12와 이어짐
  public static void main(String[] args) {
    Point4 p = new Point4(3, 5);
    // System.out.println(p.toString());
    System.out.println(p); // toString()은 생략해도 값은 동일하게 출력됨
  }
}


class Point4 extends Object {
  int x;
  int y;

  // 객체 생성시 한 번에 값을 넣어 초기화 하려면 생성자를 만들어줘야함
  Point4(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Object 클래스의 toString()을 오버라이딩
  public String toString() { // 선언부는 동일하게 해야되기 때문에 우선 public 붙임
    return "x : " + x + ", y : " + y;
  }
}
