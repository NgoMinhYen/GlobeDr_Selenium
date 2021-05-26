package baoLaCai;

public class BaoTuoiTreTiengAnh extends TuoiTre {
    @Override
    BaiViet baiViet() {
        return new BaiVietTuoiTreTiengAnh();
    }


}
