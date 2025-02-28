import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Desarrollo Basasdo En Plataformas")
    println("Miguel Jimenez")


    val scanmer = Scanner(System.`in`)
    var intentos =0;
    var codAcceso:Int

    while (intentos<3){
        println("Bienvenido, Ingrese su c[odigo de acceso")
        codAcceso=scanmer.nextInt()
        scanmer.nextLine()
        if(codAcceso in 1000..1999){
            println("Acceso exitoso, Bienvenido, empleado ID= ${codAcceso}")
        }else if (codAcceso in 2000 ..2999){
            println("Ingrese su nombre")
            var nomEmpleado= scanmer.nextLine()
            println("Cual es el motivo de su visita?")
            var motivo = scanmer.nextLine()
            println("Bienvenido, acceso concedido, ${nomEmpleado}, motivo de visita = ${motivo}")
        }else{
            println("Codigo invalido, tiene 3 oportunidades")
            intentos+=1
        }
    }
    println("Acceso Bloqueado por multiples intentos fallidos")

}