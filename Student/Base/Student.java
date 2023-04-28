package Student.Base;

public class Student implements StudentConstructor {

    private String firsName;
    private String secondName;
    private String address;
    private String scClase;

    public Student(String firsName, String secondName, String address, String scClase) {
        this.firsName = firsName;
        this.secondName = secondName;
        this.address = address;
        this.scClase = scClase;
    }

    @Override
    public String firsName() {
        return firsName;
    }

    @Override
    public String secondName() {
        return secondName;
    }

    @Override
    public String address() {
        return address;
    }

    public String getInfo() {
        return "\n*****************************"+
                "\nИнформация об ученике: " +
                "\nИмя: " + firsName +
                "\nФамилия: " + secondName +
                "\nАдрес проживания: " + address +
                "\nНомер класса: " + scClase +
                "\n*****************************";
    }

    @Override
    public String scClase() {
        return scClase;
    }
}
