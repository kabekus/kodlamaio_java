package week2.OOP1;

public class Main {
    public static void main(String[] args) {

        //Products
       Product product1 = new Product();
       product1.setName("ABC Kahve Makinesi");
       product1.setDiscount(7);
       product1.setUnitPrice(7500);
       product1.setUnitInStock(3);
       product1.setImgUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("KLM Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(3);
        product2.setImgUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("XYZ Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(3);
        product3.setImgUrl("image3.jpg");

        System.out.println("Ürün adı");
        Product[] products = {product1,product2,product3};
        for (Product prod : products){
            System.out.println(prod.getName());
        }

        //Customers
        IndividualCustomer icustomer = new IndividualCustomer();
        icustomer.setId(1);
        icustomer.setPhone("05624759568");
        icustomer.setCustomerNumber("1596284");
        icustomer.setFirstName("Kabe");
        icustomer.setLastName("Kuş");

        CorporateCustomer cCustomer = new CorporateCustomer();
        cCustomer.setId(2);
        cCustomer.setCompanyName("XXXX");
        cCustomer.setPhone("05324789595");
        cCustomer.setTaxNumber("11111111");
        cCustomer.setCustomerNumber("1543");

        Customer[] customers = {icustomer,cCustomer};

    }
}