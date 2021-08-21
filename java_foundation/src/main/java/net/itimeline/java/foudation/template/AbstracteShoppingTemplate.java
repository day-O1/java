package net.itimeline.java.foudation.template;

/**
 * @program: java
 * @description: 网上买东西
 * @author: mfg
 * @create: 2021-08-21 10:39
 **/
public abstract class AbstracteShoppingTemplate {
    /**
     * 买东西
     */
    public void shopping(){
        register();
        login();
        search();
        addshoping();
        pay();
    }

    /**
     * 注册
     */
    public  abstract void register();

    /**
     * 实名认证，通用功能
     */
    public void realName(){
        System.out.println("你的实名认证已经通过...");
    }
    /**
     * 登录
     */
    public  abstract void login();
    /**
     * 搜索
     */

    public  abstract void search();

    /**
     * 添加到购物车
     */
    public  abstract void addshoping();

    /**
     * 支付
     */
    public  abstract void pay();



}
