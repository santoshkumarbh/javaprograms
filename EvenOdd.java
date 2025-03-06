public class EvenOdd {
public static void main(String[] args) {
    int num=3;
    evenOdd(num);
}

public static void evenOdd(int num){
    if(num%2==0){
        System.out.println("Even number");
    }
    else{
        System.out.println("odd number");
    }
}
}