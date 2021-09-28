package J4_7;

public class Client {
    public static void main(String args[]){
        ImageReader reader;
        Image image;
        reader = new GifReader();
        //reader = new JpgReader();
        image = reader.read();
        image.picture();
    }
}

