package Mockito_7;

public class DummyCustomerServiceImpl implements DummyCustomerService {
    public void addCustomer(String customerName) {
        System.out.println("isim " + customerName);
    }

    public void removeCustomer(String customerName) {
        System.out.println("isim " + customerName);

    }

    public void updateCustomer(String customerName) {
        System.out.println("isim " + customerName);

    }

    public String getName(String customerName) {
        return customerName;
    }
}
