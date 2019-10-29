// Q) Use of fully qualified name
class addition
{
    public static void main(String args[])
    {
        calculator.basic.add adder = new calculator.basic.add();
        calculator.logarithmic.sine sin = new calculator.logarithmic.sine();
        System.out.println(adder.sum(23,46));
        System.out.println(sin.sineVal(90));
    }
}