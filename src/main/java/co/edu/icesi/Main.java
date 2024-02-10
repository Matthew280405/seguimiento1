package co.edu.icesi;
import co.edu.icesi.model.InfrastructureDepartment;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {

        String resource = Main.class.getClassLoader().getResource(InfrastructureDepartment.BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        System.out.println(file.exists() + " "+ resource);

    }



    public static void ejemploCrear(){

        File archivo = new File("");
        System.out.println(archivo.exists());
    }


}