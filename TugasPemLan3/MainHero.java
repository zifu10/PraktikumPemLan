package TugasPemLan3;
import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Permainan Adu Hero");
        System.out.println("Player 1 : Silahkan masukkan Hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("============================");

        ClassHero player1 = new ClassHero();
        player1.initializeHero(scanner);

        System.out.println("Permainan Adu Hero");
        System.out.println("Player 2 : Silahkan masukkan Hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("============================");

        ClassHero player2 = createHero(scanner);

        int round = 1;
        while (player1.getHealth() > 0 && player2.getHealth() > 0 && round <= 20) {
            System.out.println("=================================================");
            System.out.println("=================================================");
            System.out.println("Ronde " + round);
            playerAttack(player1, player2);
            if (player2.getHealth() > 0) {
                playerAttack(player2, player1);
            }
            round++;
        }

        if (player1.getHealth() <= 0 && player2.getHealth() <= 0) {
            System.out.println("Draw! kedua player memiliki 0 health point.");
        } else if (player1.getHealth() <= 0) {
            System.out.println("Player 2 wins!");
        } else if (player2.getHealth() <= 0) {
            System.out.println("Player 1 wins!");
        } else {
            if (player1.getHealth() > player2.getHealth()) {
                System.out.println("Player 1 wins! Lebih banyak health point setelah 20 ronde.");
            } else if (player2.getHealth() > player1.getHealth()) {
                System.out.println("Player 2 wins! Lebih banyak health point setelah 20 ronde.");
            } else {
                System.out.println("Draw! Kedua player memiliki jumlah health point yang sama setelah 20 ronde.");
            }
        }

        scanner.close();
    }

    public static ClassHero createHero(Scanner scanner) {
        System.out.printf("%-20s : ", "Nama Hero");
        String name = scanner.nextLine();
        System.out.printf("%-20s : ", "Health Point");
        float health = scanner.nextFloat();
        System.out.printf("%-20s : ", "Attack");
        float attack = scanner.nextFloat();
        System.out.printf("%-20s : ", "Defense");
        float defense = scanner.nextFloat();
        scanner.nextLine(); 

        return new ClassHero(name, health, attack, defense);
    }

    public static void playerAttack(ClassHero attacker, ClassHero defender) {
        System.out.printf("%s menyerang %s\n", attacker.getName(), defender.getName());
        float damage = Math.max(0, attacker.getAttack() - defender.getDefense());
        float healthAfterAttack = Math.max(0, defender.getHealth() - damage);
        float actualDamage = defender.getHealth() - healthAfterAttack;
        defender.takeDamage(actualDamage);
        System.out.printf("%s menyerang sebesar %.1f\n", attacker.getName(), attacker.getAttack());
        System.out.printf("%s memiliki pertahanan sebesar %.1f\n", defender.getName(), defender.getDefense());
        System.out.printf("Health %s saat ini %.1f\n\n", defender.getName(), healthAfterAttack);
    }
}