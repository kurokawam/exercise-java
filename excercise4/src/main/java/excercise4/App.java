package excercise4;

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

        for(int i = 0; i<num;i++){
            System.out.println("Hello,World!");
        }

    }
}
