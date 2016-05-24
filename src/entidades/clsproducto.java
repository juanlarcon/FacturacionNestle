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
public class clsproducto {
    private int _id;
    private String _nombre;
    private String _descripcion;
    private int _stock;
    private float _pvp; //pvp precio de venta al publico
    private float _pcp; //pcp precio compra proveedor
     private Boolean _sinIva;
    public clsproducto() {
    }

    public clsproducto(int _id, String _nombre, String _descripcion, int _stock, float _pvp, float _pcp, Boolean _sinIva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._sinIva = _sinIva;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float _pvp) {
        this._pvp = _pvp;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float _pcp) {
        this._pcp = _pcp;
    }

    public Boolean SinIva() {
        return _sinIva;
    }

    public void SinIva(Boolean _sinIva) {
        this._sinIva = _sinIva;
    }

   
    
}
