class SingleTon{
     public static void main(String[] args) {
        SingleTonDemo obj=SingleTonDemo.getInstance();
        SingleTonDemo obj2=SingleTonDemo.getInstance();
        System.out.println(obj==obj2);
    }
}

class SingleTonDemo{
    //static members are created only once that too when the class gets loaded in the memory ..so now it wont matter how many times the getInstance is invoked ..there would be only one object
    private static SingleTonDemo obj=new SingleTonDemo();

    private SingleTonDemo(){
        //by creating a private constructor..we have actually made sure that java will not be providing us the default public constructor that could be invoked outside of this class.
    }

    public static SingleTonDemo getInstance(){
        
        return(obj);
    }

    public void toDo(){
        //our task
    }

}