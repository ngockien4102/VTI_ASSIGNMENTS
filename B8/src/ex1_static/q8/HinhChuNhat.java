package ex1_static.q8;

public class HinhChuNhat extends HinhHoc{
    static int count = 0;
    public HinhChuNhat() {
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
