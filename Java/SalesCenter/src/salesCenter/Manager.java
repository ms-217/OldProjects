package salesCenter;
/**
 * Manager Class.
 */
class Manager extends Employee {
    double yearlySalary;
    
    /**
     * constructor.
     * pre: none
     * post: A manager is created.
     */
    public Manager(String fName, String lName, double sal) {
        super(fName, lName);
        yearlySalary = sal;
    }
    
    /**
     * Returns the manager salary.
     * pre: none
     * post: The manager salary has been returned.
     */
    public double getSalary() {
        return(yearlySalary);
    }
    
    /**
     * Returns the manager pay for a specific period.
     * pre: none
     * post: The manager pay for the specified period
     * has been returned.
     */
    public double pay(double weeks) {
        double payEarned;
        
        payEarned = (yearlySalary / 52) * weeks;
        return(payEarned);
    }
}