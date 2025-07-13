package CompositePattern.SolutionUsingCompositePattern;

public class File implements FileSystem {

    String FileName;

    public File(String name) { this.FileName = name; }

    public void ls() {
        System.out.println("file name " + FileName);
    }
}