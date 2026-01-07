package ex_1;

public class Question_1{
    public static void main(String[] args) {
        int[] number = {-1, 1, 3, 5, -5, -8};
        int maxVal = getMaxVal(number);
        int minVal = getMin(number);

        System.out.println("max: "+maxVal + " min:"+minVal);
    }

    private static int getMaxVal(int[] number) {
        int maxVal = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > maxVal){
                maxVal = number[i];
            }
        }
        return maxVal;
    }

    private static int getMin(int[] number) {
        int minVal = number[0];
        for (int i = 1; i < number.length; ++i) {
            if (number[i] < minVal){
                minVal = number[i];
            }
        }
        return minVal;
    }
}
