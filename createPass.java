import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.Scanner;

public class createPass {
    private static copyClipboard copy;
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Şifre uzunluğu kaç char olsun?");
        int t = u.nextInt()+1;
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        int i;
        for (i=0;i<t;i++) {
            int a = random.nextInt(123);
            if (a > 64) {
                char c = (char) a;
                builder.append(c);
            } else {
                if (a>47 && a<58) {
                    char c = (char) a;
                    builder.append(c);
                } else {
                    i--;
                }
            }
        }
        copy.copyClip(builder.toString());
        System.out.println("Şifre: %sifre%. Başarıyla panoya kopyalandı.".replace("%sifre%",builder.toString()));
    }
}
