package com.interfacetesting.Testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1111111111");
    }


    public void stu2(){
        System.out.println("GroupsOnClass2中的stu222222222222");
    }
}
