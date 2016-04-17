package za.ac.cput.workoutplanapplication;
import za.ac.cput.workoutplanapplication.CarbCounter;
/**
 * Created by SHiRO_333 on 2016-04-17.
 */
public class CounterFactory {
    private static CounterFactory counterFactory = null;

    private CounterFactory()
    {
    }

    public static CounterFactory getCounterFactoryInstance(){
        if(counterFactory == null)
            return new CounterFactory();
        return counterFactory;
    }

    public Counter getCounterType(String counter){
        if("Carbohydrate Counter".equalsIgnoreCase(counter))
        {
            return new CarbCounter();
        }
        else if("Calorie Counter".equalsIgnoreCase(counter))
        {
            return new CalorieCounter();
        }
        else return new ProteinCounter();

    }

}
