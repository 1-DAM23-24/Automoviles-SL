import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private Integer codigoVenta;
    private Date fechaVenta;
    private String datosComprador;
    private String datosVehiculo;
    private String formaPago;
    private Double precioVenta;
    private ArrayList<Venta> ventas;

    public Integer getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(Integer codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(int fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDatosComprador() {
        return datosComprador;
    }

    public void setDatosComprador(String datosComprador) {
        this.datosComprador = datosComprador;
    }

    public String getDatosVehiculo() {
        return datosVehiculo;
    }

    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }


}
