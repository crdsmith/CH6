package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class ShoulderWorkout implements Workout{
    private int shoulderWorkoutID;
    private String shoulderWorkoutName;
    private String shoulderWorkoutInfo;
    private String shoulderWorkoutHint;
    private String shoulderWorkoutTarget;


    public ShoulderWorkout() {
        this.shoulderWorkoutID = shoulderWorkoutID;
        this.shoulderWorkoutName = shoulderWorkoutName;
        this.shoulderWorkoutInfo = shoulderWorkoutInfo;
        this.shoulderWorkoutHint = shoulderWorkoutHint;
        this.shoulderWorkoutTarget = shoulderWorkoutTarget;
    }

    public int getShoulderWorkoutID() {
        return shoulderWorkoutID;
    }

    public void setShoulderWorkoutID(int shoulderWorkoutID) {
        this.shoulderWorkoutID = shoulderWorkoutID;
    }

    public String getShoulderWorkoutName() {
        return shoulderWorkoutName;
    }

    public void setShoulderWorkoutName(String shoulderWorkoutName) {
        this.shoulderWorkoutName = shoulderWorkoutName;
    }

    public String getShoulderWorkoutInfo() {
        return shoulderWorkoutInfo;
    }

    public void setShoulderWorkoutInfo(String shoulderWorkoutInfo) {
        this.shoulderWorkoutInfo = shoulderWorkoutInfo;
    }

    public String getShoulderWorkoutHint() {
        return shoulderWorkoutHint;
    }

    public void setShoulderWorkoutHint(String shoulderWorkoutHint) {
        this.shoulderWorkoutHint = shoulderWorkoutHint;
    }

    public String getShoulderWorkoutTarget() {
        return shoulderWorkoutTarget;
    }

    public void setShoulderWorkoutTarget(String shoulderWorkoutTarget) {
        this.shoulderWorkoutTarget = shoulderWorkoutTarget;
    }

    @Override
    public String type() {
        return "Shoulder Workout";
    }

    @Override
    public String toString() {
        return "ShoulderWorkout{" +
                "shoulderWorkoutID=" + shoulderWorkoutID +
                ", shoulderWorkoutName='" + shoulderWorkoutName + '\'' +
                ", shoulderWorkoutInfo='" + shoulderWorkoutInfo + '\'' +
                ", shoulderWorkoutHint='" + shoulderWorkoutHint + '\'' +
                ", shoulderWorkoutTarget='" + shoulderWorkoutTarget + '\'' +
                '}';
    }
}
