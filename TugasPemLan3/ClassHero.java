package TugasPemLan3;
import java.util.Scanner;

public class ClassHero {
    private String name;
    private float health;
    private float attack;
    private float defense;

    // Constructor tanpa parameter
    public ClassHero() {
    }

    // Constructor dengan parameter
    public ClassHero(String name, float health, float attack, float defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void initializeHero(Scanner scanner) {
        System.out.printf("%-20s : ", "Nama Hero");
        this.name = scanner.nextLine();
        System.out.printf("%-20s : ", "Health Point");
        this.health = scanner.nextFloat();
        System.out.printf("%-20s : ", "Attack");
        this.attack = scanner.nextFloat();
        System.out.printf("%-20s : ", "Defense");
        this.defense = scanner.nextFloat();
        scanner.nextLine(); // Membersihkan karakter baris baru dari buffer
    }

    // Getter dan setter untuk name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan setter untuk hp
    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    // Getter dan setter untuk attack
    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    // Getter dan setter untuk defense
    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public void takeDamage(float damage) {
        this.health -= damage;
    }
}