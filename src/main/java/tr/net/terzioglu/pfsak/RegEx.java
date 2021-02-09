package tr.net.terzioglu.pfsak;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public byte[] pattern(byte[] data, String search) throws Exception {

        String aStr = new String(data, "UTF-8");
        Pattern pat = Pattern.compile(search);
        Matcher matcher = pat.matcher(aStr);

        aStr.replaceAll(aStr, search);

        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        return aStr.getBytes();
    }
}
