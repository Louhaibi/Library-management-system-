/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.ExemplaireDao;
import Models.ExemplaireModel;
import Models.ResultSetModel;
import Util.ValidationUtil;



/**
 *
 * @author Asus
 */
public class ExemplaireController {
    
    ExemplaireModel exemplaire=new ExemplaireModel();
    ExemplaireDao dao=new ExemplaireDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 

    public ExemplaireModel getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(ExemplaireModel exemplaire) {
        this.exemplaire = exemplaire;
    }

    public ExemplaireDao getDao() {
        return dao;
    }

    public void setDao(ExemplaireDao dao) {
        this.dao = dao;
    }

    public ResultSetModel getModel() {
        return model;
    }

    public void setModel(ResultSetModel model) {
        this.model = model;
    }

    public ValidationUtil getValidation() {
        return validation;
    }

    public void setValidation(ValidationUtil validation) {
        this.validation = validation;
    }
    
    
    
            
            
    
    
}
