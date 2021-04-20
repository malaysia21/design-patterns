package behavioral.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Movie implements PrototypeCulture {

    private String name;

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie");
        return (Movie) super.clone();
    }

    @Override
    public String toString() { return "Movie"; }
}
