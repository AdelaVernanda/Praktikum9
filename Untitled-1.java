import javax.swing.*;

class Ch14ShowMessageDialog {
    String input;
    public static void main(String[] args) {
        JFrame jFrame;

        jFrame = new JFrame();
        jFrame.setLocation(100, 250);
        jFrame.setSize(400,300);
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "Apa Kabar?");
        JOptionPane.showInputDialog(jFrame, "Masukkan Teks:");

        JOptionPane.showMessageDialog(jFrame, "Selamat Tinggal");
    }
}