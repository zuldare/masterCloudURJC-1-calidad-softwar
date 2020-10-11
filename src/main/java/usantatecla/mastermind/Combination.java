package usantatecla.mastermind;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

  protected static final int MAX_COLORS = 4;
  protected List<Color> colors;

  protected Combination() {
    this.colors = new ArrayList<>();
  }

}
