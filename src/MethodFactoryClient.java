/**
 * 测试
 * @author 13761
 */
public class MethodFactoryClient {

    /**
     * 工厂方法模式，根据需要，直接创建对象。方便扩展。无用改变Factory类代码，只需要新增。
     * @param args
     */
    public static void main(String[] args) {
        DesktopFactory desktopFactory = new DesktopFactory();
        Computer desktop = desktopFactory.createComputer();
        desktop.play();

        LaptopFactory laptopFactory = new LaptopFactory();
        Computer laptop = laptopFactory.createComputer();
        laptop.play();
    }
}