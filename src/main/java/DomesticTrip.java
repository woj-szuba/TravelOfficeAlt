public class DomesticTrip extends Trip {

    private double ownArrivalDiscount;

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public DomesticTrip(Date start, Date end, String destination, double price) {
        super(start, end, destination, price);
    }

    @Override
    public double getPrice() {
        double newPrice = super.getPrice() - ownArrivalDiscount;
        return newPrice;
    }
}
