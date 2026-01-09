public class Dz36 {
    public static void main(String[] args) {
        FileInformation information1 = new FileInformation("photo.png","Steam",'1');
        FileInformation information2 = new FileInformation("photo.png","Steam",'1');
        System.out.println(information1.equals(information2));



    }
}
