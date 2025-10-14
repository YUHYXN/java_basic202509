package etc.fileio.objstream;

import java.io.Serializable;
import java.util.Objects;

// 이 클래스의 객체가 스트림을 통해 입/출력 될 수 있도록 직렬화를 시키겠다.
public class Snack implements Serializable {    // 직렬화 가능하도록 Serializable 인터페이스 구현


    private String snackName;
    private int year;
    private int price;
    private Taste taste;
    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public Snack setSnackName(String snackName) {
        this.snackName = snackName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Snack setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Snack setPrice(int price) {
        this.price = price;
        return this;
    }

    public Taste getTaste() {
        return taste;
    }

    public Snack setTaste(Taste taste) {
        this.taste = taste;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Snack snack)) return false;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    public enum Taste{
        GOOD, BAD
    }
}
