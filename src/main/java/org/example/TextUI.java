package org.example;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Enter the command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Enter the word: ");
                String word = scanner.nextLine();
                System.out.println("Enter the translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.addItem(word, translation);
            } else if (command.equals("search")) {
                System.out.println("Enter a word to search: ");
                String word = scanner.nextLine();
                String translation = simpleDictionary.translate(word);
                if(translation == null) {
                    System.out.println("Word (" + word + ") was not found");
                }else {
                    System.out.println(simpleDictionary.translate(word));
                }
            } else {
                System.out.println("Unkown Command");
            }
        }
    }
}
