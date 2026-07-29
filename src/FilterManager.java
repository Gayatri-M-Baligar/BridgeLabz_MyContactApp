// Executes selected filter strategy

import java.util.List;

public class FilterManager {

    private FilterStrategy strategy;

    public void setStrategy(FilterStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Contact> execute(List<Contact> contacts) {
        return strategy.filter(contacts);
    }
}