import org.junit.Assert;
import org.junit.Test;

public class UtilsTests {
    @Test
    public void trimStringToBytesSize() {
        trimStringToBytesSizeTestLogic("Shalom",
                6,
                "Shalom"
        );
        trimStringToBytesSizeTestLogic(
                "Shalom",
                5,
                "Shalo"
        );
        trimStringToBytesSizeTestLogic("Шалом",
                6,
                "Шал"
        );
        trimStringToBytesSizeTestLogic(
                "Шалом",
                2,
                "Ш"
        );
    }

    private void trimStringToBytesSizeTestLogic(final String input, final int
            stringLength, final String expectedResult) {
        final String actRes = Utils.trimStringToBytesSize(input, stringLength);
        Assert.assertEquals(expectedResult, actRes);
    }
}
