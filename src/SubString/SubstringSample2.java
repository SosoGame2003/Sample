package SubString;

// 文字列から部分文字列を取り出す
public class SubstringSample2
{
    public static void main(String[] args)
    {
        String number = "0123456789";

        System.out.println(String.format("取り出し前の文字列：%s", number));
        System.out.println("文字列の3文字目から7文字目を取り出す=>" + number.substring(2, 7));
        System.out.println("文字列の2文字目から2文字目を取り出す=>" + number.substring(1, 2));
        System.out.println("文字列の3文字目から3文字分を取り出す=>" + number.substring(2, 2+3));
    }
}