import java.util.ArrayList;
import java.util.List;

public class Observer implements observerabs {
    String nameofobserString;
    String role;
    List<Subject>subjectlist=new ArrayList<>();

    public String getNameOfObserverString(){
        return nameofobserString;
    }

    public void setNameOfObserverString(String nameofsString){
        this.nameofobserString=nameofsString;
    }

    @Override
    public void register(Subject ob) {
        // TODO Auto-generated method stub
        this.subjectlist.add(ob);
        ob.addObserver(this);

        
    }

    public void getSubjectList(){
        System.out.println("Total followeing "+this.getNameOfObserverString()+" has="+this.subjectlist.size());
        for(Subject entity:subjectlist){
            System.out.println(this.getNameOfObserverString()+"follows "+entity.getName());
        }
    }

    @Override
    public void unregister(Subject ob) {
        // TODO Auto-generated method stub
        ob.removeObserver(this);
    }

    @Override
    public void updates(Subject ob,String mssg) {
        // TODO Auto-generated method stub
        System.out.println("Channel "+ob.getName()+"has some update");
        
    }

    @Override
    public void setRoleOfObserverString(String role) {
        // TODO Auto-generated method stub
        this.role=role;
        
    }

    @Override
    public String getRoleOfObserveString() {
        // TODO Auto-generated method stub
        return this.role;
    }
    
}
