package tddjunit.Tddjunit;

/**
 * Hello world!
 *
 */
import java.util.logging.Logger;
public class App {

     Logger logger = Logger.getLogger(App.class.getName());
 
    public static String remove(String word, char unwanted){
        StringBuilder sbui = new StringBuilder();
        char[] let = word.toCharArray();
     
        for(char ch : let){
            if(ch != unwanted ){
                sbui.append(ch);
            }
        }
     
        return sbui.toString();
    }
 
    public static String removeRecursive(String wrd, char ch){
        int index = wrd.indexOf(ch);
        if(index == -1){
            return wrd;
        }
        return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch);
    }
}
