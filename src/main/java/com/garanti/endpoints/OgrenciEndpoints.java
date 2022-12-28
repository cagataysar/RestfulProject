package com.garanti.endpoints;

import com.garanti.model.Ogrenci;
import com.garanti.model.Ogretmen;
import com.garanti.repo.OgrenciRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path(value = "ogrenci")
public class OgrenciEndpoints {

    private OgrenciRepo repo;

    Ogrenci ogrenci = new Ogrenci();

    public OgrenciEndpoints() {
        this.repo = new OgrenciRepo();
    }

    @GET
    @Path(value = "getAll")
    @Produces(value = MediaType.APPLICATION_JSON)
    public ArrayList< Ogrenci > getAll() {
        // localhost:9090/FirstRestfulService/ogrenci/getAll
        return repo.getAll();
    }

    @GET
    @Path(value = "getById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Ogrenci getByIdPathParam(@PathParam (value = "id") Integer id)
    {
        // path param yazarsam bütün param 'lar set edilmiş olmak zorunda
        // localhost:9090/FirstRestfulService/ogrenci/getById/1
        return repo.getById(id);
    }

    @DELETE
    @Path(value = "deleteById/{id}")
    public String deleteById(@PathParam(value = "id") Integer id ) {
        // localhost:9090/FirstRestfulService/ogrenci/deleteById
        if (repo.deleteById(id)){
//            String sonuc = "--> " + ogrenci.getClass().getName()+ " isimli öğrenci silindi";
//            return sonuc;
            return "Başarı ile silindi.";
        }
        else {
            return "Başarı ile silinemedi.";
        }
    }

    @POST
    @Path(value = "save")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public String save(Ogrenci ogrenci)
    {
        // localhost:9090/FirstRestfulService/ogretmen/save
        repo.save(ogrenci);
        return "Başarı ile kaydedildi";
    }

}
