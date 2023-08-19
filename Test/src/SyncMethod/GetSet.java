package SyncMethod;

public class GetSet {
    private int a;
    protected int b;
    public String string;

    @Override
    public String toString() {
        return "GetSet{" +
                "a=" + a +
                ", b=" + b +
                ", string='" + string + '\'' +
                '}';
    }

    public GetSet(int a, int b, String string) {
        this.a = a;
        this.b = b;
        this.string = string;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
