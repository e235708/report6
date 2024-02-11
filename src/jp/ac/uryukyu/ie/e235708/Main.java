package jp.ac.uryukyu.ie.e235708;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JankenGame game = new JankenGame();

        System.out.println("じゃんけんゲームを開始します！");
        System.out.println("1: グー, 2: チョキ, 3: パー");

        System.out.print("あなたの手を選んでください (1-3): ");
        int userChoice = scanner.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("無効な選択です。1から3の数字を入力してください。");
            return;
        }

        Player player = new Player("あなた", Hand.fromChoice(userChoice));
        game.play(player);
    }
}