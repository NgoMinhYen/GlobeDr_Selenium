package vietThu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VietEmail extends CauTruc {

    @Override
    void tieuDe() {
        System.out.println("Email Xin Việc");
    }

    @Override
    void noiDung() {
        System.out.println("Qua thông tin tuyển dụng trên mạng xã hội là Facebook, tôi được biết Quý công ty đang có nhu cầu tuyển dụng nhân viên cho vị trí kế toán viên nên tôi viết " +
                "đơn này mong được trở thành một phần của công ty.");
    }

    @Override
    void nguoiNhan() {
        System.out.println("Kính gửi Chị Nguyễn Thị Tình - Bộ phận tuyển dụng ");
    }

    @Override
    void ngươiGui() {
        System.out.println("Tên tôi là: Nguyễn Văn A\n" +
                "Sinh ngày: xx/xx/xx\n" +
                "Địa chỉ: X\n" +
                "SĐT: 0389 586 234");
    }
}
