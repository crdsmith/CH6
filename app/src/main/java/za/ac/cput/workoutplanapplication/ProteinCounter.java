package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class ProteinCounter implements Counter{
    private double portionSizeProtein;
    private double countProtein;
    private int noOfServingsProtein;

    public ProteinCounter() {
        this.portionSizeProtein = portionSizeProtein;
        this.countProtein = countProtein;
        this.noOfServingsProtein = noOfServingsProtein;
    }

    public double getPortionSizeProtein() {
        return portionSizeProtein;
    }

    public void setPortionSizeProtein(double portionSizeProtein) {
        this.portionSizeProtein = portionSizeProtein;
    }

    public double getCountProtein() {
        return countProtein;
    }

    public void setCountProtein(double countProtein) {
        this.countProtein = countProtein;
    }

    public int getNoOfServingsProtein() {
        return noOfServingsProtein;
    }

    public void setNoOfServingsProtein(int noOfServingsProtein) {
        this.noOfServingsProtein = noOfServingsProtein;
    }

    @Override
    public String type() {
        return "Protein Counter";
    }

    @Override
    public String toString() {
        return "ProteinCounter{" +
                "portionSizeProtein=" + portionSizeProtein +
                ", countProtein=" + countProtein +
                ", noOfServingsProtein=" + noOfServingsProtein +
                '}';
    }
}
