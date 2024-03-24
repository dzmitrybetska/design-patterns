package by.academy.project.test;

public class CodecFactory {

    public static Codec createCodec(VideoFile file) {
        String format = file.getCodecType();
        return extract(format);
    }

    public static Codec createCodec(String format) {
        return extract(format);
    }

    private static Codec extract(String format) {
        switch (format) {
            case "mp4" -> {
                System.out.println("CodecFactory: extracting mpeg audio...");
                return new MPEG4CompressionCodec();
            }
            case "ogg" -> {
                System.out.println("CodecFactory: extracting ogg audio...");
                return new OggCompressionCodec();
            }
            default -> {
                System.out.println("There is no codec file for this format");
                throw new RuntimeException("There is no codec file for this format");
            }
        }
    }
}
