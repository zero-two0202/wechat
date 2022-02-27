package cn.zgy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 钟国煜
 * @creat 2022-02-27-23:34
 */
public class WechatTest {
    @Test
    public void sayTest(){
        Wechat wechat = new Wechat();
        String ret = wechat.say("wechat");
        Assert.assertEquals(ret,"hello wechat");
    }
}
