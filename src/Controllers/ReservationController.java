/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.DisqueCompactDao;
import Dao.ListeAttenteDAO;
import Dao.LivreDao;
import Dao.ReservationDao;
import Models.ReservationModel;
import Models.ResultSetModel;
import Util.ValidationUtil;

/**
 *
 * @author MHD
 */
public class ReservationController {
    ReservationModel reservation = new ReservationModel();
    ReservationDao dao = new ReservationDao();
    ResultSetModel model = new ResultSetModel();
    ValidationUtil validation = new ValidationUtil(); 
    LivreDao daoLivreRegulier = new LivreDao();
    DisqueCompactDao  daoDisqueCompact = new DisqueCompactDao();
    ListeAttenteDAO ladao = new ListeAttenteDAO();

    public void setDaoLivreRegulier(LivreDao daoLivreRegulier) {
        this.daoLivreRegulier = daoLivreRegulier;
    }

    public void setDaoDisqueCompact(DisqueCompactDao daoDisqueCompact) {
        this.daoDisqueCompact = daoDisqueCompact;
    }

    public LivreDao getDaoLivreRegulier() {
        return daoLivreRegulier;
    }

    public DisqueCompactDao getDaoDisqueCompact() {
        return daoDisqueCompact;
    }

    public void setReservation(ReservationModel reservation) {
        this.reservation = reservation;
    }

    public void setDao(ReservationDao dao) {
        this.dao = dao;
    }

    public void setModel(ResultSetModel model) {
        this.model = model;
    }

    public void setValidation(ValidationUtil validation) {
        this.validation = validation;
    }


    public ReservationModel getReservation() {
        return reservation;
    }

    public ReservationDao getDao() {
        return dao;
    }

    public ResultSetModel getModel() {
        return model;
    }

    public ValidationUtil getValidation() {
        return validation;
    }

    public ListeAttenteDAO getLadao() {
        return ladao;
    }

    public void setLadao(ListeAttenteDAO ladao) {
        this.ladao = ladao;
    }




}
