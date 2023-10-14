package SubString;

// 文字列の先頭からの部分文字列取り出し
public class SubstringSample1
{
    public static void main(String[] args)
    {
        String number = "0123456789";

        System.out.println(String.format("取り出し前の文字列", number));
        System.out.println("文字列の先頭から3文字取り出す=>" + number.substring(0, 3));
        System.out.println("文字列の先頭から7文字取り出す=>" + number.substring(0, 7));
    }
}