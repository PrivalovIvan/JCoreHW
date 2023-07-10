package Task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

class Main {
    public static void main(String[] args) throws IOException {

        nameFiles("Task5");

    }

    public static void makeDir() {

        File backup = new File(".\\backup");
        if (!(backup.mkdir())) {
            backup.mkdir();
        }
    }

    public static void nameFiles(String pathName) throws IOException {
        makeDir();

        String[] list;
        File f = new File(pathName);
        list = f.list();
        for (String item : list) {
            copyFile(new File("Task5\\" + item), new File(".\\backup\\" + item));
        }
    }

    private static void copyFile(File src, File dst) throws IOException {
        Files.copy(src.toPath(), dst.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}