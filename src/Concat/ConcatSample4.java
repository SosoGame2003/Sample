package Concat;

// StringBuildersによる文字列の連結
public class ConcatSample4
{
    public static void main(String[] args)
    {
        String firstName = "ヒラヤマ";
        String lastName  = "ソウヤ";
        StringBuilder sb = new StringBuilder();

        sb.append(firstName);
        sb.append(lastName);
        String name = sb.toString();
        
        System.out.println("StringBuilderによる文字列の連結=>" + name);
    }
}