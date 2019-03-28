package Regex;

import java.util.regex.*;
import java.util.*;

public class RegexTest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String date;
        String pattern = "^\\d{2}-\\d{2}-\\d{4}$"; // pattern you need to match. Either you can use "^\\d{4}-\\d{2}-\\d{2}$" expression to validate date in YYYY-MM-DD or YYYY-DD-MM
        Pattern p = Pattern.compile(pattern);
               
        System.out.print("Enter your date in this format DD-MM-YYYY: ");
        date = scan.next();
        
        Matcher m = p.matcher(date);
        if(p.matcher(date).matches()){
            System.out.println("\t Date " + date + " is upto format.");
        }else{
            System.out.println("\t Date " + date + " is not upto format.");
        }   
    }
}
// FOC 35th vidurathegeek