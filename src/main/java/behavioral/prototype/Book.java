package behavioral.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book implements PrototypeCulture {

    private String name;

    @Override
    public Book clone() throws CloneNotSupportedException {
        System.out.println("Cloning Book");
        return (Book) super.clone();
    }

    @Override
    public String toString() { return "Book"; }
}
