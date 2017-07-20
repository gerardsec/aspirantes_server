package sample;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by uamadm01 on 07/07/17.
 */
@Entity
@Table(name = "aspirante_r", schema = "dbo", catalog = "aebdd04")
public class AspiranteREntity {
    private Long referenciaNu;
    private String uVersion;
    private String aspiranteCl;
    private Boolean pagoRegLo;
    private Boolean encSeCLo;
    private Boolean fotoRecLo;
    private Integer folioExaCl;
    private Integer usuarioCl;
    private Timestamp actualizaFe;
    private Timestamp pagoFe;
    private Timestamp encCoFe;
    private Timestamp fotoRecFe;
    private Timestamp folioAsgFe;
    private Timestamp registroFe;
    private String archivoXx;
    private String servFotoXx;
    private Boolean lAsgFolLo;
    private Byte revDobMatCl;
    private Byte bancoPagoCl;
    private Byte edoVFotoCl;
    private Byte edoVPagoCl;
    private Double cantidadNu;
    private Double cantidadPNu;
    private String refPagoBxXx;
    private String refPagoBaXx;
    private String refPagoSsXx;
    private Timestamp genRefBanFe;
    private Integer usuarioRfCl;
    private Timestamp actualRfFe;
    private Timestamp impCompFe;

    @Basic
    @Column(name = "referencia_nu", nullable = false, precision = 0)
    public Long getReferenciaNu() {
        return referenciaNu;
    }

