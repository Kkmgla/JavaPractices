import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
     void FileR(String path){
        try{
            /*Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }*/
            FileReader fileReader = new FileReader(path);
            int c;
            while((c=fileReader.read())!=-1) {
                System.out.print((char) c);
            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
    public void FileW(String path, String text){
         try{
             FileWriter fileWriter = new FileWriter(path);
             fileWriter.write(text);
             fileWriter.flush();
         }
         catch (IOException e){
             e.getMessage();
         }
    }
    public void FileWriteInEnd(String path, String text){
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Записываем введенный текст в файл
            bufferedWriter.write(text);
            bufferedWriter.newLine(); // Добавляем перевод строки

            // Закрываем потоки после использования
            fileWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Запись в файл\n");
        main.FileW("E:\\JavaProjects\\JavaProg\\Practice13.1_13.2_13.3_13.4_13.5\\SimpleText.txt",scanner.nextLine());
        System.out.print("Чтение из файла\n");
        main.FileR("E:\\JavaProjects\\JavaProg\\Practice13.1_13.2_13.3_13.4_13.5\\SimpleText.txt");
        System.out.print("\nДобавление теста в конец файла\n");
        main.FileWriteInEnd("E:\\JavaProjects\\JavaProg\\Practice13.1_13.2_13.3_13.4_13.5\\SimpleText.txt",scanner.nextLine());
    }
}