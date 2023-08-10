public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha ( int pDay, int pMonth, int pYear) {

        day = pDay;
        month = pMonth;
        year = pYear;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getMonthDifference (Fecha pFecha) {

        int difference = 0;

        int otherDay = pFecha.getDay();
        int otherMonth = pFecha.getMonth();
        int otherYear = pFecha.getYear();

        difference = 12 * (otherYear - year) + (otherMonth - month);

        if (otherDay < day) {

            difference--;
        }
        return difference;
    }

    public String toString (){
        return day + "/" + month + "/" + year;
    }
}
