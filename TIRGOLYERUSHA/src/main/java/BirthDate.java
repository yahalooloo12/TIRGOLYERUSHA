public class BirthDate {
    int year;
    int month;
    int day;

    public BirthDate(){}
    public BirthDate(int year, int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
