

package com.jc.elementos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class TestTodo {

  
    public static void main(String[] args) {
        //Abrir la seccion-factory
       SessionFactory factory=HibernateUtilidades.getSessionFactory();
                      
                 Session sesion=  factory.openSession();
        //Empezar una transa accion
            Transaction tranza= sesion.beginTransaction();
        //Haremos un insert
             Trabajador t= new Trabajador("sandra","franco","arzate");
             sesion.save(t);
             //Liberamos la transacion
             tranza.commit();
             //Cerramos la secion, es decir devolvemos la libertad al borrador
             sesion.close();
    }
    
}
