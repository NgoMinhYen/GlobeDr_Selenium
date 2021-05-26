package vietThu;

public class ThuTay extends CauTruc {
    @Override
    void tieuDe() {
        System.out.println("Viết thư cho ông bà");
    }

    @Override
    void noiDung() {
        System.out.println("Ông bà ngoại kính mến!\n" +
                "\n" +
                "Ông bà ngoại dạo này có khỏe không? Dừa thu hoạch có nhiều hơn lúc trước không? Bây giờ là thời điểm cháu đang ôn tập thi kì II nên những ngày ngày nghỉ cuối tuần cũng không thể về quê được. Cháu nhớ ông bà lắm!\n" +
                "\n" +
                "Mặc dù bài vở học kì II này nhiều và khó, nhưng cháu hết sức cố gắng để đạt được danh hiệu học sinh giỏi cả năm. Cháu nhất quyết không phụ lòng cha mẹ vất vả lo cho cháu ăn học và sự tin tưởng của ông bà ngoại. Sau khi thi xong, nhất là trong dịp hè sắp tới, cháu sẽ về quê ở lâu dài bên ông bà ngoại.\n" +
                "\n" +
                "Ba mẹ cháu ở trên này cũng khỏe cùng với cuộc sống tốt. Em trai cháu đã nói bập bẹ và chập chững bước đi rồi. Cuối thư, cháu chúc ông bà ngoại sống vui và sống mãi với con cháu.");
    }

    @Override
    void nguoiNhan() {
        System.out.println("Ông bà ngoại");
    }

    @Override
    void ngươiGui() {
        System.out.println("Cháu của ông bà ngoại");
    }
}
