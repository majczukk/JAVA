import java.util.Scanner;

public class JokeCategory {
    Scanner sc = new Scanner(System.in);
    private String category;

    // Wybór kategorii
    public void JokeCategories(){
        System.out.println("\n=================================================");
        System.out.println(" Programming - (Programowanie), \n Dark - (Czarny humor), \n Spooky - (Straszne), \n Pun - (Gra słów), \n Christmas - (Świąteczny), \n Misc - (Różne), \n Any - (Jakikolwiek)");
        System.out.print("\nWybierz kategorie żartu: ");
        category = sc.nextLine();
    }

    public String getCategories(){ return category; }
}
