class SingleTon{
     public static void main(String[] args) {
        SingleTonDemo obj=SingleTonDemo.getInstance();
        SingleTonDemo obj2=SingleTonDemo.getInstance();
        System.out.println(obj==obj2);
    }
}

class SingleTonDemo{
    private static SingleTonDemo obj=new SingleTonDemo();

    private SingleTonDemo(){

    }

    public static SingleTonDemo getInstance(){
        
        return(obj);
    }

}