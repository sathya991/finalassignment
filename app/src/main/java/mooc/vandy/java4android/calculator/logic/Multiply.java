package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements Logic.Read {
    public int val1;
    public int val2;
    public void getvalues(int value1,int value2) {
        this.val1 = value1;
        this.val2 = value2;
    }
    public int mulnum(){
        return(val1*val2);
    }
    // TODO -- start your code here
}
