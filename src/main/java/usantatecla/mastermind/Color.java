package usantatecla.mastermind;

enum Color {
  RED("R"), BLUE("B"), YELLOW("Y"), GREEN("G"), ORANGE("O"), PURPLE("P");

  private String symbol;

  Color(String symbol){
    this.symbol = symbol;
  }

  public static Color getColor(int number){
    return Color.values()[number];
  }

  public String getSymbol(){
    return this.symbol;
  }

  public static Color getColorBySymbol(String symbol){
    for (Color color: Color.values()){
      if (color.getSymbol().equalsIgnoreCase(symbol)) return color;
    }
    return null;
  }

  public static String getAllSymbols(){
    String values = "";
    for(Color color: Color.values()){
      values = values + color.getSymbol();
    }
    return values;
  }
}
