import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Pobieranie Ilosci zartów od użytkownika
        Joke joke = new Joke();
        joke.IloscZartow();

        // Pobieranie języka w którym żart będzie wyświetlany od użytkownika
        JokeLanguage jokeLanguage = new JokeLanguage();
        jokeLanguage.Jokelanguage();

        // Pobieranie kategorii od użytkownika
        JokeCategory jokeCategory = new JokeCategory();
        jokeCategory.JokeCategories();


        // Połączenie z JokeApi
        HttpClient client = HttpClient.newHttpClient();

        // Wybór żartu z opcjami wybranymi przez użytkownika
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/"+jokeCategory.getCategories()+"?lang="+jokeLanguage.getLanguage()+"&type=single")).build();
        
        // Wyświetlanie żartu
        try {
            for(int i = 0; i < joke.getIlosc(); i++){
                
                HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String output;
                output = response.body().toString();

                String jj; 
                jj = output.substring(output.indexOf("\"joke\":") +9);

                String joke_final;
                joke_final = jj.substring(0, jj.indexOf("\"," ));

                System.out.println("=====");
                System.out.print("ŻART: " + joke_final + "\n");
                System.out.println("=====");
            }
        } catch(IOException e) {
            System.out.println("Connection error");
            e.printStackTrace();
        } catch(InterruptedException e ){
            System.out.println("Connection error");
            e.printStackTrace();
        }
    } 

    
}
