public class Three {
  String message = "foo";
  String message2 = "foo";
  String message3 = "foo";
  String message4 = "foo";

  public String foo() {
    return message;
  }

  public String foo1() {
    System.out.println(foo());
    return message;
  }

  public String foo2() {
    System.out.println(foo());
    return message;
  }

  public void uncoveredMethod() {
    System.out.println("Alwal Three" + 123);
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
  }
}
