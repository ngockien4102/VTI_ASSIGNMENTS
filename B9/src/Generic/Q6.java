package Generic;

public class Q6 {
    public static void main(String[] args) {
        MyMath<String,String> student = new MyMath<>("he","nnk");
        System.out.println(student.getKey());
        System.out.println(student.getVal());
    }
}

class MyMath<k,v>{
    private k key;
    private v val;

    public MyMath(k key, v val) {
        this.key = key;
        this.val = val;
    }

    public k getKey() {
        return key;
    }

    public v getVal() {
        return val;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public void setVal(v val) {
        this.val = val;
    }
}
