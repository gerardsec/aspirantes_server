package sample;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.LongSummaryStatistics;

/**
 * Created by uamadm01 on 07/07/17.
 */
@Entity
@Table(name = "folio_examen", schema = "dbo", catalog = "aebdd04")
public class FolioExamenEntity {
    private Long folioExaCl;
    private String uVersion;
    private Byte tipoExamenCl;
    private Byte stipoExaACl;
    private Byte estadoFexCl;
    private String fCodHResXx;
    private String examenXx;
    private Integer usuarioCl;
    private Timestamp actualizaFe;
    private String trimestreCl;
    private Short aulaPNu;
    private Byte plantelCl;
    private Byte diaExamenNu;
    private Byte turnoPCl;
    private Byte asientoExNu;
    private String aspiranteCl;


       @Basic
    @Id
    @Column(name = "folio_exa_cl", nullable = false)
    public Long getFolioExaCl() {
        return folioExaCl;
    }

    public void setFolioExaCl(Long folioExaCl) {
        this.folioExaCl = folioExaCl;
    }

    @Basic
    @Column(name = "u_version", nullable = true, length = 1)
    public String getuVersion() {
        return uVersion;
    }

    public void setuVersion(String uVersion) {
        this.uVersion = uVersion;
    }

    @Basic
    @Column(name = "tipo_examen_cl", nullable = false)
    public Byte getTipoExamenCl() {
        return tipoExamenCl;
    }

    public void setTipoExamenCl(Byte tipoExamenCl) {
        this.tipoExamenCl = tipoExamenCl;
    }

    @Basic
    @Column(name = "stipo_exa_a_cl", nullable = false)
    public Byte getStipoExaACl() {
        return stipoExaACl;
    }

    public void setStipoExaACl(Byte stipoExaACl) {
        this.stipoExaACl = stipoExaACl;
    }

    @Basic
    @Column(name = "estado_fex_cl", nullable = false)
    public Byte getEstadoFexCl() {
        return estadoFexCl;
    }

    public void setEstadoFexCl(Byte estadoFexCl) {
        this.estadoFexCl = estadoFexCl;
    }

    @Basic
    @Column(name = "f_cod_h_res_xx", nullable = true, length = 8)
    public String getfCodHResXx() {
        return fCodHResXx;
    }

    public void setfCodHResXx(String fCodHResXx) {
        this.fCodHResXx = fCodHResXx;
    }

    @Basic
    @Column(name = "examen_xx", nullable = true, length = 8)
    public String getExamenXx() {
        return examenXx;
    }

    public void setExamenXx(String examenXx) {
        this.examenXx = examenXx;
    }

    @Basic
    @Column(name = "usuario_cl", nullable = false, precision = 0)
    public Integer getUsuarioCl() {
        return usuarioCl;
    }

    public void setUsuarioCl(Integer usuarioCl) {
        this.usuarioCl = usuarioCl;
    }

    @Basic
    @Column(name = "actualiza_fe", nullable = false)
    public Timestamp getActualizaFe() {
        return actualizaFe;
    }

    public void setActualizaFe(Timestamp actualizaFe) {
        this.actualizaFe = actualizaFe;
    }

    @Basic
    @Column(name = "trimestre_cl", nullable = true, length = 4)
    public String getTrimestreCl() {
        return trimestreCl;
    }

    public void setTrimestreCl(String trimestreCl) {
        this.trimestreCl = trimestreCl;
    }

    @Basic
    @Column(name = "aula_p_nu", nullable = true)
    public Short getAulaPNu() {
        return aulaPNu;
    }

    public void setAulaPNu(Short aulaPNu) {
        this.aulaPNu = aulaPNu;
    }

    @Basic
    @Column(name = "plantel_cl", nullable = true)
    public Byte getPlantelCl() {
        return plantelCl;
    }

    public void setPlantelCl(Byte plantelCl) {
        this.plantelCl = plantelCl;
    }

    @Basic
    @Column(name = "dia_examen_nu", nullable = true)
    public Byte getDiaExamenNu() {
        return diaExamenNu;
    }

    public void setDiaExamenNu(Byte diaExamenNu) {
        this.diaExamenNu = diaExamenNu;
    }

