/*
Uniandes- uyo
sistema de facturacion 2016
octavo semestre
Juan Alarcon
23/05/2016
 */
package entidades;
import java.util.Date;
/**
 *
 * @author Pc01
 */
public class clscompra {
   private int _id;
   private String _proevedor;
   private Date _fecha;
   private float _subtotal;
   private float _iva;
   private float _total;

    public clscompra() {
    }

    public clscompra(int _id, String _proevedor, Date _fecha, float _subtotal, float _iva, float _total) {
        this._id = _id;
        this._proevedor = _proevedor;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getProevedor() {
        return _proevedor;
    }

    public void setProevedor(String _proevedor) {
        this._proevedor = _proevedor;
    }

    public Date getFecha() {
        return _fecha;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public float getSubtotal() {
        return _subtotal;
    }

    public void setSubtotal(float _subtotal) {
        this._subtotal = _subtotal;
    }

    public float getIva() {
        return _iva;
    }

    public void setIva(float _iva) {
        this._iva = _iva;
    }

    public float getTotal() {
        return _total;
    }

    public void setTotal(float _total) {
        this._total = _total;
    }

           
}

