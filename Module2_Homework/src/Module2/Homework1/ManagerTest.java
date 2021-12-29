package Module2.Homework1;

public class ManagerTest {

    public static void main(String[] args) {

        //创建Manager对象并初始化赋值
        //1.使用构造方法创建
        Manager mr = new Manager("一龙","123",15000,6000);
        //调用work方法
        mr.work();

        System.out.println("--------------------------------");
        //2.使用set方法创建
        Manager mr2 = new Manager();
        mr2.setName("一龙");
        mr2.setId("123");
        mr2.setSalary(15000);
        mr2.setBonus(6000);
        //调用work方法
        mr2.work();
    }
}
