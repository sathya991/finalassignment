package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Logic.Read {
    private static int val1;
    private static int val2;
    public void getvalues(int value1,int value2) {
         this.val1 = value1;
         this.val2 = value2;
    }
    public int addnum(){
        return(val1+val2);
    }
    // TODO -- start your code here
}
