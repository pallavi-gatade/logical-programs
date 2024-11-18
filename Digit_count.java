package LogicalPrograms;

public class Digit_count {
    public static int how_many_digit(int num)
    {
        int count=0;
        int rem=0, rev=0;
        int original_num=num;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            System.out.println(rem);
            rev=rev*10+rem;
            System.out.println(rev);
            count++;
        }
        return count;
    }
    public static int Mult_factor(int count) {
        int fact = 1;
        while (count != 0) {
            fact = fact * 10;
            count--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=56789;
        how_many_digit(num);
        Mult_factor(4);
    }
}
