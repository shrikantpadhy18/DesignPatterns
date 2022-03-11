public class Client {
    
    public static void main(String[] args) {

        User user=creatUser();
        UserBuilder.UserBuilderImpl userBuilder=UserBuilder.getBuilder();
        UserBuilder user1=userBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withAddress(user.getAd()).build();
        
    }

    public static User creatUser(){

        User user=new User();
        user.setFirstName("Shrikant");
        user.setLastName("Padhy");

        Address address=new Address();

        address.setApartmentNumber(123);
        address.setCity("Kalyan");
        address.setFloor(23);


        user.setAd(address);
        return user;
    }



}
