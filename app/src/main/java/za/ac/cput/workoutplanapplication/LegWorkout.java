package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class LegWorkout implements Workout{
    private int legWorkoutID;
    private String legWorkoutName;
    private String legWorkoutInfo;
    private String legWorkoutHint;
    private String legWorkoutTarget;

    public LegWorkout() {
        this.legWorkoutID = legWorkoutID;
        this.legWorkoutName = legWorkoutName;
        this.legWorkoutInfo = legWorkoutInfo;
        this.legWorkoutHint = legWorkoutHint;
        this.legWorkoutTarget = legWorkoutTarget;
    }

    public int getLegWorkoutID() {
        return legWorkoutID;
    }

    public void setLegWorkoutID(int legWorkoutID) {
        this.legWorkoutID = legWorkoutID;
    }

    public String getLegWorkoutName() {
        return legWorkoutName;
    }

    public void setLegWorkoutName(String legWorkoutName) {
        this.legWorkoutName = legWorkoutName;
    }

    public String getLegWorkoutInfo() {
        return legWorkoutInfo;
    }

    public void setLegWorkoutInfo(String legWorkoutInfo) {
        this.legWorkoutInfo = legWorkoutInfo;
    }

    public String getLegWorkoutHint() {
        return legWorkoutHint;
    }

    public void setLegWorkoutHint(String legWorkoutHint) {
        this.legWorkoutHint = legWorkoutHint;
    }

    public String getLegWorkoutTarget() {
        return legWorkoutTarget;
    }

    public void setLegWorkoutTarget(String legWorkoutTarget) {
        this.legWorkoutTarget = legWorkoutTarget;
    }

    @Override
    public String type() {
        return "Leg Workout";
    }

    @Override
    public String toString() {
        return "LegWorkout{" +
                "legWorkoutID=" + legWorkoutID +
                ", legWorkoutName='" + legWorkoutName + '\'' +
                ", legWorkoutInfo='" + legWorkoutInfo + '\'' +
                ", legWorkoutHint='" + legWorkoutHint + '\'' +
                ", legWorkoutTarget='" + legWorkoutTarget + '\'' +
                '}';
    }
}
