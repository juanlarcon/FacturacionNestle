/*
Uniandes- uyo
sistema de facturacion 2016
octavo semestre
Juan Alarcon
23/05/2016
 */
package entidades;

/**
 *
 * @author Pc01
 */
public class clsproveedor {
public String _ruc;
 public String _nombre;
 public String _razonSocial;
 public String _direccion;
 public String _telefono;

    public clsproveedor() {
    }

    public clsproveedor(String _ruc, String _nombre, String _razonSocial, String _direccion, String _telefono) {
        this._ruc = _ruc;
        this._nombre = _nombre;
        this._razonSocial = _razonSocial;
        this._direccion = _direccion;
        this._telefono = _telefono;
    }

    public String Ruc() {
        return _ruc;
    }

    public void Ruc(String _ruc) {
        this._ruc = _ruc;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String RazonSocial() {
        return _razonSocial;
    }

    public void RazonSocial(String _razonSocial) {
        this._razonSocial = _razonSocial;
    }

    public String Direccion() {
        return _direccion;
    }

    public void Direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String Telefono() {
        return _telefono;
    }

    public void Telefono(String _telefono) {
        this._telefono = _telefono;
    }
 
}
