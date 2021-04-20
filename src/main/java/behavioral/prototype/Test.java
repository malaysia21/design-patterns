package behavioral.prototype;

public class Test {
    public static void main(String[] args)  {

        try {
            PrototypeCulture newInstanceBook = PrototypeFactory.getInstance(CultureEnum.BOOK);
            System.out.println(newInstanceBook.toString());

            PrototypeCulture newInstanceBook2 = PrototypeFactory.getInstance(CultureEnum.BOOK);
            System.out.println(newInstanceBook2.toString());

            PrototypeCulture newInstanceMovie = PrototypeFactory.getInstance(CultureEnum.MOVIE);
            System.out.println(newInstanceMovie.toString());

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }

}
