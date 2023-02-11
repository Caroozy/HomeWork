package Series3.E1;

import java.time.LocalDate;

public class flight {
    private String code;
    private String company;
    private String from;
    private String to;
    private LocalDate when=LocalDate.now();

    public flight(String code, String company, String from, String to) {
        this.code = code;
        this.company = company;
        this.from = from;
        this.to = to;
    }

    public flight(String code, String company, String from, String to, LocalDate when) {
        this.code = code;
        this.company = company;
        this.from = from;
        this.to = to;
        this.when = when;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "flight{" +
                "code='" + code + '\'' +
                ", company='" + company + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", when=" + when +
                '}';
    }
}
