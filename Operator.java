class Operator {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        float num3 = 6;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 / num3);

        //forced casting
        float sum = (float) num1 + num2;
        float resultDivide = (float) num1 / (float) num2;
        System.out.println("This is " + sum + ".");
        System.out.println("This is " + resultDivide + ".");
    }
}