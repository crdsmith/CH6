package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class GeneratedWorkoutSchedule implements WorkoutSchedule{
    private int scheduleIDGen;
    private int numberOfCyclesGen;
    private int cycleIteratorGen;

    public GeneratedWorkoutSchedule() {
        this.scheduleIDGen = scheduleIDGen;
        this.numberOfCyclesGen = numberOfCyclesGen;
        this.cycleIteratorGen = cycleIteratorGen;
    }

    public int getScheduleIDGen() {
        return scheduleIDGen;
    }

    public void setScheduleIDGen(int scheduleIDGen) {
        this.scheduleIDGen = scheduleIDGen;
    }

    public int getNumberOfCyclesGen() {
        return numberOfCyclesGen;
    }

    public void setNumberOfCyclesGen(int numberOfCyclesGen) {
        this.numberOfCyclesGen = numberOfCyclesGen;
    }

    public int getCycleIteratorGen() {
        return cycleIteratorGen;
    }

    public void setCycleIteratorGen(int cycleIteratorGen) {
        this.cycleIteratorGen = cycleIteratorGen;
    }

    @Override
    public String type() {
        return "Generated Workout Schedule";
    }

    @Override
    public String toString() {
        return "GeneratedWorkoutSchedule{" +
                "scheduleIDGen=" + scheduleIDGen +
                ", numberOfCyclesGen=" + numberOfCyclesGen +
                ", cycleIteratorGen=" + cycleIteratorGen +
                '}';
    }
}
