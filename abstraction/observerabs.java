package abstraction;

public interface observerabs {
    public void register(subjectabs ob);

    public void unregister(subjectabs ob);

    public void updates(subjectabs ob);


}
