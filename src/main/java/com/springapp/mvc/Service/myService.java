package com.springapp.mvc.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Ультрамар on 07.06.2016.
 */
@Service
public class myService {


    public String doPost(MultipartFile filek) throws IOException {

        String path= "D:\\jopa\\"+filek.getName()+".txt";

        InputStream input = filek.getInputStream();
        try {
            byte[] attachment = new byte[input.available()];
            input.read(attachment);
            File file = new File(path);
            FileOutputStream out = new FileOutputStream(file);
            out.write(attachment);
            input.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";

    }
}
