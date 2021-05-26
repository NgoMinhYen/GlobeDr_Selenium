package baoLaCai;

public class FactoryBaoLaCai {
    public CauTrucBaiBao choiceTypeBao(BaoType baoType) {
        CauTrucBaiBao cauTrucBaoLaCai = null;
        if (baoType.equals(BaoType.TUOI_TRE_VN)) {
            cauTrucBaoLaCai = new BaoTuoiTreTiengViet();
        }
        if (baoType.equals(BaoType.TUOI_TRE_US)) {
            cauTrucBaoLaCai = new BaoTuoiTreTiengAnh();
        }
        if (baoType.equals(BaoType.VNEXPRESS_VN) ) {
            cauTrucBaoLaCai = new VNExpressTiengViet();
        }
        if (baoType.equals(BaoType.VNEXPRESS_US)) {
            cauTrucBaoLaCai = new VNExpressTiengAnh();
        }
        return cauTrucBaoLaCai;
    }
}
