package CurrentTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

// 現在の時刻を表示
public class CurrentTimeSample1
{
    public static void main(String[] args)
    {
        // 現在の時刻を所得
        LocalTime currenTime = LocalTime.now();
        
        // 時刻のフォーマットを指定
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // 現在の時刻を表示
        String formattedTime = currenTime.format(timeFormatter);
        System.out.println("現在の時刻：" + formattedTime);
    }
}