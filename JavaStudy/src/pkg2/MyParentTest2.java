package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
  public void printMembers() {
    // System.out.println(prv); //같은 클래스가 아니여서 에러
    // System.out.println(dft); //같은 패키지가 아니여서 에러
    System.out.println(prt);
    System.out.println(pub);
  }
}


public class MyParentTest2 {

  public static void main(String[] args) {
    MyParent mp = new MyParent();
    // System.out.println(mp.prv);
    // System.out.println(mp.dft);
    // System.out.println(mp.prt);
    System.out.println(mp.pub); // public만 가능!
  }

}
