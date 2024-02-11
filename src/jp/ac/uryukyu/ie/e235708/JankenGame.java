package jp.ac.uryukyu.ie.e235708;

public class JankenGame {
    private Judge judge = new Judge();

    public void play(Player player) {
        Player computer = new Player("コンピューター", Hand.random());
        System.out.println(player.getName() + ": " + player.getHand());
        System.out.println(computer.getName() + ": " + computer.getHand());

        judge.determineWinner(player, computer);
    }
}
