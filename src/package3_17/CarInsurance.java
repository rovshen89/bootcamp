package package3_17;

public class CarInsurance {
    private int modelYear;
    private int numberOfTickets;
    private int numberOfAccidents;
    private double offer;
    final double basePrice = 99.9;
    public CarInsurance(int modelYear, int numberOfTickets, int numberOfAccidents){
        this.modelYear = modelYear;
        this.numberOfTickets = numberOfTickets;
        this.numberOfAccidents = numberOfAccidents;
        this.offer = offer;
    }

    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }

    public int getModelYear(){
        return this.modelYear;
    }

    public void setNumberOfTickets(int tickets){
        this.numberOfTickets = tickets;
    }

    public int getNumberOfTickets(){
         return this.numberOfTickets;
    }

    public void setNumberOfAccidents(int accidents){
        this.numberOfAccidents = accidents;
    }

    public int getNumberOfAccidents(){
        return this.numberOfAccidents;
    }

    public void setOffer(int offer){
        this.offer = offer;
    }

    public double getOffer(){
        return this.offer;
    }

    public double makeOffer(int year){
        this.offer = this.basePrice + (year - this.modelYear) * 50 + (30 * this.numberOfAccidents) + (100*this.numberOfAccidents);
        return this.offer;
    }

    @Override
    public String toString() {
        return "CarInsurance{" +
                "modelYear=" + modelYear +
                ", numberOfTickets=" + numberOfTickets +
                ", numberOfAccidents=" + numberOfAccidents +
                ", offer=" + offer +
                ", basePrice=" + basePrice +
                '}';
    }
}
