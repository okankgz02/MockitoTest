package Mockito_7;

import org.mockito.InOrder;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class BehaviorTest {

    @Test
    public void testBehaviour() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");

        Mockito.verify(customerService).addCustomer("istanbul");
        Mockito.verify(customerService).addCustomer("ankara");
    }

    @Test
    public void testKacKereCagrildi() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");

        Mockito.verify(customerService, Mockito.times(2)).addCustomer("istanbul"); // 2 kere istanbuş cağrıldıysa geçer

        //remove metodu cagrılmadı ise geçer
        Mockito.verify(customerService, Mockito.never()).removeCustomer(anyString());

        //izmir metodu hiç çağrılmadıysa
        Mockito.verify(customerService, Mockito.never()).addCustomer("izmir");

        //en az 2 defa çalıştı ise
        Mockito.verify(customerService, Mockito.atLeast(2)).addCustomer("istanbul");
    }

    //sıralar değişirse testen geçemez
    @Test
    public void testSirasiniKontrolEt() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.addCustomer("istanbul");

        InOrder inOrder=inOrder(customerService); //istedimiz kadar mock nesnedi veririz
        inOrder.verify(customerService).addCustomer("istanbul");
        inOrder.verify(customerService).addCustomer("ankara");
        inOrder.verify(customerService).addCustomer("istanbul");

    }


    //artık çağrılma olmasın
    //sıralar değişirse testen geçemez
    @Test
    public void testBaskaKontrolYok() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.removeCustomer("istanbul");

        Mockito.verify(customerService).addCustomer("istanbul");
        Mockito.verify(customerService).removeCustomer("ankara");

        verifyNoMoreInteractions(customerService); //baska cagrılma olmasın  sadece verilenler
        //burda verify içindekilere baska eklenemez

    }

}
