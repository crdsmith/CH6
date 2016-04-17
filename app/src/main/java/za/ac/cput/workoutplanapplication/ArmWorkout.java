package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class ArmWorkout implements Workout{
    private int armWorkoutID;
    private String armWorkoutName;
    private String armWorkoutInfo;
    private String armWorkoutHint;
    private String armWorkoutTarget;


    public ArmWorkout() {
        this.armWorkoutID = armWorkoutID;
        this.armWorkoutName = armWorkoutName;
        this.armWorkoutInfo = armWorkoutInfo;
        this.armWorkoutHint = armWorkoutHint;
        this.armWorkoutTarget = armWorkoutTarget;
    }

    public int getArmWorkoutID() {
        return armWorkoutID;
    }

    public void setArmWorkoutID(int armWorkoutID) {
        this.armWorkoutID = armWorkoutID;
    }

    public String getArmWorkoutName() {
        return armWorkoutName;
    }

    public void setArmWorkoutName(String armWorkoutName) {
        this.armWorkoutName = armWorkoutName;
    }

    public String getArmWorkoutInfo() {
        return armWorkoutInfo;
    }

    public void setArmWorkoutInfo(String armWorkoutInfo) {
        this.armWorkoutInfo = armWorkoutInfo;
    }

    public String getArmWorkoutHint() {
        return armWorkoutHint;
    }

    public void setArmWorkoutHint(String armWorkoutHint) {
        this.armWorkoutHint = armWorkoutHint;
    }

    public String getArmWorkoutTarget() {
        return armWorkoutTarget;
    }

    public void setArmWorkoutTarget(String armWorkoutTarget) {
        this.armWorkoutTarget = armWorkoutTarget;
    }

    @Override
    public String type() {
        return "Arm Workout";
    }

    @Override
    public String toString() {
        return "ArmWorkout{" +
                "armWorkoutID=" + armWorkoutID +
                ", armWorkoutName='" + armWorkoutName + '\'' +
                ", armWorkoutInfo='" + armWorkoutInfo + '\'' +
                ", armWorkoutHint='" + armWorkoutHint + '\'' +
                ", armWorkoutTarget='" + armWorkoutTarget + '\'' +
                '}';
    }
}
