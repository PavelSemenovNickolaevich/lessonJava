public class MyFirstGame {
    public static void main(String[] args) {
        int numGamer = 50;
        int numComp = (int)Math.random()*101;
        if (numComp > numGamer) {
            System.out.println("Введенное вами число  меньше того, что загадал компьютер, ход следующего игрока");
        } else if (numComp < numGamer) {
            System.out.println("Введенное вами число  больше того, что загадал компьютер, ход следующего игрока ");
        } else if (numComp == numGamer) {
            System.out.println("Вы угадали");
        }
    }
}