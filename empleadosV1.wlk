class Empleado {

    var property nombre
    var property direccion
    var property estadoCivil
    var property fechaNacimiento
    var property sueldoBasico

    method edad() {
        return 2025 - self.fechaNacimiento()
    }

    method sueldoBruto(){
        return self.sueldoBasico()
    }

    method getRetenciones() {
        return self.obraSocial() + self.aportesJubilatorios()
    }

    method obraSocial()
    method aportesJubilatorios()

    method sueldoNeto(){
        return self.sueldoBruto() - self.getRetenciones()
    }
}


class EmpleadoPermanente inherits Empleado {
    var property cantidadHijos
    var property antiguedad
    var property estaCasado = true

    override method sueldoBruto(){
        return super() + self.salarioFamiliar()
    } 

    method salarioFamiliar(){
        return self.asignacionPorHijos() + self.asignacionPorConyugue() + (self.antiguedad()*50)
    }

    method asignacionPorHijos(){
        return self.cantidadHijos() * 150
    }

    method asignacionPorConyugue(){
        return if(self.estaCasado()){100}
                else{0}
    }

    override method obraSocial(){
        return 0.1 * self.sueldoBruto() + 20 * self.cantidadHijos()
    }

    override method aportesJubilatorios(){
        return self.sueldoBruto() * 0.15
    }

}

class EmpleadoTemporal inherits Empleado {
    var property fechaFinDesignacion
    var property cantidadHorasExtra

    override method sueldoBruto(){
        return super() + self.bonoPorExtras(40)
    }

    method bonoPorExtras(cantidad){
        return self.cantidadHorasExtra() * cantidad
    }

    override method obraSocial(){
        return 0.1 * self.sueldoBruto() + self.bonoEdad()
    }

    method bonoEdad() {
        return if (self.edad() >50 ){25}
                else{0}
    }

    override method aportesJubilatorios(){
        return 0.1 *self.sueldoBruto() + self.bonoPorExtras(5)
    }
}

class EmpleadoContratado inherits Empleado{
    var property numeroContrato
    var property medioPago

    override method getRetenciones(){
        return 50
    }
}