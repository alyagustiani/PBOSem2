import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    private String secretaryName;

    // Konstruktor Manager
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    // Override metode raiseSalary
    @Override
    public void raiseSalary(double byPercent) {
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    // Getter untuk secretaryName
    public String getSecretaryName() {
        return secretaryName;
    }

    // Implementasi compare agar Manager bisa diurutkan
    @Override
    public int compare(Sortable b) {
        return super.compare(b);
    }
}
