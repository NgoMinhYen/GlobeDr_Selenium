package huTieuGo;

public class XeHuTieuMienNam extends XeHuTieuGo {
    @Override
    HuTieu huTieu() {
        return new MonHuTieuMienNam();
    }

    @Override
    HoanhThanh hoanhThanh() {
        return new MonHoanhThanhMienNam();
    }
}
