public class Code2_16 {
  public static void main(String[] args) {
    System.out.println("あなたの名前を入力してください。");
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("あなたの年齢を入力してください。");
    String age = sc.nextLine();
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  }
}
