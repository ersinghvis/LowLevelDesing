package designpatterns.compositepattern;

public enum FileType {
    FILE("File"),
    DIRECTORY("Directory"),;

    private final String fileType;

    FileType(String fileType) {
        this.fileType = fileType;
    }

}
