package tr.net.terzioglu.pfsak;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class FileProcessor {

    public byte[] write(String fileName, byte[] data) throws IOException {
        FileUtils.writeByteArrayToFile(new File(fileName), data);
        return data;

    }

    public byte[] read(String fileName) throws IOException {
        return FileUtils.readFileToByteArray(new File(fileName));

    }

}
