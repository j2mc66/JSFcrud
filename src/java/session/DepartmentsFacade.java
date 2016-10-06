/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Departments;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author james
 */
@Stateless
public class DepartmentsFacade extends AbstractFacade<Departments> {
    @PersistenceContext(unitName = "reservasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartmentsFacade() {
        super(Departments.class);
    }
    
}
