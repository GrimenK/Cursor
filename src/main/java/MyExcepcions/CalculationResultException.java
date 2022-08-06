package MyExcepcions;

public class CalculationResultException extends RuntimeException {

    public CalculationResultException(String errorMessage){
        super(errorMessage);
    }
}
