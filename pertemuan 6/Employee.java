class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    // Konstruktor Employee
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    // Implementasi metode compare dari Sortable
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }

    // Metode untuk menaikkan gaji
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // Metode untuk mencetak informasi
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Metode untuk mengembalikan tahun perekrutan
    public int hireYear() {
        return hireyear;
    }
}
