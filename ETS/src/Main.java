import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String json = "[{\"status\":{\"code\":0,\"description\":\"OK\"},\"servicePackage\":{\"service\":\"REGULAR (REG)\",\"value\":15000},\"city\":{\"origin\":\"BANDUNG\",\"destination\":\"JAKARTA\"},\"weight\":2,\"quantity\":1,\"priceItem\":80000,\"productName\":\"Celana Jeans\"},{\"status\":{\"code\":0,\"description\":\"OK\"},\"servicePackage\":{\"service\":\"Reguler (REG)\",\"value\":26000},\"city\":{\"origin\":\"BANDUNG\",\"destination\":\"SURABAYA\"},\"weight\":2,\"quantity\":2,\"priceItem\":90000,\"productName\":\"Kemeja Lengan Panjang\"}]";

        Gson gson = new Gson();
        Delivery[] deliveries = gson.fromJson(json, Delivery[].class);

        // Membuat array metode pembayaran
        PaymentService[] payments = {
                new PaymentService.OVO(),
                new PaymentService.QRIS(),
                new PaymentService.Cash()
        };

        // Mengakses delivery pertama (index 0)
        Delivery delivery1 = deliveries[0];
        PaymentService payment1 = payments[0]; // OVO sebagai metode pembayaran pertama
        int total1 = delivery1.getPriceItem() + delivery1.getServicePackage().getValue();

        // Output untuk pengiriman pertama
        System.out.println("productName | quantity | weight | destination | servicePackage | serviceValue | Total | paymentMethod | paymentStatus");
        System.out.println(
                delivery1.getProductName() + " | " +
                        delivery1.getQuantity() + " | " +
                        delivery1.getWeight() + " | " +
                        delivery1.getCity().getDestination() + " | " +
                        delivery1.getServicePackage().getService() + " | " +
                        delivery1.getServicePackage().getValue() + " | " +
                        total1 + " | " +
                        payment1.getPaymentMethod() + " | " +
                        payment1.getPaymentStatus()
        );

        // Mengakses delivery kedua (index 1)
        Delivery delivery2 = deliveries[1];
        PaymentService payment2 = payments[1]; // QRIS sebagai metode pembayaran kedua
        int total2 = delivery2.getPriceItem() + delivery2.getServicePackage().getValue();

        // Output untuk pengiriman kedua
        System.out.println(
                delivery2.getProductName() + " | " +
                        delivery2.getQuantity() + " | " +
                        delivery2.getWeight() + " | " +
                        delivery2.getCity().getDestination() + " | " +
                        delivery2.getServicePackage().getService() + " | " +
                        delivery2.getServicePackage().getValue() + " | " +
                        total2 + " | " +
                        payment2.getPaymentMethod() + " | " +
                        payment2.getPaymentStatus()
        );
    }
}
