public abstract class Directory implements Disk{
    private int capacity;
    private String directoryPath;
    Directory(int capacity, String directoryPath){
        this.capacity=capacity;
        this.directoryPath=directoryPath;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getDirectoryPath() {
        return directoryPath;
    }
    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }
}
