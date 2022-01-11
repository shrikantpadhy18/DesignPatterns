package behavioraldesignpatterns;

import abstraction.observerabs;

public class Observer implements observerabs {

    @Override
    public void register(Subject ob) {
        // TODO Auto-generated method stub
        ob.addObserver(this);

        
    }

    @Override
    public void unregister(Subject ob) {
        // TODO Auto-generated method stub
        ob.removeObserver(this);
    }

    @Override
    public void updates(Subject ob,String mssg) {
        // TODO Auto-generated method stub
        System.out.println("Channel "+ob.name+"has some update");
        
    }
    
}
