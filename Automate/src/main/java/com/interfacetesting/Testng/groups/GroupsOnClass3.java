package com.interfacetesting.Testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tescher")
public class GroupsOnClass3 {

    public void tescher1(){
        System.out.println("GroupsOnClass3中的tescher1111111111");
    }


    public void tescher2(){
        System.out.println("GroupsOnClass3中的tescher222222222222");
    }

}
