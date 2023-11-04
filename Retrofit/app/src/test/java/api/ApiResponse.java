package api;

import java.util.List;

public class ApiResponse {
    private int count;
    private int pages;
    private String next;
    private String prev;

    private List<Character> results;

    public List<Character> getResults() {
        return results;
    }

    public int getCount() {
        return count;
    }

    public int getPages() {
        return pages;
    }

    public String getNext() {
        return next;
    }

    public String getPrev() {
        return prev;
    }
}
