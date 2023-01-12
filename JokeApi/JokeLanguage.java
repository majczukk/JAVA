import java.util.Scanner;

public class JokeLanguage {
    private String language;

    Scanner sc = new Scanner(System.in);
    
    // Wybór języka 
    public void Jokelanguage(){
        System.out.println("\n===============================================");
        System.out.println(" EN - (Angielski),\n CS - (Czeski),\n DE - (Niemiecki),\n ES - (Hiszpański), \n FR - (francuski), \n PT - (Portugalski)");
        System.out.print("\nWybierz język w jakim chcesz wyświetlić żart: ");
        
        language = sc.nextLine();
        language.toUpperCase();
    }
        
    public String getLanguage(){ return language; }
    
}
