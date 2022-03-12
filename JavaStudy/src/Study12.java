
public class Study12 {
  public static void main(String[] args) {
    Point3D p = new Point3D();
    p.x = 3;
    p.y = 5;
    p.z = 7;
    System.out.println(p.getLocation());
  }
}


class Point3 {
  int x;
  int y;

  String getLocation() {
    return "x:" + x + ", y :" + y;
  }
}


class Point3D extends Point3 {
  int z;

  // 조상의 getLocation()을 오버라이딩
  // 조상의 메서드를 자식에 맞게 바꾸면 해당 메서드가 메인에서 호출됨!
  // 즉, 오버라이딩 된 새로운게 호출된다고 보면됨 없다면 기존의 조상의 메서드가 호출!
  String getLocation() {
    return "x:" + x + ", y :" + y + ", z : " + z;
  }
}
