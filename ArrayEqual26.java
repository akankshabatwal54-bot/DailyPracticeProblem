public class ArrayEqual26{
    static boolean equalArray(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        boolean result = equalArray(a, b);
        System.out.println("Equal Array:" + result);

    }
}