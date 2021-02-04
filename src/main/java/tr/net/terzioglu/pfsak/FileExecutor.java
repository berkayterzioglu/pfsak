package tr.net.terzioglu.pfsak;

import tr.net.terzioglu.pfsak.module.FileConfig;

public class FileExecutor {

    public byte[] execute(FileConfig config, byte[] data) throws Exception {

        FileProcessor fp = new FileProcessor();

        switch (config.getFileType()) {

            case READ:
                return fp.read(config.getFileName());

            case WRITE:
                return fp.write(config.getFileName(), data);
        }

        return null;

    }

}
