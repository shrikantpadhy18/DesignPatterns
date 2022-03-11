



public class UserBuilder
{

    private String firstname;

    private String lastName;

    private Address address;

    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    private void setAddress(Address address) {
        this.address = address;
    }

    public static UserBuilderImpl getBuilder(){
        return new UserBuilderImpl();
    }

    public static class UserBuilderImpl
    {
        private String firstname;
        private Address address;
        private String lastname;
        private UserBuilder user;

        public UserBuilderImpl withFirstName(String name){
            firstname=name;
            return this;
        }

        public UserBuilderImpl withLastName(String name){
            lastname=name;
            return this;
        
        }

        public UserBuilderImpl withAddress(Address add){
            address=add;
            return this;
        }

        public UserBuilder build(){
            this.user=new UserBuilder();
            user.setFirstname(firstname);
            user.setLastName(lastname);
            user.setAddress(address);
            return(user);
        }


    }
    



}