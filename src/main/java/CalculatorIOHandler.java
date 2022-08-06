import MyExcepcions.CalculationResultException;

import java.util.Scanner;

import static java.lang.Float.NaN;

public class CalculatorIOHandler {
    private Calculator calculator;

    CalculatorIOHandler(Calculator calculator){
        this.calculator = calculator;
    }

    public void handleUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first digit: ");
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()){
                calculator.setX(scanner.nextInt());
                break;
            }
            else {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }

        System.out.println("Enter operand, following operation are allowed - *, /, +, - :");
        while (scanner.hasNext()) {
            calculator.setOperator(scanner.next().charAt(0));
            if(calculator.getOperand() == '-' || calculator.getOperand()  == '*' || calculator.getOperand()  == '/' || calculator.getOperand()  == '+'){
                break;
            }
            else {
                System.out.println("Please enter valid operator");
                scanner.next();
            }
        }

        System.out.println("Enter second digit: ");
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()){
                calculator.setY(scanner.nextInt());
                break;
            }
            else {
                System.out.println("Please enter an valid integer");
                scanner.next();
            }
        }
    }

    public void printResult(){
        float result = NaN;
        try {
            result = calculator.calculateResult();
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurred " + e);
        }
        catch (CalculationResultException e){
            System.out.println("Exception occurred " + e);
        }
        System.out.println(result);
    }
}
