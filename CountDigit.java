class CountDigit{
    public static void main(String[] args) {
        int num=12345;
        int res= count(num);
        System.out.println(res);
    }


    public static int count(int num){
       int count=(int)(Math.log10(num)+1);
       return count;
    }
}