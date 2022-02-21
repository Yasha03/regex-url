import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(http|https):\\/\\/([\\w.]+)(\\.[\\w]+)(\\/?\\S*)");
        Matcher match = pattern.matcher("https://math100.ru/?id=432&login=dd http://class100.com");

        while(match.find()) {
            for (int i = 0; i <= match.groupCount(); i++)
                System.out.println(i + ": " + match.group(i));
        }

        // checking the entire line
        String regex2 = "^(http|https):\\/\\/([\\w.]+)(\\.[\\w]+)(\\/?\\S*)$";
        String input2 = "https://math100.ru/?id=432&login=kek";
        System.out.println(Pattern.matches(regex2, input2));
    }
}
