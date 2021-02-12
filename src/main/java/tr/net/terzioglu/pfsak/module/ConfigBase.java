package tr.net.terzioglu.pfsak.module;

public abstract class ConfigBase {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

    public abstract ConfigBase getInverse();

}
