package Mockito_7.Anotasyon;

import Mockito_7.DummyCustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

public class AnnotationTest {

    private DummyCustomerService dummyCustomerService;

    @Before
    public void setUp() throws Exception {
        dummyCustomerService = Mockito.mock(DummyCustomerService.class);
    }

    @Test
    public void testAnnotation() throws Exception {
        dummyCustomerService.removeCustomer("qe2q");
    }
}
