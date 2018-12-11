import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TravelOfficeTest {

    @Mock
    Set<Customer> customersTab = new HashSet<>();

    @InjectMocks
    TravelOffice travelOffice = new TravelOffice();

    @Test
    public void shouldAddTwoCustomers() {
        // Given
        Customer customer1 = new Customer("Wojciech");
        Customer customer2 = new Customer("Adam");
        // When
        customersTab.add(customer1);
        customersTab.add(customer2);
        // Then
        assertEquals(2, customersTab.size());
    }

    @Test
    public void shouldGetCustomerCountEqualsOne() {
        // Given
        Customer customer1 = new Customer("Wojciech");
        customersTab.add(customer1);
        // When
        int expectedCount = customersTab.size();
        // Then
        assertEquals("Liczba zapisanych klientów: " + 1, "Liczba zapisanych klientów: " + expectedCount);
    }

    @Test
    public void shouldAddTrip() {
        Map<String, Trip> tripMap= new HashMap<>();
        Trip trip = new Trip(new Date(2008, 12, 12),
                new Date(2008, 12, 12), "Karaiby", 299 );
        travelOffice.addTrip("wycieczka 1", trip);
        assertEquals(1, travelOffice.tripMap.size());
    }

    @Test
    public void shouldRemoveTrip() {
        Map<String, Trip> tripMap= new HashMap<>();
        Trip trip = new Trip(new Date(2008, 12, 12),
                new Date(2008, 12, 12), "Karaiby", 299 );
        travelOffice.addTrip("wycieczka 1", trip);
        travelOffice.removeTrip("wycieczka 1");
        assertEquals(0, travelOffice.tripMap.size());
    }

    @Test
    public void shouldFindCustomerByName() {
        // Given
        String name = "Kuba";
        Customer expectedCustomer = new Customer(name);
        travelOffice.addCustomer(expectedCustomer);
        // When
        Customer result = travelOffice.findCustomerByName(name);
        // Then
        assertEquals(expectedCustomer.getName(),result.getName());
    }

    @Test
    public void shouldRemoveCustomer() {
        // Given
        Customer customer1 = new Customer("Wojciech");
        travelOffice.addCustomer(customer1);
        // When
        travelOffice.removeCustomer(customer1);
        // Then
        assertEquals(0, customersTab.size());
    }
}