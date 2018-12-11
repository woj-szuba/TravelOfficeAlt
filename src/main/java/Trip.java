
public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }


    public String toString(){
        System.out.println("Cel podróży: " + destination);
        System.out.print("Data przyjazdu: ");
        start.toString();
        System.out.print("Data wyjazdu: ");
        end.toString();
        System.out.println("Koszt wyjazdu: " + getPrice());
        System.out.println();
        return null;
    }
}
