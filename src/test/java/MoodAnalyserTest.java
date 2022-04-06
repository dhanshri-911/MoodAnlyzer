import junit.framework.TestCase;
import org.junit.Assert;

public class MoodAnalyserTest extends TestCase {
    public void testAnalyseMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
}