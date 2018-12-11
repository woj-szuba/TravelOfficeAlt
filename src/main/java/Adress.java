public class Adress {

    private String street;
    private String zip;
    private String city;

    public Adress(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String toString(){
        System.out.println("Miasto: " + city);
        System.out.println("Ulica: " + street);
        System.out.println("Kod pocztowy: " + zip);
        System.out.println();
        return null;
    }
}
