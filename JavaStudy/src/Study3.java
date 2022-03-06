
public class Study3 {

  public static void main(String[] args) {
    MyMath mm = new MyMath();
    long result1 = mm.add(5L, 3L); // add 메서드 호출
    long result2 = mm.subtract(5L, 3L); // subtract 메서드 호출
    long result3 = mm.multiply(5L, 3L); // multiply 메서드 호출
    double result4 = mm.divide(5L, 3L); // divide 메서드 호출
    long result5 = mm.test(5L, 3L);
    long result6 = mm.test2(5L, 3L);
    mm.printGugudan(3);

    System.out.println("add = " + result1);
    System.out.println("subtract = " + result2);
    System.out.println("multiply = " + result3);
    System.out.println("divide = " + result4);
    System.out.println("test =" + result5);
    System.out.println("test2 =" + result6);
  }

}


class MyMath {
  void printGugudan(int dan) {
    if (!(2 <= dan && dan <= 9)) {
      return; // 입력받은 단이 2~9가 아니면 메서드 종료하고 돌아가기!
    }

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d + %d = %d%n", dan, i, dan * i);
    }
  }

  long add(long a, long b) {
    long result = a + b;
    return result;
  }

  // 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성!
  long test(long a, long b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // 위와 반대
  long test2(long a, long b) {
    return a > b ? b : a;
  }

  long subtract(long a, long b) {
    return a - b;
  }

  long multiply(long a, long b) {
    return a * b;
  }

  double divide(double a, double b) {
    return a / b;
  }

}
