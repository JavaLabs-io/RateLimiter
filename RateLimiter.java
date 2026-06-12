import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private final int LIMIT = 3;
    private Map<String, Integer> requests;

    public RateLimiter() {
        requests = new HashMap<>();
    }

    public boolean allowRequest(String user) {

        int count = requests.getOrDefault(user, 0);

        if (count >= LIMIT) {
            return false;
        }

        requests.put(user, count + 1);
        return true;
    }

    public void displayStats() {
        System.out.println("\nRequest Counts:");

        for (Map.Entry<String, Integer> entry : requests.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        RateLimiter limiter = new RateLimiter();

        String[] incomingRequests = {
                "User1",
                "User1",
                "User2",
                "User1",
                "User2",
                "User1",
                "User3",
                "User2",
                "User2"
        };

        for (String user : incomingRequests) {

            if (limiter.allowRequest(user)) {
                System.out.println("Request from " + user + " -> Allowed");
            } else {
                System.out.println("Request from " + user + " -> Blocked");
            }
        }

        limiter.displayStats();
    }
}
