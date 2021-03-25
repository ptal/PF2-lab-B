package lab.B;

public class Hammer extends Weapon implements Cloneable {
  private static final int DAMAGE = 20;
  public Hammer() {
    super(DAMAGE);
  }

  public Hammer(int damage) {
    super(damage);
  }

  @Override public String toString() {
    return "Hammer of " + super.toString();
  }

  @Override public boolean equals(Object o) {
    return (o instanceof Hammer) && super.equals(o);
  }

  @Override public Hammer clone() {
    Hammer hammer = new Hammer();
    hammer.damage = damage;
    return hammer;
  }
}