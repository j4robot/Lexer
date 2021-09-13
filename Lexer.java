import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

    String str;
    Pattern p;

    public Lexer(String regexp) {  
        p = Pattern.compile(regexp);
    }

    public void lexIt(String line) {
        str = line;
    }

    public String next() {        
        Matcher m = p.matcher(str);

        do {
            str = str.trim();
            m = p.matcher(str);
            if (m.matches()) {
                System.out.println(m.group(1));
                str = str.substring(m.end(1));
                continue;
            } else {
                break;
            }
        } while (str.length() > 0);

        return str;
    }
}
