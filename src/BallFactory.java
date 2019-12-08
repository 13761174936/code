/**
 * 定义抽象工厂类，来定义所有工厂应该具备的职责，通性。
 * @author 13761
 *
 */
abstract class ComputerFactory {
    public abstract Computer createComputer();
}

class DesktopFactory extends ComputerFactory{

    @Override
    public Computer createComputer() {
        return new Desktop("台式电脑");
    }
}

class LaptopFactory extends ComputerFactory{

    @Override
    public Computer createComputer() {
        return new Laptop("笔记本电脑");
    }

}
