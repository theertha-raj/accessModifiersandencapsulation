package accessModifiersAndEncapsulation;

public class PrivateSameClassAndPkg {
  private String name;
  private int age;

  private PrivateSameClassAndPkg(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("name:" + name);
    System.out.println("age:" + age);
  }

  public static void main(String[] args) {
    new PrivateSameClassAndPkg("Man", 24);
  }
}
