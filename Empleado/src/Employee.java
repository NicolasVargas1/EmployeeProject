import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {

    private String name;
    private String secondName;
    private String gender;
    private Fecha birthdate;
    private String photo;
    private Fecha dateOfAdmission;
    private double baseSalary;

    // Constructor.
    public Employee() {

        name = "Nicolas";
        secondName = "Vargas";
        gender = "Male";
        birthdate = new Fecha(1997, 1, 20);
        photo = "photo.png";
        dateOfAdmission = new Fecha(2023, 5, 15);
        baseSalary = 3500000;

    }

     public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate.toString();
    }

    public String getPhoto() {
        return photo;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission.toString();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int ageCalculator() {

        Fecha today = getCurrentDate();

        int age = birthdate.getMonthDifference(today)/12;

        return age;
    }

    public int antiquityCalculate() {

        Fecha today = getCurrentDate();

        int antiquity = dateOfAdmission.getMonthDifference(today)/12;

        return antiquity;
    }

    public double benefitsCalculate () {

        int antiquity =  antiquityCalculate();

        double benefits = ((double)(antiquity * baseSalary) );

        return benefits;
    }

    public void employeeChange(String pName, String pSecondName, String pGender, Fecha pBirthdate,
                               Fecha pDateOfAdmission, int pSalary, String pPhoto) {

        name = pName;
        secondName = pSecondName;
        gender = pGender;
        birthdate = pBirthdate;
        photo = pPhoto;
        dateOfAdmission = pDateOfAdmission;
        baseSalary = pSalary;
    }
    public Fecha getCurrentDate() {

        GregorianCalendar gc = new GregorianCalendar();

        int day = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH) + 1;
        int year = gc.get(Calendar.YEAR);

        return new Fecha(day, month, year);

    }

    public String method1() {

        return "Answer 1";
    }

    public String method2() {

        return "Answer 2";
    }

}
