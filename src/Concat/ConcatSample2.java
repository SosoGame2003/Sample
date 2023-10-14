package Concat;

// String.concatによる文字列の連結
public class ConcatSample2
{
    public static void main(String[] args)
    {
        String firstName = "苗字";
        String lastName  = "名前";

        String name = firstName.concat(lastName);   // 連結

        System.out.println("String.concatによる文字列の連結=>" + name);
    }
}