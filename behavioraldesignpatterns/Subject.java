package behavioraldesignpatterns;

import java.util.ArrayList;
import java.util.List;

import abstraction.subjectabs;

public class Subject implements subjectabs {
    String name="SHRIKANT PADHY";
    List<Observer>Observerlist=new ArrayList<>();
    @Override
    public void notifying() {
        for(Observer entity:Observerlist){
           entity.updates(this,"new content is posted");
        }
        
    }

    @Override
    public int getTotalObserver() {
        return Observerlist.size();
    }

    @Override
    public boolean addObserver(Observer ob) {
        this.Observerlist.add(ob);
        return true;
    }

    @Override
    public boolean removeObserver(Observer ob) {
        // TODO Auto-generated method stub
        Observer t1=null;
        for(Observer temp:Observerlist){
            if(temp==ob){
                t1=temp;
                break;
            }
        }
        if(t1==null)
            return false;
        Observerlist.remove(t1);
        return(true);
    }
    
    
}
