package baoLaCai;

public class VNExpressTiengAnh extends CauTrucBaiBao {
    @Override
    BaiViet baiViet() {
        return new BaiVietVNExpressTiengAnh();
    }

    @Override
    LoGo loGo() {
        return new LoGoVNExpressTiengAnh();
    }
}
