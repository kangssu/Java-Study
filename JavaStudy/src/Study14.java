
public class Study14 {
  public static void main(String[] args) {
    Point4D p4 = new Point4D(1, 2, 3);
  }
}


class Point5 {
  int x;
  int y;

  Point5(int x, int y) {
    this.x = x;
    this.y = y;
  }

  String getLocation() {
    return "x : " + x + ", y : " + y;
  }
}


class Point4D extends Point5 {
  int z;

  Point4D(int x, int y, int z) {
    // 무조건 첫줄에는 생성자 호출을 해야함
    // 만약 super가 없이 this.x=x;,this.y=y;라면 super(); 생성자가 호출됨
    // super()는 조상의 생성자 호출이므로 Point5()를 호출하는데 조상에 기본 생성자가 없음
    // 기본 생성자는 해당 클래스에 생성자가 없으면 자동 생성되지만 있다면 자동 생성되지 않음
    // 조상에 기본 생성자를 추가하거나 아래의 super(x,y)로 컴파일러 오류 해결 가능!!
    // 추가적으로 조상의 인스턴스 초기화는 자식의 생성자가 아닌 조상에서 하는게 맞음!
    super(x, y);
    this.z = z;
  }

  String getLocation() {
    return "x : " + x + ", y : " + y + ", z : " + z;
  }
}
