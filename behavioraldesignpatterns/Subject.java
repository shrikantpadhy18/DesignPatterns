import java.util.ArrayList;
import java.util.List;


public class Subject implements subjectabs {
    private String name;
    List<Observer>Observerlist=new ArrayList<>();
    
    
    public List<Observer> getObserverList(){
        return(Observerlist);
    }

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
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name=name;
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }
    
    
}