package lab.B;

public class Hammer extends Weapon implements Cloneable {
  private static final int DAMAGE = 20;
  public Hammer() {
    super(DAMAGE);
  }

  @Override public String toString() {
    return "Hammer of " + super.toString();
  }

  @Override public Hammer clone() {
    Hammer hammer = new Hammer();
    hammer.damage = damage;
    return hammer;
  }
}