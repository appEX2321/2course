public class File extends Directory {
    private String format;
    File(int capacity, String directoryPath, String format) {
        super(capacity, directoryPath);
        this.format=format;
    }
    private String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    @Override
    public void showSize() {
        System.out.println(getCapacity());
    }
    @Override
    public void showFormat() {
        System.out.println(getFormat());
    }

    @Override
    public String toString() {
        return "File{" +
                "format='" + format + '\'' +
                ", capacity=" + getCapacity() +
                ", directoryPath='" + getDirectoryPath() + '\'' +
                '}';
    }
}
