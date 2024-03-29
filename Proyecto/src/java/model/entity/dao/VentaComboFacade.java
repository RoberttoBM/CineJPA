/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entity.VentaCombo;

/**
 *
 * @author PC13
 */
@Stateless
public class VentaComboFacade extends AbstractFacade<VentaCombo> {

    @PersistenceContext(unitName = "CinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaComboFacade() {
        super(VentaCombo.class);
    }
    
}
