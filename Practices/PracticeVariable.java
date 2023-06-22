public class PracticeVariable {
    public static void main(String[] args){
            int variableA = 6;
            int variableB = 2;
            variableA = variableB;
            variableB = variableA;
            System.out.println("A = " + variableA);
            System.out.println("B = " + variableB);

            int articlePriceDutyFree = 25;
            int numberArticle = 5;
            int rateTVA = (20/100);

            System.out.println("Cette article est vendu " + articlePriceDutyFree + " et il en existe " + numberArticle + " dans le magasin");
    }

    
}
