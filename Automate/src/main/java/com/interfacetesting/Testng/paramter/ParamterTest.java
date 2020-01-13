package com.interfacetesting.Testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    /*
    * 参数化测试 .xml 文件参数化
    * */

    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name,int age){
        System.out.println("name = "+ name + "； age = " + age);

    }
}
