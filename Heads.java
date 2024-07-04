import java.util.Random;
import java.util.Scanner;

public class Heads{

    public static void main(String[] args){
        Random r = new Random();
        Boolean coin;
        int h=0,t=0;
        
        for(int i=1;i<=3;i++){
            System.out.print("Round"+i+": ");
            coin = r.nextBoolean();
        if(coin==true){
            System.out.println("Heads");
            h++;
        }
        else{
            System.out.println("Tails");
            t++;
        }
    }

    System.out.println("Heads: "+h+", Tails: "+t);
    }
}