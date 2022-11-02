public class House {

    public int a = 50;
    protected String b = "Daxil";

    private double c = 15.5;

    public House(int d) {
        this.a = d;
    }

    public House() { 
    }

    public House(String b) {
        this.b = b;

    }

    public House(double c) {
        this.c = c;
    }

    public House(int a, double c) {
        this.a = a;
        this.c = c;
    }

    public House(double c, int a) {
    }

    public House(double c, String b) {
    }

    public House(String b, double c) {
    }

    public House(String b, int a) {
    }

    public House(int a, String b) {
    }

    public House(int a, double c, String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public House(int a, String b, double c) { //
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public House(double c, int a, String b) {
        this.a = a; //
        this.c = c;
        this.b = b;
    }

    public House(double c, String b, int a) { //
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public House(String b, int a, double c) {
    }

    public House(String b, double c, int a) {
    }

    public int getInteger() {
        return a;
    }

    public double getDouble() {
        return c;
    }

    public String getString() {
        return b;
    }
}
