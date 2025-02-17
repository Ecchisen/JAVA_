public class MathOperations{
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args){
        MathOperations math = new MathOperations();
        System.out.println(math.add(1, 2));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add(1.7, 2.3));
    }
}