package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class AbdomenWorkout implements Workout{
    private int abdomenWorkoutID;
    private String abdomenWorkoutName;
    private String abdomenWorkoutInfo;
    private String abdomenWorkoutHint;
    private String abdomenWorkoutTarget;


    public AbdomenWorkout() {
        this.abdomenWorkoutID = abdomenWorkoutID;
        this.abdomenWorkoutName = abdomenWorkoutName;
        this.abdomenWorkoutInfo = abdomenWorkoutInfo;
        this.abdomenWorkoutHint = abdomenWorkoutHint;
        this.abdomenWorkoutTarget = abdomenWorkoutTarget;
    }

    public int getAbdomenWorkoutID() {
        return abdomenWorkoutID;
    }

    public void setAbdomenWorkoutID(int abdomenWorkoutID) {
        this.abdomenWorkoutID = abdomenWorkoutID;
    }

    public String getAbdomenWorkoutName() {
        return abdomenWorkoutName;
    }

    public void setAbdomenWorkoutName(String abdomenWorkoutName) {
        this.abdomenWorkoutName = abdomenWorkoutName;
    }

    public String getAbdomenWorkoutInfo() {
        return abdomenWorkoutInfo;
    }

    public void setAbdomenWorkoutInfo(String abdomenWorkoutInfo) {
        this.abdomenWorkoutInfo = abdomenWorkoutInfo;
    }

    public String getAbdomenWorkoutHint() {
        return abdomenWorkoutHint;
    }

    public void setAbdomenWorkoutHint(String abdomenWorkoutHint) {
        this.abdomenWorkoutHint = abdomenWorkoutHint;
    }

    public String getAbdomenWorkoutTarget() {
        return abdomenWorkoutTarget;
    }

    public void setAbdomenWorkoutTarget(String abdomenWorkoutTarget) {
        this.abdomenWorkoutTarget = abdomenWorkoutTarget;
    }

    @Override
    public String type(){
        return "Abdomen Workout";
    }

    @Override
    public String toString() {
        return "AbdomenWorkout{" +
                "abdomenWorkoutID=" + abdomenWorkoutID +
                ", abdomenWorkoutName='" + abdomenWorkoutName + '\'' +
                ", abdomenWorkoutInfo='" + abdomenWorkoutInfo + '\'' +
                ", abdomenWorkoutHint='" + abdomenWorkoutHint + '\'' +
                ", abdomenWorkoutTarget='" + abdomenWorkoutTarget + '\'' +
                '}';
    }
}
