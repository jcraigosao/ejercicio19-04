
package Archivos;

import java.io.File;

public class FileInfo{
    public static void main(String[] args) {
        File f= new File("hamlet.txt");
        System.out.println("exists returns"+ f.exists());
        System.out.println("canRead returns"+ f.canRead());
        System.out.println("length returns"+ f.length());
        System.out.println("getAbsolutePath returns"+ f.exists());
        
    }
}
