package studi_kasus_1;

public class Commission extends Hourly {
    private double totalSales;    // Variabel total penjualan
    private double commissionRate;  // Variabel tingkat komisi

    // Konstruktor menerima 6 parameter, 5 pertama diteruskan ke konstruktor Hourly, yang ke-6 digunakan untuk tingkat komisi
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);  // Memanggil konstruktor dari kelas induk (Hourly)
        this.commissionRate = commissionRate;  // Set tingkat komisi
        totalSales = 0;  // Inisialisasi total penjualan ke 0
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;  // Tambahkan penjualan yang baru ke total penjualan
    }

    // Override the pay method
    @Override
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);  // Hitung gaji + komisi
        totalSales = 0;  // Reset total penjualan setelah gaji dibayarkan
        return payment;
    }

    // Override the toString method
    @Override
    public String toString() {
        String result = super.toString();  // Panggil toString() dari kelas induk
        result += "\nTotal Sales: " + totalSales;  // Tambahkan informasi total penjualan
        return result;
    }
}

