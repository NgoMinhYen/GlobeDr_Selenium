package monAn;

public class FactoryMonXao {
    public MonXao xaoMon(MonType type) {

        MonXao monXao = null;
        if (type.equals(MonType.MUOP_LONG_GA)) {
            monXao = new MuopXaoLongGa();
        } else if (type.equals(MonType.RAU_MUONG)) {
            monXao = new RauMuongXaoToi();
           
        }
        return  monXao;
    }
}
