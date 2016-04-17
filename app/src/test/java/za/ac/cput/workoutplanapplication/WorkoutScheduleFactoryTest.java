package za.ac.cput.workoutplanapplication;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class WorkoutScheduleFactoryTest {

    @Test
    public void testGetWorkoutScheduleFactoryInstance() throws Exception {
        WorkoutScheduleFactory workout = WorkoutScheduleFactory.getWorkoutScheduleFactoryInstance();
        Assert.assertEquals(null,workout);
    }


}