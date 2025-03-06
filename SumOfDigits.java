public class SumOfDigits {
    public static void main(String[] args) {
        int num=1234;  //6
        sumOfDigit(num);
    }

    public static void sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }

        System.out.println(sum);
    }
}
