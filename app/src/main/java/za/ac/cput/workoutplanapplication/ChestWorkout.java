package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class ChestWorkout implements Workout{
    private int chestWorkoutID;
    private String chestWorkoutName;
    private String chestWorkoutInfo;
    private String chestWorkoutHint;
    private String chestWorkoutTarget;


    public ChestWorkout() {
        this.chestWorkoutID = chestWorkoutID;
        this.chestWorkoutName = chestWorkoutName;
        this.chestWorkoutInfo = chestWorkoutInfo;
        this.chestWorkoutHint = chestWorkoutHint;
        this.chestWorkoutTarget = chestWorkoutTarget;
    }

    public int getChestWorkoutID() {
        return chestWorkoutID;
    }

    public void setChestWorkoutID(int chestWorkoutID) {
        this.chestWorkoutID = chestWorkoutID;
    }

    public String getChestWorkoutName() {
        return chestWorkoutName;
    }

    public void setChestWorkoutName(String chestWorkoutName) {
        this.chestWorkoutName = chestWorkoutName;
    }

    public String getChestWorkoutInfo() {
        return chestWorkoutInfo;
    }

    public void setChestWorkoutInfo(String chestWorkoutInfo) {
        this.chestWorkoutInfo = chestWorkoutInfo;
    }

    public String getChestWorkoutHint() {
        return chestWorkoutHint;
    }

    public void setChestWorkoutHint(String chestWorkoutHint) {
        this.chestWorkoutHint = chestWorkoutHint;
    }

    public String getChestWorkoutTarget() {
        return chestWorkoutTarget;
    }

    public void setChestWorkoutTarget(String chestWorkoutTarget) {
        this.chestWorkoutTarget = chestWorkoutTarget;
    }

    @Override
    public String type() {
        return "Chest Workout";
    }

    @Override
    public String toString() {
        return "ChestWorkout{" +
                "chestWorkoutID=" + chestWorkoutID +
                ", chestWorkoutName='" + chestWorkoutName + '\'' +
                ", chestWorkoutInfo='" + chestWorkoutInfo + '\'' +
                ", chestWorkoutHint='" + chestWorkoutHint + '\'' +
                ", chestWorkoutTarget='" + chestWorkoutTarget + '\'' +
                '}';
    }
}
