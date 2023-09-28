class MainCalls {
    fun presentMenu(){
        //user enters `0` to leave
        var userInput:Int = 0

        //Use a do while loop to present user choices
        do {
            //print The choices
            print("What Kind Of Housing would you Like To Get A Quote For?\n1:Commercial\n2:Residential\nEnter Your Choice(0 to leave): ")


            userInput = readln().toInt()

            //depending on the users input, call a function that gets the input for the choice
            when(userInput){
                1-> choseCommercial()
                2 -> choseResidential()
                else -> println("Invalid Choice")

            }

        }while (userInput != 0)





    }


    //The Following Functions Purposes are to take in,
    // convert and handle the users values for a house of their choosing type
    fun choseCommercial(){

        println("Whats The Name Of The Property?")
        val propertyName:String = readln().toString()

        println("Do You Own Multiple Houses? (0 no, 1 yes)")
        val multiProperty:Int = readln().toInt()

        val multiBool:Boolean = when(multiProperty){
            1 -> true
            0 -> false
            else -> false //If they enter something invalid, default is no multi property
        }
        //standard Customer Questions
        println("Whats Your Name?: ")
        val name:String = readln()

        println("Whats Your Phone Number?: ")
        val number:String = readln()

        println("Whats Your Address?: ")
        val address:String = readln()

        println("Whats Your Houses Square Footage?: ")
        val footage:Double = readln().toDouble()

        //with all the revelant Data, send it all to Commercial
        var comm = Commercial(propertyName, multiBool, name, number, address, footage)
        comm.calcWeeklyRate()

    }

    fun choseResidential(){
        println("Are You A Senior Citizen? (0 no, 1 yes): ")
        val seniorInt:Int = readln().toInt()
        val seniorAval:Boolean = when(seniorInt){
            1 -> true
            0 -> false
            else -> false //If they enter something invalid, default is not Senior
        }

        //standard Customer Questions
        println("Whats Your Name?: ")
        val name:String = readln()

        println("Whats Your Phone Number?: ")
        val number:String = readln()

        println("Whats Your Address?: ")
        val address:String = readln()

        println("Whats Your Houses Square Footage?: ")
        val footage:Double = readln().toDouble()

        //with all the revelant Data, send it all to Residential
        val res = Residential(seniorAval,name, number,address,footage)
        res.calcWeeklyRate()



    }

}