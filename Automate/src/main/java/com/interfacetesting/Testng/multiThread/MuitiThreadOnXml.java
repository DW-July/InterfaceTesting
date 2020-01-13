package com.interfacetesting.Testng.multiThread;

import org.testng.annotations.Test;

public class MuitiThreadOnXml {
    /*
    * 多线程 .xml 文件实现
    * */
    @Test
    public void test1(){
        System.out.printf("Thrad Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thrad Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thrad Id: %s%n",Thread.currentThread().getId());
    }


}
