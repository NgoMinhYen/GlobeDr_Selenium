package baoLaCai;

public class BaoTuoiTreTiengViet extends TuoiTre {
    @Override
    BaiViet baiViet() {
        return new BaiVietBaoTuoiTreTiengViet();
    }

}
