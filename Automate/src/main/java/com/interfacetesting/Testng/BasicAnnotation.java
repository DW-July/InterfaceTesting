package com.interfacetesting.Testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    /*
    *注解
    * */

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public  void testcase1(){
        System.out.println("这个是测试用例1");
    }

    @Test
    public  void testcase2(){
        System.out.println("这个是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这个是测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这个是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这个是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这个是在类运行之后运行的方法");
    }


    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("BeforeSuite测试套件，在类运行之前运行");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println("AfterSuite测试套件，在类运行之后运行");
    }


}
