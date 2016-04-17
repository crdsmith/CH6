package za.ac.cput.workoutplanapplication;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class WorkoutScheduleFactory {

    private static WorkoutScheduleFactory workoutScheduleFactory = null;

    private WorkoutScheduleFactory() {
    }

    public static WorkoutScheduleFactory getWorkoutScheduleFactoryInstance() {
        if (workoutScheduleFactory == null)
            return new WorkoutScheduleFactory();
        return workoutScheduleFactory;
    }

    public WorkoutSchedule getWorkoutScheduleType(String workoutSchedule) {
        if ("Generated Workout Schedule".equalsIgnoreCase(workoutSchedule)) {
            return new GeneratedWorkoutSchedule();
        } else
            return new CustomWorkoutSchedule();


    }



}
