package CompositePattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directoryname;
    List<Object> objectList;

    public Directory(String name) {
        this.directoryname = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory name: " + directoryname);

        for(Object obj: objectList) {
            if(obj instanceof File) {
                ((File) obj).ls();
            }
            else if(obj instanceof Directory) {
                ((Directory) obj).ls();
            } else {
                System.out.println("Unknown object type");
            }
        }
    }
}