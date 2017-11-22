package net.thucydides.showcase.cucumber.model;

public class Trade {
    private String name;
    private String status;
    private int id;

    public Trade(String status, String name) {
        this.status = status;
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
