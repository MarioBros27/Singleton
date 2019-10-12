

public class View {
    int a = 10;
    int b = 20;
    
    int calcSum(){
        Calculator calc2 = Calculator.getInstance();
        return calc2.sum(a, b);
    }
    public static void main(String[] args) {
        //Calculator calc = new Calculator();
        
        Calculator calc = Calculator.getInstance();
        View v = new View();
        System.out.println("answer: "+ v.calcSum());
        
    }
    
}
