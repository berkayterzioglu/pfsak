package tr.net.terzioglu.pfsak;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tr.net.terzioglu.pfsak.module.RegExConfig;

public class RegEx {

    public byte[] pattern(byte[] data, RegExConfig config) throws Exception {

        String aStr = new String(data, "UTF-8");
        Pattern pat = Pattern.compile(config.getSearch());
        Matcher matcher = pat.matcher(aStr);
        aStr = matcher.replaceAll(config.getReplaceWord());


        return aStr.getBytes("UTF-8");
    }
}
