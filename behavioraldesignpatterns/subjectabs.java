public interface subjectabs {
    public void notifying(String msg);
    public int getTotalObserver();
    public boolean addObserver(Observer ob);
    public boolean removeObserver(Observer ob);
    public String getName();
    public void setName(String x);

}
