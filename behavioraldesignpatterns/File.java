
public class File {
     public static void main(String[] args) {
        Observer ob1=new Observer();

        ob1.setNameOfObserverString("RITIK PATIL");
        
        Subject sub1=new Subject();
        sub1.setName("SHRIKANT PADHY");


        //NOW RITIK IS FOLLOWING SHRIKANT

        ob1.register(sub1);

        //now check how many followers now shrikant has

        System.out.println(sub1.getName()+" has this many followers "+sub1.getTotalObserver());
        
        //print down all the followers detail of shrikant
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
        }


        //if suppose ritik unfollows shrikant;

        ob1.unregister(sub1);

        System.out.println(sub1.getName()+" has this many followers "+sub1.getTotalObserver());

        //print down all the followers detail of shrikant
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
        }

    }  
}
