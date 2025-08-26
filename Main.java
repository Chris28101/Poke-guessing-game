// import
import com.sun.source.util.SourcePositions;
import org.w3c.dom.ls.LSOutput;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Enumeration;
public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        // introduction to game
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        while (name.isBlank()){
            System.out.println("Please enter a valid name try again...");
            System.out.println("Enter your name: ");
            name= scan.nextLine();
        }
        System.out.println("""
                ,'\\
                    _.----.        ____         ,'  _\\   ___    ___     ____
                _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.
                \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |
                 \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |
                   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |
                    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |
                     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |
                      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |
                       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |
                        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |
                                                `'                            '-._|""");
        System.out.println("Hello " + name + " this is a pokemon guessing game.");
        System.out.println("Im going to ask you 10 pokemon related questions to see if your a true fan.");
        System.out.println("Based on your score ill rank the type of poke gamer you are!!.");

        // List of pokemon
        ArrayList<String> Poke = new ArrayList<String>(
                Arrays.asList("Pikachu", "Charizard", "Eevee", "Squirtle", "Jigglypuff", "Snorlax"));

        //dictionary for questions

        String answer;
        Dictionary<String, String> q = new Hashtable<>();
        q.put("What pokemon is electric type and is ashe's first ever pokemon?: ", "Pikachu");
        q.put("In generation I what fire type pokemon is a starter: ", "Charmander");
        q.put("What region did ash grow up in?: ", "Kanto");
        q.put("What type of pokemon is weak against fire types and strong against ground types: ","Grass");
        q.put("What pokemon has 8 different possible evolutions and is a normal type: ","Eevee");
        q.put("Where is the game Pokemon Sun And Moon set in: ", "Alola region");
        q.put("If you Use a Thunder Stone on Pikachu and it evolves what does it evolve into?: ","Raichu");
        q.put("What pokemon game is Tepig (Fire-type) a starter pokemon?: ","Black and White");
        q.put("What is the only type that is super effective against both Fire and Electric Pokémon?: ", "Ground");
        q.put("What item is required to Mega Evolve a Pokémon?: ", "Mega Stone");
        Enumeration<String> questions = q.keys();
        while (questions.hasMoreElements()) {
            String question = questions.nextElement();
            System.out.println(question);
            String check = scan.nextLine().trim().toLowerCase();
            //checks if question
            if(check.equals(q.get(question).toLowerCase())) {
                System.out.println("That's right!");
                score += 1;
                System.out.println(score + "/10");
            }
            else if (!check.equals(q.get(question))){
                System.out.println("Wrong");

            }


            }
        //score
        if(score>= 8){
            System.out.println("Your score is " + score + "/10" + " with all this knowledge you could be a pokemon master!! \uD83D\uDDE3\uFE0F \uD83D\uDD25 \uD83D\uDD25");
        }
        else if(score <8 && score>= 5){
            System.out.println("Your score is " + score + "/10" + " Eh you should definitely go read up on your pokedex... \uD83E\uDD37\uD83C\uDFFF\u200D♂\uFE0F");
        }
        else if (score<=4) {
            System.out.println("Your score is " + score + "/10" + " Just go play a pokemon game or watch the shows its not that hard LOL \uD83D\uDE2D");
        }

    }
    }


