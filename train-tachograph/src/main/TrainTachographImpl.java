import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.interfaces.TrainController;

import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.Date;


public class TrainTachographImpl{
    private TrainUser user;
    private TrainController controller;
    private Table<Integer, Integer, Date> tachoData;

    public TrainTachographImpl(TrainUser user, TrainController controller){
        this.user = user;
        this.controller = controller;
        tachoData = new TreeBasedTable.create();
    }

    public void logTachoData(){
        tachoData.put(
            user.getJoystickPosition(),
            controller.getReferenceSpeed(),
            new Date()
        );
    }

    public boolean isEmpty(){
        return tachoData.isEmpty();
    }
}