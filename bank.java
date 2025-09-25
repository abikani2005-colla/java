public class bank{
    public static void main(String[]arg)
    {
        int digit=1234;
        int reversed=0;
        while(digit!=0){
            int c=digit%10;
            reversed=reversed*10+c;
            digit= digit/10;
        }
        System.out.println("reversed"+reversed);
        
    }
}