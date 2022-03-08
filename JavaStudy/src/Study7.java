
public class Study7 {

  // 오버로딩의 올바른 예!!
  // 메서드의 이름은 전부 동일하지만 매개변수의 타입이 전부 다름
  // 즉 예시 코드 add 메서드들은 전부 동일한 기능 수행함
  // 메서드 이름은 add, println,round 등으로 대부분 동사!

  public static void main(String[] args) {
    AddTest ad = new AddTest();
    System.out.println("int add 결과 : " + ad.add(3, 3));
    System.out.println("int and long 결과 : " + ad.add(3, 3L));
    System.out.println("long add 결과 : " + ad.add(3L, 3L));

    int[] a = {100, 200, 300};
    System.out.println("int[] add 결과 : " + ad.add(a));
  }
}


class AddTest {

  // 해당 타입에 맞게 호출해야 모호하다는 오류 없이 출력됨
  int add(int a, int b) {
    return a + b;
  }

  long add(int a, long b) {
    return a + b;
  }

  long add(long a, long b) {
    return a + b;
  }

  int add(int[] a) {
    int result = 0;
    for (int i = 0; i < a.length; i++) {
      result += a[i];
    }
    return result;
  }
}
