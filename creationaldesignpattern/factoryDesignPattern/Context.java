package intermediate;
import template.*;

public class Context{

    public vehicleTemplate getInstance(String s){
        vehicleTemplate obj=null;
        if(s.equalsIgnoreCase("car")){
            obj=new Car();

        }
        else if(s.equalsIgnoreCase("bus")){
            obj=new Bus();
        }

        return(obj);
    }

}