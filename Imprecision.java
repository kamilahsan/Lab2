
/**
 * Ch2 LabP1
 *
 * @author Kamil Ahsan, kahsan@student.sdccd.edu
 * @since 2/9/2026
 * @version V1.0
 */
public class Imprecision    {
    public static void main(String[] args) {
        double x,y,z;
        
        x= 12345.6789E200;
        y= 1 / x;
        z = x * y;
        
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z (x*y) is: " + z);
        System.out.println("1 - z is: " + (1 - z));
    
    }
}