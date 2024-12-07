public class Employee extends  Person {
    String EmployeeId;
    String deSHIFT;
    BirthDate clockedin;

    public Employee(){}
    public Employee(String id, String FName,String LName,String address, BirthDate bd,
                    String EmployeeId, String DIDDY, BirthDate sw){
        super(id, FName,LName, address, bd);
        this.EmployeeId = EmployeeId;
        this.deSHIFT = DIDDY;
        this.clockedin = sw;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + EmployeeId + " - " + deSHIFT + " - " + this.clockedin;
    }

    public int salary(){
        return 0;
    }
}
