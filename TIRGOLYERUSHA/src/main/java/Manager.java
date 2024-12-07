public class Manager extends  Employee{
    int ThisMonthSalary;

    public Manager(){}
    public Manager(String id, String FName, String LName, String address, BirthDate bd,
                   String EmployeeId, String DIDDY, BirthDate sw, int tms){
        super(id, FName, LName,  address, bd, EmployeeId, DIDDY, sw);
        this.ThisMonthSalary = tms;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + ThisMonthSalary;
    }

    @Override
    public int salary() {
        return this.ThisMonthSalary;
    }
}
