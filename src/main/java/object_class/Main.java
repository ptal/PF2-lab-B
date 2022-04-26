package object_class;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Weapon w = new Axe();
    Weapon w2 = new Hammer();
    Weapon w3 = new Hammer(10);
    Weapon a1 = new MithrillAxe(true);
    Weapon a2 = new MithrillAxe(false);

    System.out.println("I. Method toString\n");
    System.out.println("w = " + w);
    System.out.println("w2 = " + w2);
    System.out.println("w3 = " + w3);
    System.out.println("a1 = " + a1);
    System.out.println("a2 = " + a2);

    System.out.println("\n\nII. Method equals\n");
    equalWeapon(w, w2, false);
    equalWeapon(w2, w2, true);
    System.out.println("Comparing an axe and hammer of similar damages:");
    equalWeapon(w, w3, false);
    equalWeapon(w, w2, false);
    equalWeapon(a1, a2, false);
    // Symmetric. (unsymmetric version as comments in MithrillAxe).
    System.out.println("Symmetric test:");
    equalWeapon(w, a1, true);
    equalWeapon(a1, w, true);
    // Not transitive
    System.out.println("Transitive test:");
    equalWeapon(a1, w, true); // is true and
    equalWeapon(w, a2, true); // is true, but
    equalWeapon(a1, a2, false); // is false.
    // ArrayList collection
    ArrayList<Weapon> s = new ArrayList<>();
    s.add(w2);
    s.add(a1);
    s.add(a2);
    System.out.println(expect(s.contains(new Hammer()), true));

    System.out.println("\n\nIII. Method hashCode\n");
    HashSet<Weapon> store = new HashSet<>();
    store.add(new Axe());
    store.add(new MithrillAxe(true));
    store.add(new MithrillAxe(false));
    store.add(new Axe());
    store.add(new MithrillAxe(true));
    expect(store.size() == 3, true);
    System.out.println(store.size());

    System.out.println("\n\nIV. Method clone\n");
    Weapon a1b = a1.clone();
    Weapon a1c = a1.clone();
    equalWeapon(a1, a1b, true);
    equalWeapon(a1, a1c, true);
    equalWeapon(a1b, a1c, true);
    Weapon a2b = a2.clone();
    equalWeapon(a2b, a2, true);
    equalWeapon(a2b, a1, false);
  }

  private static void equalWeapon(Weapon x, Weapon y, boolean expected) {
    boolean res = expect(x.equals(y), expected);
    if(res) {
      System.out.println("Same weapons!");
    }
    else {
      System.out.println("Different weapons!");
    }
  }

  private static boolean expect(boolean obtained, boolean expected) {
    if(obtained == expected) {
      System.out.print("OK~");
    }
    else {
      System.out.print("KO~");
    }
    return obtained;
  }
}