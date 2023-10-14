package SubString;

// 文字列後ろからの部分文字列取り出し
public class SubstringSample3
{
    public static void main(String[] args)
    {
        String number = "0123456789";

        System.out.println(String.format("取り出し前の文字列：%s", number));
        System.out.println("文字列の6文字目から最後までを取り出す=>" + number.substring(6-1));
        System.out.println("文字列の後ろ3文字分を取り出す=>" + number.substring(number.length()-3));
    }
}