public class ServicePackage {
    private String service;
    private int value;

    // constructors, getters, and setters
    public ServicePackage(String service, int value){
        this.service = service;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public void setValue(int value) {
        this.value = value;
    }
}


