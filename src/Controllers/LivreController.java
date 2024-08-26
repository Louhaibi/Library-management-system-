/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.LivreDao;
import Models.ResultSetModel;
import Models.livreModel;
import Util.ValidationUtil;

/**
 *
 * @author MHD
 */
public class LivreController {
    livreModel livre = new livreModel();
    LivreDao dao = new LivreDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 

    public livreModel getLivre() {
        return livre;
    }

    public void setLivre(livreModel livre) {
        this.livre = livre;
    }

    public LivreDao getDao() {
        return dao;
    }

    public void setDao(LivreDao dao) {
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
