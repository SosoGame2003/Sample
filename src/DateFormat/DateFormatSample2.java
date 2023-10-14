package DateFormat;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// 日付の文字列フォーマット(和暦年)
public class DateFormatSample2
{
    public static void main(String[] args)
    {
        // 現在の日付を取得
        LocalDate currentDate = LocalDate.now();

        // 和暦に変換
        JapaneseDate japaneseDate = JapaneseDate.from(currentDate);

        // 和暦のフォーマットを指定
        DateTimeFormatter japaneseEraFormatter = DateTimeFormatter.ofPattern("GGGGy年MM月dd日", Locale.JAPAN);

        // 和暦を表示
        String japaneseEraDate = japaneseDate.format(japaneseEraFormatter);
        System.out.println("和暦：" + japaneseEraDate);
    }
}