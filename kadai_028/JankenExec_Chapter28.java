package kadai_026;

public class JankenExec_Chapter26 {
  public static void main(String[] args) {
    Janken_Chapter26 janken = new Janken_Chapter26();
    String myChoice = janken.getMyChoice();
    String random = janken.getRandom();
    janken.playGame(myChoice, random);
  }
}
