import java.util.Random;
import java.util.Scanner;

public class createPass {
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
                System.out.println(c);
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
        System.out.println(builder.toString());
    }
}
