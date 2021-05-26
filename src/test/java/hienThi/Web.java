package hienThi;

public abstract class Web {
    abstract void tieuDe();

    abstract void noiDung();
    abstract void cuoiBai();
    abstract void logo();
    public final void hienThi() {
        tieuDe();
        noiDung();
        cuoiBai();
        logo();
    }

}
