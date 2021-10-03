package baseline;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class Solution24Test {

    @Test
    public void isAnagram(){
        Solution24Test checker = new Solution24Test();

        assertThat(checker.isAnagram("peek", "keep"), equalTo(true));
        assertThat(checker.isAnagram("mary", "army"), equalTo(true));

        assertThat(checker.isAnagram("dart", "mart"), equalTo(false));
    }
}