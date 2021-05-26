public class Overloading {

    public static void login(String userName, String pass){

    }
    public static void login(String userName, String pass,String country){

    }
    public static void login(String userName, String pass,String country, String name){

    }

    public static void main(String[] args) {
        login("0215556856","123456","vn","nguyễn văn a");


    }
}
