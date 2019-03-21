package Ignore_Test_4;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    @Ignore("bu metot şimdi çalıştırılmayacak")
    public void test2(){
        System.out.println("test2");

    }
}
