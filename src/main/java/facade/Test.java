package facade;

public class Test {

    public static void main(String[] args) {
        FileGenerationFacade.generateFacade(FileType.PDF);
        FileGenerationFacade.generateFacade(FileType.XLS);
    }
}
