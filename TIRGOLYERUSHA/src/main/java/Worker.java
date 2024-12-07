public class Worker extends Employee{
    int StartingSalary;
    int Hoursworked;

    public Worker(){}
    public Worker(String id, String FName,String LName,String address, BirthDate bd,
                  String EmployeeId, String DIDDY, BirthDate sw ,int bs, int wh){
        super(id, FName, LName,  address, bd, EmployeeId, DIDDY, sw);
        this.StartingSalary = bs;
        this.Hoursworked = wh;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + StartingSalary + " - " + Hoursworked;
    }

    @Override
    public int salary() {
        return this.StartingSalary * this.Hoursworked;
    }
}
