package Mockito_7.Anotasyon;

import Mockito_7.DummyCustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest_Spy {
    //spy nesnesi için Kullanılacak injectte nesne interface veya abstrack olamazs
    @Spy
    private DummyCustomerServiceImpl dummyCustomerService;


    @Test
    public void testAnnotation() throws Exception {
        dummyCustomerService.removeCustomer("qe2q");
    }
}
