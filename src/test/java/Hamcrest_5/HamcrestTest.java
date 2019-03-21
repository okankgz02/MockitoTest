package Hamcrest_5;

import junit.framework.Assert;
import org.testng.annotations.Test;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    String text1 = "OKAN";
    String text2 = "OKAN";
    String text3=null;

    @Test
    public void testEsitmi() {
        System.out.println("test1");
        Assert.assertEquals(text1, text1);
        assertThat(text1, is(equalTo(text2))); // is kullanılnak zorunda
        assertThat(text3,is(nullValue())); //null olup olmadıgı
        assertThat(text2,is(notNullValue()));//text2 null değilse geçers
        assertThat(text1,containsString("OKA")); //OKA Yazısı text1 içinde varmı
        assertThat(text1,anyOf(containsString("OK"),containsString("AN")));

    }


}
