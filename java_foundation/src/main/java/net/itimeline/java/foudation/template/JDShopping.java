package net.itimeline.java.foudation.template;

/**
 * @program: java
 * @description: 京东购物
 * @author: mfg
 * @create: 2021-08-21 10:47
 **/
public class JDShopping extends AbstracteShoppingTemplate {
    @Override
    public void register() {
        System.out.println("欢迎注册京东");
        super.realName();
    }

    @Override
    public void login() {
        System.out.println("登录");

    }

    @Override
    public void search() {
        System.out.println("搜索");

    }

    @Override
    public void addshoping() {
        System.out.println("京东添加购物车");

    }

    @Override
    public void pay() {
        System.out.println("支付");

    }
}
