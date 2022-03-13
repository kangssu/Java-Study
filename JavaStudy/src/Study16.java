
class Car {
  String color;
  int door;

  void drive() {
    System.out.println("drive,Brrrr~");
  }

  void stop() {
    System.out.println("stop!!");
  }
}


class FireEngine extends Car {
  void water() {
    System.out.println("water!!");
  }
}


public class Study16 {
  public static void main(String[] args) {
    Car car = null;
    // 참조변수간의 형변환이 중요한게 아닌 실제 가르키는 객체가 중요함!!!
    // 실제 가르키는 인스턴스의 객체의 개수를 넘으면 안됨!
    // FireEngine은 5개 이므로 전부 가능, 만약 Car로 생성했다면 4개까지! water 안됨
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = (Car) fe; // fe와 동일한 주소값을 가르킴, car 클래스는 조상이므로 조상 클래스에 해당하는 객체만 사용 가능함
    // car.water(); //에러 : Car 타입의 참조변수인 Car로는 water() 사용불가! 그 이유는 Car 클래스에 water 없음
    fe2 = (FireEngine) car; // 조상을 자손으로 형변환 하기 때문에 생략 불가능! 4개 > 5개 증가되므로 안전하지 않기 때문에 형변환은 꼭 써줘야함
    fe2.water();
  }
}
