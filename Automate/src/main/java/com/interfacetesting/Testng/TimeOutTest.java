package com.interfacetesting.Testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    /*
    * 超时测试
    * @Test(timeOut = 3000)//单位为毫秒
    * */
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("超时测试test1");
    }

    @Test(timeOut = 2000)
    public void test2Success() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("超时测试test2");
    }

}
