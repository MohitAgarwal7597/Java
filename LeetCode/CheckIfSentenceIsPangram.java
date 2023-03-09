package LeetCode;

import java.util.ArrayList;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbumpsoverthelazydog";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);

    }
        static boolean checkIfPangram(String sentence) {
            ArrayList<Integer> list = new ArrayList<>();
            char alpha = 97;
            for(char check1 = 'a'; check1 <= 'z'; check1++){
                int check = 0;
                for(check = 0 ; check < sentence.length(); check++){
                    if(alpha == sentence.charAt(check)){
                        list.add(1);
                        break;
                    }
                }
                alpha++;
                if(check == sentence.length()){
                    list.add(-1);
                    }
                }
            boolean result;
            if(list.contains(-1)){
                result =  false;
            }
            else{
                result =  true;
            }
            return result;
    }

}
