package strategy.pattern.Operations;

public class Add implements Operation{
    
    @Override
    public int calculate(int first,int second){
        return first + second;
    }
}
