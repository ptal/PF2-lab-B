package object_class;

public abstract class Weapon implements Cloneable {
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

  @Override protected Weapon clone() {
    try {
      return (Weapon)super.clone();
    }
    catch (CloneNotSupportedException e) {
      throw new AssertionError(); // Can't happen
    }
  }
}