package Practice;

import java.util.Scanner;

// 数字を入力したら倍数を表示させる
public class Practice01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        while(true)
        {
            System.out.println("1～9までの数字を入力してください");
            number = scanner.nextInt();
        
            if(number >= 1 && number <= 9)
            {
                break;
            }
            else
            {
                System.out.println("条件を見ろ");
            }
        }

        System.out.println(number + "の倍数を表示します：");
        for(int i = 1; i <= 10; i++)
        {
            int multiple = number * i;
            System.out.println(number + " × " + i + " = " + multiple);
        }

        scanner.close();
    }
}