    public void setReferenciaNu(Long referenciaNu) {
        this.referenciaNu = referenciaNu;
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
    @Id
    @Column(name = "aspirante_cl", nullable = false, length = 15)
    public String getAspiranteCl() {
        return aspiranteCl;
    }

    public void setAspiranteCl(String aspiranteCl) {
        this.aspiranteCl = aspiranteCl;
    }

    @Basic
    @Column(name = "pago_reg_lo", nullable = false)
    public Boolean getPagoRegLo() {
        return pagoRegLo;
    }

    public void setPagoRegLo(Boolean pagoRegLo) {
        this.pagoRegLo = pagoRegLo;
    }

    @Basic
    @Column(name = "enc_se_c_lo", nullable = false)
    public Boolean getEncSeCLo() {
        return encSeCLo;
    }

    public void setEncSeCLo(Boolean encSeCLo) {
        this.encSeCLo = encSeCLo;
    }

    @Basic
    @Column(name = "foto_rec_lo", nullable = false)
    public Boolean getFotoRecLo() {
        return fotoRecLo;
    }

    public void setFotoRecLo(Boolean fotoRecLo) {
        this.fotoRecLo = fotoRecLo;
    }

    @Basic
    @Column(name = "folio_exa_cl", nullable = true)
    public Integer getFolioExaCl() {
        return folioExaCl;
    }

    public void setFolioExaCl(Integer folioExaCl) {
        this.folioExaCl = folioExaCl;
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
    @Column(name = "pago_fe", nullable = true)
    public Timestamp getPagoFe() {
        return pagoFe;
    }

    public void setPagoFe(Timestamp pagoFe) {
        this.pagoFe = pagoFe;
    }

    @Basic
    @Column(name = "enc_co_fe", nullable = true)
    public Timestamp getEncCoFe() {
        return encCoFe;
    }

    public void setEncCoFe(Timestamp encCoFe) {
        this.encCoFe = encCoFe;
    }

    @Basic
    @Column(name = "foto_rec_fe", nullable = true)
    public Timestamp getFotoRecFe() {
        return fotoRecFe;
    }

    public void setFotoRecFe(Timestamp fotoRecFe) {
        this.fotoRecFe = fotoRecFe;
    }

    @Basic
    @Column(name = "folio_asg_fe", nullable = true)
    public Timestamp getFolioAsgFe() {
        return folioAsgFe;
    }

    public void setFolioAsgFe(Timestamp folioAsgFe) {
        this.folioAsgFe = folioAsgFe;
    }

    @Basic
    @Column(name = "registro_fe", nullable = true)
    public Timestamp getRegistroFe() {
        return registroFe;
    }

    public void setRegistroFe(Timestamp registroFe) {
        this.registroFe = registroFe;
    }

    @Basic
    @Column(name = "archivo_xx", nullable = true, length = 16)
    public String getArchivoXx() {
        return archivoXx;
    }

    public void setArchivoXx(String archivoXx) {
        this.archivoXx = archivoXx;
    }

    @Basic
    @Column(name = "serv_foto_xx", nullable = true, length = 25)
    public String getServFotoXx() {
        return servFotoXx;
    }

    public void setServFotoXx(String servFotoXx) {
        this.servFotoXx = servFotoXx;
    }

    @Basic
    @Column(name = "l_asg_fol_lo", nullable = false)
    public Boolean getlAsgFolLo() {
        return lAsgFolLo;
    }

    public void setlAsgFolLo(Boolean lAsgFolLo) {
        this.lAsgFolLo = lAsgFolLo;
    }

    @Basic
    @Column(name = "rev_dob_mat_cl", nullable = false)
    public Byte getRevDobMatCl() {
        return revDobMatCl;
    }

    public void setRevDobMatCl(Byte revDobMatCl) {
        this.revDobMatCl = revDobMatCl;
    }

    @Basic
    @Column(name = "banco_pago_cl", nullable = false)
    public Byte getBancoPagoCl() {
        return bancoPagoCl;
    }

    public void setBancoPagoCl(Byte bancoPagoCl) {
        this.bancoPagoCl = bancoPagoCl;
    }

    @Basic
    @Column(name = "edo_v_foto_cl", nullable = false)
    public Byte getEdoVFotoCl() {
        return edoVFotoCl;
    }

    public void setEdoVFotoCl(Byte edoVFotoCl) {
        this.edoVFotoCl = edoVFotoCl;
    }

    @Basic
    @Column(name = "edo_v_pago_cl", nullable = false)
    public Byte getEdoVPagoCl() {
        return edoVPagoCl;
    }

    public void setEdoVPagoCl(Byte edoVPagoCl) {
        this.edoVPagoCl = edoVPagoCl;
    }

    @Basic
    @Column(name = "cantidad_nu", nullable = true, precision = 0)
    public Double getCantidadNu() {
        return cantidadNu;
    }

    public void setCantidadNu(Double cantidadNu) {
        this.cantidadNu = cantidadNu;
    }

    @Basic
    @Column(name = "cantidad_p_nu", nullable = true, precision = 0)
    public Double getCantidadPNu() {
        return cantidadPNu;
    }

    public void setCantidadPNu(Double cantidadPNu) {
        this.cantidadPNu = cantidadPNu;
    }

    @Basic
    @Column(name = "ref_pago_bx_xx", nullable = true, length = 40)
    public String getRefPagoBxXx() {
        return refPagoBxXx;
    }

    public void setRefPagoBxXx(String refPagoBxXx) {
        this.refPagoBxXx = refPagoBxXx;
    }

    @Basic
    @Column(name = "ref_pago_ba_xx", nullable = true, length = 40)
    public String getRefPagoBaXx() {
        return refPagoBaXx;
    }

    public void setRefPagoBaXx(String refPagoBaXx) {
        this.refPagoBaXx = refPagoBaXx;
    }

    @Basic
    @Column(name = "ref_pago_ss_xx", nullable = true, length = 40)
    public String getRefPagoSsXx() {
        return refPagoSsXx;
    }

    public void setRefPagoSsXx(String refPagoSsXx) {
        this.refPagoSsXx = refPagoSsXx;
    }

    @Basic
    @Column(name = "gen_ref_ban_fe", nullable = true)
    public Timestamp getGenRefBanFe() {
        return genRefBanFe;
    }

    public void setGenRefBanFe(Timestamp genRefBanFe) {
        this.genRefBanFe = genRefBanFe;
    }

    @Basic
    @Column(name = "usuario_rf_cl", nullable = true, precision = 0)
    public Integer getUsuarioRfCl() {
        return usuarioRfCl;
    }

    public void setUsuarioRfCl(Integer usuarioRfCl) {
        this.usuarioRfCl = usuarioRfCl;
    }

    @Basic
    @Column(name = "actual_rf_fe", nullable = true)
    public Timestamp getActualRfFe() {
        return actualRfFe;
    }

    public void setActualRfFe(Timestamp actualRfFe) {
        this.actualRfFe = actualRfFe;
    }

    @Basic
    @Column(name = "imp_comp_fe", nullable = true)
    public Timestamp getImpCompFe() {
        return impCompFe;
    }


    public void setImpCompFe(Timestamp impCompFe) {
        this.impCompFe = impCompFe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AspiranteREntity that = (AspiranteREntity) o;

        if (referenciaNu != null ? !referenciaNu.equals(that.referenciaNu) : that.referenciaNu != null) return false;
        if (uVersion != null ? !uVersion.equals(that.uVersion) : that.uVersion != null) return false;
        if (aspiranteCl != null ? !aspiranteCl.equals(that.aspiranteCl) : that.aspiranteCl != null) return false;
        if (pagoRegLo != null ? !pagoRegLo.equals(that.pagoRegLo) : that.pagoRegLo != null) return false;
        if (encSeCLo != null ? !encSeCLo.equals(that.encSeCLo) : that.encSeCLo != null) return false;
        if (fotoRecLo != null ? !fotoRecLo.equals(that.fotoRecLo) : that.fotoRecLo != null) return false;
        if (folioExaCl != null ? !folioExaCl.equals(that.folioExaCl) : that.folioExaCl != null) return false;
        if (usuarioCl != null ? !usuarioCl.equals(that.usuarioCl) : that.usuarioCl != null) return false;
        if (actualizaFe != null ? !actualizaFe.equals(that.actualizaFe) : that.actualizaFe != null) return false;
        if (pagoFe != null ? !pagoFe.equals(that.pagoFe) : that.pagoFe != null) return false;
        if (encCoFe != null ? !encCoFe.equals(that.encCoFe) : that.encCoFe != null) return false;
        if (fotoRecFe != null ? !fotoRecFe.equals(that.fotoRecFe) : that.fotoRecFe != null) return false;
        if (folioAsgFe != null ? !folioAsgFe.equals(that.folioAsgFe) : that.folioAsgFe != null) return false;
        if (registroFe != null ? !registroFe.equals(that.registroFe) : that.registroFe != null) return false;
        if (archivoXx != null ? !archivoXx.equals(that.archivoXx) : that.archivoXx != null) return false;
        if (servFotoXx != null ? !servFotoXx.equals(that.servFotoXx) : that.servFotoXx != null) return false;
        if (lAsgFolLo != null ? !lAsgFolLo.equals(that.lAsgFolLo) : that.lAsgFolLo != null) return false;
        if (revDobMatCl != null ? !revDobMatCl.equals(that.revDobMatCl) : that.revDobMatCl != null) return false;
        if (bancoPagoCl != null ? !bancoPagoCl.equals(that.bancoPagoCl) : that.bancoPagoCl != null) return false;
        if (edoVFotoCl != null ? !edoVFotoCl.equals(that.edoVFotoCl) : that.edoVFotoCl != null) return false;
        if (edoVPagoCl != null ? !edoVPagoCl.equals(that.edoVPagoCl) : that.edoVPagoCl != null) return false;
        if (cantidadNu != null ? !cantidadNu.equals(that.cantidadNu) : that.cantidadNu != null) return false;
        if (cantidadPNu != null ? !cantidadPNu.equals(that.cantidadPNu) : that.cantidadPNu != null) return false;
        if (refPagoBxXx != null ? !refPagoBxXx.equals(that.refPagoBxXx) : that.refPagoBxXx != null) return false;
        if (refPagoBaXx != null ? !refPagoBaXx.equals(that.refPagoBaXx) : that.refPagoBaXx != null) return false;
        if (refPagoSsXx != null ? !refPagoSsXx.equals(that.refPagoSsXx) : that.refPagoSsXx != null) return false;
        if (genRefBanFe != null ? !genRefBanFe.equals(that.genRefBanFe) : that.genRefBanFe != null) return false;
        if (usuarioRfCl != null ? !usuarioRfCl.equals(that.usuarioRfCl) : that.usuarioRfCl != null) return false;
        if (actualRfFe != null ? !actualRfFe.equals(that.actualRfFe) : that.actualRfFe != null) return false;
        if (impCompFe != null ? !impCompFe.equals(that.impCompFe) : that.impCompFe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = referenciaNu != null ? referenciaNu.hashCode() : 0;
        result = 31 * result + (uVersion != null ? uVersion.hashCode() : 0);
        result = 31 * result + (aspiranteCl != null ? aspiranteCl.hashCode() : 0);
        result = 31 * result + (pagoRegLo != null ? pagoRegLo.hashCode() : 0);
        result = 31 * result + (encSeCLo != null ? encSeCLo.hashCode() : 0);
        result = 31 * result + (fotoRecLo != null ? fotoRecLo.hashCode() : 0);
        result = 31 * result + (folioExaCl != null ? folioExaCl.hashCode() : 0);
        result = 31 * result + (usuarioCl != null ? usuarioCl.hashCode() : 0);
        result = 31 * result + (actualizaFe != null ? actualizaFe.hashCode() : 0);
        result = 31 * result + (pagoFe != null ? pagoFe.hashCode() : 0);
        result = 31 * result + (encCoFe != null ? encCoFe.hashCode() : 0);
        result = 31 * result + (fotoRecFe != null ? fotoRecFe.hashCode() : 0);
        result = 31 * result + (folioAsgFe != null ? folioAsgFe.hashCode() : 0);
        result = 31 * result + (registroFe != null ? registroFe.hashCode() : 0);
        result = 31 * result + (archivoXx != null ? archivoXx.hashCode() : 0);
        result = 31 * result + (servFotoXx != null ? servFotoXx.hashCode() : 0);
        result = 31 * result + (lAsgFolLo != null ? lAsgFolLo.hashCode() : 0);
        result = 31 * result + (revDobMatCl != null ? revDobMatCl.hashCode() : 0);
        result = 31 * result + (bancoPagoCl != null ? bancoPagoCl.hashCode() : 0);
        result = 31 * result + (edoVFotoCl != null ? edoVFotoCl.hashCode() : 0);
        result = 31 * result + (edoVPagoCl != null ? edoVPagoCl.hashCode() : 0);
        result = 31 * result + (cantidadNu != null ? cantidadNu.hashCode() : 0);
        result = 31 * result + (cantidadPNu != null ? cantidadPNu.hashCode() : 0);
        result = 31 * result + (refPagoBxXx != null ? refPagoBxXx.hashCode() : 0);
        result = 31 * result + (refPagoBaXx != null ? refPagoBaXx.hashCode() : 0);
        result = 31 * result + (refPagoSsXx != null ? refPagoSsXx.hashCode() : 0);
        result = 31 * result + (genRefBanFe != null ? genRefBanFe.hashCode() : 0);
        result = 31 * result + (usuarioRfCl != null ? usuarioRfCl.hashCode() : 0);
        result = 31 * result + (actualRfFe != null ? actualRfFe.hashCode() : 0);
        result = 31 * result + (impCompFe != null ? impCompFe.hashCode() : 0);
        return result;
    }
}
