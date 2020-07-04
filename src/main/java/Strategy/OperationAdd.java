package Strategy;

/**
 * @author dengcaochao
 */
public class OperationAdd implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}