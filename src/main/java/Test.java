public class Test {
    public static void main(String args[]){

        Adress adress1 = new Adress("Piotrkowska" , "91-100" , "Lodz");
        Customer customer1 = new Customer("Wojciech Szuba");
        Adress adress2 = new Adress("Piotrkowska" , "91-100" , "Lodz");
        Customer customer2 = new Customer("Michał Szuba");

        AbroadTrip abroadTrip = new AbroadTrip(new Date(2018,11,23), new Date(2018, 12, 04),
                "Karaiby", 2999.99);
        DomesticTrip domesticTrip = new DomesticTrip(new Date(2018, 9, 3),
                new Date(2018, 12, 11), "Katowice", 399.99);

        abroadTrip.setInsurance(299);
        domesticTrip.setOwnArrivalDiscount(39);

        TravelOffice travelOffice = new TravelOffice();
        customer1.assignTrip(abroadTrip);
        customer1.setAdress(adress1);
        customer2.assignTrip(domesticTrip);
        customer2.setAdress(adress2);

        customer1.toString();
        customer2.toString();

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.getCustomerCount();
        travelOffice.findCustomerByName("Wojciech Szuba");
        Date.writeYourDate("23.12,2016", "'/,.");
    }
}
