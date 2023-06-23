import java.util.Arrays;
import java.util.Scanner;

public class Pratice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // for (int i = 0; i < 11; i++){
        //     System.out.println("9 x " + i + " = " + 9*i);
        // }

        // int numberArray[] = new int[3];

        // for (int i=0; i<numberArray.length;i++){
        //     System.out.println("Entrez votre chiffre N°" + i + ": ");
        //     numberArray[i] = scanner.nextInt();
        // }

        //     System.out.println(Arrays.stream(numberArray).max());
        
        // int choosenNumber;
        // int result = 0;
        // System.out.println("Entrez votre chiffre:");
        // choosenNumber = scanner.nextInt();
        
        // for(int i=0; i<choosenNumber+1; i++){
        //     result = result + i;
        // }
        // System.out.println(result);
        
        // int choosenNumber;
        // System.out.println("Entrez votre chiffre:");
        // choosenNumber = scanner.nextInt();

        // while (choosenNumber < 1 || choosenNumber > 3) {
        //         System.out.println("Entrez votre chiffre:");
        //         choosenNumber = scanner.nextInt();
        // }
        // System.out.println("Test réussi");

        // int nombreUSB = 0;
        // System.out.println("Entrez le nombre de clé USB que vous voulez: ");
        // nombreUSB = scanner.nextInt();

        // if (nombreUSB < 10){
        //     System.out.println("Prix d'achat à l'unité: 5€");
        // }else if (nombreUSB > 10 || nombreUSB <= 20){
        //     System.out.println("Prix d'achat à l'unité: 4€");
        // }else if (nombreUSB > 20){
        //     System.out.println("Prix d'achat à l'unité: 3€");
        // }else {
        //     System.out.println("Erreur, impossible d'acheter ce nombre de clé USB");
        // }

        String arrayNames[] = {"","",""};
        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println("Veuillez entrer un nom:");
            arrayNames[i] = scanner.nextLine();
        }

        String arrayNamesSort[] = arrayNames.clone();
        Arrays.sort(arrayNamesSort);

        if (Arrays.equals(arrayNames,arrayNamesSort)) {
            System.out.println("Les noms sont tous dans l'ordre");
        } else {
            System.out.println("Les noms ne sont pas dans l'ordre");
        }
    }
}
