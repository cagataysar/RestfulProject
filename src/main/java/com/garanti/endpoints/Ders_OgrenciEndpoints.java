package com.garanti.endpoints;

import com.garanti.model.Ders;
import com.garanti.model.Ders_Ogrenci;
import com.garanti.repo.DersRepo;
import com.garanti.repo.Ders_OgrenciRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path(value = "dersogrenci")
public class Ders_OgrenciEndpoints {
    private Ders_OgrenciRepo repo;

    public Ders_OgrenciEndpoints() {
        this.repo = new Ders_OgrenciRepo();
    }

    @GET
    @Path (value = "getAll")
    @Produces (value = MediaType.APPLICATION_JSON)
    public ArrayList< Ders_Ogrenci > getAll() {
        // localhost:9090/FirstRestfulService/dersogrenci/getAll
        return repo.getAll();
    }

    @GET
    @Path(value = "getById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Ders_Ogrenci getByIdPathParam(@PathParam (value = "id") Integer id)
    {
        // path param yazarsam bütün param 'lar set edilmiş olmak zorunda
        // localhost:9090/FirstRestfulService/dersogrenci/getById/1
        return repo.getById(id);
    }

    @DELETE
    @Path(value = "deleteById/{id}")
    public String deleteById(@PathParam(value = "id")Integer id)
    {
        // localhost:9090/FirstRestfulService/dersogrenci/deleteById
        if (repo.deleteById(id)){
            return "Başarı ile silindi.";
        }
        else {
            return "Başarı ile silinemedi.";
        }
    }

    @POST
    @Path(value = "save")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public String save(Ders_Ogrenci ders_ogrenci)
    {
        // localhost:9090/FirstRestfulService/dersogrenci/save
        repo.save(ders_ogrenci);
        return "Başarı ile kaydedildi";
    }
}
