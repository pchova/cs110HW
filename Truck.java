package hwAssignments;

/** Polina Chetnikova CS110 Assignment 8
 *  A hwAssignments.Truck “is-a” hwAssignments.Vehicle. It is specialized to also have a capacity
 *  (integer number of tons) and a number of axles
 */
public class Truck extends Vehicle {
    //instance variables
    private int capacity;
    private int numAxles;

    //class constants
    private final static int DEF_CAPACITY = 1;
    private final static int DEF_AXLES = 2;

    /** hwAssignments.Truck() constructor takes a hwAssignments.Person object, String for make and model,
     *  and int for the year, mileage, capacity, and numAxles
     *  @param owner hwAssignments.Person object representing name, phone, address
     *  @param make str make of car
     *  @param model str model of car
     *  @param year int year
     *  @param mileage int truck mileage
     *  @param capacity truck capacity load
     *  @param numAxles number of axles
     */
    public Truck(Person owner, String make, String model, int year, int mileage,
                 int capacity, int numAxles){
        super(owner, make, model, year, mileage);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    /** Alternate hwAssignments.Truck constructor takes a String for a name, address, and phone
     *  number. Then two more str for make and model. make, model, year, and
     *  mileage. Creates a person object and uses the super class constructor
     *  to initialize make, model, year and mileage in the same instance
     * @param name str for someones name (hwAssignments.Person class call)
     * @param address str for address (hwAssignments.Person object call)
     * @param phone str for phone (hwAssignments.Person object call)
     * @param make str for make (superclass call)
     * @param model str for model (superclass call)
     * @param year (initialized in truck.java)
     * @param mileage (initialized in truck.java)
     */
    public Truck(String name, String address, String phone, String make,
                 String model, int year, int mileage)
    {
        super(new Person(name, address, phone), make, model, year, mileage);
        this.capacity = DEF_CAPACITY;
        this.numAxles = DEF_AXLES;
    }

    /** getCapacity() returns the weight capacity of a truck
     *  @return truck capacity
     */
    public int getCapacity(){
        return capacity;
    }

    /** getNumAxles() returns the number of axles on a truck
     *  @return numAxles on a truck
     */
    public int getNumAxles(){
        return numAxles;
    }

    /** setCapacity() sets the capacity for a truck
     *  @param cap truck capacity
     */
    public void setCapacity(int cap){
        capacity = cap;
    }

    /** setNumAxles sets the number of axles on a truck
     *  @param na number of axles on a truck
     */
    public void setNumAxles(int na){
        numAxles = na;
    }

    /** toString() method calls the superclasses' toString method which also
     *  calls the hwAssignments.Person object toString() method and then adds the capacity
     *  and number of axles to the end of it
     *  @return String containing superclass and hwAssignments.Person toString() classes
     */
    @Override
    public String toString(){
        return String.format("%s %d ton %d axles",
                super.toString(), capacity, numAxles);
    }

    /** equals() method compares the hwAssignments.Truck object to another hwAssignments.Truck object
     *  Calls the superclass to compare all the instance variables in that class
     *  and then checks the two integers from this class
     *  @param other object from default java class
     *  @return boolean value T or False
     */
    @Override
    public boolean equals(Object other){
        Truck otherTruck = (Truck)other;
        return (super.equals(otherTruck) &&
                capacity == otherTruck.capacity &&
                numAxles == otherTruck.numAxles);
    }
}
