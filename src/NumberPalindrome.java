

    import java.util.Scanner;

    class NumberPalindrome {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number : ");
            int number= sc.nextInt();
            sc.nextLine();

            isPalindrome(number);
        }
        public static void isPalindrome(int number)
        {   boolean result;
            int reverse=0;
            int i=0;
            int r=0;

            reverse=number;
            do
            {
                i=number%10;

                r=(r*10)+i;
                number=number/10;
            }while(number!=0);

            if(r==reverse)
            {
                System.out.println("the number entered is Palindrome .");
            }
            else{
                System.out.println("the number entered is not Palindrome!");
            }



        }
    }

