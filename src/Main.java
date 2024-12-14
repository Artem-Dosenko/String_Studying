public class Main {
    public static void main(String[] args) {
        ExampleStringUsage.findSymbolOccurance("Hello", 'l');

        int checker = ExampleStringUsage.findWordPosition("Apollo", "pollo");
        System.out.println(checker);
        checker = ExampleStringUsage.findWordPosition("Apple", "Plant");
        System.out.println(checker);

        ExampleStringUsage.stringReverse("Hello");

        ExampleStringUsage.isPalindrome("ERE");
        ExampleStringUsage.isPalindrome("Allo");

        ExampleStringUsage.stringGame();
    }
}