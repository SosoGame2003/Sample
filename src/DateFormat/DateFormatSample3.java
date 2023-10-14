package DateFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// 英語で日付を表示
public class DateFormatSample3
{
    public static void main(String[] args)
    {
        // 現在の日付を取得
        LocalDate currentDate = LocalDate.now();

        // 英語のフォーマットを指定
        DateTimeFormatter englishDateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        // 英語表記の日付を表示
        String englishDate = currentDate.format(englishDateFormatter);
        System.out.println("今日の日付を英語表記すると(曜日, 月日, 年)：" + englishDate);
    }
}