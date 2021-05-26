package huTieuGo;

public class test {
    public static void main(String[] args) {
//        HuTieuGo mienBac = new MienBac();
//        mienBac.hoanhThanh();
//        mienBac.huTieu();
//        HuTieuGo mienNam = new MienNam();
//        mienNam.hoanhThanh();
//        mienNam.huTieu();
        FactoryXeHTG factoryXeHTG = new FactoryXeHTG();
        factoryXeHTG.choiceMien(MienType.MIEN_BAC).huTieu().nauHuTieu();
        factoryXeHTG.choiceMien(MienType.MIEN_BAC).hoanhThanh().nauHoanhThanh();
        factoryXeHTG.choiceMien(MienType.MIEN_NAM).hoanhThanh().nauHoanhThanh();
        factoryXeHTG.choiceMien(MienType.MIEN_NAM).huTieu().nauHuTieu();
    }
}
