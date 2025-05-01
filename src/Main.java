import designpatterns.compositepattern.*;

class Main {

    public static void main(String[] args) {

        DirectoryFileSystem folder = new Directory("Movies");
        FileSystem file = new File("Avengers");
        folder.addFileSystem(file);
        DirectoryFileSystem actionDir = new Directory("Action");
        DirectoryFileSystem comedyDir = new Directory("Comedy");
        comedyDir.addFileSystem(new File("Fir Hera Pheri"));
        comedyDir.addFileSystem(new File("Dhamal"));
        actionDir.addFileSystem(new File("Fast and Furious"));
        folder.addFileSystem(actionDir);
        folder.addFileSystem(comedyDir);
        folder.showFileSystem();
    }
}