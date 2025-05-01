package designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements DirectoryFileSystem{

    List<FileSystem> fileSystems;

    String directoryName;

    FileType fileType = FileType.DIRECTORY;

    public Directory(String directoryName) {
        fileSystems = new ArrayList<>();
        this.directoryName = directoryName;
    }

    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void removeFileSystem(FileSystem fileSystem) {
        fileSystems.remove(fileSystem);
    }


    @Override
    public void showFileSystem() {
        System.out.println("Directory: " + directoryName);
        for (FileSystem fileSystem : fileSystems) {
            if( fileSystem instanceof Directory){
                ((Directory) fileSystem).showFileSystem();
            }
            else{
                fileSystem.getName();
            }
        }
    }

    @Override
    public void printSize() {
        System.out.println("Current file System size: "+this.fileSystems.size());
    }

    @Override
    public void getName() {
        System.out.println("Directory Name: " + directoryName + " & type: " + fileType.name());
    }

}
