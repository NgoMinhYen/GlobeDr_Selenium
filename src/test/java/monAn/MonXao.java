package monAn;

public abstract class MonXao {
    abstract void chuanBiNguyenLieu();
    abstract void soCheNguyLieu();
    abstract void xao();
    abstract void trangTri();
    public final void cáchLamMonXao(){
        chuanBiNguyenLieu();
        soCheNguyLieu();
        xao();
        trangTri();
    }
}
