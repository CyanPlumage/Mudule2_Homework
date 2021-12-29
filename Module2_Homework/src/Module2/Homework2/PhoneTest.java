package Module2.Homework2;

public class PhoneTest {

    public static void main(String[] args) {

        //创建父类Phone的引用指向子类NewPhone对象
        CellPhone cellp = new NewPhone();

        //多态试验
        cellp.call();

        //实现玩游戏的功能，使用强制类型转换
        ((NewPhone) cellp).playGame();
    }
}
