package io16;

import java.io.File;

/**
 * Created by 1 on 26.01.2017.
 */

public class MakeDirectories {
    private static void usage(){
        System.err.println(
                "Использование: MakeDirectories путь1 ... \n" +
                        "Создаеь все пути\n" +
                        "Использование: MakeDirectories -d  путь1 ...\n" +
                        "удаляет все пути\n" +
                        "Использование: MakeDirectories -r путь1 путь2\n" +
                        "Переименовывает путь1 в путь2\n");
        System.exit(1);
    }
    public static void fileData(File f){
        System.out.println(
                "Полное имя: " + f.getAbsolutePath() +
                        "\n доступно для чтения: " + f.canRead() +
                        "\n доступно для записи: " + f.canWrite() +
                        "\nимя файла .getName(): " + f.getName() +
                        "\n родительский каталог getParent(): " + f.getParent() +
                        "\n путь getPath() " + f.getPath() +
                        "\n размер " + f.length() +
                        "\n последнее изменение" + f.lastModified());
        if(f.isFile()){
            System.out.println("Это файл");
        }else{
            System.out.println("Это каталог");
        }

    }
    public static void main(String[] args) {
        if(args.length < 1) usage();
        if(args[0].equals("-r")){
            if(args.length != 3)usage();
            File
                    old = new File(args[1]),
                    rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;
        }
        int count = 0;
        boolean del = false;
        if(args[0].equals("-d")){
            count++;
            del = true;
        }
        count--;
        while(++count < args.length){
            File f = new File(args[count]);
            if(f.exists()){
                System.out.println(f + " существует");
                if(del){
                    System.out.println("удаление   " + f);
                    f.delete();
                }
            }
            else{
                if(!del){
                    f.mkdirs();
                    System.out.println("создано " + f);
                }
            }
            fileData(f);
        }
    }
}
