package object_class;

public class Hammer extends Weapon {
  private static final int DAMAGE = 20;
  public Hammer() {
    super(DAMAGE);
  }

  public Hammer(int damage) {
    super(damage);
  }
}