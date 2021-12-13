import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s1,s2,s3,s4;

        System.out.println("1. Sayıyı giriniz :");
        s1 = input.nextInt();

        System.out.println("2. Sayıyı giriniz :");
        s2 = input.nextInt();

        System.out.println("3. Sayıyı giriniz :");
        s3 = input.nextInt();

        System.out.println("4. Sayıyı giriniz :");
        s4 = input.nextInt();

        if(s1 > s2 && s1 >s3 && s1 > s4){
            System.out.println("s1 en büyüktür");
        }else if ( s1<s2  && s1 <s3 && s1 <s4){
            System.out.println("s1 en küçüktür");
        }
        if ( s2 >s1 && s2 >s3 && s2 >s4 ){
            System.out.println("s2 en büyüktür");
        }else if ( s2<s1 && s2<s3 && s2<s4 ) {
            System.out.println("s2 en küçüktür");
        }
        if (s3>s1 && s3>s2 && s3>s4){
            System.out.println("s3 en büyüktür");
        }else if (s3<s1 && s3<s2 && s3<s4){
            System.out.println("s3 en küçüktür");
        }
        if ( s4>s1 && s4>s2 && s4>s3){
            System.out.println("s4 en büyüktür");
        }else if (s4<s1 && s4<s2 && s4<s3){
            System.out.println("s4 en küçüktür");
        }

    }
}
