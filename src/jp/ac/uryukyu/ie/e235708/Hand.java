package jp.ac.uryukyu.ie.e235708;

import java.util.Random;

public enum Hand {
    グー, チョキ, パー;

    public static Hand fromChoice(int choice) {
        switch (choice) {
            case 1:
                return グー;
            case 2:
                return チョキ;
            case 3:
                return パー;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }

    public static Hand random() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
