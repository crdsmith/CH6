package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class WorkoutFactory {
    private static WorkoutFactory workoutFactory = null;

    private WorkoutFactory()
    {
    }

    public static WorkoutFactory getWorkoutFactoryInstance(){
        if(workoutFactory == null)
            return new WorkoutFactory();
        return workoutFactory;
    }

    public Workout getWorkoutType(String workout) {
        if ("Arm Workout".equalsIgnoreCase(workout)) {
            return new ArmWorkout();
        } else if ("Back Workout".equalsIgnoreCase(workout)) {
            return new BackWorkout();
        } else if ("Chest Workout".equalsIgnoreCase(workout)) {
            return new ChestWorkout();
        } else if ("Leg Workout".equalsIgnoreCase(workout)) {
            return new LegWorkout();
        } else if ("Abdomen Workout".equalsIgnoreCase(workout)) {
            return new AbdomenWorkout();
        } else if ("Shoulder Workout".equalsIgnoreCase(workout)) {
            return new ShoulderWorkout();
        } else return new ButtockWorkout();
    }


}
