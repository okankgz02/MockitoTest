package Mockito_7;

import org.testng.annotations.Test;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class SpyTest {
    //Spy kullanabilmek için gerçek nesnelere ihtiyaç var gerçek nesneleri cagırır her zaman
    @Test
    public void testSpy() throws Exception {
        DummyCustomerService service = spy(new DummyCustomerServiceImpl());
        doNothing().when(service).addCustomer(eq("istanbul")); //mock davranısımız sadece istanbul için geçerli
        doThrow(new RuntimeException()).when(service).removeCustomer(anyString()); //herhangi birsey azınca hata ver

        service.addCustomer("istanbul");
        service.removeCustomer("safd");
    }

    @Test
    public void testSpy2() throws Exception {
        DummyCustomerService service = spy(new DummyCustomerServiceImpl());
        doNothing().when(service).addCustomer(eq("istanbul")); //mock davranısımız sadece istanbul için geçerli
        doThrow(new RuntimeException()).when(service).removeCustomer(anyString()); //herhangi birsey yazınca hata ver

        service.addCustomer("ankara");
        service.removeCustomer("safd");
    }

}
