package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class CalorieCounter implements Counter{
    private double portionSizeCal;
    private double countCal;
    private int noOfServingsCal;

    public CalorieCounter(double portionSizeCal, double countCal, int noOfServingsCal) {
        this.portionSizeCal = portionSizeCal;
        this.countCal = countCal;
        this.noOfServingsCal = noOfServingsCal;
    }

    public CalorieCounter() {

    }

    public double getPortionSizeCal() {
        return portionSizeCal;
    }

    public void setPortionSizeCal(double portionSizeCal) {
        this.portionSizeCal = portionSizeCal;
    }

    public double getCountCal() {
        return countCal;
    }

    public void setCountCal(double countCal) {
        this.countCal = countCal;
    }

    public int getNoOfServingsCal() {
        return noOfServingsCal;
    }

    public void setNoOfServingsCal(int noOfServingsCal) {
        this.noOfServingsCal = noOfServingsCal;
    }

    @Override
    public String type() {
        return "Calorie Counter";
    }

    @Override
    public String toString() {
        return "CalorieCounter{" +
                "portionSizeCal=" + portionSizeCal +
                ", countCal=" + countCal +
                ", noOfServingsCal=" + noOfServingsCal +
                '}';
    }
}
