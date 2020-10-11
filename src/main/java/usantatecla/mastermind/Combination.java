package usantatecla.mastermind;

import java.util.Random;

public abstract class Combination {

  protected static final int MAX_COLORS = 4;
  protected final Color[] colors;

  public Combination() {
    this.colors = new Color[MAX_COLORS];
  }

  protected String colorsToString(){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i< MAX_COLORS; i++){
      sb.append(colors[i].getSymbol());
    }
    return sb.toString();
  }

  public abstract void writeCombination();
}
