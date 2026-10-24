public class NekoE2E {
  public static void main(String[] args) {
    int unused = 1;
    String q = "SELECT * FROM users WHERE id = " + args[0];
    System.out.println(q);
  }
}
