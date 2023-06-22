import java.util.Scanner;

public class JavaFight{
    public static void main(String[] args){
        // Necessary imports
        Scanner input = new Scanner(System.in);
        
        // General attributes
        boolean isCharacterHit;
        int rangeDifference;

        // Player attributes
        String playerName = "Player";
        String playerWeapon;
        int playerHealth = 100;
        int playerStamina = 50;
        int playerWeaponDamage;
        int playerWeaponRange;

        // Enemy attributes
        String enemyName = "Enemy";
        String enemyWeapon;
        int enemyHealth = 100;
        int enemyStamina = 50;
        int enemyWeaponDamage;
        int enemyWeaponRange;
        
        // Weapon attributes
        String weaponName;
        int weaponDamage;
        int weaponMinimumRange;
        int weaponMaximumRange;

        System.out.println("");
        String chooseWeaponPlayer = input.nextLine();

    }
}