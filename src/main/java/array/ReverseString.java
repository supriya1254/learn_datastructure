package array;

public class ReverseString {
    public static void main(String[] args) {
        String result = reverseWord();
        System.out.println(result);

    }

     static String reverseWord() {
        String s = "i.like.this.program.very.much";


        String[] splitString = s.split("\\.");

         String s1 = "";

        for(int i=splitString.length-1;i>=0;i--)
        {
            s1= s1 + splitString[i];

            if(i!=0)
            {
                s1+=".";
            }
        }
        return s1;
    }

}
