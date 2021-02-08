package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public interface UIConfig {

    void showConfigDialog(JFrame frame);

    Object inverse();
    void updateInverse();
}
