import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input1=s.nextInt();
        int sum=0;
        String number = Integer.toString(input1);
        int len = number.length();
        for(int i=0;i<len;i++)
        {
        for(int j=i;j<len;j++)
        {
        sum += (int) Integer.parseInt(String.valueOf(number.charAt(j)));
        }
        }
        System.out.println(sum);
       // return sum;
    }}
