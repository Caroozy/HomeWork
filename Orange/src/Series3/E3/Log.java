package Series3.E3;

import java.time.LocalDate;

public class Log {
    private long id;
    private String title;
    private String description;
    private long accountID;
    private LocalDate when=LocalDate.now();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public Log() {
    }

    public Log(long id, String title, String description, long accountID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountID = accountID;
    }

    public Log(long id, String title, String description, long accountID, LocalDate when) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.accountID = accountID;
        this.when = when;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", accountID=" + accountID +
                ", when=" + when +
                '}';
    }
}
