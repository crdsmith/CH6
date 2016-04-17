package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class BackWorkout implements Workout{
    private int backWorkoutID;
    private String backWorkoutName;
    private String backWorkoutInfo;
    private String backWorkoutHint;
    private String backWorkoutTarget;


    public BackWorkout() {
        this.backWorkoutID = backWorkoutID;
        this.backWorkoutName = backWorkoutName;
        this.backWorkoutInfo = backWorkoutInfo;
        this.backWorkoutHint = backWorkoutHint;
        this.backWorkoutTarget = backWorkoutTarget;
    }

    public int getBackWorkoutID() {
        return backWorkoutID;
    }

    public void setBackWorkoutID(int backWorkoutID) {
        this.backWorkoutID = backWorkoutID;
    }

    public String getBackWorkoutName() {
        return backWorkoutName;
    }

    public void setBackWorkoutName(String backWorkoutName) {
        this.backWorkoutName = backWorkoutName;
    }

    public String getBackWorkoutInfo() {
        return backWorkoutInfo;
    }

    public void setBackWorkoutInfo(String backWorkoutInfo) {
        this.backWorkoutInfo = backWorkoutInfo;
    }

    public String getBackWorkoutHint() {
        return backWorkoutHint;
    }

    public void setBackWorkoutHint(String backWorkoutHint) {
        this.backWorkoutHint = backWorkoutHint;
    }

    public String getBackWorkoutTarget() {
        return backWorkoutTarget;
    }

    public void setBackWorkoutTarget(String backWorkoutTarget) {
        this.backWorkoutTarget = backWorkoutTarget;
    }

    @Override
    public String type() {
        return "Back Workout";
    }

    @Override
    public String toString() {
        return "BackWorkout{" +
                "backWorkoutID=" + backWorkoutID +
                ", backWorkoutName='" + backWorkoutName + '\'' +
                ", backWorkoutInfo='" + backWorkoutInfo + '\'' +
                ", backWorkoutHint='" + backWorkoutHint + '\'' +
                ", backWorkoutTarget='" + backWorkoutTarget + '\'' +
                '}';
    }
}
