package baoLaCai;

public class test {
    public static void main(String[] args) {
        FactoryBaoLaCai factoryBaoLaCai = new FactoryBaoLaCai();
        factoryBaoLaCai.choiceTypeBao(BaoType.TUOI_TRE_US).baiViet().creatBaiViet();
        factoryBaoLaCai.choiceTypeBao(BaoType.TUOI_TRE_US).loGo().creatLoGo();
        factoryBaoLaCai.choiceTypeBao(BaoType.TUOI_TRE_VN).baiViet().creatBaiViet();
        factoryBaoLaCai.choiceTypeBao(BaoType.TUOI_TRE_VN).loGo().creatLoGo();
        System.out.println("##########################");
        factoryBaoLaCai.choiceTypeBao(BaoType.VNEXPRESS_US).baiViet().creatBaiViet();
        factoryBaoLaCai.choiceTypeBao(BaoType.VNEXPRESS_US).loGo().creatLoGo();
        factoryBaoLaCai.choiceTypeBao(BaoType.VNEXPRESS_VN).baiViet().creatBaiViet();
        factoryBaoLaCai.choiceTypeBao(BaoType.VNEXPRESS_VN).loGo().creatLoGo();
    }
}
