public class Main {
    public static void main(String args[]) {
        File newfile1 = new File(1300, "C://desktop/", "text");
        System.out.println(newfile1.toString());
        newfile1.showFormat();
        newfile1.setCapacity(1500);
        newfile1.showSize();
    }
}
