/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.local.facade;

import com.library.model.Library;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author syslife01
 */
@Local
public interface LibraryFacadeLocal {

    void create(Library library);

    void edit(Library library);

    void remove(Library library);

    Library find(Object id);

    List<Library> findAll();

    List<Library> findRange(int[] range);

    int count();
    
}
