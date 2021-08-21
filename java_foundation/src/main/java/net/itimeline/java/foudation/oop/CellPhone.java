package net.itimeline.java.foudation.oop;

/**
 * @author mfg
 * @version 1.0
 */
public class CellPhone {
    /**
     * 型号
     */
    String model;
    /**
     * 颜色
     */
    String color;
    /**
     * 给指定的手机号打电话
     */
    public void call(long number){
        System.out.println("正在打电话给"+number);
    }
}
