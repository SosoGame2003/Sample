package DateFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;

// 西暦日付を表示
public class DateFormatSample1
{
    public static void main(String[] args)
    {
        // 現在の西暦日付を取得
        LocalDate currentDate = LocalDate.now();

        // 西暦のフォーマットを指定
        DateTimeFormatter westernDateFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        // 西暦を表示
        String westernDate = currentDate.format(westernDateFormatter);
        System.out.println("西暦：" + westernDate);
    }
}