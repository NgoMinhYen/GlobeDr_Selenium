package huTieuGo;

public class FactoryXeHTG {
    public XeHuTieuGo choiceMien(MienType mienType) {
        XeHuTieuGo huTieuGo = null;
        if (mienType.equals(MienType.MIEN_BAC)) {
            huTieuGo = new XeHuTieuMienBac();
        }
        if (mienType.equals(MienType.MIEN_NAM)) {
            huTieuGo = new XeHuTieuMienNam();
        }
        return huTieuGo;
    }
}
