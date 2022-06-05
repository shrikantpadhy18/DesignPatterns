

interface Gbutton{
    void press();
} 


// we have created macButton
class MacButton implements Gbutton
{
    public void press(){
        System.out.println("MacButton is pressed");
    }
}


// we have created WinButton
class WinButton implements Gbutton
{
    public void press(){
        System.out.println("Window Button Pressed");
    }
}


interface Itextbox{
    void showText();
}

class MacTextBox implements Itextbox
{
    public void showText(){
        System.out.println("MacTextBox is displayed");
    }
}


// we have created WinButton
class WinTextBox implements Itextbox
{
    public void showText(){
        System.out.println("WindowTextBox is diplayed");
    }
}

interface Gfactory{

    Gbutton createButton();
    Itextbox createTextBox();


}


class WindowFactory implements Gfactory
{

    @Override
    public Gbutton createButton() {
        return(new WinButton());
        
    }

    @Override
    public Itextbox createTextBox() {
       return(new WinTextBox());
        
    }
    
}

class MacFactory implements Gfactory
{

    @Override
    public Gbutton createButton() {
        return(new MacButton());
        
    }

    @Override
    public Itextbox createTextBox() {
       return(new MacTextBox());
        
    }
    
}


class Factory
{
    public static Gfactory createFactory(String osType){
        if(osType.equalsIgnoreCase("apple"))
        {
            return(new MacFactory());
        }
        else if(osType.equalsIgnoreCase("window"))
        {
            return(new WindowFactory());
        }
        return(new WindowFactory());
    }

}




class Client {

    public static void main(String[] args){
        Gfactory factory=Factory.createFactory("apple");

        Gbutton btn=factory.createButton();
        Itextbox txtbox=factory.createTextBox();

        btn.press();
        txtbox.showText();

        Gfactory factory2=Factory.createFactory("window");
        Itextbox txtbox2=factory2.createTextBox();
        Gbutton btn2=factory2.createButton();

        btn2.press();
        txtbox2.showText();
    }


}