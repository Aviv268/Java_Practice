package practice;

public class Digits {

    public static int firstDigit(int x) {
        while (x > 9) {
            x /= 10;
        }
        return x;
    }

    public static void main(String[] args) {
        int number = 100;
        number = number % 100;
        System.out.println(number);
        int num1 = firstDigit(number);
        System.out.println(num1);
        int num2 = number % 10;
        System.out.println(num2);

        for(int i = 100 ; i < 1000; i++){

            number = number % 100;
             num1 = firstDigit(number);
             num2 = number % 10;
            if(number==0){
                System.out.println(i);
                number+=10;
            } else if (num1 == num2){
                System.out.println(i);
            }
            number++;
        }
    }


}
