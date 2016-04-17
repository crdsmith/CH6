package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class ButtockWorkout implements Workout{
    private int buttockWorkoutID;
    private String buttockWorkoutName;
    private String buttockWorkoutInfo;
    private String buttockWorkoutHint;
    private String buttockWorkoutTarget;


    public ButtockWorkout() {
        this.buttockWorkoutID = buttockWorkoutID;
        this.buttockWorkoutName = buttockWorkoutName;
        this.buttockWorkoutInfo = buttockWorkoutInfo;
        this.buttockWorkoutHint = buttockWorkoutHint;
        this.buttockWorkoutTarget = buttockWorkoutTarget;
    }

    public int getButtockWorkoutID() {
        return buttockWorkoutID;
    }

    public void setButtockWorkoutID(int buttockWorkoutID) {
        this.buttockWorkoutID = buttockWorkoutID;
    }

    public String getButtockWorkoutName() {
        return buttockWorkoutName;
    }

    public void setButtockWorkoutName(String buttockWorkoutName) {
        this.buttockWorkoutName = buttockWorkoutName;
    }

    public String getButtockWorkoutInfo() {
        return buttockWorkoutInfo;
    }

    public void setButtockWorkoutInfo(String buttockWorkoutInfo) {
        this.buttockWorkoutInfo = buttockWorkoutInfo;
    }

    public String getButtockWorkoutHint() {
        return buttockWorkoutHint;
    }

    public void setButtockWorkoutHint(String buttockWorkoutHint) {
        this.buttockWorkoutHint = buttockWorkoutHint;
    }

    public String getButtockWorkoutTarget() {
        return buttockWorkoutTarget;
    }

    public void setButtockWorkoutTarget(String buttockWorkoutTarget) {
        this.buttockWorkoutTarget = buttockWorkoutTarget;
    }

    @Override
    public String type() {
        return "Buttock Workout";
    }

    @Override
    public String toString() {
        return "ButtockWorkout{" +
                "buttockWorkoutID=" + buttockWorkoutID +
                ", buttockWorkoutName='" + buttockWorkoutName + '\'' +
                ", buttockWorkoutInfo='" + buttockWorkoutInfo + '\'' +
                ", buttockWorkoutHint='" + buttockWorkoutHint + '\'' +
                ", buttockWorkoutTarget='" + buttockWorkoutTarget + '\'' +
                '}';
    }
}
