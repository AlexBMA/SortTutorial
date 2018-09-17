import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimplestStringListSortTest {


    @Test
    public void canSortStrings(){
        var actualNames = new ArrayList(Arrays.asList(
                "Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"
        ));
        Collections.sort(actualNames);
        Assert.assertEquals(new ArrayList<>(Arrays.asList(
                "Abraham", "Dagobert",
                "Johnson", "Wilkinson", "Wilson")),
                actualNames);

    }
}
