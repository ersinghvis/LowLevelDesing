package designpatterns.compositepattern;

public interface DirectoryFileSystem extends FileSystem{

    public void addFileSystem(FileSystem fileSystem);

    public void removeFileSystem(FileSystem fileSystem);

    public void showFileSystem();

    public void printSize();

}
