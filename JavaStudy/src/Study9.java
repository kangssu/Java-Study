
public class Study9 {
  String color;
  String gearType;
  int door;

  // 같은 생성자에서 호출할 때는 this를 사용함
  // 호출할 때 첫줄에서만 가능함
  // 코드의 중복을 제거하려고 서로 호출하게 하는 것!
  Study9() {
    this("white", "auto", 4);
    // 만약 this 사용하지 않을 경우
    // 아래 코드와 위 코드를 비교하면 1줄 > 3줄 결국 코드중복 발생
    // color = "white";
    // gearType = "auto";
    // door = 4;
  }

  Study9(String color) {
    this(color, "auto", 4);
  }

  // 위에 생성자 2개 전부 아래 생성자를 호출함

  Study9(String color, String gearType, int door) {
    // 아래의 this는 지역변수와 인스턴스 변수를 구별하기 위함!
    // 즉 인스턴스 변수와 지역변수의 명칭이 동일한 경우에 꼭 this 써줘야함
    // 만약 없다면 둘다 지역변수로 인식되버림
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
}
