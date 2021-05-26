package vietThu;

public abstract class CauTruc {
    abstract void tieuDe();
    abstract void noiDung();
    abstract void nguoiNhan();
    abstract void ngươiGui();
    public final void guiThu(){
        nguoiNhan();
        ngươiGui();
        tieuDe();
        noiDung();


    }

}
