package Practice;

import javax.swing.JFrame;

// 空ウィンドウを表示させる
public class Practice02 extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JavaSwingのテスト");
        frame.setVisible(true);

        // ×(バツ)を押すとアプリケーションを終了させる
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ウィンドウの表示位置とサイズ
        frame.setBounds(0, 0, 900, 900);
    }
}