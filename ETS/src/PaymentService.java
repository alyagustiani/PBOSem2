public abstract class PaymentService {
    public abstract String getPaymentStatus();
    public abstract String getPaymentMethod();

    public static class OVO extends PaymentService {
        @Override
        public String getPaymentStatus() {
            return "Paid via OVO";
        }

        @Override
        public String getPaymentMethod() {
            return "OVO";
        }
    }

    public static class QRIS extends PaymentService {
        @Override
        public String getPaymentStatus() {
            return "Paid via QRIS";
        }

        @Override
        public String getPaymentMethod() {
            return "QRIS";
        }
    }

    public static class Cash extends PaymentService {
        @Override
        public String getPaymentStatus() {
            return "Paid via Cash";
        }

        @Override
        public String getPaymentMethod() {
            return "Cash";
        }
    }
}
