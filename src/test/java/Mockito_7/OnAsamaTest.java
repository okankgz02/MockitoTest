package Mockito_7;

import org.assertj.core.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;


//when then yapısı
public class OnAsamaTest {
    //Mockitoda when metot çağırma
    //then davranıs sekli

    @Test
    public void testWhen() throws Exception {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);
        Mockito.when(dummyCustomerService.getName(anyString())).thenReturn("customeristanbul");//bize dummycustomer.getName() metodu cagrılınca dönecek sonuc
        //  Mockito.when(dummyCustomerService.getName(eq("malatya"))).thenReturn("customeristanbul");//bize dummycustomer.getName() metodu cagrılınca dönecek sonuc

        String customer = dummyCustomerService.getName("malatya"); //Burda öylesine yazdık cokta önemi yok aslında

        Assertions.assertThat(customer).isEqualTo("customeristanbul");
    }

    @Test
    public void testException() throws Exception {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        Mockito.when(dummyCustomerService.getName(eq("ankara"))).thenThrow(new ArithmeticException()); //ankara verilince exception atar
        String customer = dummyCustomerService.getName("ankara"); //Burda öylesine yazdık cokta önemi yok aslında

    }

    //void metotlar için when then yapısı
    //void metotlar için do yapısı kulllanıılrı
    @Test
    public void testWhen3() throws Exception {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);
        Mockito.doNothing().when(dummyCustomerService).addCustomer(anyString());

        Mockito.doReturn("ankara").when(dummyCustomerService).getName("istanbul");//istanbul çağrılınca ankara geri dön

        //Exception atma void nesneler için
        Mockito.doThrow(new RuntimeException()).when(dummyCustomerService).addCustomer(anyString());
    }
}
