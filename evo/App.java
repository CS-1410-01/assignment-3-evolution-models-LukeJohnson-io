package evo;

import java.util.Random;
import java.util.Scanner;

public class App extends World {

    static String helpMsg = """
            TODO: write helpMsg
            """;
    
    public static void main(String[] args) {
        App app = new App();
        Random rando = new Random();
        Scanner keyb = new Scanner(System.in);
        while (true) {
            String uin = keyb.nextLine();
            switch(uin.trim().toLowerCase()) {
                case "next":
                    int cycleseed = rando.nextInt();
                    app.generation(cycleseed);
                    break;
                case "help":
                default:
                    System.out.println(helpMsg);
            }
            
        }
    }

    public App() {
        super();
    }
}
