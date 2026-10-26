package com.example.somosmaravilla

object Simpleton {
    var user_def = String()
    var paswer_def = String()
    var arrmsj = ArrayList<String>()
    var arrvalid = ArrayList<String>()

    var arrleng = listOf<String>("Kotlin", "Java", "C++","Python", "JavaScript", "PHP")
    var cities = listOf<String>("Gomez", "Lerdo", "Torreon", "Parras", "Ojinaga", "Juarez")

    var finalname: String
    var finalfecha: String
    var finallanguage: String

    init{
        user_def = "munich@gmail.com"
        paswer_def = "1234"
        arrmsj = ArrayList<String>()
        arrvalid = ArrayList<String>()
        arrmsj.add(0, "Hey brother")
        arrvalid.add(0, "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+s")
        arrmsj.add(1, "FORMATO NO VALID OKKK")
        //edad
        arrvalid.add(1, "^1?[0-9]{2}$")
        //RFC
        arrvalid.add(2, "^[A-Z]{4}[0-9]{6}$")
        //tel
        arrvalid.add(3, "^871[0-9]{7}$")

        finalname = ""
        finalfecha = ""
        finallanguage = ""
    }
}