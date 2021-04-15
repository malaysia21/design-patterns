package structural.facade;

public class FileGenerationFacade {

    public static void generateFacade(FileType fileType){
        File newFile = File.builder()
                .fileHeader(new FileHeader())
                .fileContent(new FileContent())
                .fileFooter(new FileFooter())
                .build();

        switch (fileType) {
            case PDF:
                FileWriter.writePdfFile(newFile);
                break;
            case XLS:
                FileWriter.writeXlsFile(newFile);
                break;
        }

    }
}
