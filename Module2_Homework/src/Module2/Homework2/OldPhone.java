package Module2.Homework2;

public class OldPhone extends CellPhone{

    //继承并重写父类的抽象方法
    @Override
    public void call() {
        System.out.println("旧手机在打电话！");
    }

    @Override
    public void sendMail() {
        System.out.println("旧手机在发短信！");
    }
}
