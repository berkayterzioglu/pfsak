package tr.net.terzioglu.pfsak.module;

import javax.swing.JFrame;

public class RegExConfig extends ConfigBase implements UIConfig, Cloneable {

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        RegExConfig clone = new RegExConfig();
        clone.replaceWord = replaceWord;
        clone.search = search;
        clone.inverse = inverse != null ? (RegExConfig) inverse.clone() : null;

        return clone;
    }

    public RegExConfig getInverse() {
        return inverse;
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
