import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class copyClipboard {
    static void copyClip(String pass) {
        Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(new StringSelection(pass),null);
    }
}
