package object_class;

public class Axe extends Weapon {
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
    return (Axe)super.clone();
  }
}