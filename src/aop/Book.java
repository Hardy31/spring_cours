package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("преступление и наказание")
    private String name;

    @Value("Ф.М. Достоевский")
    private String outher;

    @Value("1866")
    private int yearsOfPublication;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuther() {
        return outher;
    }

    public void setOuther(String outher) {
        this.outher = outher;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setYearsOfPublication(int yearsOfPublication) {
        this.yearsOfPublication = yearsOfPublication;
    }
}
