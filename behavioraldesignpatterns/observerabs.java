
public interface observerabs {
    public void register(Subject ob);

    public void unregister(Subject ob);

    public void updates(Subject ob,String m);

    public void getSubjectList();

    public String getNameOfObserverString();
    public void setNameOfObserverString(String ob);
    public void setRoleOfObserverString(String role);
    public String getRoleOfObserveString();
}
