package SubString;

// 指定した文字より前の文字列を取り出す
public class SubstringSample5
{
    public static void main(String[] args)
    {
        // 検索文字より前の文字列を取り出す
        String name = "氏名：平山颯谷";

        int index = name.indexOf("：");
        System.out.println("取り出し文字列=>" + name.substring(0, index));

        name = "氏名=>平山颯谷";
        index = name.indexOf("=>");
        System.out.println("取り出し文字列=>" + name.substring(0, index));
    }
}