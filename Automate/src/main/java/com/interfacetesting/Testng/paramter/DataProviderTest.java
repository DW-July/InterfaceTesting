package com.interfacetesting.Testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    /*
    * 通过对象来参数化
    * */

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = "+ name + "； age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] objects = new Object[][]{
                {"zdw",18},
                {"zhangsan",20},
                {"lisi",20}
        };
        return objects;
    }

    /*
    * 通过方法来参数化
    * */
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法执行 name = "+name+"；age = "+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法执行 name = "+name+"；age = "+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][]  result=null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",22},
                    {"lisi",23}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",24},
                    {"zhaoliu",25}
            };
        }
        return result;
    }



}
