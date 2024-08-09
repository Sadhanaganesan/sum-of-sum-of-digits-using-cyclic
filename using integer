import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int sum=0,c=0;
        while(t!=0){
            //sum=sum+ n%10;
            t/=10;
            c++;
        }
        t=n;
        int a[]=new int[c];
        for(int i=c-1;i>=0;i--){
            a[i]=t%10;
            t/=10;
        }
        for(int i=0;i<c;i++){
            for(int j=i;j<c;j++){
                sum+=a[j];
            }
        }
        System.out.println(sum);
    }
}


