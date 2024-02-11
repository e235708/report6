package jp.ac.uryukyu.ie.e235708;

public class Judge {
    public void determineWinner(Player player, Player computer) {
        if (player.getHand() == computer.getHand()) {
            System.out.println("引き分けです！");
        } else if (
            (player.getHand() == Hand.グー && computer.getHand() == Hand.チョキ) ||
            (player.getHand() == Hand.チョキ && computer.getHand() == Hand.パー) ||
            (player.getHand() == Hand.パー && computer.getHand() == Hand.グー)
        ) {
            System.out.println(player.getName() + "の勝ちです！");
        } else {
            System.out.println(computer.getName() + "の勝ちです！");
        }
    }
}
