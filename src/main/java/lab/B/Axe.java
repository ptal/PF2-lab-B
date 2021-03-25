package lab.B;

public class Axe extends Weapon implements Cloneable {
  private static final int DAMAGE = 10;
  public Axe() {
    super(DAMAGE);
  }

  @Override public String toString() {
    return "Axe of " + super.toString();
  }

  @Override public boolean equals(Object o) {
    return (o instanceof Axe) && super.equals(o);
  }

  @Override public Axe clone() {
    Axe axe = new Axe();
    axe.damage = damage;
    return axe;
  }
}