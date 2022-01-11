
public class Observer implements observerabs {
    String nameofobserString;
    public String getNameOfObserverString(){
        return nameofobserString;
    }

    public void setNameOfObserverString(String nameofsString){
        this.nameofobserString=nameofsString;
    }

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
        System.out.println("Channel "+ob.getName()+"has some update");
        
    }
    
}
