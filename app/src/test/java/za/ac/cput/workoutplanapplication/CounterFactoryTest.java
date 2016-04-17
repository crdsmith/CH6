package za.ac.cput.workoutplanapplication;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class CounterFactoryTest {

    @Test
    public void testGetCounterFactoryInstance() throws Exception {
            CounterFactory count = CounterFactory.getCounterFactoryInstance();
            Assert.assertEquals(null,count);

    }


}