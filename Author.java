package hwAssignments;

/** Polina Chetnikova CS110 Section C
 *  Class to represent an hwAssignments.Author object to hold info about an author
 */
public class Author {
    //instance variables
    private String firstName;
    private String lastName;
    private String email;

    /** hwAssignments.Author constructor that accepts three Strings as the first name,
     *  last name, and email  values
     *  @param firstName name of author
     *  @param lastName last name of author
     *  @param email email address of the author
     */
    public Author(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /** hwAssignments.Author copy constructor that accept three Strings from
     *  another hwAssignments.Author object as the first name, last name,
     *  and email address values
     *  @param other other hwAssignments.Author object
     */
    public Author(Author other){
        setFirstName(other.firstName);
        setLastName(other.lastName);
        setEmail(other.email);
    }

    /** getFirstName returns the string value set to firstName
     *  @return firstName name value
     */
    public String getFirstName() {
        return firstName;
    }

    /** getLastName returns the string value set to lastName
     *  @return lastName last name value
     */
    public String getLastName(){
        return lastName;
    }

    /** getEmail returns the string value set to email
     *  @return email an email address value
     */
    public String getEmail(){
        return email;
    }

    /** setFirstName takes in parameter and sets it to the
     *  firstName instance variable
     *  @param n first name value
     */
    public void setFirstName(String n){
        firstName = n;
    }

    /** setLastName takes in parameter and sets it to the
     *  lastName instance variable
     *  @param ln last name value
     */
    public void setLastName(String ln){
        lastName = ln;
    }

    /** setEmail takes in parameter and sets it in to the
     *  email instance variable
     *  @param e email value
     */
    public void setEmail(String e){
        email = e;
    }

    /** toString method with the full hwAssignments.Author info
     *  @Override - defaults the toString method that is called
     * @return a str
     */
    public String toString(){
        return String.format("%s %s <%s>", firstName, lastName, email);
    }

    /** equals method compares two hwAssignments.Author objects to see if they are equal
     *  @Override
     *  @return T or F
     */
    public boolean equals(Object other){
        Author auth = (Author)other;
        //compare values from this class with another object
        return this.firstName.equals(auth.firstName)
                && this.lastName.equals(auth.lastName);
    }
}
