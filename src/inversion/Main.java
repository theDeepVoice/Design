package inversion;

public class Main {
    private AbstractTransformer transformer;
    private AbstractSource source;

    public static void main(String[] args) {
        // 调用source
        AbstractSource source = new DatabaseSource();
        source.source();

        source = new TextSource();
        source.source();

        // 调用transformer
        AbstractTransformer transformer = new XMLTransformer();
        transformer.transformer();

        transformer = new XLSTransformer();
        transformer.transformer();

    }
}
