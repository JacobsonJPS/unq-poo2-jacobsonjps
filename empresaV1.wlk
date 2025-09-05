import reciboV1.*
class Empresa {

    var property nombre
    var property cuit 
    const property empleados = #{}
    const property recibos = #{}

    method montoTotal(){
        return empleados.sum({empleado => empleado.sueldoNeto()})
    }

    method montoTotalBruto(){
        return empleados.sum({empleado => empleado.sueldoBruto()})
    }

    method montoTotalRetenciones(){
        return empleados.sum({empleado => empleado.getRetenciones()})
    }

    method liquidacionSueldos(){
        return empleados.forEach({empleado => self.guardarRecibo(self.generarRecibo(empleado))})
    }

    method generarRecibo(empleado){
        return new Recibo(nombre = empleado.nombre(), 
                            direccion = empleado.direccion(),
                            fechaEmision = null , 
                            sueldoNeto = empleado.sueldoNeto(), 
                            desgloceDeConceptos = null)
    }

    method guardarRecibo(recibo){
        recibos.add(recibo)
    }

}