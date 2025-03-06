public class Palindrome {
    public static void main(String[] args) {
      short var1 = 1111;
      isPalindrome(var1);
   }

   public static void isPalindrome(int num) {
            int rev=0;
            int number=num;
            while(num!=0){
                int digit=num%10;
                rev=rev*10+digit;
                num/=10;
            }

            if(number==rev){
                System.out.println("is Palindrome number");
            }
            else{
                System.out.println("Not Palindrome");
            }


   }
}
