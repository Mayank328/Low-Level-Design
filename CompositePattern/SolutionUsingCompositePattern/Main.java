package CompositePattern.SolutionUsingCompositePattern;

public class Main {

    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movies");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyDirectory = new Directory("ComedyMovie");
        FileSystem hangover = new File("Hangover");
        comedyDirectory.add(hangover);
        movieDirectory.add(comedyDirectory);

        movieDirectory.ls();
    }
}