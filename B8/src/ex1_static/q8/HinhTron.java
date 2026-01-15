package ex1_static.q8;

public class HinhTron extends HinhHoc {
    static int count = 0;

    public HinhTron() {
        super();
        count++;
    }

    @Override
    public float chuVi() {
        return 0;
    }

    @Override
    public float dienTich() {
        return 0;
    }
}