    @Basic
    @Column(name = "turno_p_cl", nullable = true)
    public Byte getTurnoPCl() {
        return turnoPCl;
    }

    public void setTurnoPCl(Byte turnoPCl) {
        this.turnoPCl = turnoPCl;
    }

    @Basic
    @Column(name = "asiento_ex_nu", nullable = true)
    public Byte getAsientoExNu() {
        return asientoExNu;
    }

    public void setAsientoExNu(Byte asientoExNu) {
        this.asientoExNu = asientoExNu;
    }

    @Basic
    @Column(name = "aspirante_cl", nullable = true, length = 15)
    public String getAspiranteCl() {
        return aspiranteCl;
    }

    public void setAspiranteCl(String aspiranteCl) {
        this.aspiranteCl = aspiranteCl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FolioExamenEntity that = (FolioExamenEntity) o;

        if (folioExaCl != null ? !folioExaCl.equals(that.folioExaCl) : that.folioExaCl != null) return false;
        if (uVersion != null ? !uVersion.equals(that.uVersion) : that.uVersion != null) return false;
        if (tipoExamenCl != null ? !tipoExamenCl.equals(that.tipoExamenCl) : that.tipoExamenCl != null) return false;
        if (stipoExaACl != null ? !stipoExaACl.equals(that.stipoExaACl) : that.stipoExaACl != null) return false;
        if (estadoFexCl != null ? !estadoFexCl.equals(that.estadoFexCl) : that.estadoFexCl != null) return false;
        if (fCodHResXx != null ? !fCodHResXx.equals(that.fCodHResXx) : that.fCodHResXx != null) return false;
        if (examenXx != null ? !examenXx.equals(that.examenXx) : that.examenXx != null) return false;
        if (usuarioCl != null ? !usuarioCl.equals(that.usuarioCl) : that.usuarioCl != null) return false;
        if (actualizaFe != null ? !actualizaFe.equals(that.actualizaFe) : that.actualizaFe != null) return false;
        if (trimestreCl != null ? !trimestreCl.equals(that.trimestreCl) : that.trimestreCl != null) return false;
        if (aulaPNu != null ? !aulaPNu.equals(that.aulaPNu) : that.aulaPNu != null) return false;
        if (plantelCl != null ? !plantelCl.equals(that.plantelCl) : that.plantelCl != null) return false;
        if (diaExamenNu != null ? !diaExamenNu.equals(that.diaExamenNu) : that.diaExamenNu != null) return false;
        if (turnoPCl != null ? !turnoPCl.equals(that.turnoPCl) : that.turnoPCl != null) return false;
        if (asientoExNu != null ? !asientoExNu.equals(that.asientoExNu) : that.asientoExNu != null) return false;
        if (aspiranteCl != null ? !aspiranteCl.equals(that.aspiranteCl) : that.aspiranteCl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = folioExaCl != null ? folioExaCl.hashCode() : 0;
        result = 31 * result + (uVersion != null ? uVersion.hashCode() : 0);
        result = 31 * result + (tipoExamenCl != null ? tipoExamenCl.hashCode() : 0);
        result = 31 * result + (stipoExaACl != null ? stipoExaACl.hashCode() : 0);
        result = 31 * result + (estadoFexCl != null ? estadoFexCl.hashCode() : 0);
        result = 31 * result + (fCodHResXx != null ? fCodHResXx.hashCode() : 0);
        result = 31 * result + (examenXx != null ? examenXx.hashCode() : 0);
        result = 31 * result + (usuarioCl != null ? usuarioCl.hashCode() : 0);
        result = 31 * result + (actualizaFe != null ? actualizaFe.hashCode() : 0);
        result = 31 * result + (trimestreCl != null ? trimestreCl.hashCode() : 0);
        result = 31 * result + (aulaPNu != null ? aulaPNu.hashCode() : 0);
        result = 31 * result + (plantelCl != null ? plantelCl.hashCode() : 0);
        result = 31 * result + (diaExamenNu != null ? diaExamenNu.hashCode() : 0);
        result = 31 * result + (turnoPCl != null ? turnoPCl.hashCode() : 0);
        result = 31 * result + (asientoExNu != null ? asientoExNu.hashCode() : 0);
        result = 31 * result + (aspiranteCl != null ? aspiranteCl.hashCode() : 0);
        return result;
    }
}
