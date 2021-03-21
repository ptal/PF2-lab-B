package lab.B;

public class MithrillAxe extends Axe implements Cloneable {
  private boolean madeByDwarf;

  public MithrillAxe(boolean madeByDwarf) {
    super();
    this.madeByDwarf = madeByDwarf;
  }

  @Override public String toString() {
    String extra = madeByDwarf ? " made by a dwarf" : "";
    return "MithrillAxe of " + damage + " damages" + extra;
  }

  @Override public MithrillAxe clone() {
    MithrillAxe axe = new MithrillAxe(madeByDwarf);
    axe.damage = damage;
    return axe;
  }

  // // Not symmetric, neither transitive
  // @Override public boolean equals(Object o) {
  //   if(o == this) {
  //     return true;
  //   }
  //   else if (!(o instanceof MithrillAxe)) {
  //     return false;
  //   }
  //   else {
  //     return super.equals(o)
  //       && ((MithrillAxe) o).madeByDwarf == madeByDwarf;
  //   }
  // }

  // Still not transitive...
  @Override public boolean equals(Object o) {
    if(o == this) {
      return true;
    }
    else if(o.getClass() == Axe.class) {
      return super.equals(o);
    }
    else if (!(o instanceof MithrillAxe)) {
      return false;
    }
    else {
      return super.equals(o)
        && ((MithrillAxe) o).madeByDwarf == madeByDwarf;
    }
  }

  @Override public int hashCode() {
    return super.hashCode() * 10 + (madeByDwarf ? 1 : 0);
  }
}
