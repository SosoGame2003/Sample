package Concat;

// 演算子による文字列の連結
public class ConcatSample1
{
    public static void main(String[] args)
    {
        String firstName = "ヒラヤマ";
        String lastName  = "ソウヤ";

        String name = firstName + lastName; // 連結
        
        System.out.println("+演算子による文字列の連結=>" + name);
    }
}