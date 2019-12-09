package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Logic.Read {
    public int val1;
    public int val2;
    public void getvalues(int value1,int value2) {
        this.val1 = value1;
        this.val2 = value2;
    }
    public int subnum(){
        return(val1-val2);
    }
    // TODO -- start your code here
}
