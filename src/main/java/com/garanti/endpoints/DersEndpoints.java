package com.garanti.endpoints;

import com.garanti.model.Ders;
import com.garanti.model.Konu;
import com.garanti.repo.DersRepo;
import com.garanti.repo.KonuRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path(value = "ders")
public class DersEndpoints {
    private DersRepo repo;

    public DersEndpoints() {
        this.repo = new DersRepo();
    }

    @GET
    @Path (value = "getAll")
    @Produces (value = MediaType.APPLICATION_JSON)
    public ArrayList< Ders > getAll() {
        // localhost:9090/FirstRestfulService/konu/getAll
        return repo.getAll();
    }

    @GET
    @Path(value = "getById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Ders getByIdPathParam(@PathParam (value = "id") Integer id)
    {
        // path param yazarsam bütün param 'lar set edilmiş olmak zorunda
        // localhost:9090/FirstRestfulService/konu/getById/1
        return repo.getById(id);
    }

    @GET
    @Path(value = "deleteById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String deleteById(@PathParam(value = "id") Integer id) {
        // localhost:9090/FirstRestfulService/ders/deleteById
        repo.deleteById(id);
        return "Başarı ile silindi";
    }

    @POST
    @Path(value = "save")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public boolean save(Ders ders)
    {
        // localhost:9090/FirstRestfulService/konu/save
        return repo.save(ders);
    }
}
