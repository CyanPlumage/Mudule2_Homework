package Module2.Homework1;

public class CoderTest {

    public static void main(String[] args) {

        //创建Coder对象并初始化赋值
        //1.使用构造方法创建
        Coder cr = new Coder("方便","135",10000);
        //调用work方法
        cr.work();

        System.out.println("--------------------------------");
        //2.使用set方法创建
        Coder cr2 = new Coder();
        cr2.setName("方便");
        cr2.setId("135");
        cr2.setSalary(10000);
        //调用work方法
        cr2.work();
    }
}
