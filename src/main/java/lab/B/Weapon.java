package lab.B;

public abstract class Weapon {
  protected int damage;

  public Weapon(int damage) {
    this.damage = damage;
  }

  @Override public boolean equals(Object o) {
    if(o == this) {
      return true;
    }
    else if (!(o instanceof Weapon)) {
      return false;
    }
    else {
      return ((Weapon)o).damage == damage;
    }
  }

  @Override public int hashCode() {
    return damage;
  }

  @Override public String toString() {
    return damage + " damages";
  }
}