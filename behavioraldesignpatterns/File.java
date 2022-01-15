
public class File {
     public static void main(String[] args) {
        Observer ob1=new Observer();

        //NOW OBSERVER ARE MEMBER OF CLUB/COMMITTEE/SOCIETY
        ob1.setNameOfObserverString("SHRIKANT PADHY");
        ob1.setRoleOfObserverString("President");                
        //here subject corresponds to college committee/societies
        Subject sub1=new Subject();
        sub1.setName("ITSA");


        //NOW SHRIKANT IS FOLLOWING ITSA CLUB

        ob1.register(sub1);

        //now check how many followers now itsa has

        System.out.println(sub1.getName()+" has this many members "+sub1.getTotalObserver());
        
        //print down all the followers detail of ITSA club
        System.out.println("The member of the committee named="+sub1.getName()+"are as follows:");
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
            System.out.println("Role="+data.getRoleOfObserveString());
        }

        //find out how many clubs SHRIKANT FOLLOWS
        ob1.getSubjectList();

        //want to update the committee members regarding an event that gonna happen 
        sub1.notifying("we are organising an event ---stay tuned");


        //if suppose SHRIKANT unfollows ITSA;

        ob1.unregister(sub1);
        System.out.println("After removing the member named="+ob1.getNameOfObserverString()+" now "+sub1.getName()+" has total members=");
        System.out.println(sub1.getName()+" has this many followers "+sub1.getTotalObserver());

        //print down all the followers detail of ITSA after the one member has unfollowed it
        for(Observer data:sub1.getObserverList()){
            System.out.println("NAME="+data.getNameOfObserverString());
        }
        

    }  
}
