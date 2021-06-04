
    //Declaraciones de Variables
    var cantidad_a_Convertir :Double=0.00;
    var opcion : Int =0;
    var resultado : Double=0.00;

    //funciones
    fun convertMMaCM(){

        resultado = cantidad_a_Convertir / 10;
        println("la conversion de mm -> cm es de: " +resultado);
    }
    fun convertMMaMT(){

        resultado = cantidad_a_Convertir / 1000;
        println("Tu resultado de la conversion de mm -> mt es de: "+resultado);
    }
    fun convertMMaKM(){

        resultado = cantidad_a_Convertir / 1000000;
        println("Tu resultado de la conversion de mm -> km es de: " +resultado);
    }
    fun convertCMaMM(){

        resultado = cantidad_a_Convertir * 10;
        println("Tu resultado de la conversion de cm -> mm es de: " + resultado );
    }
    fun convertMTaMM(){

        resultado = cantidad_a_Convertir * 1000;
        println("Tu resultado de la conversion de mt -> mm es de: " +resultado );
    }
    fun convertKMaMM(){

        resultado = cantidad_a_Convertir * 1000000;
        println("Tu resultado de la conversion de km -> mm es de: "+resultado );
    }
    fun main(){
        println("----------Convertidor de Unidades-------");
        println("1.  convertir de mm -> cm");
        println("2. convertir de mm -> mt");
        println("3. convertir de mm -> km");
        println("4. convertir de cm -> mm");
        println("5. convertir de mt -> mm");
        println("6. convertir de km -> mm");
        println("Eliga una Opcion ");
        opcion = readLine()!!.toInt();
        println("ingrese una cantidad a convertir");
        cantidad_a_Convertir = readLine()!!.toDouble();
        when(opcion){
            1->convertMMaCM();
            2->convertMMaMT();
            3->convertMMaKM();
            4->convertCMaMM();
            5->convertMTaMM();
            6->convertKMaMM();

        }

    }

