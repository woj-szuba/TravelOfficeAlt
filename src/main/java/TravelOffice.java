import java.util.*;


public class TravelOffice {

    Set<Customer> customersTab;
    Map<String, Trip> tripMap= new HashMap<>();

    public TravelOffice() {
        this.customersTab = new HashSet<>();
    }

    public void addCustomer(Customer customer){
        customersTab.add(customer);

    }
    public void getCustomerCount(){
        System.out.println("Liczba zapisanych klientów: " + customersTab.size());
    }

    public String toString() {
        int count = 1;
        String info = "Total clients [" + customersTab.size() + "]\n\tClient list: ";
        for (Customer customer : customersTab) {
            info += "\n\nClient number [" + count + "]\n\n"+customer.toString();
            ++count;
        }
        return info;
    }

    public void addTrip(String string, Trip trip){
        tripMap.put(string, trip);
    }

    public boolean removeTrip(String trip){
        if (tripMap.containsKey(trip) && !trip.equals(null)){
            tripMap.remove(trip);
            return true;
        } else {
            return false;
        }
    }

    Customer findCustomerByName(String name) {

        for (Iterator<Customer> i = customersTab.iterator(); i.hasNext(); ) {
            Customer element = i.next();
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public boolean removeCustomer(Customer customer){
        if(customersTab.contains(customer)){
            customersTab.remove(customer);
        } return false;


    }

}
