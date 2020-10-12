package es.mastercloud.mastermind;

enum Color {
  RED("R"), BLUE("B"), YELLOW("Y"), GREEN("G"), ORANGE("O"), PURPLE("P");

  private String symbol;

  private Color(String symbol){
    this.symbol = symbol;
  }

  static Color getColor(int number){
    return Color.values()[number];
  }

  String getSymbol(){
    return this.symbol;
  }

  static Color getColorBySymbol(String symbol){
    for (Color color: Color.values()){
      if (color.getSymbol().equalsIgnoreCase(symbol)) return color;
    }
    return null;
  }

  static String getAllSymbols(){
    String values = "";
    for(Color color: Color.values()){
      values = values + color.getSymbol();
    }
    return values;
  }
}
