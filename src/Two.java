//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
//efekjfewf
public class One {
  String message = "foo";

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
    System.out.println("Alwal" + 123);
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
    System.out.println(foo());
  }
}
