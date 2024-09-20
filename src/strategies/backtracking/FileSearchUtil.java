package strategies.backtracking;

import java.io.File;
import java.util.*;

public class FileSearchUtil {

    public static void main(String[] args) {
        FileSearchUtil demo=new FileSearchUtil();
        Optional<String>result=demo.searchFile("C:/Users/vineets/work/experiments","test.txt");
        if(result.isPresent()){
            System.out.println("found at path="+result.get());
        }
    }

    /**
     *
     *
     * Worst Case Time Complex: O(n) where n represents the total files from root startPath
     *  Auxiliary Space: O(n)
     *
     * @param startPath
     * @param fileName
     * @return found file path as optional
     */
    Optional<String> searchFile(String startPath, String fileName){
        Deque<File> visitedStack=new LinkedList<>();
        File start=new File(startPath);
        if(start.isFile() && startPath.equalsIgnoreCase(fileName)){
                return Optional.of(startPath);
        }
        //adds at last, addLast(element)/offerLast(element) does same
        visitedStack.add(new File(startPath));
        while (!visitedStack.isEmpty()) {
            //fetch last element and remove
            File visited=visitedStack.pollLast();
            File[] files = visited.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                    return Optional.of(file.getAbsolutePath());
                }
                visitedStack.push(file);
            }
        }
        return Optional.empty();
    }
}
