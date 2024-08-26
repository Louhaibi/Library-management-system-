/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.CategorieDao;
import Models.CategorieModel;
import Models.ResultSetModel;
import Util.ValidationUtil;

/**
 *
 * @author MHD
 */
public class CategorieController {
    CategorieModel categorie = new CategorieModel();
    CategorieDao dao = new CategorieDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 

    public CategorieModel getCategorie() {
        return categorie;
    }

    public CategorieDao getDao() {
        return dao;
    }

    public ResultSetModel getModel() {
        return model;
    }

    public ValidationUtil getValidation() {
        return validation;
    }

    public void setCategorie(CategorieModel categorie) {
        this.categorie = categorie;
    }

    public void setDao(CategorieDao dao) {
        this.dao = dao;
    }

    public void setModel(ResultSetModel model) {
        this.model = model;
    }

    public void setValidation(ValidationUtil validation) {
        this.validation = validation;
    }



}
