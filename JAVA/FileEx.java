package day11;

import java.io.File;

public class FileEx {
public static void main(String[] args) {
	File f=new File("D:\\lectures and material\\ravan.txt");
    System.out.println(f.canExecute());
    System.out.println(f.canRead());
    System.out.println(f.canWrite());
    System.out.println(f.getName());
    System.out.println(f.getPath());
    System.out.println(f.lastModified());
    System.out.println(f.isHidden());
    f.deleteOnExit();
}
}
