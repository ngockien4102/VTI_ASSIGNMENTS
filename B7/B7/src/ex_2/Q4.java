package ex_2;

public class Q4 {

    static void getIndex(int index){
        int[] departments = {1,2,3};
        try {
            System.out.println(departments[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println( "Cannot find department.");
        }
    }
    public static void main(String[] args) {
        Q4.getIndex(4);
    }
}
