package suitTest_3;

import exceptiontest_2.ExceptionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //bu sınıfı bir grup sınıfı olarak çalıştırmasını istiyoruz
@Suite.SuiteClasses({
        ExceptionTest.class
})
public class SuitTest {
}
