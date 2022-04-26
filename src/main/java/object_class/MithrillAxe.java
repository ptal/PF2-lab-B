package object_class;

public class MithrillAxe extends Axe {
  private boolean madeByDwarf;

  public MithrillAxe(boolean madeByDwarf) {
    this.madeByDwarf = madeByDwarf;
  }

  @Override public String toString() {
    String extra = madeByDwarf ? " made by a dwarf" : "";
    return "MithrillAxe of " + damage + " damages" + extra;
  }

  @Override public MithrillAxe clone() {
    return (MithrillAxe)super.clone();
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

  // Still not transitive... but unfortunately, that's as good as it can be.
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
