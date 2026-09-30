package org.example.monde

import org.example.monstre.EspeceMonstre

class Zone (
    var id : Int,
    var nom : String,
    var expZone : Int,
    var especesMonstres : MutableList<EspeceMonstre>,
    var zoneSuivante : Zone?,
    var zonePrecedante : Zone?
){

// TODO: faire la méthode genereMonstre()
// TODO: faire la méthode rencontreMonstre()
}