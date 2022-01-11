package abstraction;

import behavioraldesignpatterns.Observer;

public interface subjectabs {
    public void notifying();
    public int getTotalObserver();
    public boolean addObserver(Observer ob);
    public boolean removeObserver(Observer ob);
}
