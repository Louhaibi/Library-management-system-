/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.PeriodicDao;
import Models.PeriodicModel;
import Models.ResultSetModel;
import Util.ValidationUtil;

/**
 *
 * @author MHD
 */
public class PeriodicController {
    PeriodicModel periodic = new PeriodicModel();
    PeriodicDao dao = new PeriodicDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 

    public PeriodicModel getPeriodic() {
        return periodic;
    }

    public PeriodicDao getDao() {
        return dao;
    }

    public ResultSetModel getModel() {
        return model;
    }

    public ValidationUtil getValidation() {
        return validation;
    }

    public void setPeriodic(PeriodicModel periodic) {
        this.periodic = periodic;
    }

    public void setDao(PeriodicDao dao) {
        this.dao = dao;
    }

    public void setModel(ResultSetModel model) {
        this.model = model;
    }

    public void setValidation(ValidationUtil validation) {
        this.validation = validation;
    }


}
