import java.util.Scanner;
import java.util.Random;

public class JavaFight{
    public static void main(String[] args){
        // Necessary imports
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        
        // General attributes
        String weaponWheel[] = {"Sword","Axe","Spear"};
        int damageReduction = 0;
        int diceRoll = 0;

        // Player attributes
        String playerName = "";
        String playerWeapon = "";
        String playerState = "";
        int playerHealth = 100;
        int playerStamina = 50;
        int playerWeaponDamage = 0;
        int playerWeaponStamina = 0;

        // Enemy attributes
        String enemyName = "";
        String enemyWeapon = "";
        String enemyState = "";
        int enemyHealth = 100;
        int enemyStamina = 50;
        int enemyWeaponDamage = 0;
        int enemyWeaponStamina = 0;
        

        // Game functions

        // Character name input
        System.out.println("Enter your name: ");
        playerName = input.nextLine();
        System.out.println("Enter your enemy's name: ");
        enemyName = input.nextLine();

        // Weapon randomizer
        playerWeapon = weaponWheel[rand.nextInt(weaponWheel.length)];
        System.out.println("Player weapon is: " + playerWeapon);
        enemyWeapon = weaponWheel[rand.nextInt(weaponWheel.length)];
        System.out.println("Enemy weapon is: " + enemyWeapon);

        // Weapon damage distribution
        switch (playerWeapon) {
            case "Sword":
                playerWeaponDamage = 10;
                playerWeaponStamina = 10;
                break;
            case "Axe":
                playerWeaponDamage = 20;
                playerWeaponStamina = 15;                
                break;
            case "Spear":
                playerWeaponDamage = 5;
                playerWeaponStamina = 5;                
                break;
        }
        switch (enemyWeapon) {
            case "Sword":
                enemyWeaponDamage = 10;
                enemyWeaponStamina = 10;
                break;
            case "Axe":
                enemyWeaponDamage = 15;
                enemyWeaponStamina = 15;                
                break;
            case "Spear":
                enemyWeaponDamage = 5;
                enemyWeaponStamina = 5;                
                break;
        }

        while (playerHealth <= 0 || enemyHealth <= 0) {
            if (playerStamina > enemyStamina) {
                System.out.println(playerName + ", ATK or DEF ?");
                playerState = input.nextLine();

                if (playerState == "ATK") {
                    diceRoll = rand.nextInt(101);
                    if (diceRoll >= 50 && enemyState == "DEF") {
                        enemyHealth -= playerWeaponDamage - damageReduction;
                        playerStamina -= playerWeaponStamina;
                        System.out.println(enemyName + " received " + (playerWeaponDamage - damageReduction) + " damage.");                        
                    } else if (diceRoll >= 50) {
                        enemyHealth -= playerWeaponDamage;
                        playerStamina -= playerWeaponStamina;
                        System.out.println(enemyName + " received " + playerWeaponDamage + " damage.");
                    } else {
                        playerStamina -= playerWeaponStamina;
                        System.out.println(enemyName + " received no damage.");
                    }
                } else if (playerState == "DEF") {
                    damageReduction = rand.nextInt(11);
                }
            } else if (enemyStamina > playerStamina) {
                if (enemyState == "ATK") {
                    diceRoll = rand.nextInt(101);
                    if (diceRoll >= 50 && playerState == "DEF") {
                        playerHealth -= enemyWeaponDamage - damageReduction;
                        enemyStamina -= enemyWeaponStamina;
                        System.out.println(playerName + " received " + (enemyWeaponDamage - damageReduction) + " damage.");                        
                    } else if (diceRoll >= 50) {
                        playerHealth -= enemyWeaponDamage;
                        enemyStamina -= enemyWeaponStamina;
                        System.out.println(playerName + " received " + enemyWeaponDamage + " damage.");
                    } else {
                        enemyStamina -= enemyWeaponStamina;
                        System.out.println(playerName + " received no damage.");
                    }
                } else if (enemyState == "DEF") {
                    damageReduction = rand.nextInt(11);
                }                
            } else {
                playerStamina += 10;
                enemyStamina += 10;
            }
            
        }

        input.close();
    }
}