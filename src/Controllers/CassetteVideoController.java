/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.CassetteVideoDao;
import Models.CassetteVideoModel;
import Models.ResultSetModel;
import Util.ValidationUtil;

/**
 *
 * @author MHD
 */
public class CassetteVideoController {
    CassetteVideoModel cassette = new CassetteVideoModel();
    CassetteVideoDao dao = new CassetteVideoDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 

    public void setCassette(CassetteVideoModel journal) {
        this.cassette = journal;
    }

    public void setDao(CassetteVideoDao dao) {
        this.dao = dao;
    }

    public void setModel(ResultSetModel model) {
        this.model = model;
    }

    public void setValidation(ValidationUtil validation) {
        this.validation = validation;
    }

    public CassetteVideoModel getCassette() {
        return cassette;
    }

    public CassetteVideoDao getDao() {
        return dao;
    }

    public ResultSetModel getModel() {
        return model;
    }

    public ValidationUtil getValidation() {
        return validation;
    }

}
