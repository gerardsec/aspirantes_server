package sample;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "aspirante_l", schema = "dbo", catalog = "aebdd04")
public class AspiranteLEntity {
    private String aspiranteCl;
    private String uVersion;
    private Boolean sancionadoLo;
    private String apeMAspXx;
    private String aspiranteNo;
    private String apePAspXx;
    private String calleYNumXx;
    private String coloniaXx;
    private String sexoAspXx;
    private String telefonoXx;
    private String ladaXx;
    private String codigoPosXx;
    private Integer usuarioCl;
    private Timestamp nacimientoFe;
    private Timestamp actualizaFe;
    private String correoEleXx;
    private String curpXx;
    private String mexicanoXx;

    @Basic
    @Id
    @Column(name = "aspirante_cl", nullable = false, length = 15)
    public String getAspiranteCl() {
        return aspiranteCl;
    }

    public void setAspiranteCl(String aspiranteCl) {
        this.aspiranteCl = aspiranteCl;
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
    @Column(name = "sancionado_lo", nullable = false)
    public Boolean getSancionadoLo() {
        return sancionadoLo;
    }

    public void setSancionadoLo(Boolean sancionadoLo) {
        this.sancionadoLo = sancionadoLo;
    }

    @Basic
    @Column(name = "ape_m_asp_xx", nullable = false, length = 50)
    public String getApeMAspXx() {
        return apeMAspXx;
    }

    public void setApeMAspXx(String apeMAspXx) {
        this.apeMAspXx = apeMAspXx;
    }

    @Basic
    @Column(name = "aspirante_no", nullable = false, length = 50)
    public String getAspiranteNo() {
        return aspiranteNo;
    }

    public void setAspiranteNo(String aspiranteNo) {
        this.aspiranteNo = aspiranteNo;
    }

    @Basic
    @Column(name = "ape_p_asp_xx", nullable = true, length = 50)
    public String getApePAspXx() {
        return apePAspXx;
    }

    public void setApePAspXx(String apePAspXx) {
        this.apePAspXx = apePAspXx;
    }

    @Basic
    @Column(name = "calle_y_num_xx", nullable = false, length = 50)
    public String getCalleYNumXx() {
        return calleYNumXx;
    }

    public void setCalleYNumXx(String calleYNumXx) {
        this.calleYNumXx = calleYNumXx;
    }

    @Basic
    @Column(name = "colonia_xx", nullable = false, length = 30)
    public String getColoniaXx() {
        return coloniaXx;
    }

    public void setColoniaXx(String coloniaXx) {
        this.coloniaXx = coloniaXx;
    }

    @Basic
    @Column(name = "sexo_asp_xx", nullable = false, length = 1)
    public String getSexoAspXx() {
        return sexoAspXx;
    }

    public void setSexoAspXx(String sexoAspXx) {
        this.sexoAspXx = sexoAspXx;
    }

    @Basic
    @Column(name = "telefono_xx", nullable = true, length = 15)
    public String getTelefonoXx() {
        return telefonoXx;
    }

    public void setTelefonoXx(String telefonoXx) {
        this.telefonoXx = telefonoXx;
    }

    @Basic
    @Column(name = "lada_xx", nullable = true, length = 5)
    public String getLadaXx() {
        return ladaXx;
    }

    public void setLadaXx(String ladaXx) {
        this.ladaXx = ladaXx;
    }

    @Basic
    @Column(name = "codigo_pos_xx", nullable = false, length = 5)
    public String getCodigoPosXx() {
        return codigoPosXx;
    }

    public void setCodigoPosXx(String codigoPosXx) {
        this.codigoPosXx = codigoPosXx;
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
    @Column(name = "nacimiento_fe", nullable = false)
    public Timestamp getNacimientoFe() {
        return nacimientoFe;
    }

    public void setNacimientoFe(Timestamp nacimientoFe) {
        this.nacimientoFe = nacimientoFe;
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
    @Column(name = "correo_ele_xx", nullable = true, length = 80)
    public String getCorreoEleXx() {
        return correoEleXx;
    }

    public void setCorreoEleXx(String correoEleXx) {
        this.correoEleXx = correoEleXx;
    }

    @Basic
    @Column(name = "curp_xx", nullable = true, length = 20)
    public String getCurpXx() {
        return curpXx;
    }

    public void setCurpXx(String curpXx) {
        this.curpXx = curpXx;
    }

    @Basic
    @Column(name = "mexicano_xx", nullable = true, length = 1)
    public String getMexicanoXx() {
        return mexicanoXx;
    }

    public void setMexicanoXx(String mexicanoXx) {
        this.mexicanoXx = mexicanoXx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AspiranteLEntity that = (AspiranteLEntity) o;

        if (aspiranteCl != null ? !aspiranteCl.equals(that.aspiranteCl) : that.aspiranteCl != null) return false;
        if (uVersion != null ? !uVersion.equals(that.uVersion) : that.uVersion != null) return false;
        if (sancionadoLo != null ? !sancionadoLo.equals(that.sancionadoLo) : that.sancionadoLo != null) return false;
        if (apeMAspXx != null ? !apeMAspXx.equals(that.apeMAspXx) : that.apeMAspXx != null) return false;
        if (aspiranteNo != null ? !aspiranteNo.equals(that.aspiranteNo) : that.aspiranteNo != null) return false;
        if (apePAspXx != null ? !apePAspXx.equals(that.apePAspXx) : that.apePAspXx != null) return false;
        if (calleYNumXx != null ? !calleYNumXx.equals(that.calleYNumXx) : that.calleYNumXx != null) return false;
        if (coloniaXx != null ? !coloniaXx.equals(that.coloniaXx) : that.coloniaXx != null) return false;
        if (sexoAspXx != null ? !sexoAspXx.equals(that.sexoAspXx) : that.sexoAspXx != null) return false;
        if (telefonoXx != null ? !telefonoXx.equals(that.telefonoXx) : that.telefonoXx != null) return false;
        if (ladaXx != null ? !ladaXx.equals(that.ladaXx) : that.ladaXx != null) return false;
        if (codigoPosXx != null ? !codigoPosXx.equals(that.codigoPosXx) : that.codigoPosXx != null) return false;
        if (usuarioCl != null ? !usuarioCl.equals(that.usuarioCl) : that.usuarioCl != null) return false;
        if (nacimientoFe != null ? !nacimientoFe.equals(that.nacimientoFe) : that.nacimientoFe != null) return false;
        if (actualizaFe != null ? !actualizaFe.equals(that.actualizaFe) : that.actualizaFe != null) return false;
        if (correoEleXx != null ? !correoEleXx.equals(that.correoEleXx) : that.correoEleXx != null) return false;
        if (curpXx != null ? !curpXx.equals(that.curpXx) : that.curpXx != null) return false;
        if (mexicanoXx != null ? !mexicanoXx.equals(that.mexicanoXx) : that.mexicanoXx != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aspiranteCl != null ? aspiranteCl.hashCode() : 0;
        result = 31 * result + (uVersion != null ? uVersion.hashCode() : 0);
        result = 31 * result + (sancionadoLo != null ? sancionadoLo.hashCode() : 0);
        result = 31 * result + (apeMAspXx != null ? apeMAspXx.hashCode() : 0);
        result = 31 * result + (aspiranteNo != null ? aspiranteNo.hashCode() : 0);
        result = 31 * result + (apePAspXx != null ? apePAspXx.hashCode() : 0);
        result = 31 * result + (calleYNumXx != null ? calleYNumXx.hashCode() : 0);
        result = 31 * result + (coloniaXx != null ? coloniaXx.hashCode() : 0);
        result = 31 * result + (sexoAspXx != null ? sexoAspXx.hashCode() : 0);
        result = 31 * result + (telefonoXx != null ? telefonoXx.hashCode() : 0);
        result = 31 * result + (ladaXx != null ? ladaXx.hashCode() : 0);
        result = 31 * result + (codigoPosXx != null ? codigoPosXx.hashCode() : 0);
        result = 31 * result + (usuarioCl != null ? usuarioCl.hashCode() : 0);
        result = 31 * result + (nacimientoFe != null ? nacimientoFe.hashCode() : 0);
        result = 31 * result + (actualizaFe != null ? actualizaFe.hashCode() : 0);
        result = 31 * result + (correoEleXx != null ? correoEleXx.hashCode() : 0);
        result = 31 * result + (curpXx != null ? curpXx.hashCode() : 0);
        result = 31 * result + (mexicanoXx != null ? mexicanoXx.hashCode() : 0);
        return result;
    }
}
