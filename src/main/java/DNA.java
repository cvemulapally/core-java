import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by kumarvemulapally on 8/14/17.
 */
public class DNA {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char identicalChar = ' ';
        int count =0;
        try {
            String before = br.readLine();
            char[] chars = before.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = i + 1; j < chars.length - 1; j++) {
                    if (chars[i] == chars[j]) {
                        identicalChar = chars[j];
                    }else{
                        break;
                    }
                }
            }

            String after = br.readLine();
            char[] chars1 = after.toCharArray();
            for(int i=0; i<chars1.length;i++){
                if(chars1[i] == identicalChar){
                    count++;
                }

            }
            System.out.print(count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
