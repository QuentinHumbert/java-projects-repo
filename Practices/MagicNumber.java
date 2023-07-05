package Practices;
import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String whoGuess = "";
        int numberToGuess = 0;
        int numberInputed = 0;
        int numberTries = 0;
        int numberMin = 0;
        int numberMax = 0;

        System.out.println("Qui doit deviner (J (Joueur) ou O (Ordinateur)) ?");
        whoGuess = scan.nextLine();

        if (whoGuess.equals("J")){
            numberToGuess = rand.nextInt(numberMax);
            do {
                System.out.println("Entre 0 et 100, Déviner le chiffre que j'ai choisis:");
                numberInputed = scan.nextInt();

                if (numberInputed > numberToGuess) {
                    System.out.println("C'est moins");
                    ++numberTries;
                } else if (numberInputed < numberToGuess) {
                    System.out.println("C'est plus");
                    ++numberTries;
                }
            } 
            while (numberInputed != numberToGuess);
            System.out.println("Félicitation, vous avez trouvez le nombre magique " + numberToGuess + "./n Nombre de tentative: " + numberTries);
        }
        else if (whoGuess.equals("O")) {
            System.out.println("Incris le nombre que l'ordinateur dois deviner:");
            numberToGuess = scan.nextInt();

            while ((numberMax - numberMin) > numberToGuess) {
                int numberMid = (numberMin + numberMax) / 2;
            }

        }

        scan.close();
    } 
}
