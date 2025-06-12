package com.example.ejemplo1composeridgs901

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplo1composeridgs901.ui.theme.Ejemplo1ComposerIDGS901Theme

private val tarjetas: List<PersonajeTarjeta> = listOf(
    PersonajeTarjeta(
        "Goku",
        "El protagonista de la serie, conocido por su gran poder y personalidad amigable. Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla. Sin embargo, el caer por un barranco le proporcionó un brutal golpe que si bien casi lo mata, este alteró su memoria y anuló todos los instintos violentos de su especie, lo que lo hizo crecer con un corazón puro y bondadoso, pero conservando todos los poderes de su raza. No obstante, en la nueva continuidad de Dragon Ball se establece que él fue enviado por sus padres a la Tierra con el objetivo de sobrevivir a toda costa a la destrucción de su planeta por parte de Freeza. Más tarde, Kakarot, ahora conocido como Son Goku, se convertiría en el príncipe consorte del monte Fry-pan y líder de los Guerreros Z, así como el mayor defensor de la Tierra y del Universo 7, logrando mantenerlos a salvo de la destrucción en innumerables ocasiones, a pesar de no considerarse a sí mismo como un héroe o salvador."
    ),
    PersonajeTarjeta(
        "Vegeta",
        "Príncipe de los Saiyans, inicialmente un villano, pero luego se une a los Z Fighters. A pesar de que a inicios de Dragon Ball Z, Vegeta cumple un papel antagónico, poco después decide rebelarse ante el Imperio de Freeza, volviéndose un aliado clave para los Guerreros Z. Con el paso del tiempo llegaría a cambiar su manera de ser, optando por permanecer y vivir en la Tierra para luchar a su lado contra las inminentes adversidades que superar. Junto con Piccolo, él es de los antiguos enemigos de Goku que ha evolucionando al pasar de ser un villano y antihéroe, a finalmente un héroe a lo largo del transcurso de la historia, convirtiéndose así en el deuteragonista de la serie."
    ),
    PersonajeTarjeta(
        "Piccolo",
        "Es un namekiano que surgió tras ser creado en los últimos momentos de vida de su padre, siendo su actual reencarnación. Aunque en un principio fue el archienemigo de Son Goku, con el paso del tiempo fue haciéndose menos malvado hasta finalmente convertirse en un ser bondadoso y miembro de los Guerreros Z. A través del tiempo, también comenzó a tomarle cariño a su discípulo Son Gohan, a quien veía como una especie de \"vástago\" y formando un lazo de amistad con este."
    ),
    PersonajeTarjeta(
        "Bulma",
        "Bulma es la protagonista femenina de la serie manga Dragon Ball y sus adaptaciones al anime Dragon Ball, Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es hija del Dr. Brief y su esposa Panchy, hermana menor de Tights y una gran amiga de Son Goku con quien inicia la búsqueda de las Esferas del Dragón. En Dragon Ball Z tuvo a Trunks, primogénito de quien sería su esposo Vegeta, a su hija Bra[3] y su hijo adulto del tiempo alterno Trunks del Futuro Alternativo."
    ),
    PersonajeTarjeta(
        "Freezer",
        "Freezer es el tirano espacial y el principal antagonista de la saga de Freezer."
    ),
    PersonajeTarjeta(
        "Zarbon",
        "Zarbon es uno de los secuaces de Freezer y un luchador poderoso."
    ),
    PersonajeTarjeta(
        "Dodoria",
        "Dodoria es otro secuaz de Freezer conocido por su brutalidad."
    ),
    PersonajeTarjeta(
        "Ginyu",
        "Ginyu es el líder del la élite de mercenarios de mayor prestigio del Ejército de Freeza, la cual lleva el nombre de Fuerzas Especiales Ginew en su honor."
    ),
    PersonajeTarjeta(
        "Celula",
        "Cell conocido como Célula en España, es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo, y con ello el sueño de todo villano: dominar el mundo. Es el antagonista principal del Arco de los Androides y Cell."
    ),
    PersonajeTarjeta(
        "Gohan",
        "Son Gohanda en su tiempo en España, o simplemente Gohan en Hispanoamérica, es uno de los personajes principales de los arcos argumentales de Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es un mestizo entre saiyano y humano terrícola. Es el primer hijo de Son Goku y Chi-Chi, hermano mayor de Son Goten, esposo de Videl y padre de Pan."
    )
)

data class PersonajeTarjeta(val title: String, val body: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Ejemplo1ComposerIDGS901Theme {
                SaludoCard("Android", "Goku normal")
            }
        }
    }
}

@Composable
fun SaludoCard(name: String, datosCard: String){
    Row() {
        Image(
            painter = painterResource(id = R.drawable.goku_normal),
            contentDescription = null,
            modifier = Modifier.padding(10.dp)
                .size(120.dp)
        )
        Column {
            Text(text = "Nombre: $name",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "Personaje: $datosCard")
        }
    }
}

@Preview
@Composable
fun SaludoCardPreview(){
    Column {
        SaludoCard("Android", "Goku normal")
    }
}

@Composable
fun Tarjeta(personaje: List<PersonajeTarjeta>){
    LazyColumn {
        items (personaje){
                personaje -> SaludoCard(personaje.title, personaje.description)
            MyPersonajes(personaje)
        }
    }
}

@Composable
fun MyPersonajes(x0: Int) {
    Row {
        ImagenPersonaje(personaje.title.lowercase())
    }
}

@Composable
fun Personajes(personaje: PersonajeTarjeta){
    Column {
        Personajes(personaje.title)
        Personajes(personaje.body)
    }
    @Composable
    fun Personaje(datos: String){
        Text(datos)
    }
}

@Composable
fun ImagenPersonaje(name: String){
    Image(
        painter = painterResource(id = R.drawable.android_icon_192x192),
        contentDescription = null,
        modifier = Modifier.padding(10.dp)
            .size(120.dp)
    )
}