public class HW1 {
    public static void main(String[] args) {
        int i = 10;
        boolean b = true;
        float f = 10.1f;
        double d = 10d;
        char ch = 'c';
        byte b1 = 127;

        String str = "Мое первое домашнее задание";

        System.out.println("Результат выполнения первой функции: " + fn1(10.5f,5.5f,3.8f,8f));
        System.out.println("Результат выполнения второго метода: " + fn2(5,6));
        fn3(-5);
        System.out.println("Результат выполнения четвертого метода: " + fn4(5));
        fn5("Максим");

        int year = 2024;
        if (IsLeapYear(year)){
            System.out.println("Год " + year + " высокосный");
        }else {
            System.out.println("Год " + year + " не высокосный");
        }
    }
    public static float fn1(float a, float b,float c,float d) {
        return a * (b + (c / d));
    }
    public static boolean fn2(int a, int b){
        return a+b >=10 & a+b <=20;
    }
    public static void fn3(int a){
        if (a>=0){
            System.out.println("Число: " + a + " положительное");
        } else {
            System.out.println("Число: " + a + " отрицательное");
        }
    }
    public static boolean fn4(int a){
        return a<0;
    }
    public static void fn5(String name){
        System.out.println("Привет, " + name + "!");
    }
    public static boolean IsLeapYear(int year){
        if (year%4==0){
            if (year%100==0){
                return year % 400 == 0;
            }else {
                return true;
            }
        } else {
            return false;
        }
    }

}
