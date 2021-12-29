package Module2.Homework2;

public class NewPhone extends CellPhone implements IPlayGame{

    //继承父类并重写抽象方法
    @Override
    public void call() {
        System.out.println("新手机在打电话！");
    }

    @Override
    public void sendMail() {
        System.out.println("新手机在发短信！");
    }

    //实现接口重写方法
    @Override
    public void playGame() {
        System.out.println("新手机在玩游戏！");
    }
}
