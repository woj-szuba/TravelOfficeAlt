public class AbroadTrip extends Trip {

    private double insurance;

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public AbroadTrip(Date start, Date end, String destination, double price) {
        super(start, end, destination, price);
    }

    @Override
    public double getPrice() {
        double newPrice = super.getPrice() + insurance;
        return newPrice;
    }
}
