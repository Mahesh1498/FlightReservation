public class Passenger{
    private static int idCounts = 0;
    private int id;

    private static class Address{
        String street;
        String city;
        String state;

        Address(String street,String city,String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;
    private static class Contact{
        String name;
        String phone;
        String email;

        Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }
    private Contact contact;

    public Passenger(String street,String city,String state,String name,String phone,String email){
        this.id=++idCounts;
        this.address=new Address(street,city,state);
        this.contact=new Contact(name,phone,email);
    }
    public int getid(){
        return this.id;
    }
    public String getAddressDetail(){
        return "Street :" + address.street + " City:" + address.city + " State:" + address.state ;
    }
    public String getContactDetail(){
        return "Name:" + contact.name + " Phone:" + contact.phone + " email:" + contact.email;
    }
    public static int getIdCounts(){
        return idCounts;
    }
}