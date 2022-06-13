package classroomFive.encapsulation;

 public class Bird {

  public String color;
  private String name = "Polly";

  // varam piekļūt no citām klasēm
  public void printText() {
   System.out.println("Šī ir publiska metode");
   System.out.println("Printēju putnu");
   printTextSpecial();
  }

  // varam piekļūt tikai no šīs klases
  private void printTextSpecial() {
   System.out.println("Šī ir privāte metode");
  }

  // varam piekļūt pakotnes ietvaros
  void defaultMethodExample() {
   System.out.println("Šī ir default metode");
  }

}
