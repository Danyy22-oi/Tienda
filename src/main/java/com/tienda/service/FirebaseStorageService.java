/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "dollypop - a3722.appspot.com";
    final String rutaSuperiroStorage = "dollypo";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "dollypop-a3722-firebase-adminsdk-onn7f-48c6aa7fc0";

}
