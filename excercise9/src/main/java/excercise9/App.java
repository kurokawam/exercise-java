package excercise9;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("start main");

        try {
            throwException2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("end main");
    }

    public static void throwException2() throws Exception {
        System.out.println("start throwException2");
        try {
            throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end throwException2");
    }

    public static void throwException() throws Exception {
        System.out.println("start throwException");
        try {
            throw new Exception("エラー");
        } finally {
            System.out.println("end throwException");
        }
    }
}
