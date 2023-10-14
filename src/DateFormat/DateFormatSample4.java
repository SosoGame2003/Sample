package DateFormat;

import java.util.Calendar;
import java.util.Locale;

// 国別の曜日を表示
public class DateFormatSample4
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        
        System.out.println("日本語表記");
        System.out.println(String.format("曜日の表示（曜日の短縮名）：%1$ta",cal));
        System.out.println(String.format("曜日の表示（曜日の完全名）：%1$tA",cal));
        System.out.println();

        System.out.println("英語表記");
        Locale.setDefault(Locale.ENGLISH);
        System.out.println(String.format("曜日の表示（曜日の短縮名）：%1$ta",cal));
        System.out.println(String.format("曜日の表示（曜日の完全名）：%1$tA",cal));
        System.out.println();

        System.out.println("中国語表記");
        Locale.setDefault(Locale.CHINESE);
        System.out.println(String.format("曜日の表示（曜日の短縮名）：%1$ta",cal));
        System.out.println(String.format("曜日の表示（曜日の完全名）：%1$tA",cal));
    }
}