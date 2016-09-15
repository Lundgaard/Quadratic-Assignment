
//Anne Lundgaard
//20-09-16
public class Quadratic
{
    private double a;
    private double b;
    private double c;
    
    //Constructor
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Shows the equation
    public void show() {
        System.out.println(a + "x^2 + " + b + "x + " + c);
        System.out.println();
    }
    
    //Shows the compute to the equation
    public void compute(double x) {
        double compute; 
        compute = a * x * x + b * x + c;
        System.out.println("Compute(x) = " + compute);
    }
    
    //Solves the equation if a and b is not zero
    public void solve() {
        double d;
        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("There are no solutions \n");
        } else if (d == 0) {
            double x;
            x = (-b)/(2 * a);
            System.out.println("There is one solution:");
            System.out.println("x = " + x);
            System.out.println();
        } else if (d > 0) {
            double x1;
            double x2;
            x1 = (-b + Math.sqrt(d))/(2 * a);
            x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("There are two solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println();
        }
    }
    
    //Solves the equation if a is zero and b is not zero
    public void superSolve() {
        if (a == 0) {
            double x;
            x = -c/b;
            System.out.println("There is one solution:");
            System.out.println("x = " + x);
            System.out.println();
        } else {
            solve();
        }
    }
    
    //Solves the equation if a and b are zero
    public void robustSolve() {
        if(a==0 && b == 0) {
            System.out.println("There are no solutions:");
        } else {
            superSolve();
        }
    }
}
