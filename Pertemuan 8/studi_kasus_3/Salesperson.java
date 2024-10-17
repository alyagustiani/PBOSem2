package studi_kasus_3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName;  // Nama depan penjual
    private String lastName;   // Nama belakang penjual
    private int totalSales;    // Total penjualan penjual

    // Konstruktor: Mengatur objek penjual dengan nama dan total penjualan
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Mengembalikan representasi string dari penjual
    @Override
    public String toString() {
        return lastName + ", " + firstName + "\t" + totalSales;
    }

    // Membandingkan dua penjual berdasarkan total penjualan
    @Override
    public int compareTo(Salesperson other) {
        // Membandingkan berdasarkan total penjualan terlebih dahulu
        if (this.totalSales != other.totalSales) {
            return Integer.compare(this.totalSales, other.totalSales);  // Mengembalikan -1, 0, atau 1
        } else {
            // Jika total penjualan sama, urutkan berdasarkan nama belakang
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;  // Urutkan berdasarkan nama belakang jika tidak sama
            } else {
                // Jika nama belakang sama, urutkan berdasarkan nama depan
                return this.firstName.compareTo(other.firstName);
            }
        }
    }

    // Mengembalikan true jika dua penjual memiliki nama yang sama
    @Override
    public boolean equals(Object other) {
        if (other instanceof Salesperson) {
            Salesperson otherSalesperson = (Salesperson) other;
            return this.lastName.equals(otherSalesperson.getLastName()) &&
                    this.firstName.equals(otherSalesperson.getFirstName());
        }
        return false;
    }

    // Mengembalikan nama depan penjual
    public String getFirstName() {
        return firstName;
    }

    // Mengembalikan nama belakang penjual
    public String getLastName() {
        return lastName;
    }

    // Mengembalikan total penjualan penjual
    public int getSales() {
        return totalSales;
    }
}


