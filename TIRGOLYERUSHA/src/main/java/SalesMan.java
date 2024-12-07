public class SalesMan extends  Employee{
    private int AllSales;
    private final static double AllSales_Rate = 0.15;

    public SalesMan(){}
    public SalesMan(String id, String FName,String LName,String address, BirthDate bd,
                    String EmployeeId, String DIDDY, BirthDate sw, int ts){
        super(id, FName,LName, address, bd, EmployeeId, DIDDY, sw);
        this.AllSales = ts;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + AllSales;
    }

    @Override
    public int salary() {
        return (int)(this.AllSales * SalesMan.AllSales_Rate);
    }
}
