/**
 * 定义一个电脑的实体
 * @author 13761
 */

abstract class Computer {
    /**
     * 定义电脑的特性，都能用来打游戏
     */
    public abstract void play();
}

class Desktop extends Computer{
    private String name = "";

    public Desktop(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("使用 "+ name+" 畅玩3A大作");
    }

}

class Laptop extends Computer{
    private String name = "";
    public Laptop(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("使用 "+ name+" 享受4399小游戏");
    }
}

