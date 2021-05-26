package huTieuGo;

public class XeHuTieuMienBac extends XeHuTieuGo {
    @Override
    HuTieu huTieu() {
        return new MonHuTieuMienBac();
    }

    @Override
    HoanhThanh hoanhThanh() {
        return new MonHoanhThanhMienBac();
    }
}
