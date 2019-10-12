
public class Calculator {
    private static Calculator calc;
    //private constructor
    private Calculator(){}
    
    public static Calculator getInstance(){
        
        if(calc == null){
            calc = new Calculator();
        }
        
        return calc;
    }
    public int sum(int a, int b){
        return a + b;
    }
    
}
