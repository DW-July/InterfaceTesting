package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    /*
    *   TestNG断言 Assert.assertEquals();
    *   日志记录
    * */
    @Test
    public void test(){
        System.out.println("能运行成功吗？？？？？？");
    }


    @Test
    public void test1(){
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2(){
        Assert.assertEquals("qqqqqqqqqq","ssssssssssssss");
    }

    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void  logDemo(){
        Reporter.log("这个是我们自己写的日志");
        throw new RuntimeException("自己运行时抛出的异常！！！！！！！！！！！");
    }
}
