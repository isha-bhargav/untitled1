import java.util.List;
import java.util.Map;

public class RetentionTopic extends Topic {
    private int retentionDays;
    private int retentionBytes;
    private Map<Main.Consumer,Integer> subscriber;
    private List<String> messages;

    public int getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(int retentionDays) {
        this.retentionDays = retentionDays;
    }

    public int getRetentionBytes() {
        return retentionBytes;
    }

    public void setRetentionBytes(int retentionBytes) {
        this.retentionBytes = retentionBytes;
    }

    public Map<Main.Consumer, Integer> getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Map<Main.Consumer, Integer> subscriber) {
        this.subscriber = subscriber;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    protected boolean publish(String topicName, String message) {
        return false;
    }
}
