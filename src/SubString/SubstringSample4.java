package SubString;

// 指定した文字より後ろの文字列を取り出す
public class SubstringSample4
{
    public static void main(String[] args)
    {
        // 指定した文字より後ろの文字を取り出す
        String name = "氏名：平山颯谷";

        int index = name.indexOf("：");
        System.out.println("取り出す文字列=>" + name.substring(index+1));

        name = "氏名=>平山颯谷";
        index = name.indexOf("=>");
        index += "=>".length();
        System.out.println("取り出す文字列=>" + name.substring(index));
    }    
}
