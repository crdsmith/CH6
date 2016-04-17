package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class CarbCounter implements Counter{
    private double portionSizeCarb;
    private double countCarb;
    private int noOfServingsCarb;


    public CarbCounter() {
        this.portionSizeCarb = portionSizeCarb;
        this.countCarb = countCarb;
        this.noOfServingsCarb = noOfServingsCarb;
    }

    public double getPortionSizeCarb() {
        return portionSizeCarb;
    }

    public void setPortionSizeCarb(double portionSizeCarb) {
        this.portionSizeCarb = portionSizeCarb;
    }

    public double getCountCarb() {
        return countCarb;
    }

    public void setCountCarb(double countCarb) {
        this.countCarb = countCarb;
    }

    public int getNoOfServingsCarb() {
        return noOfServingsCarb;
    }

    public void setNoOfServingsCarb(int noOfServingsCarb) {
        this.noOfServingsCarb = noOfServingsCarb;
    }

    @Override
    public String type() {
        return "Carbohydrate Counter";
    }

    @Override
    public String toString() {
        return "CarbCounter{" +
                "portionSizeCarb=" + portionSizeCarb +
                ", countCarb=" + countCarb +
                ", noOfServingsCarb=" + noOfServingsCarb +
                '}';
    }
}
