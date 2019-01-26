import java.util.*;
class Check{
    public static void main(String args[]){
        System.out.println("Enter input String:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.toLowerCase();
        if(check(input)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

      /* check method used to check if characters of input contains all the alphabets.
       *@param : input
       * Contains entered string
       *returns true if characters of input contains all alphabets.
       * else return false.
       */
    public static boolean check(String input){
        boolean[] value=new boolean[26];
        int c=0;
        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))) {
                c = input.charAt(i) - 'a';
                value[c] = true;
            }
        }
        for(int i=0;i<26;i++){

            if(value[i]==false)
                return false;
        }
        return true;
    }
}

//Time Complexity= O(n)
//Space Complexity= O(n)