package pkg1;

public class MyParent { // 접근제어자가 public
  private int prv; // 같은 클래스
  int dft; // 같은 패키지
  protected int prt; // 같은 패키지 + 자손(다른 패키지)
  public int pub; // 접근제한 없음

  // 같은 클래스이기 때문에 전부 사용 가능함
  public void printMembers() {
    System.out.println(prv);
    System.out.println(dft);
    System.out.println(prt);
    System.out.println(pub);
  }
}


class MyParentTest { // 접근 제어자가 (default)
  public static void main(String[] args) {
    MyParent mp = new MyParent();
    // System.out.println(mp.prv); // private일 경우 같은 클래스가 아니기 때문에 에러 발생
    System.out.println(mp.dft);
    System.out.println(mp.prt);
    System.out.println(mp.pub);
  }
}
