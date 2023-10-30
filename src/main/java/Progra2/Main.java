package Progra2;

import Progra2.DTO.Estudiantes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        try{
            Estudiantes estudiante = new Estudiantes();
            estudiante.setNombre("Melvin");
            estudiante.setApellido("Tzun");
            session.beginTransaction();
            System.out.println(estudiante.getIdestudiante());
            session.save(estudiante);
            session.getTransaction().commit();
            System.out.println("Se inicio la conexion");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}