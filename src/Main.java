import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom de l'ingredient");
        String nom = sc.nextLine();

        System.out.println("Saisir la quantite de l'ingredient");
        double quantite = sc.nextDouble();
        sc.skip("\n");

        System.out.println("Saisir l'unite de l'ingredient");
        String unite = sc.nextLine();
        Ingredient MonIngredient = new Ingredient(nom, quantite, unite);
        //Ingredient MonIngredient = new Ingredient("levure",1, "sachet");
        System.out.println("La quantite de mon ingredient"+ MonIngredient.getQuantite());
        System.out.println("La unite de mon ingredient"+ MonIngredient.getUnite());
        System.out.println("La nom de mon ingredient"+ MonIngredient.getNom());
        System.out.println(MonIngredient.afficher());
        int nouvelleQuantite =25;
        MonIngredient.setQuantite(nouvelleQuantite);
        System.out.println(MonIngredient.afficher());

    }
}