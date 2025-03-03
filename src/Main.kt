import java.util.*

fun main() {
    println("Desarrollo Basasdo En Plataformas")
    println("Miguel Jimenez")

        val scanner = Scanner(System.`in`)
        var candidato1=0
        var candidato2=0
        var candidato3=0

        var costoCandidato1=0
        var costoCandidato2=0
        var costoCandidato3=0

        val internet = 7000000
        val radio = 200000
        val tv= 600000
        var votos=0
        var opcion:Int
        var costo =0

        do{
            println("""""
            |Bienvenido al menu de elecciones a continuacion elija una opcion para seguir
            |1 votar por un candidato
            |2 calcular el valor del costo de campaña de un candidato
            |3 vaciar urnas 
            |4 mostrar votos 
            |5 mostrar porcentaje de votos 
            |6 mostrar costo promedio de la campaña 
            |7 salir 
      
        """.trimMargin())
            opcion= scanner.nextInt()
            when(opcion){
                1->{
                    println(""""
                    |ingrese el numero del candidato por el que va a votar
                    |1 candidato 1
                    |2 candidato 2
                    |3 candidato 3 """.trimMargin())
                    val candidato= scanner.nextInt()
                    println("""""
                    |ingrese el medio de publicidad por el cual conoció al candidato
                    |1 internet
                    |2 radio
                    |3 TV
                    |""".trimMargin())
                    val medio= scanner.nextInt()
                    println("Su voto registrado")

                    if(medio==1){
                        costo= internet
                    }
                    else if (medio==2){
                        costo= radio
                    }
                    else if(medio==3){
                        costo=tv
                    }
                    if (candidato ==1){
                        candidato1+=1
                        votos+=1
                        costoCandidato1 +=costo
                    }
                    else if (candidato==2){
                        candidato2+=1
                        votos+=1
                        costoCandidato2 +=costo
                    }
                    else if (candidato==3){
                        candidato3+=1
                        votos+=1
                        costoCandidato3 +=costo
                    }
                    else{
                        println("Candidato invalido")
                    }


                }
                2-> {
                    println("""""ingrese el numero del candidato 
                    |1
                    |2
                    |3
                   
                """.trimMargin())
                    val candidato= scanner.nextInt()
                    var costo=0
                    if(candidato==1){
                        costo=costoCandidato1
                    }
                    else if (candidato==2){
                        costo=costoCandidato2
                    }
                    else if(candidato==3){
                        costo=costoCandidato3
                    }
                    else println("opcion invalida")
                    if(candidato in 1..3) {
                        println("el costo de la campaña del candidato $candidato : es de $costo")
                    }
                }
                3->{
                    candidato1=0
                    candidato2=0
                    candidato3=0
                    costoCandidato1=0
                    costoCandidato2=0
                    costoCandidato3=0
                    votos=0
                    println("Se han vaciado las urnas con exito ")
                }
                4-> println("El total de votos es de: $votos")
                5-> {
                    println("El porcentaje de votos: ")
                    if(votos>0){
                        var porcentajeCand1=(candidato1*100)/votos
                        var porcentajeCand2=(candidato2*100)/votos
                        var porcentajeCand3=(candidato3*100)/votos
                        println("""
                        |El porcentaje de candidato 1 es $porcentajeCand1 %
                        |El porcentaje de candidato 2 es $porcentajeCand2 %
                        |El porcentaje de candidato 3 es $porcentajeCand3 %
                    """.trimMargin())
                    }
                    else println("Aun no hay votos")
                }
                6->{

                    if(votos>0) {
                        var campania = (costoCandidato1 + costoCandidato2 + costoCandidato3) / votos
                        println("El costo promedio de la campaña es: $campania")
                    }
                    else println("aun no hay votos")
                }
                7-> println("Saliendo del progrma")

                else-> println("ingrese una opcion valida ")
            }

        } while(opcion !=7)












}