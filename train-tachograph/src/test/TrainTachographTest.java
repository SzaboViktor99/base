package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import hu.bme.mit.train.system.TrainSystem;


public class TrainTachographTest{
    public TrainTachographImpl tachograph;
    
    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        tachograph = new TrainTachographImpl(system.getUser(), getController());
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        tachograph.logTachoData();
        Assert.assertEquals(false, tachograph.isEmpty());
    }
}
