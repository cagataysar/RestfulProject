package com.garanti.endpoints;


import com.garanti.model.Ogretmen;
import com.garanti.repo.OgretmenRepo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

@Path(value = "ogretmen")
public class OgretmenEndpoints
{
    private OgretmenRepo repo;

    public OgretmenEndpoints()
    {
        this.repo = new OgretmenRepo();
    }

    @GET
    @Path(value = "getAll")
    @Produces(value = MediaType.APPLICATION_JSON)
    public ArrayList<Ogretmen> getAll()
    {
        // localhost:9090/FirstRestfulService/ogretmen/getAll
        return repo.getAll();
    }

    @GET
    @Path(value = "getById")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Ogretmen getByIdQueryParam(@QueryParam(value = "id") Integer id)
    {
        // localhost:9090/FirstRestfulService/ogretmen/getById?id=1
        return repo.getById(id);
    }

    @GET
    @Path(value = "getById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Ogretmen getByIdPathParam(@PathParam(value = "id") Integer id)
    {
        // path param yazarsam bütün param 'lar set edilmiş olmak zorunda
        // localhost:9090/FirstRestfulService/ogretmen/getById/1
        return repo.getById(id);
    }

    @DELETE
    @Path(value = "deleteById/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public String deleteById(@PathParam(value = "id") Integer id) {
        // localhost:9090/FirstRestfulService/ogretmen/deleteById
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
    public String save(Ogretmen ogretmen)
    {
        // localhost:9090/FirstRestfulService/ogretmen/save
        repo.save(ogretmen);
        return "Başarı ile kaydedildi";
    }
}