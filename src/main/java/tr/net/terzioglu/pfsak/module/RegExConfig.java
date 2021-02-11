package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class RegExConfig implements UIConfig {

    private RegExConfig inverse = null;

    private String search = null;
    private String replaceWord = null;

    @Override
    public void showConfigDialog(JFrame frame) {
        RegExConfigDialog recd = new RegExConfigDialog(null, true);

        recd.setRegExConfıg(this);
        recd.setLocationRelativeTo(frame);
        recd.setVisible(true);
    }

    @Override
    public Object inverse() {
        if (inverse == null) {
            inverse = new RegExConfig();

            inverse.search = search;
            inverse.replaceWord = replaceWord;
        }
        return inverse;
    }

    @Override
    public void updateInverse() {
        inverse.search = search;
        inverse.replaceWord = replaceWord;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getReplaceWord() {
        return replaceWord;
    }

    public void setReplaceWord(String replaceWord) {
        this.replaceWord = replaceWord;
    }

    @Override
    public String toString() {
        return "RegExConfig{" + "search=" + search + ", replaceWord=" + replaceWord + '}';
    }

}
