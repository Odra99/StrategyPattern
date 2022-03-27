package strategy.pattern;

import java.util.Scanner;

import strategy.pattern.Operations.Add;
import strategy.pattern.Operations.Divide;
import strategy.pattern.Operations.Operation;
import strategy.pattern.Operations.Substract;

public class Calculator {
    
    private Operation operation;

    public int calculate(int first, int second){
        return operation.calculate(first, second);
    }

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public void beginOperation(){
        System.out.println("Ingrese dos numeros");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Seleccione la operacion a realizar - por defecto (suma)");
        System.out.println("1. Sumar");
        System.out.println("2. Resta");
        System.out.println("3. Dividir");

        int operationType = scanner.nextInt();

        switch (operationType) {
            case 1:
                this.setOperation(new Add());
                break;
            case 2:
                this.setOperation(new Substract());
                break;
            case 3:
                this.setOperation(new Divide());
                break;
        
            default:
            this.setOperation(new Add());
                break;
        }

        System.out.println("Resultado");
        System.out.println(operation.calculate(a, b));
        scanner.close();
    }
}
