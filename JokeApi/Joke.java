import java.util.Scanner;

public class Joke {
    private int ilosc;

    Scanner sc = new Scanner(System.in);

    // Wybór ilości żartów
    public void IloscZartow(){
        System.out.print("\nPodaj ile żartów chcesz wyświetlić(1 - 10): ");
        ilosc = sc.nextInt();
    }

    public int getIlosc(){ return ilosc; }
}