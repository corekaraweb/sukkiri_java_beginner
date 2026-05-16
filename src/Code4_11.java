public class Code4_11 {
  public static void main(String[] args) {
    int[] score = {20, 30, 40, 50, 80};
    int count = 0;
    for (int i = 0; i < score.length; i++) {
      if (score[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は：" + count);
  }
}
