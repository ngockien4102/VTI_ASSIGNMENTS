package ex1_static.q8;

public abstract class HinhHoc {
    static int count = 0;

    public HinhHoc() {
        if (count > configs.SO_LUONG_HINH_TOI_DA){
            throw new RuntimeException("Số lượng hình tối đa là: "+ configs.SO_LUONG_HINH_TOI_DA);
        }
        count++;
    }

    public abstract float chuVi();

    public abstract float dienTich();
}
