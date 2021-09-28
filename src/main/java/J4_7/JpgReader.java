package J4_7;

public class JpgReader implements ImageReader{
    public Image read() {
        Image image = new Jpg();
        return image;
    }
}
