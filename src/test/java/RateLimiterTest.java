import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class RateLimiterTest {

    private RateLimiter rateLimiter;
    
    @BeforeEach 
        //Arrange
        public void setup() {

            rateLimiter = new RateLimiter();
        }
    

    @Test
    void shouldAllowFirstRequest() {
        //rateLimiter.allowRequest("user");
        assertTrue(rateLimiter.allowRequest("user"));
    }

    @Test
    void shouldAllowThirdRequest() {
        //Act
        for (int i = 0; i < 2; i++) {
            rateLimiter.allowRequest("user1");
        }
        assertTrue(rateLimiter.allowRequest("user1"));
    }

    @Test
    void shouldBlockFourthRequest() {
        for(int i = 0; i < 3; i++) {
            rateLimiter.allowRequest("user2");
        }
        assertFalse(rateLimiter.allowRequest("user2"));
    }

    @Test
    void shouldTrackUsersIndependently() {
        //Act 
        for(int i = 0; i < 3; i++) {
            rateLimiter.allowRequest("user3");
        }
        assertFalse(rateLimiter.allowRequest("user3"));
        rateLimiter.allowRequest("user4");
        assertTrue(rateLimiter.allowRequest("user4"));
    }
    
}
