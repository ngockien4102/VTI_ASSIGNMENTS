package src.Wildcard;

public class Q4 {
    public static void main(String[] args) {
//        System.out.println(myMath.sum(1,2,3,4,5,6,7));
        System.out.println(myMath.sub(1,2));
    }
}

class myMath{
    public static <T extends Number> double sum(T... a){
        double result=0;
        for(T x:a){
            result += x.doubleValue();
        }
        return result;
    }
    public static <T extends Number> double sub(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }
}
