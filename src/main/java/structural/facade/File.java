package structural.facade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class File {

    private FileHeader fileHeader;
    private FileContent fileContent;
    private FileFooter fileFooter;
}
