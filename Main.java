public class Main {
    public static void main(String[] args) {
       // String pattern = "^(\\d+|[a-z]+)(.*)";
        String pattern = "^(\\d+|[a-z]+)(.*)";
        String pattern1 = "^(\\w+|\\s+|\"(\\\\.|[^\"])+\"|[^\\s\\w\"]+)(.*)";

        Lexer myLex = new Lexer(pattern);

        String input = "the quick 23 fox jumps456";
        myLex.lexIt(input);

        while (true) {
            String token = myLex.next();
            if (token.length() == 0)
                break;
            System.out.println(token);
        } // while
    }
}