package baoLaCai;

public class VNExpressTiengViet extends CauTrucBaiBao {
    @Override
    BaiViet baiViet() {
        return new BaiVietVNExpressTiengViet();
    }

    @Override
    LoGo loGo() {
        return new LoGoVNExpressTiengViet();
    }
}
