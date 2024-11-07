public class GenericTypeOld {
    private Object t;
    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }
    public static void main(String args[]){
        GenericTypeOld type = new GenericTypeOld();
        type.set("Java");
        String str = (String) type.get();
//type casting, error prone and can cause ClassCastException
    }
}
