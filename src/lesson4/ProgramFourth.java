package lesson4;
import java.io.File;
import java.io.FileReader;


public class ProgramFourth {
    public void main(String[] args) throws InterruptedException {
        FileReader fr = null;
        File f = new  File("jdfhgjdfhjghj");
        try {
            simpleWaiter(1000L);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        try{
            int i=10/0;
        } catch (ArithmeticException ae){
        System.out.println("Exception toString(): "+ae);
        System.out.println("");
        System.out.println("Exception getMessage(): "+ae.getMessage());
        System.out.println("");
        System.out.println("Exception printStackTrace(): ");
        ae.printStackTrace();
    }finally {
            System.out.println("Final block.");
        }
}
private void simpleWaiter(long timeout) throws InterruptedException {
        Thread.sleep(timeout);
}
}