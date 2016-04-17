package za.ac.cput.workoutplanapplication;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class WorkoutFactoryTest {

    @Test
    public void testGetWorkoutFactoryInstance() throws Exception {
        WorkoutFactory work = WorkoutFactory.getWorkoutFactoryInstance();
        Assert.assertEquals(null,work);

    }


}