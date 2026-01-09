public class FileInformation {
    private String inputFile;
    private String absolutPath;
    private long size;


    public FileInformation(String inputFile, String absolutPath, long size) {
        this.inputFile = inputFile;
        this.absolutPath = absolutPath;
        this.size = size;
    }

    public String toString() {
        return inputFile + " " + absolutPath + " " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  FileInformation){
            FileInformation information = (FileInformation) obj;
            boolean result = this.inputFile.equals(information.inputFile);
            return result;
        }else {
            return false;
        }
    }
}
