package zadanie14;

import java.io.File;

public class Rekurencja {
    public static void main(String[] args) {
        File f = new File(".");
        f.exists();
        System.out.println("Folder: " + f.getAbsolutePath());

        File[] files = f.listFiles(); //// list.files: zwraca bezposrednie elementy, ktore sa w folderze. mozna po tych katalogach przechodzic.
        for (File child : files) {
            System.out.println(child.getAbsolutePath());

            File[] files1 = f.listFiles();  ///
            for (File child1 : files) {
                System.out.println("isDirectory: " + child1.isDirectory() + ", name: " + child1.getAbsolutePath());
            }
        }
    }
}

