package org.example.monde

import org.example.monstre.EspaceMonstre

class Zone (
    var id : Int,
    var nom : String,
    var expZone : Int,
    var especesMonstres : MutableList<EspaceMonstre>,
    var zoneSuivante : Zone?,
    var Zoneprcedante : Zone?
){

}