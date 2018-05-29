package tree2str;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tree2str() {
    }

    @Test
    public void makeTree() {
        s = new Solution();
        s.makeTree(new Integer[]{1,2,3,4,5,6,null,8});
    }
}