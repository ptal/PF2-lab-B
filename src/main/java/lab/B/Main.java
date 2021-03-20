package lab.B;

public class Main {
  public static void main(String[] args) {
    Weapon w = new Axe();
    Weapon w2 = new Hammer();
    Weapon w3 = new Hammer();
    System.out.println("w = " + w);
    System.out.println("w2 = " + w2);
    System.out.println("w3 = " + w3);
    compare(w, w2);
    compare(w2, w2);
    compare(w2, w3);
  }

  private static void compare(Weapon x, Weapon y) {
    if(x.equals(y)) {
      System.out.println("Same weapons!");
    }
    else {
      System.out.println("Different weapons!");
    }
  }
}