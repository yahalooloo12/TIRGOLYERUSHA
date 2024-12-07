public class Person {
    String id;
    String FName;
    String LName;
    String address;
    BirthDate bd;

    public Person(){}
    public Person(String id, String FName,String LName, String address, BirthDate bd){
        this.id = id;
        this.FName = FName;
        this.LName = LName;
        this.address = address;
        this.bd = bd;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.FName + " - " + this.LName + " - " + this.address + " - " + this.bd;
    }

    public static void main(String[] args) {
        Person p2 = new Person("111", "Sagi", "sharabi", "ben-shemen", new BirthDate(1999, 5, 19));
        System.out.println(p2);
    }
}
