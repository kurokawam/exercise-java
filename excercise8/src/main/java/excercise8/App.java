package excercise8;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "文字列を入力してください" );

        Scanner scan = new Scanner(System.in);

        String mozi = scan.next();
        
        int num = Integer.parseInt(mozi);

        boolean sosuu = true;

        for(int i = 2; i <=num-1;i++){
            if(num%i==0){
                sosuu = false;
            }
        }
            if(sosuu == true){
        System.out.println("素数である");
            }else{
                System.out.println("素数ではない");
        }
    }
}