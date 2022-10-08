import java.io.File;
import java.io.IOException;
import java.util.function.Function;

interface Printer {
    default void print() {
        System.out.println("This is a default message");
    }
}

// do not change code below
class Main {
    public static void main(String... args) {
        Printer printer = new ConsolePrinter();
        printer.print(); // prints: This is a default message

        Runnable creatFile = () -> {
            File file = new File("file.txt");
            try {
                boolean createdNew = file.createNewFile();
                if (createdNew) {
                    System.out.println("The file was successfully created.");
                } else {
                    System.out.println("The file already exists. " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("Cannot create the file: " + file.getPath());
            }
        };

        Runnable creatDirs = () -> {
            File file = new File("dir/dir/dir");

            boolean createdNewDirectory = file.mkdirs();
            if (createdNewDirectory) {
                System.out.println("It was successfully created.");
            } else {
                System.out.println("It was not created.");
            }
        };

        Runnable deleteFile = () -> {
            File file = new File("dir");

            if (file.delete()) {
                System.out.println("It was successfully removed.");
            } else {
                System.out.println("It was not removed.");
            }
        };

        Runnable deleteAllDirFiles = () -> {
            File file = new File("dir");
            deleteDirRecursively(file);
        };

        File file = new File("/home/art/Documents/dir/filename.txt");
        boolean renamed = file.renameTo(new File("/home/art/Documents/dir/newname.txt"));
        boolean moveFile = file.renameTo(new File("/home/art/Documents/another/file.txt"));
        Thread t1 = new Thread(() -> {
            System.out.println("Bonjour");
        });
        t1.start();

        print(s -> 2);

        Function<String, Integer> test = x -> x.length() + 10;
        print(test);
    }

    static void print(Function<String, Integer> key) {
        var k = key.apply("") + 30;
        System.out.println(key.apply("bonjour"));
    }


    private static void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        for (File child : children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                child.delete();
            }
        }

        dir.delete();
    }
}

class ConsolePrinter implements Printer {
}

