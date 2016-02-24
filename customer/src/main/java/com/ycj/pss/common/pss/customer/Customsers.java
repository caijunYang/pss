package com.ycj.pss.common.pss.customer;

import com.ycj.pss.common.pss.common.BaseUtils;

/**
 * Created by Administrator on 2016/2/23.
 */
public class Customsers {
    public  void doTest(){
        System.out.println("this in Customer Utils ");
       BaseUtils bs=new BaseUtils();
        bs.commonUtils("哈哈");
        C c=new C();
        c.doC();

    }
}
class C{
    public  void doC(){
        Customsers customsers=new Customsers();
        customsers.doTest();
    }
}
