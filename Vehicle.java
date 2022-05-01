package hwAssignments;

/** Polina Chetnikova CS110 Assignment 8
 *  A hwAssignments.Vehicle represents a generic hwAssignments.Vehicle that has an owner (a hwAssignments.Person),
 *  a make, model, year and mileage instance variables
 */
public class Vehicle {
    private Person owner;
    private String make;
    private String model;
    private int year;
    private int mileage;

    /** hwAssignments.Vehicle() constructor accepts an hwAssignments.Person object, strings make and model,
     *  and two int for year and mileage - all to represent vehicle info
     *  @param owner
     *  @param make
     *  @param model
     *  @param year
     *  @param mileage
     */
    public Vehicle(Person owner, String make, String model, int year, int mileage){
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    /** Alternate hwAssignments.Vehicle() constructor accepts hwAssignments.Person object owner, Strings make and
     *  model, and an int for year. Constructor initializes mileage to 0
     *  @param owner
     *  @param make
     *  @param model
     *  @param year
     */
    public Vehicle(Person owner, String make, String model, int year){
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        mileage = 0;
    }

    /** getOwner() returns the name of the car owner. Makes a deep copy
     *  by returning new hwAssignments.Person object that is a copy of the current hwAssignments.Vehicle.
     *  Since owner represents a hwAssignments.Person object, we can access its instance vars
     *  by owner.methodClass() (i.e. owner.getAddress())
     *  @return a copy of a hwAssignments.Person object
     */
    public Person getOwner(){
        return new Person(owner.getName(),
                owner.getAddress(), owner.getPhone());
    }

    /** getMake() method returns the make of a vehicle
     *  @return String with the make of vehicle
     */
    public String getMake(){
        return make;
    }

    /** getModel() returns the type of vehicle
     *  @return String with the model of vehicle
     */
    public String getModel(){
        return model;
    }

    /** getYear() returns the year the vehicle was made
     *  @return int with the year of vehicle
     */
    public int getYear(){
        return year;
    }

    /** getMileage() returns the mileage of a vehicle
     *  @return int holding the mileage
     */
    public int getMileage(){
        return mileage;
    }

    /** setOwner() sets the owner of hwAssignments.Person object
     *  @param o name of vehicle owner
     */
    public void setOwner(Person o){
        owner = o;
    }

    /** setMake() sets the make of the car
     *  @param m make of vehicle
     */
    public void setMake(String m){
        make = m;
    }

    /** setModel() sets the model of the vehicle
     *  @param mod model of the vehicle
     */
    public void setModel(String mod){
        model = mod;
    }

    /** setYear() sets the year of a vehicle
     *  @param y year the vehicle was made
     */
    public void setYear(int y){
        year = y;
    }

    /** toString() method returns a string containing all the
     *  information in a vehicle object and person object
     *  @return String holds the person toString() method and then
     *  adds on the make, model, year and mileage
     */
    @Override
    public String toString(){
        return String.format("%s\n%s %s %d %d miles", owner.toString(), make, model, year, mileage);
    }

    /** equals() method returns a boolean value to see if two hwAssignments.Vehicle
     *  objects are equal. equals() for Str and == for int
     *  @param other object from default java class
     *  @return boolean value T or F
     */
    @Override
    public boolean equals(Object other){
        Vehicle otherVehicle = (Vehicle)other;
        return (make.equals(otherVehicle.make) &&
                model.equals(otherVehicle.model) &&
                year == otherVehicle.year &&
                mileage == otherVehicle.mileage);
    }
}
