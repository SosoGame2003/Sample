package Concat;

// StringBufferによる文字列の連結
public class ConcatSample3
{
    public static void main(String[] args)
    {
        String firstName = "苗字";
        String lastName  = "名前";
        StringBuffer sb  = new StringBuffer();

        sb.append(firstName);
        sb.append(lastName);
        String Name = sb.toString();    // 連結

        System.out.println("StringBufferによる文字列の連結=>" + Name);
    }
}