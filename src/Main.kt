import java.util.*
import kotlin.random.Random



fun main() {
    println("Desarrollo Basasdo En Plataformas")
    println("Miguel Jimenez")


    println("""
        Crea el juego “Apuesta y gana”. El usuario debe introducir 
        inicialmente una cantidad de dinero. A continuación aparecerá por 
        pantalla un numero de forma aleatoria. Si sale un 3, el usuario pierde 
        todo su dinero y termina el juego. Si sale 2, el usuario pierde la mitad 
        del dinero y puede seguir jugando con esa cantidad o puede dejar de jugar. 
        Si sale el 1, el usuario multiplica por dos su dinero y puede seguir 
        jugando con esa cantidad o puede dejar de jugar
    """.trimIndent())


    val reader = Scanner(System.`in`)
    println("Ingrese el dinero inicial $$$$$")

    var continuar = true
    var inicial = reader.nextInt()
    println(inicial)

    do {
        var randomNum= Random.nextInt(3)+1
        println(randomNum)
        println("Numero aleatorio Generado ${randomNum}")
        if (randomNum==1){
            var mulitplicacion =inicial*2
            inicial =mulitplicacion
            println("Puede seguir jugando con ${inicial}, 1->Si 2->No")
            var continuacion = reader.nextInt()
            if (continuacion==1){
                continuar= true
            }
            if (continuacion==2){
                continuar= false
            }
        }
        if (randomNum==2){
            var division= inicial/2
            inicial = division
            println("Puede seguir jugando con ${inicial}, 1->Si 2->No")
            var continuacion = reader.nextInt()
            if (continuacion==1){
                continuar= true
            }
            if (continuacion==2){
                continuar= false
            }
        }
        if(randomNum==3){
            inicial=0
            println("Ha perdido TOOODO Su $$$$")
            continuar=false
        }


    }while (continuar==true)



}