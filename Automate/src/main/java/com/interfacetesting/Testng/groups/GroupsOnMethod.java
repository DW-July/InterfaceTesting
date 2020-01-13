package com.interfacetesting.Testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    /*
    * 组测试中的方法分组测试
    *
    * */

    @Test(groups = "server")
    public void groupstest1(){
        System.out.println("这是服务端组的测试方法111111111111");
    }

    @Test(groups = "server")
    public void groupstest2(){
        System.out.println("这是服务端组的测试方法2222222222222");
    }

    @Test(groups = "client")
    public void groupstest3(){
        System.out.println("这是客户端组的测试方法333333333333333333");
    }

    @Test(groups = "client")
    public void groupstest4(){
        System.out.println("这是客户端组的测试方法4444444444444");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnServer(){
        System.out.println("这个是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这个是服务端组运行之后运行的方法");
    }



}
