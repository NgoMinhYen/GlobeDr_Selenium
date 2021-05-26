package monAn;

public class Test {
    public static void main(String[] args) {
//        MonXao rauMuonXaoToi = new RauMuongXaoToi();
//        rauMuonXaoToi.cáchLamMonXao();
//        MonXao muopXaoLongGa = new MuopXaoLongGa();
//        System.out.println("LKKKKKKKKKKKKKKKKKKK");
//        muopXaoLongGa.cáchLamMonXao();

        FactoryMonXao factoryMonXao = new FactoryMonXao();
        System.out.println(factoryMonXao.xaoMon(MonType.MUOP_LONG_GA).getClass());;


    }
}
