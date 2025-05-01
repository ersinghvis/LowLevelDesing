package designpatterns.compositepattern;

public class File implements FileSystem{

    String fileName;

    FileType fileType = FileType.FILE;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getName() {
        System.out.println("File name: " + fileName+ " & type: " + fileType.name());
    }

}
