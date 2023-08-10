
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "tecshop-de719.appspot.com";
    final String rutaSuperiroStorage = "tecshop";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "tecshop-de719-firebase-adminsdk-8t6s1-8e997a2859";

}
