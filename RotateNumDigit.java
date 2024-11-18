package LogicalPrograms;

public class RotateNumDigit {
    public static void main(String[] args) {
        int num = 56478;
        int rotate_by= 1;
        int digit=0,rot=0;
        int mul=1;
        int count=0;

        int cal=Digit_count.how_many_digit(num);
            while(count<rotate_by) {
                digit = num % 10;
                rot = digit * mul + rot;
                mul = mul * 10;
//                System.out.println(rot);
                count++;
                num = num / 10;
            }
            cal=(cal-rotate_by);
        System.out.println();

        System.out.println(rot * Digit_count.Mult_factor(cal)+num);
    }
}
