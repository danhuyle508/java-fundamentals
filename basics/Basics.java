import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basics {

    public static void main(String[] args){
        // hello Java code
        System.out.println("Hello Java");

        // salmon season code
        Calendar cal = Calendar.getInstance();
        String month = new SimpleDateFormat("MMMM").format(cal.getTime());
        System.out.println(isItSamlonSeason(month + "\n"));
       
       // pluralize code
        String answer = pluralize("cat", 4);
        System.out.println("this is pluralize " + answer + "\n");

        //heads/tails
        flipNHeads(2);

        //clock
        clock();

    }

    public static boolean isItSamlonSeason(String month){
        if(month.equals("July") || month.equals("August") || month.equals("September")){
            return true;
        }
        else{
            return false;
        }
    }

    public static String pluralize(String word, int number){
        if(number > 1 || number == 0){
            word = word + "s";
            return word;
        }
        else{
            return word;
        }
    }

    public static void flipNHeads(int heads){
        int countHeads = 0;
        int countTries = 0;
        while(countHeads != heads){
            countTries++;

            double randomNum = 0 + Math.random() * (1 - 0);
            if(randomNum > .5){
                System.out.println("heads");
                countHeads++;
            }
            else{
                System.out.println("tails");
                countHeads = 0;
            }
        }
        System.out.println("It took " + countTries + " tries to get " + countHeads +" heads.\n" );
    }

    public static void clock(){
        try{
            while(true){
                LocalDateTime now = LocalDateTime.now();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex){
            System.out.println("Did not work");
        } 

    }
}