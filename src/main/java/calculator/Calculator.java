package calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int d = calculator.add(10, 20); // 30 --> actual value 40
        System.out.println(d);
       String makerName = calculator.getMakerName();
        System.out.println(makerName);
    }
    public int add(int value1, int value2){
//        int a = value1; // a = value1
//        int b = value2;
        int c = value1 + value2; // 6
        //System.out.println(c);
        return c;
    }

    public void deduct(){
        int a = 2;
        int b = 4;
        int c = a - b; // -2

    }

    public void divide(){
        int a = 4;
        int b = 2;
        int c = a/b; // 2
    }

    public String getMakerName(){
        String makerName = "Casio";
        return makerName;
    }
}
