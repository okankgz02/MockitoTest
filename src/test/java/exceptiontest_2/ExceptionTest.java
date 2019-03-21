package exceptiontest_2;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    MailServis mailServis = new MailServis();

    @Test
    public void mailTest() {
        try {
            mailServis.adminMailGönder();

        } catch (Exception ex) {
            assertTrue(ex instanceof MailNotSentException); //yakalanan hatanın kendi hatamız oldugunu test ederiz

            assertEquals("gönderilmedi", ex.getMessage());
        }
    }

    @Test(expectedExceptions = MailNotSentException.class) //hangi hatayı bekliyorsak
    public void testException() throws Exception {
        mailServis.adminMailGönder();
    }

    //Rule ile beklediğimiz thrownladık
    @Test
    public void testRuleException() throws Exception {
        thrown.expect(MailNotSentException.class); //beklenen hatasınıfı
        thrown.expectMessage("gönderilmedi"); //beklenen hata mesajı
        mailServis.adminMailGönder(); //hatanın fırlatıldığı sınıf

    }
}
