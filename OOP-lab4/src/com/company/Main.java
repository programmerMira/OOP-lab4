package com.company;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static void task1(String testString)
    {
        if(testString!="" || testString!=null)
        {
            String substring_start="I like";
            String substring_end="!!!";
            String substring="Java";
            System.out.println("Last char: " + testString.charAt(testString.length()-1));
            System.out.println("The string("+testString+") ends with substring("+substring_end+"): "+testString.endsWith(substring_end));
            System.out.println("The string("+testString+") starts with substring("+substring_start+"): "+testString.startsWith(substring_start));
            System.out.println("The string("+testString+") contains substring("+substring+"): "+testString.contains(substring));
            System.out.println("The substring("+substring+") position: "+testString.contains(substring));
            System.out.println("Substring position: "+testString.indexOf(substring));
            System.out.println("Replace a -> o :"+testString.replace('a','o'));
            System.out.println("String to lower case: "+testString.toLowerCase());
            System.out.println("String to upper case: "+testString.toUpperCase());
            System.out.println("Get substring: "+testString.substring(testString.indexOf(substring),testString.indexOf(substring_end)));
        }
    }
    private static void task2(String testString)
    {
        if(testString!="" || testString!=null)
        {
            String substring="object-oriented programming";
            StringBuilder newString = new StringBuilder(testString);
            int lastIndex = 0;
            ArrayList<Integer> result = new ArrayList<Integer>();
            while(lastIndex != -1) {
                lastIndex = testString.toLowerCase().indexOf(substring,lastIndex);
                if(lastIndex != -1){
                    result.add(lastIndex);
                    lastIndex += 1;
                }
            }
            for(int i=0; i<result.size();i++)
            {
                if(i%2!=0)
                {
                    newString=newString.replace(result.get(i),result.get(i)+27,"OOP");
                }
            }
            System.out.println(newString);
        }
    }
    private static void task3(String testString)
    {
        if(testString!="" || testString!=null)
        {
            String pattern="Java\\s\\d+";
            Pattern patt = Pattern.compile(pattern);
            CharSequence input;
            Matcher matcher = patt.matcher(testString);
            while(matcher.find())
            {
                System.out.println(testString.substring(matcher.start(),matcher.end()));
            }
        }
    }
    private static void task4(String testString)
    {
        if(testString!="" || testString!=null)
        {
            var newString = testString.split(" ");
            String result="";
            int unique_val=999;
            for(int i=0;i< newString.length;i++)
            {
                if(checkUnique(newString[i])<unique_val)
                {
                    unique_val = checkUnique(newString[i]);
                    result = newString[i];
                }
            }
            System.out.println(result);
        }
    }
    public static int checkUnique(String s)
    {
        String lowerCase = s.toLowerCase();
        char characters[] = lowerCase.toCharArray();
        int countOfUniqueChars = s.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != lowerCase.indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;
    }
    private static void task5(String testString)
    {
        if(testString!="" || testString!=null)
        {
            String pattern="[a-zA-Z]+\\s";
            Pattern patt = Pattern.compile(pattern);
            CharSequence input;
            Matcher matcher = patt.matcher(testString);
            int counter = 0;
            while(matcher.find())
            {
                System.out.println(testString.substring(matcher.start(),matcher.end()));
                counter++;
            }
            System.out.println(counter);
        }
    }
    private static void task6(String testString)
    {
        if(testString!="" || testString!=null)
        {
            String pattern="\\d+";
            Pattern patt = Pattern.compile(pattern);
            CharSequence input;
            Matcher matcher = patt.matcher(testString);
            while(matcher.find())
            {
                if(checkNumbers(Integer. parseInt(testString.substring(matcher.start(),matcher.end())))){
                    System.out.println(testString.substring(matcher.start(),matcher.end()));
                }
            }
        }
    }
    public static boolean checkNumbers(int num)
    {
        char[] x = String.valueOf(num).toCharArray();
        boolean check = true;
        for (int i=0, j=x.length-1; i < x.length; i++, j--) {
            if (x[i] == x[j]) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        //task1("I like Java!!!");
        //task2("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
        //task3("Versions: Java 5, Java 6, Java 7, Java 8, Java 12.");
        //task4("fffff ab f 1234 jkjk");
        //task5("One two three four раз два три one1 two2 123");
        //task6("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
    }
}
