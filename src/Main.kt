
fun main() {
    println("Desarrollo Basasdo En Plataformas")
    println("Miguel Jimenez")

    var opcion =0
    var moneda20=20
    var moneda50=50
    var moneda100=100
    var moneda200=200
    var moneda500=500
    var cantidad20=0
    var cantidad50=0
    var cantidad100=0
    var cantidad200=0
    var cantidad500=0
    var total=0


    do {

        print(
            """ingrese una opcion
        1 ingresar monedas
        2 visualizar monedas
        3 total ahorrado 
        4 sacar dinero
        5 salir
        """
        )
        val menu = readln().toInt()
        when (menu) {
            1 -> {

                println("""
                    moneda a ingresar
                    1=20
                    2=50
                    3=100
                    4=200
                    5=500
                    
                    """)
                val valor_moneda= readln().toInt()
                println("ingrese la cantidad de monedas")
                val cantidad = readln().toInt()
                when(valor_moneda){
                    1-> {
                        println("ingrese la cantidad de 20")
                        cantidad20 += cantidad


                    }
                    2-> {
                        println("ingrese la cantidad de 50")
                        cantidad50 += cantidad

                    }
                    3-> {
                        println("ingrese la cantidad de 100")
                        cantidad100+= cantidad
                    }
                    4-> {
                        println("ingrese la cantidad de 200")
                        cantidad200+= cantidad
                    }
                    5-> {
                        println("ingrese la cantidad de 500")
                        cantidad500+= cantidad
                    }
                    else -> println("opcion no valida")
                }
            }
            2-> {
                println("la cantidad de monedas ingresadas es: ")
                println("monedas de 20: $cantidad20")
                println("monedas de 50: $cantidad50")
                println("monedas de 100: $cantidad100")
                println("monedas de 200: $cantidad200")
                println("monedas de 500 $cantidad500")
            }
            3 -> {

                total=(cantidad20*moneda20)+(cantidad50*moneda50)+(cantidad100*moneda100)+(cantidad200*moneda200)+(cantidad500*moneda500)
                println("El total ahorrado es de: $total")
            }
            4->{
                println("La alcancía se ha roto")
                cantidad20=0
                cantidad50=0
                cantidad100=0
                cantidad200=0
                cantidad500=0
                total=0
            }
            5-> println("Salir Programa")
            else -> println("Opcion no valida")
        }
    }while (menu!=5)
}