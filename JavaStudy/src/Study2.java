
public class Study2 {

  public static void main(String[] args) {
    System.out.println("Card.width = " + Card.width);
    System.out.println("Card.height = " + Card.height);

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 4;

    System.out.println(
        "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
    System.out.println(
        "c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
    System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");

    // c1 또는 c2 로 바꾸더라도 Card의 값이 동일하게 바뀌기 때문에
    // 오해의 소지가 없게 Card.라고 작성해줘야함!!
    Card.width = 50;
    Card.height = 80;

    System.out.println(
        "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
    System.out.println(
        "c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
  }
}


class Card {
  String kind;
  int number;
  static int width = 100;
  static int height = 250;
}
