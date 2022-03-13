
class Time {
  // private는 Time 클래스 안에서만 사용이 가능함
  private int hour; // 0~23사이의 값을 가져야함.
  private int minute;
  private int second;

  public void setHour(int hour) {
    // true면 return이고 flase면 값을 바꿔줌
    if (isNotValidHour(hour))
      return;
    this.hour = hour;
  }

  // 해당 클래스에서 올바른 값일 때만 값을 변경해주기 위함
  // 즉, 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드!
  // 해당 클래스에서만 사용되는 메서드이기 때문에 private를 사용함
  private boolean isNotValidHour(int hour) {
    return hour < 0 || hour > 23;
  }

  public int getHour() {
    return hour;
  };
}


public class Study15 {
  public static void main(String[] args) {
    Time t = new Time();
    // t.hour = 25; //에러 발생(private는 다른 클래스에서 사용 불가)
    t.setHour(21);
    System.out.println(t.getHour());
    t.setHour(100);
    System.out.println(t.getHour()); // isNotValidHour에서 리턴되서 값 변경이 안됨, 조건에 맞지 않음!
  }
}
