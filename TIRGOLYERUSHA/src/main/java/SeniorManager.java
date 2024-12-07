public class SeniorManager extends Manager{
    int bonus;

    public SeniorManager(){}
    public SeniorManager(String id, String FName, String LName, String address, BirthDate bd,
                         String EmployeeId, String DIDDY, BirthDate sw, int tms, int bonus){
        super(id, FName, LName,  address, bd, EmployeeId, DIDDY, sw, tms);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + bonus;
    }

    @Override
    public int salary() {
        return this.ThisMonthSalary + this.bonus;
    }
}

