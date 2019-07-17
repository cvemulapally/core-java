import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dice {
    
    public static int addConsoleValues(String value){
        int sum = 0;

        String[] splitValues = value.split(" ");
        for(int i=0; i<splitValues.length; i++){
            sum= sum + Integer.parseInt(splitValues[i]);
        }
        
        return sum;
    }


public static void main(String[] args){

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int gunnerSum = 0;
    int emmaSum = 0;
    try {
        String player1 = br.readLine();
        gunnerSum = addConsoleValues(player1);
        String player2 = br.readLine();
        emmaSum = addConsoleValues(player2);
        
        
    } catch (IOException e) {
        e.printStackTrace();
    }

    if(gunnerSum > emmaSum){
        System.out.print("Gunner");
    }
    if(gunnerSum < emmaSum){
        System.out.print("Emma");
    }
    if(gunnerSum == emmaSum){
        System.out.print("Tie");
    }
}
}
