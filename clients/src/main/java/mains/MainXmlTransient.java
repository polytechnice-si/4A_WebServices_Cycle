package mains;

import stubs.xmlTransient.*;

public class MainXmlTransient {

    public static void main(String[] args) {
        DemoService service = new DemoService();
        Demo port = service.getDemoPort();
        System.out.println("** Retrieving Customers");
        for (Customer customer : port.listCustomers()) {
            System.out.println("  - " + customer.getName() + " - " + customer.getCard().getIdentifier());
        }
        System.out.println("** done");
    }

}
