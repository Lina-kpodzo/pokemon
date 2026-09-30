package org.example.monstre

import org.example.dresseur.Entraineur
import kotlin.math.pow

class IndividuMonstre(
    var id: Int,
    var nom: String,
    var espece: EspeceMonstre,
    var entraineur: Entraineur?,
    expInit: Double
) {
    var niveau : Int = 1
    var attaque : Int = espece.baseAttaque + (-2..2).random()
    var defense : Int = espece.baseDefense + (-2..2).random()
    var vitesse : Int = espece.baseVitesse + (-2..2).random()
    var attaqueSpe : Int = espece.baseAttaqueSpe + (-2..2).random()
    var defenseSpe : Int = espece.baseDefenseSpe + (-2..2).random()
    var pvMax : Int = espece.basePv + (-5..2).random()
    var potentiel : Double = (5..20).random()/10.0
    var exp : Double = 0.0
    /**
     *  @property pv  Points de vie actuels.
     * Ne peut pas être inférieur à 0 ni supérieur à [pvMax].
     */
    var pv: Int = pvMax
        get() = field
        set(nouveauPv) {
            if(nouveauPv<=0){
                field=0
            }
            else if(nouveauPv >pvMax){
                field=pvMax
            }
            else {
                field = nouveauPv
            }
        }

    fun palierExp(niveau: Int): Double {
        return 100.0 * (niveau - 1).toDouble().pow(2.0)
    }

}

