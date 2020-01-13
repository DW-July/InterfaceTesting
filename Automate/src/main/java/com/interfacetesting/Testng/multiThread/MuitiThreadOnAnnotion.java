package com.interfacetesting.Testng.multiThread;

import org.testng.annotations.Test;

public class MuitiThreadOnAnnotion {

    /*
    * TestNG多线程测试–注解方式实现
    * */

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void threadTest(){
        System.out.println("111");
        System.out.printf("Thrad Id: %s%n",Thread.currentThread().getId());
    }

}