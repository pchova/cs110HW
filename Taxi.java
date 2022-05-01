package hwAssignments;

/** Polina Chetnikova CS110 Assignment #8
 *  A hwAssignments.Taxi “is-a” hwAssignments.Automobile.
 */
public class Taxi extends Automobile {
    //instance class variables
    private Person driver;
    private String id;

    /** hwAssignments.Taxi() constructor accepts hwAssignments.Person owner object, String for make and model,
     *  int for year and mileage and numPassengers, and boolean isSUV from superclass
     *  also accepts person object for a driver and a String for id
     *  @param owner
     *  @param make
     *  @param model
     *  @param year
     *  @param mileage
     *  @param numPassengers
     *  @param isSUV
     *  @param driver second hwAssignments.Person object for the driver of the hwAssignments.Taxi
     *  @param id String containing the id for the taxi driver
     */
    public Taxi(Person owner, String make, String model, int year, int mileage,
                int numPassengers, boolean isSUV, Person driver, String id){
        //call the super class constructor (hwAssignments.Automobile)
        super(owner, make, model, year, mileage, numPassengers, isSUV);

        this.driver = driver;
        this.id = id;
    }

    /** getDriver() makes a deep copy for the hwAssignments.Person driver object
     * @return deep copy for driver object
     */
    public Person getDriver(){
        return new Person(driver.getName(), driver.getAddress(), driver.getPhone());
    }

    /** getID() returns a string containing the driver ID
     * @return string for ID
     */
    public String getID(){
        return id;
    }

    /** setDriver() accepts a hwAssignments.Person object parameter, sets d to driver
     * @param d represents a driver object
     */
    public void setDriver(Person d){
        driver = d;
    }

    /** setID() accepts a String parameter, sets i to id
     * @param i represents an id String
     */
    public void setID(String i){
        id = i;
    }

    /** The toString method should create a String in the format:
     *  Julia Connors, 145 Maple St, St Louis, MO, 314-769-3923
     *  Toyota Camry 2019 14500 miles 5 passengers SUV,
     *  Driver: Susan Smith, 87 Button Ct, Oakland, CA, 742-860-8009 ID#4E9874AG4
     *  @return String with information of the hwAssignments.Person,
     *   vehicle, automobile, and taxi info
     */
    @Override
    public String toString(){
      return String.format("%s,\nDriver: %s ID#%s", super.toString(), getDriver(), getID());
    }

    /** Equals() method - Two hwAssignments.Taxi objects are the same if their hwAssignments.Automobile part is the same, as well as the
     *  driver and ID
     * @return T or F whether two taxi objects are the same
     */
    @Override
    public boolean equals(Object other){
        Taxi t = (Taxi)other;
        if(t == null)
            return false;
        else
            return super.equals(t) && driver.equals(t.driver) &&
                    id.equals(t.id);
    }
}
