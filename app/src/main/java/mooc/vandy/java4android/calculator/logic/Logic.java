package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    interface Read{
        public void getvalues(int value1,int value2);
    }
    private static int ADDITION = 1;
    private static int SUBTRACTION = 2;
    private static int MULTIPLICATION = 3;
    private static int DIVISION = 4;
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        if(operation == ADDITION) {
            Add addition = new Add();
               addition.getvalues(argumentOne,argumentTwo);
               mOut.print(String.valueOf(addition.addnum()));
        }
        else if(operation == SUBTRACTION){
            Subtract subtraction = new Subtract();
            subtraction.getvalues(argumentOne,argumentTwo);
            mOut.print(String.valueOf(subtraction.subnum()));
        }
        else if(operation == MULTIPLICATION){
            Multiply multiplication = new Multiply();
            multiplication.getvalues(argumentOne,argumentTwo);
            mOut.print(String.valueOf(multiplication.mulnum()));
        }
        else if(operation == DIVISION){
            Divide divide = new Divide();
            divide.getvalues(argumentOne,argumentTwo);
            mOut.print(divide.divnum());
        }
        else{
            throw new IllegalStateException("Unexpected value: " + operation);
        }
    }

}
