package ex3_file.utils;

import javax.naming.spi.DirectoryManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileManager {

    public static void main(String[] args) throws IOException {
//        FileManager.deleteFile("C:\\Users\\ngockien\\Desktop\\VTI\\VTI_JAVA\\VTI_ASSIGNMENTS\\B8\\file\\newFile.txt");
//        System.out.println(FileManager.isFolder("C:\\Users\\ngockien\\Desktop\\VTI\\VTI_JAVA\\VTI_ASSIGNMENTS\\B8\\file"));
//        System.out.println(FileManager.getAllFileName("C:\\Users\\ngockien\\Desktop\\VTI\\VTI_JAVA\\VTI_ASSIGNMENTS\\B8\\.idea"));
    }

    //    Question 1: Check File is exists
//    Tạo 1 method có đầu vào là String path để check xem path đó có tồn tại hay không.
//            VD: path = "C:\Users\pc\Desktop\Test.txt"
//    Gợi ý: Tạo method boolean isFileExists(String pathFile)
    public boolean checkFileExist(String filePath) {
        return new File(filePath).exists() ? true : false;
    }

    //    Question 2: Create new file
//    Tạo 1 method để có thể tạo được file.
//    Chú ý:
//    Kiểm tra xem file đã tồn tại hay chưa, nếu file đã tồn tại thì sẽ throw ra Exception "Error! File Exist."
//    Gợi ý:
//    Tạo method void createNewFile(String pathFile)
//    Vào tạo thêm method void createNewFile(String path, String fileName)
    public static void createNewFile(String path, String fileName) throws IOException {
        Path fpath = Paths.get(path, fileName);
        if (Files.exists(fpath)) {
            throw new RuntimeException("Error! File Exist.");
        } else {
            Files.createFile(fpath);
        }
    }

    //
//
//    Question 4: Delete file
//    Tạo 1 method để có thể delete file
//    Chú ý:
//    Kiểm tra xem file đã tồn tại hay chưa, nếu file chưa tồn tại thì sẽ throw ra Exception        "Error! File Not Exist."
//    Gợi ý: Tạo method void deleteFile(String pathFile)
    public static void deleteFile(String pathFile) throws IOException {
        Path path = Paths.get(pathFile);
        if (Files.exists(path)) {
            Files.delete(path);
        } else {
            throw new RuntimeException("Error! File Not Exist.");
        }

    }

//
//
//    Question 5: Check path is File or Folder
//    Tạo 1 method để kiểm tra xem path có thể là File hay Folder.
//    Gợi ý: Tạo method boolean isFolder(String path)
    public static boolean isFolder(String path){
        Path fpath = Paths.get(path);
        if (Files.isRegularFile(fpath)){
            return false;
        } else if (Files.isDirectory(fpath)) {
            return true;
        }
        return false;
    }

//
//
//    Question 6: Get all File name of Folder
//    Tạo 1 method để lấy ra tất cả các tên file trong 1 Folder.
//    Chú ý:
//    Kiểm tra xem path nhập vào có phải là folder hay không, nếu không phải thì sẽ throw ra Exception "Error! Path is not folder."
//    Gợi ý: Tạo method List<String> getAllFileName(String path)
    public static List<String> getAllFileName(String path) throws IOException {
        Path fpath = Paths.get(path);
        List<String> listFile = new ArrayList<>();
        if (!Files.isDirectory(fpath)){
            throw new RuntimeException("Error! Path is not folder.");
        }
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(fpath);
        for (Path p: directoryStream){
            if (Files.isRegularFile(p)) {
                listFile.add(p.getFileName().toString());
            }
        }
        return listFile;
    }

//
//
//    Question 7: Copy File
//    Tạo 1 method để copy file.
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception "Error! Source File Not Exist."
//    Nếu file đích đã tồn tại thì sẽ throw ra Exception "Error! newPath has File same name."
//    Gợi ý:
//    Tạo method void copyFile(String sourceFile, String distinationPath, String newName)
//    Và tạo method void copyFile(String sourceFile, String newPath). Với File mới sẽ có tên cùng với file cũ
    public void copyFile(String sourceFile, String distinationPath, String newName){
//        Files.copy(sourceFile,distinationPath,REPLACE_EXISTING);
    }

//
//
//    Question 8: Moving file
//    Tạo 1 method để di chuyển file sang folder khác.
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception "Error! File Not Exist.".
//    Phải xóa file cũ đi
//    Gợi ý:
//    Tạo method void moveFile(String sourceFile, String destinationPath)
//
//    Question 9: Rename File
//    Tạo 1 method để đổi tên file.
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception "Error! File Not Exist.".
//    Nếu newName đã tồn tại thì sẽ throw ra Exception "Error! Name is Exist.".
//    Gợi ý:
//    Tạo method void renameFile(String pathFile, String newName)
//
//
//    Question 10: Create new folder
//    Tạo 1 method để có thể tạo được folder.
//    Chú ý:
//    Kiểm tra xem folder đã tồn tại hay chưa, nếu folder đã tồn tại thì sẽ throw ra Exception "Error! Folder Exist."
//    Gợi ý: Tạo method void createNewFolder(String newPathFolder)
//
//
//    Question 11: Download File
//    Hãy viết 1 method để có thể download được file ở trên mạng
//    Chú ý:
//    Nếu folder không tồn tại thì sẽ tạo folder.
//    Nếu tên file download đã tồn tại trong folder thì sẽ thêm (1), (2) vào sau tên file (giống download file ở window).
//    Gợi ý:
//    Tạo method void downloadFile(String fileLink, String folder)
}
