package strategies.backtracking;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

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
     * @param startPath
     * @param fileName
     * @return
     */
    Optional<String> searchFile(String startPath, String fileName){
        Stack<File>stack=new Stack<>();
        File start=new File(startPath);
        if(start.isFile() && startPath.equalsIgnoreCase(fileName)){
                return Optional.of(startPath);
        }
        stack.push(new File(startPath));
        while (!stack.empty()) {
            File visited=stack.pop();
            File[] files = visited.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                    return Optional.of(file.getAbsolutePath());
                }
                stack.push(file);
            }
        }
        return Optional.empty();
    }
}
