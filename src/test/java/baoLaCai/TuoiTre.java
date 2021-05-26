package baoLaCai;

public abstract class TuoiTre extends CauTrucBaiBao{
    @Override
    LoGo loGo() {
        System.out.println("dong 1 ");
        System.out.println("dong 2 ");
        System.out.println("dong 3 ");
        System.out.println("dong 4 ");
        System.out.println("dong 5 ");
        return new LoGoBaoTuoiTre();
    }
}
