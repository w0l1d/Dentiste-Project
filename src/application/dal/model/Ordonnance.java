package application.dal.model;

import application.dal.dao.MedicsDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;



public class Ordonnance implements Comparable<Ordonnance> {

   private Long id;
   private Long visId;
   private Date date;
   private Vector<Medicament> medics;



    public Ordonnance(ResultSet rst) throws SQLException {
        setId(rst.getLong("ord_id"));
        setVisId(rst.getLong("fvst_id"));
        setDate(rst.getDate("ord_date"));
    }


    public Ordonnance(ResultSet rst, MedicsDao medDao) throws SQLException {
        this(rst);
        setMedics(medDao.findByOrd(this.id));
    }

    public Ordonnance(Long id, Long visId, Date date) {
        this.id = id;
        this.visId = visId;
        this.date = date;
    }



    public Ordonnance(Long id, Long visId, Date date, MedicsDao medDao) {
        this.id = id;
        this.visId = visId;
        this.date = date;
        setMedics(medDao.findByOrd(this.id));
    }

    public Vector<Medicament> getMedics() {
        return medics;
    }

    public void setMedics(Vector<Medicament> medics) {
        this.medics = medics;
    }


    public void setMedics(MedicsDao medDao) {
        setMedics(medDao.findByOrd(this.getId()));
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Long getVisId() {
        return visId;
    }

    public void setVisId(Long visId) {
        this.visId = visId;
    }

    public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }


   public String getPdfTitle() {
        return "Ordonnance -" +getId()+"- :";
   }


    @Override
    public int compareTo(Ordonnance o) {
        return (int) (this.id - o.getId());
    }
}