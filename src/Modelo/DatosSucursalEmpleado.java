package Modelo;

public class DatosSucursalEmpleado
{

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    private int  idSucursal;
    private String  nombreSucursal;
    
    private int idEmp;
    private String nombreEmp;
    private String apellidos;
    private String tipoDocumento;
    private String documento;
    private String correo;
    private String ocupacion;
    
    public DatosSucursalEmpleado()
    {
        this.idSucursal = 0;
        this.nombreSucursal = "";
        this.idEmp = 0;
        this.nombreEmp = "";
        this.apellidos = "";
        this.tipoDocumento = "";
        this.documento = "";
        this.correo = "";
        this.ocupacion = "";
    }
}
