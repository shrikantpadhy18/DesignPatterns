package factory;
import intermediate.*;
import template.*;

class Factory{
    public static void main(String []args ){
        Context obj=new Context();
        vehicleTemplate entity=obj.getInstance("car");
        entity.specs();
    }
}