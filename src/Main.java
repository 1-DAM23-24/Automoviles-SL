public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo= new Vehiculo();
        vehiculo.setMatricula("5874LNF");
        vehiculo.setModelo("C3");
        vehiculo.setMarca("Citroen");
        vehiculo.setColor("Rojo");
        vehiculo.setTipoCombustible("Gasolina");
        vehiculo.setMotor("1.5TCe");
        vehiculo.setCaballos(130.0);

        Cliente cliente= new Cliente();
        cliente.setDni("25976315S");
        cliente.setNombre("Alberto");
        cliente.setApellidos("Nuñez González");
        cliente.setDireccion("Calle Alcalá, Madrid");

        Venta venta= new Venta();
        venta.setCodigoVenta(254-896-428-725);
        venta.setFechaVenta(19/8/2021);
        venta.setPrecioVenta(10124.54);
        venta.setDatosComprador("Alberto Nuñez Gozález, 25976315S, Calle Alcalá(Madrid)");
        venta.setDatosVehiculo("Citroen C3, 5874LNF, Rojo, Gasolina, 1.5TCe, 130.0");
        venta.setFormaPago("Transferencia bancaria");
    }
}
