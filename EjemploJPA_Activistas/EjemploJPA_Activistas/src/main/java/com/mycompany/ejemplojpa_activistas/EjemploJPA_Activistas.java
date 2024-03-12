/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojpa_activistas;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetos.*;

/**
 *
 * @author Laboratorios
 */
public class EjemploJPA_Activistas {

    public static void main(String[] args) {
        EntityManagerFactory mf = Persistence.createEntityManagerFactory("com.mycompany_EjemploJPA_Activistas_jar_1.0-SNAPSHOTPU");
        EntityManager em = mf.createEntityManager();
        em.getTransaction().begin();
        
        /*
        CREAR ACTIVISTA
        Activista activista = new Activista("Ramiro","Perez","Lopez","6444778899",new GregorianCalendar(2020,1,15));
        em.persist(activista);
        em.getTransaction().commit();
        */
        
        /*
        BUSCAR
        Activista a = em.find(Activista.class, 3L);
        if(a != null){
            System.out.println(a.toString());
        }
        else{
            System.out.println("Activista no encontrado");
        }
        em.getTransaction().commit();
        */
        
        /*
        ACTUALIZAR
        Activista a = em.find(Activista.class, 3L);
        if(a != null){
            a.setApMaterno("Dominguez");
            a.setTelefono("6441686923");
            em.persist(a);
        }
        else{
            System.out.println("Activista no encontrado");
        }
        em.getTransaction().commit();
        */
        
        /*
        ELIMINAR
        Activista a = em.find(Activista.class, 3L);
        if(a != null){
            em.remove(a);
            System.out.println("Activista eliminado :D");
        }
        else{
            System.out.println("Activista no encontrado");
        }
        em.getTransaction().commit();
        */
        
        /*
        BUSCAR 
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Activista.class));
        Query query = em.createQuery(criteria);
        List<Activista> activistas = query.getResultList();
        for (Activista activista : activistas){
            System.out.println(activista.toString());
        }
        em.getTransaction().commit();
        */
        
        /*
        Cliente c = new Cliente("Ramiro","Perez","Lopez");
        Direccion d = new Direccion("Wallaby","Osuna","85000","300");
        List<Direccion> ds = new ArrayList();
        ds.add(d);
        c.setDirecciones(ds);
        em.persist(c);
        em.getTransaction().commit();
        */
        
        /*
        Cliente c = new Cliente();
        c.setNombres("Pancho");
        c.setApPaterno("Pantera");
        c.setApMaterno("Nuñez");
        Direccion d = new Direccion("Wallaby","Osuna","85000","300", c);
        List<Direccion> ds = new ArrayList();
        ds.add(d);
        c.setDirecciones(ds);
        em.persist(c);
        em.getTransaction().commit();
        */
        
    }
}
    
