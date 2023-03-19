package this¹Ø¼ü×Ö;

public class FindArray {
    public static void main(String[] args) {
        String[] fstr = {"ff","gg","ee"};
        findf find = new findf();

        System.out.println("index = " + find.find("ee",fstr));
    }
}
class findf{
    public int find(String n,String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (n.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}
