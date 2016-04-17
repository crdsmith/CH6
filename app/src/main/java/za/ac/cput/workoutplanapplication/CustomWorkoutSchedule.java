package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class CustomWorkoutSchedule implements WorkoutSchedule
{
    private int scheduleIDCust;
    private int numberOfCyclesCust;
    private boolean randomWorkout;
    private int cycleIterationCust;

    public CustomWorkoutSchedule() {
        this.scheduleIDCust = scheduleIDCust;
        this.numberOfCyclesCust = numberOfCyclesCust;
        this.randomWorkout = randomWorkout;
        this.cycleIterationCust = cycleIterationCust;
    }


    public int getScheduleIDCust() {
        return scheduleIDCust;
    }

    public void setScheduleIDCust(int scheduleIDCust) {
        this.scheduleIDCust = scheduleIDCust;
    }

    public int getNumberOfCyclesCust() {
        return numberOfCyclesCust;
    }

    public void setNumberOfCyclesCust(int numberOfCyclesCust) {
        this.numberOfCyclesCust = numberOfCyclesCust;
    }

    public boolean isRandomWorkout() {
        return randomWorkout;
    }

    public void setRandomWorkout(boolean randomWorkout) {
        this.randomWorkout = randomWorkout;
    }

    public int getCycleIterationCust() {
        return cycleIterationCust;
    }

    public void setCycleIterationCust(int cycleIterationCust) {
        this.cycleIterationCust = cycleIterationCust;
    }

    @Override
    public String type() {
        return "Custom Workout Schedule";
    }

    @Override
    public String toString()
    {
        return "CustomWorkoutSchedule{" + "scheduleIDCust = " + scheduleIDCust + ", numberOfCyclesCust = " + numberOfCyclesCust + ", randomWorkout = " + randomWorkout + ", cycleIterationCust = " + cycleIterationCust + '}';
    }
}
