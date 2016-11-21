/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.facade.remote;

import com.library.model.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author syslife01
 */
@Remote
public interface BookInterfazRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/bookinterfazremote";
    
    void create(Book book);

    void edit(Book book);

    void remove(Book book);

    Book find(Object id);

    List<Book> findAll();

    List<Book> findRange(int[] range);

    int count();
}
