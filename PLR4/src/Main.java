import java.util.*;

public class Main {
    public static void main(String[] args) {
        Abiturient Abiturient1 = new Abiturient();
        Abiturient Abiturient2 = new Abiturient();

        Abiturient1.setId(1);
        Abiturient1.setLastName("Smith");
        Abiturient1.setName("Adam");
        Abiturient1.setPatronymic("Harrison");
        Abiturient1.setAddress("Street №1");
        Abiturient1.setPhoneNumber(123451552);
        Abiturient1.setMarks(5);

        Abiturient2.setId(1);
        Abiturient2.setLastName("Potter");
        Abiturient2.setName("Garry");
        Abiturient2.setPatronymic("Levis");
        Abiturient2.setAddress("Street №2");
        Abiturient2.setPhoneNumber(223651552);
        Abiturient2.setMarks(4);

        Abiturient[] arr;
        arr = new Abiturient[2];
        arr[0] = Abiturient2;
        arr[1] = Abiturient1;


        Arrays.sort(arr, Comparator.comparing(Abiturient::getName));
        for (Abiturient abiturient : arr) {
            abiturient.display();
        }
    }
}