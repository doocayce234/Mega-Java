public class Calc {
    private double num1;
    private double num2;
    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }
    public Calc(double a, double b)
    {
        num1 = a;
        num2 = b;
    }
    public double add()
    {
        return num1 + num2;
    }
    public double subtract()
    {
        return num1 - num2;
    }
    public double multi()
    {
        return num1 * num2;
    }
    public double div()
    {
        return num1 / num2;
    }
    public double power()
    {
        return Math.pow(num1, num2);
    }
    public double abDiff()
    {
        return Math.abs(num1 - num2);
    }
    public double suRooOfSum()
    {
        return Math.sqrt(num1 + num2);
    }
    public double ranBetNum()
    {
        return (int) (Math.random() * (num2 - num1 + 1)) + num1;
    }
}