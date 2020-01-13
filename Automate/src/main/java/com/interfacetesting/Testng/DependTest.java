package com.interfacetesting.Testng;

import org.testng.annotations.Test;

public class DependTest {
    /*
    * 依赖测试
    * @Test(dependsOnMethods = {"test1"})
    * 当被依赖的test1方法执行失败了，依赖test1方法的执行就会被忽略
    *
    * */

    @Test
    public void test1(){
        System.out.println("tset1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void teat2(){
        System.out.println("tset2 run");
    }



}
