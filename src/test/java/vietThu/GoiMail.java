package vietThu;

public class GoiMail {
    public static void main(String[] args) {
        CauTruc thuTay = new ThuTay();
        thuTay.guiThu();
        CauTruc vietMail = new VietEmail();
        System.out.println("#########################");
        vietMail.guiThu();
    }
}
