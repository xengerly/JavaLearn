public class FileInformation {
    String inputFile;
    String absolutPath;
    long size;


    FileInformation(String inputFile, String inputAbsolutPath, long inputSize) {
        this.inputFile = inputFile;
        this.absolutPath = inputAbsolutPath;
        this.size = inputSize;
        System.out.println(this.inputFile);
        System.out.println(this.absolutPath);
        System.out.println(this.size);
    }
}
