public class Abiturient {
    private int id = 0;
    private String lastName = "";
    private String Name = "";
    private String Patronymic = "";
    private String Address = "";
    private int phoneNumber = 0;
    private int Mark = 0;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMarks() {
        return Mark;
    }

    public void setMarks(int mark) {
        Mark = mark;
    }

    public void display() {
        System.out.println(
                "Name:" + Name + "\n" +
                "Last Name:" + lastName + "\n" +
                "Patronymic:" + Patronymic + "\n" +
                "Address:" + Address + "\n" +
                "phoneNumber:" + phoneNumber + "\n" +
                "Mark:" + Mark + "\n"
        );
        System.out.println();
    }
}
