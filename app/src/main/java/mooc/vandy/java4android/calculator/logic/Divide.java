package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Logic.Read {
    public int val1;
    public int val2;
    public void getvalues(int value1,int value2) {
        this.val1 = value1;
        this.val2 = value2;
    }
    public String divnum(){
        if(val2 == 0){
            return("Value Two cannot be zero");
        }
        return(val1/val2+"R:"+val1%val2);
    }
    // TODO -- start your code here
}
