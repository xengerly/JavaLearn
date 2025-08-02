public class FileInformation {
    String fileName;
    String absolutPath;
    long size;


    FileInformation (String inputFileName,String inputAbsolutPath,long inputSize){
        this.fileName = inputFileName;
        this.absolutPath = inputAbsolutPath;
        this.size = inputSize;
    }

}
