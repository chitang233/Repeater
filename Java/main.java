import java.util.Scanner;

public class main {
  public static void repeater(String inputText, int inputTimes) {
    for (int i = 0; i < inputTimes; i++) {
      System.out.println(inputText);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("iNpUt SoMe AwEsOmE tExTs PlEaSe: ");
    String inputText;
    inputText = sc.nextLine();
    System.out.print("hOw MaNy TiMeS dO yOu WaNt To RePeAt: ");
    int inputTimes;
    inputTimes = sc.nextInt();
    repeater(inputText, inputTimes);
  }
}