/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.local.facade;

import com.library.model.Library;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author syslife01
 */
@Stateless
public class LibraryFacade extends AbstractFacade<Library> implements LibraryFacadeLocal {

    @PersistenceContext(unitName = "library_banckend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibraryFacade() {
        super(Library.class);
    }
    
}
