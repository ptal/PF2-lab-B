package object_class;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Weapon w = new Axe();
    Weapon w2 = new Hammer();
    Weapon w3 = new Hammer(10);
    Weapon a1 = new MithrillAxe(true);
    Weapon a2 = new MithrillAxe(false);
    System.out.println("w = " + w);
    System.out.println("w2 = " + w2);
    System.out.println("w3 = " + w3);
    System.out.println("a1 = " + a1);
    System.out.println("a2 = " + a2);
    equalWeapon(w, w2);
    equalWeapon(w2, w2);
    System.out.println("Comparing an axe and hammer of similar damages:");
    equalWeapon(w, w3);
    equalWeapon(w, w2);
    equalWeapon(a1, a2);
    // Not symmetric. (uncomment in MithrillAxe to see that).
    System.out.println("Symmetric test:");
    equalWeapon(w, a1);
    equalWeapon(a1, w);
    // Not transitive
    System.out.println("Transitive test:");
    equalWeapon(a1, w); // is true and
    equalWeapon(w, a2); // is true, but
    equalWeapon(a1, a2); // is false.
    // ArrayList collection
    ArrayList<Weapon> s = new ArrayList<>();
    s.add(w2);
    s.add(a1);
    s.add(a2);
    System.out.println(s.contains(new Hammer()));
    // Set collection
    HashSet<Weapon> store = new HashSet<>();
    store.add(new Axe());
    store.add(new MithrillAxe(true));
    store.add(new MithrillAxe(false));
    store.add(new Axe());
    System.out.println(store.size()); // prints 3.
  }

  private static void equalWeapon(Weapon x, Weapon y) {
    if(x.equals(y)) {
      System.out.println("Same weapons!");
    }
    else {
      System.out.println("Different weapons!");
    }
  }
}