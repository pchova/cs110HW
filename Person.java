package hwAssignments;

/** Polina Chetnikova CS110 Assignment 8
 *  The hwAssignments.Person class represents a hwAssignments.Person with a name,
 *  an address and a phone number.
 */
public class Person {
    private String name;
    private String address;
    private String phone;

    /** Constructor that access 3 string parameters for someone's
     *  name, their address, and phone number
     *  @param name
     *  @param address
     *  @param phone
     */
    public Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /** getName() returns the name of a person
     *  @return var representing the person's name
     */
    public String getName(){
        return name;
    }

    /** getAddress() returns a person's address
     *  @return a string of the person's address
     */
    public String getAddress(){
        return address;
    }

    /** getPhone() returns a hwAssignments.Person's phone number
     *  @return a string of a person's phone number
     */
    public String getPhone(){
        return phone;
    }

    /** setName() sets a person's name
     *  @param n name of a person object
     */
    public void setName(String n){
        name = n;
    }

    /** setAddress() sets the address of a person
     *  @param a
     */
    public void setAddress(String a){
        address = a;
    }

    /** setPhone() sets the person's phone number
     *  @param p
     */
    public void setPhone(String p){
        phone = p;
    }

    /** toString() method returns a str with all of a person's information
     *  @return str with name, address, and phone number
     */
    @Override
    public String toString(){
        String str = "";
        return str.format("%s, %s, %s", name, address, phone);
    }

    /** equals() method compares a hwAssignments.Person object to another hwAssignments.Person object
     *  @return boolean value T or F
     */
    @Override
    public boolean equals(Object other){
        Person otherPerson = (Person)other;
        if(otherPerson == null){
            return false;
        }else{
            return (name.equals(otherPerson.name) &&
                    address.equals(otherPerson.address) &&
                    phone.equals(otherPerson.phone));
        }
    }
}
