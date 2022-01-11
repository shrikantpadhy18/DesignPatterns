
public interface observerabs {
    public void register(Subject ob);

    public void unregister(Subject ob);

    public void updates(Subject ob,String m);


}
