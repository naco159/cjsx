public class CustomInteger {
    private int value;
    private String description;

    public CustomInteger(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    // 其他方法，如equals(), hashCode()等，根据需要实现
}