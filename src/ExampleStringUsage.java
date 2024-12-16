import java.util.Random;
import java.util.Scanner;

public class ExampleStringUsage {
    public static void findSymbolOccurance(String word, char symbol){
        int counter = 0; char []lettersArray = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(lettersArray[i] == symbol){
                counter++;
            }
        }
        System.out.println("Counted " + counter + " symbols " + symbol);
    }

    public static int findWordPosition(String source, String target){
        return (source.contains(target)) ? 1 : -1;
    }

    public static void stringReverse(String wordToReverse){
        StringBuilder stringBuilder = new StringBuilder(wordToReverse);
        System.out.println(stringBuilder);
        stringBuilder.reverse(); System.out.println(stringBuilder);
    }

    public static void isPalindrome(String word){
        StringBuilder wordReverser = new StringBuilder(word);
        wordReverser.reverse();
        System.out.println(word.equalsIgnoreCase(wordReverser.toString()));
    }

    public static void stringGame(){
        boolean playing = true;
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        StringBuilder gridSymbols = new StringBuilder("###############");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int wordToGuess = rd.nextInt(words.length - 1);
        String correctWord = words[wordToGuess];
        System.out.println("Guess the word");
        while(playing){
            if(gridSymbols.toString().contains(correctWord)){
                System.out.println("The word was: " + correctWord);
                break;
            }
            System.out.println(gridSymbols);
            String guessedWord = sc.nextLine();
            for(int i = 0; i <= correctWord.length()-1; i++){
                char symbolOfWord = correctWord.charAt(i);
                if(guessedWord.contains(symbolOfWord + "")){
                    gridSymbols.setCharAt(i, symbolOfWord);
                }
            }
        }
    }
}
