
public class File {
     public static void main(String[] args) {
        Observer ob1=new Observer();

        //NOW OBSERVER ARE MEMBER OF CLUB/COMMITTEE/SOCIETY
        ob1.setNameOfObserverString("SHRIKANT PADHY");
        
        //here subject corresponds to college committee/societies
        Subject sub1=new Subject();
        sub1.setName("ITSA");


        //NOW SHRIKANT IS FOLLOWING ITSA CLUB

        ob1.register(sub1);

        //now check how many followers now itsa has

        System.out.println(sub1.getName()+" has this many followers "+sub1.getTotalObserver());
        
        //print down all the followers detail of ITSA club
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
        }

        //find out how many clubs SHRIKANT FOLLOWS
        ob1.getSubjectList();

        //if suppose SHRIKANT unfollows ITSA;

        ob1.unregister(sub1);

        System.out.println(sub1.getName()+" has this many followers "+sub1.getTotalObserver());

        //print down all the followers detail of ITSA after the one member has unfollowed it
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
        }

    }  
}
