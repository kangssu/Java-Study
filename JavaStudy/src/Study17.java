class Product {
  int price; // 제품의 가격
  int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가격의 10%
  }
}


class Tv1 extends Product {
  Tv1() {
    // 조상 클래스의 생성자 Product(int price)를 호출
    super(100); // Tv의 가격을 100만원으로 함
  }

  // Object 클래스의 toString()을 오버라이딩함
  public String toString() {
    return "Tv";
  }
}


class Computer extends Product {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}


class Buyer { // 고객, 물건을 사는 사람
  int money = 1000; // 소유금액
  int bonusPoint = 0; // 보너스점수

  // Product p에 new Tv1, new Computer 들어올 수 있음(다형성)
  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
      return;
    }

    money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺌
    bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가함
    System.out.println(p + "을/를 구입하셨습니다."); // 여기서 p는 p.toString과 동일함!
  }
}


public class Study17 {
  public static void main(String[] args) {
    Buyer b = new Buyer();

    // buy(Product p)를 호출, 해당 메서드에 조상 타입을 쓴다면 다형성에 의해서 자손들을 가르킬 수 있음!
    // 참조변수 없이 직접 넣을 수 있지만 리모컨(참조변수)가 없기 때문에 여기 내에서는 사용할 수 없음
    b.buy(new Tv1()); // Product p = new Tv1(); b.buy(p);와 동일한 코드!
    b.buy(new Computer());

    System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
    System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
  }
}

