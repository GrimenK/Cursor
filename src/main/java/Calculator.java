import MyExcepcions.CalculationResultException;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class Calculator implements CalculationPerformer {

    private int x;
    private int y;
    private char operand;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public char getOperand(){
        return operand;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setOperator(char operand){
        this.operand = operand;
    }

    public float calculateResult(){
        float result;
        switch (operand) {
            case '+':
                result = (float) x+y;
                if(result > 100){
                    throw new CalculationResultException("Calculation result exceeds the limit of 100!!!");
                }
                else {
                return result;}
            case '-':
                result = (float) x-y;
                if(result > 100){
                    throw new CalculationResultException("Calculation result exceeds the limit of 100!!!");
                }
                else {
                    return result;}
            case '*':
                result = (float) x*y;
                if(result > 100){
                    throw new CalculationResultException("Calculation result exceeds the limit of 100!!!");
                }
                else {
                    return result;}
            case '/':
                if (y == 0){
                    throw new ArithmeticException("Division by zero!!");
                }
                    result = (float) x/y;
                    if(result > 100){
                        throw new CalculationResultException("Calculation result exceeds the limit of 100!!!");
                    }
                    else{
                return result;}


            default:
                return NaN;
        }

    }

}
