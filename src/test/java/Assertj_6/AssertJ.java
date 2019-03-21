package Assertj_6;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class AssertJ {

    @Test
    public void testStrings() throws Exception{
        String text1="istanbu";
        Assertions.assertThat(text1)
                .isEqualTo("istanbu")
                .startsWith("ist")
                .endsWith("bu")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("baris") //içinde barıs olmasın
                .containsOnlyOnce("tan")
                .describedAs("bu bir hatadır"); //içinde sadece tan olsun

    }
}
