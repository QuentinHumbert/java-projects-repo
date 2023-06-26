import java.util.*;

public class DrinkDistrib {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] drinkList = { "Coca-Cola", "Orangina", "Ice-Tea" };
        String drinkAsked = "";

        System.out.println("Veuiller sélectionner une boisson (Coca-Cola, Orangina ou Ice-Tea): ");
        drinkAsked = scanner.nextLine();

        if (drinkAsked == drinkList[0]) {
            drinkChosen(drinkAsked, 1.50);
        } else if (drinkAsked == drinkList[1]) {
            drinkChosen(drinkAsked, 2.50);
        } else if (drinkAsked == drinkList[2]) {
            drinkChosen(drinkAsked, 3.50);
        } else {
            System.out.println("Erreur: boisson inconnu.");
        }

    }

    static void drinkChosen(String drinkAsked, double priceAsked) {
        Scanner scanner = new Scanner(System.in);
        String addSugar = "";
        double priceGiven = 0;
        double priceDifference = 0;
        priceAsked = 1.50;
        System.out.println("Veuiller insérer " + priceAsked + "€.");
        priceGiven = scanner.nextDouble();
        while (priceGiven != priceAsked) {
            priceDifference = priceAsked - priceGiven;
            System.out.println("Il manque " + priceDifference + "€.");
            priceAsked += scanner.nextDouble();
        }
        if (priceGiven > priceAsked) {
            priceDifference = priceGiven - priceAsked;
            System.out.println("Il y a " + priceDifference + "€ de trop.");
        } else {
            System.out.println("Paiement reçu, Voulez vous ajouté du sucre ?");
            addSugar = scanner.nextLine();
            if (addSugar == "Oui") {
                System.out.println("Sucre ajouté.");
                System.out.println("Distribution de la boisson... Passé une agréable journée/soirée.");
            } else if (addSugar == "Non") {
                System.out.println("Distribution de la boisson... Passé une agréable journée/soirée.");
            }
        }
    }
}
