package hwAssignments;

/** Polina Chetnikova Assignment #8
 * hwAssignments.Automobile.java. An hwAssignments.Automobile “is-a” hwAssignments.Vehicle.
 */
public class Automobile extends Vehicle {
    //private instance variables
    private int numPassengers;
    private boolean isSUV;

    /** hwAssignments.Automobile constructor accepts an hwAssignments.Person object, strings make and model,
     *  and two int for year and mileage - all to represent vehicle info
     *  @param owner
     *  @param make
     *  @param model
     *  @param year
     *  @param mileage
     *  @param numPassengers
     *  @param isSUV
     */
    public Automobile(Person owner, String make, String model, int year, int mileage,
                      int numPassengers, boolean isSUV) {
        super(owner, make, model, year, mileage);
        this.numPassengers = numPassengers;
        this.isSUV = isSUV;
    }

    /** getNumPassengers() returns the number of ppl in an automobile
     *  @return numPassengers
     */
    public int getNumPassengers(){
        return numPassengers;
    }

    /** getSUV() returns T or F if an automobile is an SUV
     *  @return T or F
     */
    public boolean getSUV(){
        return isSUV;
    }

    /** setNumPassengers() passes an int to set the # of ppl
     *  @param passengers # of people in an automobile
     */
    public void setNumPassengers(int passengers){
        numPassengers = passengers;
    }

    /** setSUV() passes a boolean to set if its an SUV or not
     *  @param suv can be set to True or False
     */
    public void setSUV(boolean suv){
        isSUV = suv;
    }

    /** toString() displays the automobile's information
     *  @return String containing the automobile's information and if
     *  it is a type of SUV or not.
     */
    @Override
    public String toString(){
        String suv = "SUV";
        if(getSUV() == false)
            return String.format("%s %d passengers", super.toString(), getNumPassengers());
        else
            return String.format("%s %d passengers %s", super.toString(), getNumPassengers(), suv);
    }

    /** equals() method - two hwAssignments.Automobile objects are equal if their hwAssignments.Vehicle parts
     *  are the same and if numPassengers and isSUV are the same
     *  @return T or F whether two automobile objects are the same.
     */
    @Override
    public boolean equals(Object other){
        Automobile am = (Automobile)other;
        if (am == null){
            return false;
        }else{
            return super.equals(am)
                    && numPassengers == am.numPassengers
                    && isSUV == am.isSUV;
        }
    }

}
