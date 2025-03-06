//program to skip number 5 and print number from 1 to 10
public class Program1 {
    public static void main(String[] args) {
       skipValue();
    
    }
    
    public static void skipValue(){
        int i=1;          //5
        while (i<=10){    //5<=10
            if(i==5){     //5==5
                i++;       //i=6
                continue;
            }                 
            System.out.println(i); //i=6
            i++;                   //i=7
        } 

        // for(int i=0;i<=5;i++){  // i==3,3<=5
        //     if(i==3){
        //         return;
        //     }
        //     System.out.println(i);
        // }
    
     
    }
}