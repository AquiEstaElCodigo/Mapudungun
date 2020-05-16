/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;


import android.content.Context;

import static cl.aquilotienes.mapudungun.AdministradorBD.CN_ESP;
import static cl.aquilotienes.mapudungun.AdministradorBD.CN_MAPU;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_A;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_B;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_C;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_D;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_E;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_F;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_G;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_H;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_I;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_J;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_L;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_M;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_N;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_O;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_P;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_Q;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_R;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_S;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_T;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_U;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_V;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_Y;
import static cl.aquilotienes.mapudungun.AdministradorBD.TABLE_LETRA_Z;

/**
 * Created by Germán Riveros S.
 */


class Tablas
{

    public Tablas(Context context)
    {

        //super(contex);


    }

    public static final String INSERTAR_LETRA_A = "INSERT INTO " + TABLE_LETRA_A + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES "+
            "('A (prep)','Meu')," +
            "('A cada rato','Müchayke')," +
            "('A este lado','nonpa')," +
            "('A un lado','Kiñepele')," +
            "('Abarca (zapato de madera)','Trañu, tranu')," +
            "('Abajo','Minutu, naqueltu, naqtu' )," +
            "('Abajo (mirar)','Naqkin-tun' )," +
            "('Abdomen','Pue' )," +
            "('Abertura (boca u orificio)','Nülapeyüm' )," +
            "('Ablandarse','Nguëfadn, nguëfashn')," +
            "('Abogado','Dënguñmachefe' )," +
            "('Abogado (mediador)','Ranguiñelwe' )," +
            "('Abominar:','Afentun' )," +
            "('Abonar (con estiércol)','Funaltun' )," +
            "('Abono (de estiércol)','Funaltu')," +
            "('Abortado','Lludkün')," +
            "('Abortar','Lludkünpëñen')," +
            "('Aborrecer','Füren')," +
            "('Aborrecer, odiar','Den, üdenentun, üdewëln')," +
            "('Abrazar','Mafüln, Rofëln')," +
            "('Abreviar, empequeñecer','Pichilcan')," +
            "('Abrir, abrirse','Nülan')," +
            "('Abrir, dejar abierto','Nülakenun' )," +
            "('Abrir (los ojos)','Lelikëlen, lelikënun')," +
            "('Abrigar del viento','Ñikëmn')," +
            "('Abrigarse de la lluvia','Chütun, chütulen, chüllkëmtun')," +
            "('Abrigarse (del frío o del viento)','Ñikemkëlen, ñikemtun')," +
            "('Abstenerse','Katrütuwn')," +
            "('Abuela (paterna)','Kuku')," +
            "('Abuela (materna)','Chuchu')," +
            "('Abuelita','Kudé papai')," +
            "('Abuelo (paterno)','Laku')," +
            "('Abuelo (materno)','Cheche')," +
            "('Abundancia (mucho)','Pëtru' )," +
            "('Abundancia (tener en)','Ünüfnguien')," +
            "('Abundante (ser)','Pëtrun, üngüfn')," +
            "('Aburrirse (cansarse de algo)','Afeln, uwn')," +
            "('Acá, aquí','Tefámeu, fau, fameu' )," +
            "('Acabar (con algo), aniquilar','Pëshamn' )," +
            "('Acabarse (perderse)','Pëdan, pëshan')," +
            "('Acalambrarse (encogerse)','Trëkëfün' )," +
            "('Acamarse','Llaun, ilawn' )," +
            "('Acamado (estar)','Llau këlen' )," +
            "('Acamar','Llau kënun' )," +
            "('Acanalarse ','Lonln' )," +
            "('Acarrear (trasladar)','Wiñamn, wiñamtun')," +
            "('Acechar (sorprender)','Lloftun' )," +
            "('Acepillar (cepillar, raspar)','Kafedün, kafürn' )," +
            "('Aceptar (recibir)','Llown' )," +
            "('Aceptar (Sobrellevar, sufrir)','Yen' )," +
            "('Acercar','Fëlëmn')," +
            "('Acertar (apuntar)','Küllin')," +
            "('Acertar (dar en el centro)','Leqn')," +
            "('Acertado','Leq')," +
            "('Aclarar','Lafpëmn')," +
            "('Acolchar (el maíz)','Wütrün')," +
            "('Acomodarse','Përn')," +
            "('Acomodar','Përëm')," +
            "('Aconchado','Llid')," +
            "('Aconcharse','Llidn, llidnaqn')," +
            "('Aconsejar','Ngülamkan, ngülamn, ngülamtun')," +
            "('Aconsejar (en contrario)','Tëkudëngun, tëkumn' )," +
            "('Acordarse (de algo o alguien)','Duamtunien')," +
            "('Acortar (abreviar)','Pichikënun, pichitun' )," +
            "('Acostarse','Kudun' )," +
            "('Acostado (estar)','Kudúlen' )," +
            "('Acostarse (dormir con un otro)','Kudúmkënun, kúdum' )," +
            "('Acostumbrarse','Wimn' )," +
            "('Acostumbrarse (a algo, alguno)','Wimëmn' )," +
            "('Acuoso','Idan' )," +
            "('Acurrucado','Llikódkélen' )," +
            "('Acusar','Dallun' )," +
            "('Acusar a alguien','Dalluntekun' )," +
            "('Achupalla (planta)','Dëcho' )," + //ver
            "('Adentro (adv)','Konelyu, ponwi' )," +
            "('Aderezar (instruir, disponer)','Trürëm, dëngu')," +
            "('Adivino (sust)','Pelon')," +
            "('Admirable (ser)','Afmatun')," +
            "('Admirar, admirarse','Afmatun')," +
            "('Adonde','Cheo, cheu, cheupule')," +
            "('Adormecer','Umaqeln, élkënun')," +
            "('Adornado (bonito)','Aifiñ')," +
            "('Adornado (estar)','Aifiñn')," +
            "('Adornar, engalanar','Aifiñeln')," +
            "('Adquirir (encontrar, ver)','Pen')," +
            "('Adulterio (cometer)','Dayen')," +
            "('Advertir (revisar)','Ngueltún')," +
            "('Afanarse','Fiñmaun')," +
            "('Afanarse por algo','Reyewn')," +
            "('Afectos','Duam' )," +
            "('Afianzar, afirmar','Yafüngueln, yafüngueltun')," +
            "('Afilar (apuntar)','Yunguëmn')," +
            "('Afixiado (sofocado)','Trëfn, trefün')," +
            "('Afligido (estar)','Lladkünduamn')," +
            "('Afligir (entristecer)','Lladkülkan')," +
            "('Afligirse (entristecerse)','Lladkün')," +
            "('Aflojarse (un cuero)','Llonchón, llonchónentun')," +
            "('Afrentar','Adkan')," +
            "('Afuera (por fuera)','Wekun, wekuntu')," +
            "('Afuera (estar)','Wekukëlen, wekuntulen')," +
            "('Agachadamente','Lloyükechi')," +
            "('Agachado (pasar)','Shiñül, shiñüll, shiñum')," +
            "('Agachar, agacharse','Lloyükënun, lloyünaqn')," +
            "('Agacharse hacia adelante','Wayónaqn')," +
            "('Agallas','Kecheu')," +
            "('Agarradera, asa, mango','Tunguepeyüm, nüpeyüm')," +
            "('Agarrar (coger, tomar)','Tun' )," +
            "('Aglomeración (gentío)','Wiluwilunguen')," +
            "('Agobiado (estar)','Pitrongkëlen')," +
            "('Agobiar','Trañmanakëmn')," +
            "('Agradable','Ayüfal')," +
            "('Agradar','Feyentun')," +
            "('Agradecer','Mañumn')," +
            "('Agradecer (un servicio)','Mañumtun')," +
            "('Agrandar, aumentar','Fücháln')," +
            "('Agraviarse (enojarse)','Lladkütun')," +
            "('Agredir, castigar','Naln')," +
            "('Agregar, añadir','Peñamtun, yomn, yomtun')," +
            "('Agrio (salado)','Kotrü')," +
            "('Agrio (picante)','Mutrü, füré')," +
            "('Agua','Ko, koiko')," +
            "('Agua pura','Reko')," +
            "('Agua de lluvia','Mawenko')," +
            "('Agua caliente','Aliko, aremko, kovunko')," +
            "('Agua barrosa','Peleko')," +
            "('Agua cristalina','Liqliqko')," +
            "('Agua de cascada','Trayenko, lliuñko')," +
            "('Agua de manantial','Wëlko')," +
            "('Agua de mar','Futalafkenko')," +
            "('Aguoso (lleno de agua)','Chillko')," +
            "('Aguardar (esperar)','Üngueln, ünguëmn')," +
            "('Agüero (mal presagio)','Perinol')," +
            "('Aguijón (punta de lanza)','Waiki' )," +
            "('Aguila pequeña (aguilucho)','Ñamku')," +
            "('Agujerear','Wechodn')," +
            "('Agujerear las orejas','Katápilunn')," +
            "('Agujero (sust)','Wechod')," +
            "('Agusanarse','Pirun')," +
            "('Ahogar (sofocar)','Nguëtrun')," +
            "('Ahogarse en el agua','Üliln, ürlimn')," +
            "('Ahora (adj)','Féula, faté, fenté')," +
            "('Ahora (hasta ahora)','Fanté, lantén, meu')," +
            "('Ahorcarse','Nguëtrüwn')," +
            "('Ahuecar','Trotrolün')," +
            "('Ahumar','Fëchotun, fitruñman')," +
            "('Ahuyentar','Yafn')," +
            "('Ahuyentar (repeler, corretear)','Wemun, wemün')," +
            "('Aire (por el)','Angka wenu')," +
            "('Aislar','Wapintëkun')," +
            "('Ajena (cosa ajena)','Kate')," +
            "('Ají','Trapi')," +
            "('Ala (sust)','Mëpü')," +
            "('Alabar (celebrar algo)','Përamyen')," +
            "('Alba (sust)','Wün')," +
            "('Alborotar (a otros)','Aukaln')," +
            "('Alcanzar ','Ditun, Óin, fitun')," +
            "('Alcanzar (llegar a tiempo)','Trepun')," +
            "('Alcanzar algo (insistir)','Nganguewn')," +
            "('Alcoba','Katrünteku')," +
            "('Alegrar (gozo)','Trüyüwëln, trüyüwëlkan')," +
            "('Alegrarse','Ayün, ayüwn, trüyüwn')," +
            "('Alegrarse mucho','Përaduamn')," +
            "('Alegría (sust)','Ayüwn')," +
            "('Alegría (tener gozo)','Trüyüwëlkelën')," +
            "('Alentado (ligero)','Trüf')," +
            "('Alentado (alegre, de buen humor)','Trepeduam')," +
            "('Alerce','Lawal')," +
            "('Alfarería','Widún')," +
            "('Alfarero','Widüfe')," +
            "('Al final','Inákechi')," +
            "('Algo (un poco)','Aimeñ, aimün, aimüneln')," +
            "('Alguno (entre varios, num)','Kiñelke, kiñelketu')," +
            "('Algunos (adj. num. indeter)','Mufü')," +
            "('Aliado (socio)','Wichan')," +
            "('Aliarse (acción en común)','Wichan, wichaln, wichawn')," +
            "('Alimento (buscar, pedirlo)','Wüfkün, wifkün')," +
            "('Aliño (sabor)','Ünel')," +
            "('Alisar','Luyëfeln, luyüfeln')," +
            "('Alistarse','Pilelkawn')," +
            "('Alistarse (hacer preparativos)','Trürëmuwn')," +
            "('Alma (muerto que pena)','Am, alwe')," +
            "('Alma, espíritu','Pëllü, pëlli, am')," +
            "('Almácigo','Llenkëm')," +
            "('Alojar','Umaln, umañman')," +
            "('Alojarse','Uman')," +
            "('Alrededor','Wallorupa')," +
            "('Alrededores (sust)','Ollon wallon')," +
            "('Alrededores (en los)','Wallon meu')," +
            "('Altanero (ser)','Përamuwn nguen')," +
            "('Altercar','Kewan')," +
            "('Alternativamente','Weluke, welukon')," +
            "('Altivo (bravo, guapo)','Nowü, noü, nowel')," +
            "('Alto','Alüpëram, fütann')," +
            "('Altura','Alüpëran')," +
            "('Altruista','Poyeche nguen')," +
            "('Aludir (indicar, nombrar)','Üitun, ümtun')," +
            "('Alumbrar','Pelomn')," +
            "('Alzar (elevar, alabar)','Weñuñpramn')," +
            "('Alzar (erigir, celebrar)','Witrañpramn')," +
            "('Alzado (rebelde)','Auka')," +
            "('Alzamiento (rebelión)','Aukan')," +
            "('Allá (hacia allá)','Ayépële')," +
            "('Allá','Aye, uye, eyeu')," +
            "('Allanar (emparejar el suelo)','Lürëmn')," +
            "('Amable, agradable','Ayüfal')," +
            "('Amado','Ayün, poyen')," +
            "('Amamantar','Moyoln')," +
            "('Amanecer','Wünn')," +
            "('Amansado','Ñom')," +
            "('Amansar','Ñomëmn')," +
            "('Amante','Ayün')," +
            "('Amar (querer)','Ayün')," +
            "('Amarse (estimarse)','Poyewn')," +
            "('Amargo (adj)','Muküd, mukür')," +
            "('Amarillear','Chodn, chodwen')," +
            "('Amarillo','Chod')," +
            "('Amarrado, atado','Trapel')," +
            "('Amarrar','Mütroln, trapeln')," +
            "('Ambar (sust)','Mélame, méyene')," +
            "('Ambos, ambas','Chaq, üiaq')," +
            "('Amenazar','Añeltun')," +
            "('Amigo, amiga (compañera)','Weñui')," +
            "('Amigo (ayudante, compañero)','Ingka')," +
            "('Amistad (tener con alguien)','Wenüikan')," +
            "('Amistar (reconciliar)','Weñüikënun')," +
            "('Amontonado (adj)','Wëtrun')," +
            "('Amontonado (estar)','Trumaukëlen, futrulkëlen')," +
            "('Amontonar','Trumakënun, wirkoln')," +
            "('Amor','Ayün')," +
            "('Ancho','Fúchárume')," +
            "('Anciana','Kushe, kude')," +
            "('Anciano','Fücha')," +
            "('Andar (avanzar)','Amun')," +
            "('Andar (encaminar, enviar)','Amuln')," +
            "('Andar (a brincos)','Chongkatuiawn')," +
            "('Andar (cojear)','Kütrotun')," +
            "('Angosto (delgado)','Pichirume')," +
            "('Angostura','Trafme')," +
            "('Angustiarse','Fiñmaun')," +
            "('Anhelar (algo)','Weñangütun')," +
            "('Anillo, sortija','Wëlkuq')," +
            "('Animal','Kullin')," +
            "('Animar','Yafüln, yafülkëkun')," +
            "('Ano (sust)','Nguechiwe')," +
            "('Anoche (adv)','Trafuya')," +
            "('Anochecer','Punman, punn')," +
            "('Anochecer (Hacerse)','Trafuyan')," +
            "('Ansiar (algo)','Nganguen, nganguefenguen')," +
            "('Anteayer','Epunum')," +
            "('Antenoche','Fëltrafuya')," +
            "('Antepasados:','Mü trem')," +
            "('Antes, hace tiempo','Ulfi')," +
            "('Antiguamente','Kuifi')," +
            "('Antiguo, muy anciano (adj)','Laufi')," +
            "('Antojo','Apill')," +
            "('Anudar, hacer nudos','Përonn')," +
            "('Anzuelo','Küli')," +
            "('Añadidura, yapa','Pëñam, yopëñ')," +
            "('Añejo, viejo (cosas)','Wintu')," +
            "('Año','Tripantu')," +
            "('Año próximo','Kámel')," +
            "('Apacentar','Ütaln')," +
            "('Apacible, paciente','Ñochiduamlen, Ñochiduamkëlen')," +
            "('Apacible (estar)','Llakólen')," +
            "('Apaciguarse, apaciguar','Lladkümtun')," +
            "('Apagar','Chonguëmn')," +
            "('Apagarse','Chongn')," +
            "('Apalear','Trawawn')," +
            "('Aparecer (presentarse)','Weln')," +
            "('Aparecer (hacer)','Wepëmn')," +
            "('Apartado','Wichul')," +
            "('Apartar','Pëntüln')," +
            "('Apartar (la vista)','Kákintu kenun')," +
            "('Aparte (adj. adv.)','Wichu')," +
            "('Aparte (uno por uno)','Wichuke')," +
            "('A pedazos','Ütrëfke')," +
            "('Apelmazar','Lëtrumn, lëtrün')," +
            "('Apellido','Künga')," +
            "('Apéndice (intestino)','Chümpun')," +
            "('Apesadumbrado, triste','Kutran duamkëlen')," +
            "('Apetecer, desear','Illun')," +
            "('Apetecible, deseable','Illufal')," +
            "('Aplastado (chato)','Chapëd')," +
            "('Aplastar, comprimir','Nguëtralün')," +
            "('Aplicar (poner)','Traiaitëkun')," +
            "('Apolillado, carcomido (estar)','Piritun nguen')," +
            "('Aporcar (legumbres)','Dapillman')," +
            "('Aporrear, pegar','Trëpun, trawawan')," +
            "('Apostador (sust.)','Kudefe')," +
            "('Apostar (en carreras)','Kuden')," +
            "('Apostar','Rann')," +
            "('Apoyar, apuntalar','Shechun, dechun')," +
            "('Apoyo (consuelo)','Fëtaluwn')," +
            "('Apreciable (adj.)','Shakin, rakin')," +
            "('Apreciar, honrar','Shakin, rakin')," +
            "('Apremiar','Ngueñikan')," +
            "('Apremiar (a alguien)','Reyen')," +
            "('Aprender','Kimn')," +
            "('Aprender (de memoria)','Kimkimtun')," +
            "('Apresurar (dar prisa)','Matukain, matumatukaln')," +
            "('Apretado, trancado (estar)','Úküfkë')," +
            "('Apretador (sust.)','Nguëréwe')," +
            "('Apretar (con correas, lazo)','Füyemn, Üpëmn')," +
            "('Apto (ser)','Kümen')," +
            "('Apuesta (en el juego)','Ran')," +
            "('Apuntar (en el disparar)','Küllin')," +
            "('Apuntar, afilar','Yugëmn')," +
            "('Apuradamente','Matuke, mutukechi, matumatuke')," +
            "('Apurar, insistir, apremiar','Përëmn')," +
            "('Apuro (estar)','Ngueñiatukëlen')," +
            "('Aquí, acá','Tefámeu, fa, meu')," +
            "('Arado (sust.)','Ketran')," +
            "('Arar','Ketran, maipun')," +
            "('Araucaria','Pewen, peweñ')," +
            "('Árbol, madera, palo','Mamëll, mamüll, mamill')," +
            "('Árbol, el ramaje','Chagkin')," +
            "('Arbusto','Rëtron')," +
            "('Arco de flecha','Chemfelwe, chufülwe')," +
            "('Arco iris','Relmu, relmü, wepüll')," +
            "('Arder, quemarse','Lëfn, lefkëlen')," +
            "('Arder, encencenderse (estar)','Üin, üikélen')," +
            "('Ardid','Trürëm dëgu')," +
            "('Armar ardides, falsedades','Trürém, eldëngun')," +
            "('Arena','Kuyëm, kuyüm')," +
            "('Arengar','Konakonatuln')," +
            "('Arma, fuerza','Newen')," +
            "('Aros, zarcillo','Chawai, chawaitu, chawal')," +
            "('Artesano','Kamañ')," +
            "('Articulación, coyuntura, nudillo','Troi')," +
            "('Articulación (muñeca de la mano)','Troikuq')," +
            "('Arraigar','Folinl')," +
            "('Arraigado (estar)','Folil uukëlden')," +
            "('Arrancar, desgajar','Kachamentun')," +
            "('Arrancar de raíz','Ñodün, ñodünentuün')," +
            "('Arrancar con raiz','Nguedünentun')," +
            "('Arrastrar','Wingüedn')," +
            "('Arrayán','Këtri, kollimaméll')," +
            "('Arrear','Kechan')," +
            "('Arrear para afuera','Yafentun')," +
            "('Arrebatar algo','Mëntun')," +
            "('Arrebozarse, abrigarse bien','Nguënuftëkuwn, nguënuftun')," +
            "('Arreglado, bonito','Ad üi')," +
            "('Arrendar','Arentun')," +
            "('Arrepentirse','Katrüduamn, weñóduamn')," +
            "('Arriba (encima de otra cosa)','Wetetu')," +
            "('Arriba (sobre)','Wete, weche')," +
            "('Arriba (cielo)','Wenu')," +
            "('Arriesgado','Ran')," +
            "('Arrimado (estar)','Rekülkëlen, rekúltulen')," +
            "('Arrimarse','Rekülkënuwn')," +
            "('Arrinconar','Nguióntëkun')," +
            "('Arrodillarse','Lukulnaqn')," +
            "('Arrollado (adj.). Arrollar','Wëllon, Ollon')," +
            "('Arroyo, corriente','Manguiñ')," +
            "('Arruga','Doñu, trono, soñu')," +
            "('Arrugado (estar)','Doñulen, shoñülen')," +
            "('Arrugarse','Tronon')," +
            "('Arruinarse, destruirse','Teifun')," +
            "('Asa, agarradera, mango','Ñupeyüm, tunguepeyüm')," +
            "('Asa (vaso, taza)','Pilun, nüpeyüm')," +
            "('Asado (sust.)','Kangkan')," +
            "('Asado (adj.)','Küchen, kuen')," +
            "('Asador (sust.)','Kangkawe')," +
            "('Asar','Kangkan')," +
            "('Asqueroso, sucio (adj.)','Ükaipue')," +
            "('Asentaderas','Añüwe')," +
            "('Asesino','Languëmchefe')," +
            "('Asfixiarse','Kéin, këfkefü, këfiwn')," +
            "('Así (adj.)','Femnguechi, fam, famkechi')," +
            "('Así es, sí','Itróle ka')," +
            "('Así como','keyü')," +
            "('Asiento (sust.)','Anütuwe')," +
            "('Asociarse','Trafkonn')," +
            "('Aspecto (faz, exterior, forma)','Ad')," +
            "('Aspirar, inspirar','Neyüntëkun')," +
            "('Astilla','Démillko, dümillko, shimillko')," +
            "('Astillar','Pëllüfün')," +
            "('Astucia, engaño','Nguënén')," +
            "('Asustar','Llükalkan, trupëfein')," +
            "('Atacar','Lefkontun, lefwetun')," +
            "('Atar, amarrar','Trarün')," +
            "('Atado (sust.)','Trarün')," +
            "('Atado (bulto)','Këtrung, këtrün')," +
            "('Atajar','Katrün')," +
            "('Atención (poner), escuchar','Allkütun')," +
            "('Atentamente (adj.)','Nguenduam')," +
            "('Atentar, tantear','Shumpátun')," +
            "('Atinar con algo','Leqn')," +
            "('Atinar (dar en el blanco)','Reñman')," +
            "('Atizar el fuego','Maipilltëkun')," +
            "('Atmósfera','Neyenmapu')," +
            "('Atracado, apretado (estar)','Uküfkëlen')," +
            "('Atrás, de atrás (adv.)','Furi')," +
            "('Atrasadamente, posteriormente','Iñangue,iñangui')," +
            "('Atrasado (estar o venir)','Iñalen')," +
            "('Atrasar','Iñanl')," +
            "('Atrasarse','Iñakëlen')," +
            "('Atravesado (adj.)','Kakül')," +
            "('Atravesar','Kaküln, kakeln')," +
            "('Atribuir (algo a alguien)','Troin')," +
            "('Atrincherarse','Rëngaluw, rüngaun')," +
            "('Aturdir','Uyüln')," +
            "('Aturdirse, marearse','Uyün, uyüluun')," +
            "('Aumentar','Kënun, fücháin')," +
            "('Aumentar, agrandar','Yeñpramen, yifüm')," +
            "('Aún, hasta (conj. cop.)','Kenü, kei, keyü')," +
            "('Aún, todavía (adv.)','Petu')," +
            "('Autóctono','Mapuche, mapunche')," +
            "('Avanzar, andar','Amun')," +
            "('Avanzar (con algo)','Tuwëln')," +
            "('Ave, pajaro','Üñëm')," +
            "('A veces','Katrü, katrümel')," +
            "('Avellano, avellana (sust.)','Nguefü')," +
            "('Avena','Winkawella')," +
            "('Avenida, corriente, arroyo','Manguiñ')," +
            "('Aventar','Pichuln')," +
            "('Avergonzar, confundir','Yewellkan')," +
            "('Avergonzarse','Yeweln')," +
            "('Averiguar (algo)','Inaramtun')," +
            "('Avestruz','Choike, cheuke')," +
            "('Aviso (estar sobre)','Peútulen')," +
            "('Avispa','Diumeñ')," +
            "('Ayer','Huya, úya, uiya')," +
            "('Ayudante, amigo','Ingka')," +
            "('Ayudante (trabajo)','Külla')," +
            "('Ayudar, defender','Ingkan, ingkañpen')," +
            "('Ayudarle en algo','Kellun, kelluntékun')," +
            "('Ayunar','Nguëñüutun')," +
            "('Azotar','Kuyáftun, kuyáfn')," +
            "('Azotar (más violencia)','Wimakëtuyen, wirafkanentun')," +
            "('Azul', 'Kallfü, kallvü')" +//último (la coma) <-
            ";";


    public static final String INSERTAR_LETRA_B = "INSERT INTO " + TABLE_LETRA_B + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES "+
            "('Babas','Ülwi' )," +
            "('Babear','ülwin')," +
            "('Bailar (alrededor de algo)','Përuñman, pürun')," +
            "('Baile (sust.)','Perün')," +
            "('Bailarín','Perunfe')," +
            "('Bajar','Naqn, nagn')," +
            "('Bajar algo','Nakemen')," +
            "('Bajar, ir abajo','Naqmëmn')," +
            "('Bajo (confluencia de arroyos)','Wauentu, wawentu')," +
            "('Balancearse','Ngueikülün')," +
            "('Balsa','Tangui, nontuwe')," +
            "('Ballena','Yene')," +
            "('Banquete, comida','Ilelkawn')," +
            "('Bañar (a otro)','Meñekin')," +
            "('Bañarse','Mëñekn, mëñétun')," +
            "('Baño','Meñe, müñe')," +
            "('Barba','Ketre')," +
            "('Barbechar','Wirilun')," +
            "('Barrer','Lépün')," +
            "('Barriga','Pütra')," +
            "('Barro, lodo','Chapa, pele')," +
            "('Bastar','Feikan, fein')," +
            "('Bastón','Retrüpeyun')," +
            "('Batirse, pelear','Weichan')," +
            "('Bautizar (poner nombre)','Üieln, üieltun')," +
            "('Bebedor (sust.)','Pütufe')," +
            "('Beber','Pütun')," +
            "('Bebida (chicha)','Pülku')," +
            "('Benevolencia (adv.)','Poyekechi, ayüun nguen')," +
            "('Bestia (de carga)','Chechëm peye, chechümpeye')," +
            "('Bien (hacienda, dinero)','Kullin')," +
            "('Bien (adv.)','Küme')," +
            "('Bienhechor','Kümelkafe')," +
            "('Bilis, hiel','Ütrum')," +
            "('Blanco, claro (adv.)','Liq, lüq')," +
            "('Blanco (ser)','Liqn')," +
            "('Blandir (arma)','Wifüyün')," +
            "('Blando','Nguëfad, ngëfash')," +
            "('Blando, suave (ropa)','Pañud')," +
            "('Boca (vasos, botellas)','Wën')," +
            "('Boca, orificio','Nülapeyüm')," +
            "('Bocado','Üman')," +
            "('Bola, globo','Mongko')," +
            "('Bolsa (de cuero)','Yapaq')," +
            "('Bondadoso','Poyekechi')," +
            "('Bondad','Küme nguen, kümepiuke')," +
            "('Bonito (adj.)','Tutélu')," +
            "('Bonito (arreglado)','Aden, ')," +
            "('Bonito (adornado)','Aifiñ')," +
            "('Bordados','Ñëmin')," +
            "('Bordadora','Ñëmikafe, ñëmife')," +
            "('Bordar','Ñemin')," +
            "('Borde, margen','Üpel')," +
            "('Borrachera','Kawiñ')," +
            "('Borracho','Ngollife')," +
            "('Borrar, deshacer','Ñamëmn')," +
            "('Borrarse, desaparecer','Ñamn')," +
            "('Bosque, selva','Lemu')," +
            "('Bosta (excremento)','Mé')," +
            "('Brasa','Ailen')," +
            "('Bravo, guapo, altivo','Nowü, noü')," +
            "('Brazo (pata anterior)','Lipang')," +
            "('Breve (adv.)','Pichitu')," +
            "('Brillante (adj.)','Wilëf')," +
            "('Brillar, resplandecer','Wilëfn, wilëfün')," +
            "('Brincar','Chongkan, chongkatun')," +
            "('Brinco','chonga, rüngkü')," +
            "('Brindar','Llaqn, llaqpan')," +
            "('Bronce','Chod pañilwe')," +
            "('Brotar','Pewün')," +
            "('Brote','Kalla')," +
            "('Bruja, hechicera','Kalku')," +
            "('Brujería','Wekufutun')," +
            "('Bueno (adj.)','Küme')," +
            "('Bueno (ser)','Kümen')," +
            "('Buenos días','Marimari, maimai')," +
            "('Buey','Manshun')," +
            "('Búho','Kongkong')," +
            "('Bulto (cosas)','Yewen')," +
            "('Burla','Ayetuchen')," +
            "('Burlarse','Ayetun')," +
            "('Burlesco','Ayakafe')," +
            "('Burlón','Ayetuchefe')," +
            "('Buscar','Kintun')," +
            "('Buscar sustento','Kintukawn')," +
            "('Buscar trabajo','Nguillafaluun')," +
            "('Buscar alimentos (pedir, comprar)','Wüfkün')," +
            "('Buscar leña','Mamülln')" +
            ";";



    public static final String INSERTAR_LETRA_C = "INSERT INTO " + TABLE_LETRA_C + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Cabal, cabalmente','Trür')," +
            "('Cabalgar','Kawelltun, kawellutun')," +
            "('Caballo','Kawellu, kawell')," +
            "('Caballo, a','Kawellunuu, kawellutu')," +
            "('Cabecear','Chongkütun')," +
            "('Cabecera (sust.)','Metrül')," +
            "('Cabello, pelo','Longko')," +
            "('Cabeza','Longko, lonco')," +
            "('Caber','Feikon')," +
            "('Caber aquí','Trafpan')," +
            "('Cacarear','Chachakün')," +
            "('Cacique, jefe de guerra','Toki')," +
            "('Cacique, jefe de paz','Ülmen')," +
            "('Cachimba','Kitra')," +
            "('Cada día','Mollkiñeantü')," +
            "('Caderas','Rüyün, tutre')," +
            "('Caer en ruina','Teifunaqn')," +
            "('Caer un objeto, perderse','Llangkün')," +
            "('Caer de cara','Mëllodnaqn')," +
            "('Caerse','Trann')," +
            "('Caerse con algo','Tranyen')," +
            "('Caerse flores, frutas, hojas ','Llangkon')," +
            "('Cadáver','Lá')," +
            "('Caído (desuso, olvidado)','Ñamkëlen')," +
            "('Caja, tambor de la Machi','Kultrung')," +
            "('Calabaza, zapallo (instrumento)','Wada')," +
            "('Calculador (adj.)','Rafike')," +
            "('Caldeado (adj.)','Kofilñ')," +
            "('Caldear, quemar la piel ','Lëfün')," +
            "('Caldo, jugo, savia','Korü')," +
            "('Calentar','Eñumaln')," +
            "('Calentarse','Eñumtun')," +
            "('Caliente (adj.)','Eñum')," +
            "('Caliente (mucho)','Ali')," +
            "('Calma (sin perturbaciones)','Üdwe')," +
            "('Calor, fiebre','Aré')," +
            "('Calor, el verano','Antüguen')," +
            "('Calumnia','Trürem dëngu (dungu)')," +
            "('Calvo (adj.)','Lawlau')," +
            "('Calvo, perder el pelo ','Lawn')," +
            "('Callampa','Këtrawa')," +
            "('Cama (sust.)','Ngëtantu')," +
            "('Cama, hacer la','Ngëtantun')," +
            "('Camarón (de estero)','Sanglúe, dakllu')," +
            "('Cambiar','Welukan')," +
            "('Cambiar, una cosa','Welukënun')," +
            "('Cambiado, ser incorrecto','Welulen')," +
            "('Cambio (Negocio, a razón de)','Trafkintu')," +
            "('Caminar a brincos','Chefküiawn')," +
            "('Camino','Rëpü')," +
            "('Camino, angostura','Üped')," +
            "('Camino, hacer un','Rëpüln')," +
            "('Camino, abrirse un','Wengan')," +
            "('Camino, perder el','Ñuin')," +
            "('Campanilla (garganta)','Méta')," +
            "('Canal, zanjón ','Lol')," +
            "('Canal, hacer un','Ngakan')," +
            "('Canas','Trüren')," +
            "('Canción, canto, poesía','Ül')," +
            "('Canelo','Foike')," +
            "('Canoa','Wampo, wampu')," +
            "('Cansar, fastidiar','Afeln')," +
            "('Cansar','Ürküln')," +
            "('Cansarse','Ürkün')," +
            "('Cantar','Ülkantun')," +
            "('Cantar (pájaros)','Dëngun')," +
            "('Cántaro','Metawe')," +
            "('Cantina','Pütupeyüm')," +
            "('Canto (orilla de cosas)','Üllef')," +
            "('Caña (maíz)','Fochañ')," +
            "('Caña, tallo','Foron')," +
            "('Cara, rostro','Angue, ad')," +
            "('Caracoles de mar','Chomëllko')," +
            "('Caramba (interj.)','Fort!')," +
            "('Carbón (sust.)','Kuyul')," +
            "('Carbonero','Kuyulkamañ')," +
            "('Carcomido, estar','Purutun nguen')," +
            "('Cardo (planta)','Troltro')," +
            "('Carga (sust.)','Chechëmn, chechümn')," +
            "('Carmenar, desenredar','Wiñudün')," +
            "('Carne (sust.)','Ilo')," +
            "('Carne (cuerpo)','Fën')," +
            "('Carnero, oveja','Weke')," +
            "('Carrera (a pie)','Nótulefn')," +
            "('Carrillos, mejillas','Paftraangue')," +
            "('Carta, libro','Chillka')," +
            "('Casa, choza, edificio','Ruka')," +
            "('Casita (dim.)','Shuka')," +
            "('Casa, hacer una','Rukan')," +
            "('Casada (ser)','Fëtanguen')," +
            "('Casado (ser)','Kurenguen')," +
            "('Cascada','Trayen')," +
            "('Cáscara, corteza','Trölef')," +
            "('Casco, uña','wili')," +
            "('Casco, tiesto, pedazo','Trelëf')," +
            "('Casi (adv.)','Epe, epekechi')," +
            "('Caso, al (adv.)','Wif')," +
            "('Caso, no hacer','Kochimn')," +
            "('Caso, hacer, obedecer','Tangkün')," +
            "('Castigar','Kewan')," +
            "('Castigar (pegar)','Wirafn, wirafün')," +
            "('Casualidad','Ado, adno')," +
            "('Cauce (río)','Wauwawn')," +
            "('Cautivar','Nütun')," +
            "('Cauto, estar','Kuñiutulen')," +
            "('Catre','kawitu')," +
            "('Cavar (tierra)','Rëngan')," +
            "('Cavar, labrar la tierra','Kaikün')," +
            "('Cazador (sust.)','Tralkatufe')," +
            "('Cebada','Kawella')," +
            "('Cedazo, cernidor','Chiñidwe')," +
            "('Ceder, vender','Wëltëkun')," +
            "('Cegarse','Traumen, llumüdn')," +
            "('Cejas (sust.)','Dëñiñ, nedin')," +
            "('Cejas, arrancar las','Nguedintun')," +
            "('Celar','Mërituwn')," +
            "('Celebrar, cumplir','Entun, nentun')," +
            "('Celebrar, alzar, erigir','Itrañpramn')," +
            "('Celebrar, alabar','Përamyen')," +
            "('Celebrar la fiesta','Kawiñtun')," +
            "('Celo (sexual)','Koden')," +
            "('Celo, animal en','Yayün')," +
            "('Cementerio (sust.)','Püllil')," +
            "('Cenit (sust. adj.)','Ranguiñwenu')," +
            "('Ceniza','Trufken')," +
            "('Ceniza, reducido a','Trufkenkëlewen')," +
            "('Cepillar, acepillar','Kafedün')," +
            "('Cera (sust.)','Iwiñmishki')," +
            "('Cerámica, hacer','Widün')," +
            "('Ceramista, alfarero','Widufë')," +
            "('Cerca (adv.)','Llekü, pëllé')," +
            "('Cercar, estar','Llekülen')," +
            "('Cerca, tocante (pref.)','Fël')," +
            "('Cercanía (sust.)','Iná, inau')," +
            "('Cercar, rodear','Walloñman, wallotun')," +
            "('Cerco, corral','Malal')," +
            "('Cerciorarse','Mupinmupilkawn')," +
            "('Cerebro, sesos','Mëllo')," +
            "('Cerner','Chiñidn')," +
            "('Cerrarse (herida)','Trafn')," +
            "('Cerro','Wingkul, mawida')," +
            "('Cesta','Chaiwe')," +
            "('Chacra (terreno)','Llodkéñ mapu')," +
            "('Champa, terrón','Kepe')," +
            "('Chamuscar, quemar','Kuipëdn')," +
            "('Charco, laguna','Dawüll')," +
            "('Charqui (carne seca)','Charki, anguim')," +
            "('Chasquear','Trofntropémn')," +
            "('Chasquido, dar','Trofn')," +
            "('Chato, aplastado','Chaped')," +
            "('Chico (adj.)','Pichi')," +
            "('Chispa','Pëtuikütral, pëtiwi')," +
            "('Chispear','Pëten')," +
            "('Chisporrotear','Trüwn')," +
            "('Choclo','Karüuwa, karüwa')," +
            "('Cicatero, mezquino','Rëku, rëkufe')," +
            "('Cicatriz (sust.)','Añken')," +
            "('Ciego, tuerto','Trauma, llumü')," +
            "('Ciego (sust.)','Pelonulu')," +
            "('Cielo, tiempo, clima','wenu')," +
            "('Cien, ciento','Pataka')," +
            "('Ciénaga, pantano','Wengko')," +
            "('Ciencia, saber','Kimn, Kimlu')," +
            "('Cigarra','Afülkelleñfe')," +
            "('Cinco','Kechu')," +
            "('Cinta (para el cabello)','Nguetrowe')," +
            "('Circular, redondo (adj.)','Chügkëd, trongkai')," +
            "('Ciruelillo, notro','Notru')," +
            "('Ciudad (sust.)','Waría, kara')," +
            "('Civilizarse','Wingkawn')," +
            "('Cizaña','Kamcha')," +
            "('Clara de huevo','Liqkuram')," +
            "('Claridad, luz','Pelo')," +
            "('Claro, transparente','Ailiñ')," +
            "('Claro (adv.)','Pelomtu')," +
            "('Claro, ser','Pelonguen')," +
            "('Claro, estar','Tranálen')," +
            "('Clase','Trokiñ')," +
            "('Clases, de varias','Kákeme, kákeumechi')," +
            "('Coagularse','Trüngkün')," +
            "('Cobija (sust.)','Ültu')," +
            "('Cobijar, cubrir','Ültuln')," +
            "('Cobijarse','Ültuluwn')," +
            "('Cobrar','Ramtun')," +
            "('Cocer','Afün')," +
            "('Cochayuyo','Kollof')," +
            "('Codicioso (adj.)','Nganguefe')," +
            "('Coger, tomar, aprehender','Tun, nün')," +
            "('Coincidir','Kiñentrürn')," +
            "('Coipo','Koipu')," +
            "('Cojear','Küntron')," +
            "('Cojo','Küntro')," +
            "('Cola','Këlen')," +
            "('Colaborador','Kelluwen')," +
            "('Colar, colador','Chaitun')," +
            "('Colegial, estudiante','Chillkatufe')," +
            "('Colgar, estar colgado','Pëltrün')," +
            "('Colgantes, adornos femeninos','Pëñpëñel')," +
            "('Colmado (adj.)','Nuimen')," +
            "('Colmar','Nuimeln, nuimiln')," +
            "('Colocar','Tëkun')," +
            "('Color, colores','Wirin')," +
            "('Colorado, rojo (adj.)','Kelú')," +
            "('Colorado, ser','Kelün')," +
            "('Columpiar','Piuchillkantun')," +
            "('Collar (mapuche)','Trarüpel')," +
            "('Comer','In')," +
            "('Comer, dar de','Ileln')," +
            "('Comer con ansia, devorar','Üpang')," +
            "('Comerciante (sust.)','Nguillakafe')," +
            "('Comezón','Üna')," +
            "('Comida, banquete','Ilelkawn')," +
            "('Comida, guardar','Echeln')," +
            "('Como (adv.)','Keyü')," +
            "('Cómo (adv. interrog.)','Chum')," +
            "('Compañero, ayudante','Wenüi, ingka')," +
            "('Compasión, con, tener','Fërénechen')," +
            "('Complaciente, ser','Puwënfaln')," +
            "('Completo, todo (adj.)','Kom')," +
            "('Completo, ser','Trürn')," +
            "('Comprar, buscar alimentos','Wüfkün')," +
            "('Comprar algo','Nguillan')," +
            "('Compras, hacer las','Nguillakan')," +
            "('Comprimir','Nguëtrálün')," +
            "('Concertar','Dakeltun')," +
            "('Concordar, encontrarse','Reñmawn')," +
            "('Concluir','Afentun')," +
            "('Concluido, haberse acabado','Afkëlen')," +
            "('Conclusión','Afdëngu')," +
            "('Conculcar, hollar','Pënokëtuyen')," +
            "('Condimentar, preparar','Pepi, pepikan')," +
            "('Cóndor','Mañke')," +
            "('Confiar, tener apoyo','Fétaluwn')," +
            "('Conformarse, contentarse','Tutéwn, puümwn')," +
            "('Confundir','Weluñmanien')," +
            "('Confuso, estar','Weluduamn')," +
            "('Conocer','Kimn')," +
            "('Conocible, inteligible (adj.)','Kimfal')," +
            "('Conocido, haberle','Kimfal')," +
            "('Conocimiento (aprendiendo)','Kimkëlen')," +
            "('Consejo, normas, estatutos','Ngülan')," +
            "('Consentir, quere, obedecer','Main')," +
            "('Conservarse, cuidarse','Kuñültuwn')," +
            "('Consolar','Yafülduamn, ñaufauln')," +
            "('Consolarse','Ñaufaun')," +
            "('Construir, realizar, hacer','Deuman')," +
            "('Consultar, preguntar','Ramtun')," +
            "('Contado, señalado (adj.)','')," +
            "('Contar, referir','Nütramnentun')," +
            "('Contar cuentos','Apeutun')," +
            "('Contar, calcular','Rakin')," +
            "('Contento, estar','Trüyüulen, küme duamkëlen')," +
            "('Contestar, responder','Llowdëngun, lloudëngun')," +
            "('Contorno, exterior','Ad')," +
            "('Contradecir','Üiaqtun')," +
            "('Contradecir a alguien','Traqtun')," +
            "('Contraerse, encogerse','Trëkëfün')," +
            "('Contrapesar','Fane fanetun')," +
            "('Contrariar, contradecir','Traftun')," +
            "('Convenir','Feyentun')," +
            "('Conversación, relato, narración','Hütram')," +
            "('Conversar','Nütramkan')," +
            "('Convidado (sust.)','Manguel')," +
            "('Convidar','Llaukenguëlëmn')," +
            "('Copete, moño','Kemchol')," +
            "('Copiar, imitar','Inádentun')," +
            "('Copihue','Kolkópiu')," +
            "('Corcova, joroba','Nguëtrufuri')," +
            "('Cordero','Ofida, ofisha')," +
            "('Cordillera','Dewiñ')," +
            "('Cornear','Leftun, levtun')," +
            "('Cortamente (adv.)','Pichitu')," +
            "('Cortar','Katrün')," +
            "('Corto, chico, pequeño','Pichi, pëchi')," +
            "('Corredor (adj.)','Nekul')," +
            "('Correr, huir','Nekuln, Lefn')," +
            "('Correrse','Shingueamun')," +
            "('Corretear','Wemun')," +
            "('Corriente (sust., adj.)','Witrun')," +
            "('Corroer, roer','Üngalün')," +
            "('Corromperse','Wedáwn')," +
            "('Corrompido, perverso (adj.)','Wedáñma, weráñma')," +
            "('Cosa, asunto, fallo','Dëngu')," +
            "('Cosa, bienes, objetos','Wéshakelu')," +
            "('Cosecha','Konguinnguen')," +
            "('Cosechador','Konguife')," +
            "('Cosechar','Konguin')," +
            "('Coser','Wipun, ñidëfkan')," +
            "('Cosquillas','Chiküll, chikell')," +
            "('Cosquillas, tener','Ñaiyün, chikülln')," +
            "('Cosquillas, hacer','Ñaiyúkeln')," +
            "('Costado (sust.)','Kadi')," +
            "('Costado, poner de','Kadi kënun')," +
            "('Costilla','Kadiforo')," +
            "('Costumbre','Ad')," +
            "('Costurero (sust. adj.)','Ñidëffe')," +
            "('Coyuntura (huesos)','Ülnguëd, troi')," +
            "('Coz, patada','Mangkün')," +
            "('Crear','Eln')," +
            "('Crecer, criarse','Tremn')," +
            "('Crecido (adj.)','Trem')," +
            "('Crédulo (adj.)','Mupintufe')," +
            "('Creer, obedecer, convenir','Feyentun')," +
            "('Creer','Mëgueltun')," +
            "('Crespo (adj.)','Trinti, trintrü')," +
            "('Creyente','Mupintulu')," +
            "('Crisol','Charu')," +
            "('Crudo','Karü')," +
            "('Crujir, rechinar','Tritrürün')," +
            "('Cruzarse','Weluiawn')," +
            "('Cuando (adv. relat.)','Feichiwe')," +
            "('Cuándo (adv., interrog.)','Chumel')," +
            "('Cuántos (adj., interrog.)','Mufü')," +
            "('Cuatro','Meli')," +
            "('Cubrir, tapar','Takun')," +
            "('Cuchara (mapuche)','Witrü, wütrü')," +
            "('Cucharón','Rëfuwe')," +
            "('Cuchichear','Kafkütun')," +
            "('Cuello, garganta','Pel')," +
            "('Cuenta, cálculo','Rakin')," +
            "('Cuento','Apeu')," +
            "('Cuento, narración, historia','Nütram')," +
            "('Cuerno, cacho','Mëta')," +
            "('Cuero, pellejo','Trelke')," +
            "('Cuerpo','Angka')," +
            "('Cuervo','Yeku')," +
            "('Cueva','Lolo')," +
            "('Cuidado, peligro (sust.)','Kuñiwn')," +
            "('Cuidado, con (adv.)','Kuñiutu')," +
            "('Cuidadosamente, atentamente (adv.)','Nguenduam')," +
            "('Cuidar, gobernar','Nguenn')," +
            "('Cuidar','Kintunien')," +
            "('Cuidarse','Kuñiutun')," +
            "('Culebra, serpiente','Filu')," +
            "('Cultivar','Küdaun')," +
            "('Cumbre','Wechu, wechun')," +
            "('Cumplir','Puümn')," +
            "('Cumplir años','Trafman')," +
            "('Cumpir promesa','nentun')," +
            "('Cuna (mapuche)','Kupëlwe')," +
            "('Cuncuna, oruga','Pëtreu')," +
            "('Cundir, propagarse','Püdn')," +
            "('Cuñada','Ñadu')," +
            "('Cuñado','Enpunguillan')," +
            "('Curandero, a (mapuche)','Machi')," +
            "('Curar (heridas)','Ampin')," +
            "('Curar, sanar personas','Dachen, datun')," +
            "('Curioso, ser','Fiñmanguen')," +
            "('Cutis, piel','Trawa')" +
            ";";


    public static final String INSERTAR_LETRA_D = "INSERT INTO " + TABLE_LETRA_D + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Danza (araucana)','Përun')," +
            "('Dar, entregar','Wëln, ruln')," +
            "('Darse, prestarse','Wëluwn')," +
            "('Dar algo a alguien','Elun')," +
            "('Darse algo (mutuamente)','Eluwn')," +
            "('Dar a luz, parir','Lleqëmn')," +
            "('Dar en el blanco, atinar','Reñman')," +
            "('Dar de comer','Ileln')," +
            "('Dar fin','Fenté')," +
            "('Dar pasos, marchar','Trekan')," +
            "('Dar prisa, apresurar','Matukaln, matumatukaln')," +
            "('Dar vuelta, volcar','Shëkülln')," +
            "('Darse prisa','Matukeln')," +
            "('Darse vuelta','Shëkülluwi')," +
            "('De (prep.)','Meu, mo')," +
            "('De antemano, primero','Wema')," +
            "('De frente (exp., adv.)','Reñman')," +
            "('De una vez (adv.)','Kiñetu')," +
            "('De veras, en realidad','Rëf, rëftu')," +
            "('Debajo de (prep.)','Minche')," +
            "('Debajo, por (adv.)','Minchetu')," +
            "('Débil, timido','Noiwa')," +
            "('Débil, estar muy','Entrin')," +
            "('Decaído, triste','Láduamn')," +
            "('Decir algo','Pin')," +
            "('Dicen, se dice','Piam')," +
            "('Decir la verdad','Müpin, rüfdungun ')," +
            "('Dedo','Changëll')," +
            "('Dedo de la mano','Changëll kuq')," +
            "('Dedo del pie','Chanqëll namun')," +
            "('Defectuoso, imperfecto','Well')," +
            "('Defender','Dénguñpen')," +
            "('Defenderse con armas','Weichañpewn')," +
            "('Dejar','Eln')," +
            "('Dejar (complementario)','Kënun')," +
            "('Dejar hecho','Deukënun')," +
            "('Dejar solo','Kidukënun')," +
            "('Deleitarse, deleitar','Trüyüwëlkawn')," +
            "('Delgado, fino','Pichirume, Péllüf')," +
            "('Delito (sust.)','Werin')," +
            "('Delito, cometer un','Weriluwn')," +
            "('Demasiado (adv.)','Wëtéwe')," +
            "('Demente, ignorante, tonto','Kimno')," +
            "('Demoler (cosas)','Teifukëtuyen')," +
            "('Demonio (sust.)','Wekufü')," +
            "('Denantes, antes, ','Pichi tay, tayí')," +
            "('Después','Tayiwëla, tayilen')," +
            "('Denso (adj., adv.)','Trongue')," +
            "('Denso, tupido, poblado','Trongn')," +
            "('Denunciar, descubrir algo','Pitëkun')," +
            "('Departamento, alcoba (sust.)','Katrüntëku')," +
            "('Deplorar (algo)','Ngümayen')," +
            "('Derecha (adj. la mano)','Mankuq')," +
            "('Derechamente','Norkechi')," +
            "('Derecho, recto','Nor')," +
            "('Derecho (adj.)','Man')," +
            "('Derramar','Wëtrunn')," +
            "('Derredor (sust.)','Wall')," +
            "('Derredor, ver en','Wallke')," +
            "('Derretir (algo)','Llewëmn')," +
            "('Derretirse','Lleun, llewn')," +
            "('Derribar, voltear','Trantun')," +
            "('Derrumbarse','Treilon, trein')," +
            "('Desagüe, hacer un','Ngakan')," +
            "('Desaparecer, perderse','Llangkün')," +
            "('Desatar','Naitun, ñaitun, neipin')," +
            "('Desbastar','Kafn, yüfkün')," +
            "('Descansar','Ürkütun')," +
            "('Descanso, estar en','Ürkütulen')," +
            "('Descascarar, pelar','Sollkin, dollkün')," +
            "('Descendencia, generación (sust.)','Yallel')," +
            "('Descompuesto','Nangkan')," +
            "('Descuartizar','Pillkádn')," +
            "('Descuidadamente','Upéduam')," +
            "('Descuidarse','Upéluwn, upéwn')," +
            "('Descuido','Uduam')," +
            "('Desdoblar','Lafpëmn')," +
            "('Desde siempre','Rumel')," +
            "('Deseable, apetecible (adj.)','Illufal')," +
            "('Deseable, ser','Duamfaln')," +
            "('Desear','Duamn')," +
            "('Desear, apetecer','Illun')," +
            "('Desenredar','Wiñudün')," +
            "('Desenterrar','Rëngalentun')," +
            "('Deseo (sust.)','Apill')," +
            "('Desfiladero','Üped')," +
            "('Desgajar, arrancar','Kacharnentun')," +
            "('Desgajar (ramas)','Pilládentun')," +
            "('Desgarrar','Kaqültun')," +
            "('Desgastar, estregar','Ünguern')," +
            "('Desgracia (sust.)','Lladkün dëngu')," +
            "('Desgracia, causar','Awün')," +
            "('Desgraciado, pobre (adj.)','Kuñifal')," +
            "('Desgranar','Shollkin, dollkün')," +
            "('Deshacer, deshebrar','Winúlün')," +
            "('Deshacerse, descomponer','Tein')," +
            "('Deshonesto (adj.)','Ñua')," +
            "('Designar','Úwëmn')," +
            "('Deslizarse','Pinúiün, pinuyün')," +
            "('Desmenuzar','Iran, iratun')," +
            "('Desmoronarse','Lein')," +
            "('Desnudar','Tranákënun')," +
            "('Desnudo (adj.)','Triltrang')," +
            "('Desobediente, travieso (adj.)','Wedwed')," +
            "('Desocupado, estar','Tüngn')," +
            "('Desollar (un animal)','Llochónentun')," +
            "('Desordenar','Reifütun')," +
            "('De sorpresa (adv.)','Lloftukechi')," +
            "('Despacio','Ñochi, ñochikechi')," +
            "('Despachar (algo)','Wënélkëlen')," +
            "('Despacho (negocio), cantina','Pütupeyüm')," +
            "('Desparramar','Widpün')," +
            "('Desparramarse','Püdn, fulin')," +
            "('Desparramándose, caer','Fulinaqn')," +
            "('Despedazar, desgarrar','Wirüftun')," +
            "('Despedir','Lelëmn, leikümn')," +
            "('Despedir, enviar, mandar','Nguiyun')," +
            "('Despedir, soltar, liberar ','Mëñaln, mëñaltun')," +
            "('Despedirse','Chaliwedan')," +
            "('Despejar, desocupar','Liftun')," +
            "('Despertar a alguien','Nepeln')," +
            "('Despertarse','Nepen')," +
            "('Despiojar','Shuñin')," +
            "('Despiojarse','Shuñiwn')," +
            "('Despoblado, desierto (sust.)','Üwe')," +
            "('Despreciar','Kochimn, illamn')," +
            "('Después (adv.)','Wëlá')," +
            "('Después, sólo','Wëlá wëlá')," +
            "('Destapado, estar','Tralüngkëlen')," +
            "('Destapar, desnudar','Tranákënun')," +
            "('Destetar','Ükaln')," +
            "('Destetar, separar','Wichuln')," +
            "('Destilar','Wilfodün')," +
            "('Destripar, escamar (pescado)','Rochallwan')," +
            "('Destroncar, arrancar de raiz','Wengkolentun')," +
            "('Destrozar','Këmpun')," +
            "('Destrozarse, desgarrarse','Chafodün')," +
            "('Destruido (adj.)','Teifun')," +
            "('Destruir, arruinar','Teifun')," +
            "('Destruir, pervertir','Teyëmn')," +
            "('Desvalido, huérfano','Kuñifal')," +
            "('Desvergonzado (adj.)','Nguenóyewen')," +
            "('Determinar','Elduamn')," +
            "('Devorar','Üpangüpangn')," +
            "('Devorar, tragar','Lëmüm')," +
            "('Día, sol','Antü')," +
            "('Día, este (hoy)','Fachantü, fachiantü')," +
            "('Día (al día siguiente)','Wülemeu')," +
            "('Diariamente','Münguenantü')," +
            "('Diarrea','Pechaikutran')," +
            "('Dibujante (en tejido)','Nguëpükafe')," +
            "('Dibujar, rayar, pintar','Wirin')," +
            "('Diente','Foro, ülnga')," +
            "('Diestro (adj.)','Trüf')," +
            "('Difícil','Küdaunguen, newenkëlen')," +
            "('Dificilmente (adv.)','Nguellu')," +
            "('Digerido (adj.)','Afün')," +
            "('Diluirse, disolverse','Lein')," +
            "('Dios (dominador de los hombres)','Nguënéchén')," +
            "('Dios (dominador de la tierra)','Nguënémapun')," +
            "('Disculpar','Dënguñpen')," +
            "('Disgustar','Lladkülkan')," +
            "('Disgustarse','Lladkün')," +
            "('Disminuirse','Konmen')," +
            "('Disparatar','Weludëngun')," +
            "('Disponer','Trürëm dëngu')," +
            "('Disponer, mandar','Nguenn')," +
            "('Dispuesto, estar','Pepiluukëlen, pepiluwn')," +
            "('Dispuesto, listo','Pilelkaukëlen')," +
            "('Disputar, porfiar','Nótukan')," +
            "('Distancia, a mucha','Alüpu')," +
            "('Distancia, a poca','Pichipu')," +
            "('Distinguir','Kangueltun')," +
            "('Distinguir, no','Weluñmanien')," +
            "('Distribuir, partir','Wëdamn')," +
            "('Distribuir, repartir','Trokin')," +
            "('Diversión (sust.)','Ayekantun dëngu')," +
            "('Divertir','Ayekantuln')," +
            "('Divertirse','Kángueduamn')," +
            "('Dividir','Wëdkan')," +
            "('Dividirse, partirse','Wedan')," +
            "('Divieso, apostema','Poi')," +
            "('Divisar','Adkintun, adkintulen')," +
            "('División, porción','Trokiñ')," +
            "('Doblado','Mëchalen, mëchamkëlen')," +
            "('Doblar','Mëchamn, mëchatëkuñ')," +
            "('Doblar, encoger','Ngañchódün')," +
            "('Doblarse, encogerse','Ngañchódün, Nguëllun')," +
            "('Doblarse, torcerse','Nguëñun')," +
            "('Dócil, humilde','Pëñeñwn nguen')," +
            "('Dolor, enfermedad (sust.)','Kutran')," +
            "('Dolor (interj.)','Atrütrüi!')," +
            "('Dominarse, abstenerse','Katrütuwn')," +
            "('Donde, de donde, adónde','Cheu')," +
            "('Donde quiera','cheu rume')," +
            "('Donde, hacia','Cheu pële')," +
            "('Dorado (adj.)','Millan')," +
            "('Dormir','Umaqn')," +
            "('Dormirse','Umaqnaqn')," +
            "('Dormir con alguien','Kudumn, kudutekun')," +
            "('Duende','Shechü, sechü')," +
            "('Duende (mapuche)','Añchimallen')," +
            "('Dulce (adj.)','Kochi')," +
            "('Dulce (persona)','Ñochiduamlen, Ñochiduamkëlen')," +
            "('Dueño (sust.)','Nguen')," +
            "('Dueño, ser','Nguen nguen')," +
            "('Durar mucho','Alüñmalen')," +
            "('Durar poco','Pichiñmalen, pichiman')," +
            "('Duro, firme (adj.)','Yafü')," +
            "('Duro, ser fuerte, resistente','Yafün')," +
            "('Duro, masculino (adj.)','Wentru')" +
            ";";


    public static final String INSERTAR_LETRA_E = "INSERT INTO " + TABLE_LETRA_E + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Ebrio (adj.)','Ngollin')," +
            "('Eclipsarse','Ian')," +
            "('Eco (sust.)','Auinko, dengkülla')," +
            "('Eco, dar (resonar)','Aukiñn, aukin')," +
            "('Echar (poner adentro)','Tëkun')," +
            "('Echar mirada','Kimturuin, kintuwëin')," +
            "('Echarse','Trañman')," +
            "('Educar','Tremëmn')," +
            "('Educar, formar, instruir','Yimëmn')," +
            "('Efervescencia, estar en (hervir)','Fülfülkelen')," +
            "('Ejecutar','Deumanentun')," +
            "('El (art.)','Feichi')," +
            "('El, ella, ello, lo (sust., pron, dem.)','Fei (fechi)')," +
            "('El es, eso es','Feille mai')," +
            "('Elevar, enaltecer, alzar','Wenuñpramn')," +
            "('Elocuente (adj.)','Weupife')," +
            "('Embarazar','Niepëñeñein')," +
            "('Embarazada, estar','Niechenguen')," +
            "('Embarrarse','Chapatun, peletun')," +
            "('Embellecer, adornar','Aifiñn, aifiñein')," +
            "('Embotar, arromar','Trunguëmn'),"+
            "('Embriagar','Ngolliln')," +
            "('Embriagarse','Ngollon')," +
            "('Embromar','Ayenien')," +
            "('Embuste','Trürëm dëngu')," +
            "('Emocionado','Trepeduamn')," +
            "('Emocionarse, espantarse','Trepen')," +
            "('Empacharse','Këfkëfün, këfiwn')," +
            "('Empapado, estar','Wilfodkëlen')," +
            "('Empapar','Wifóntekun')," +
            "('Empaparse','Këltrafn')," +
            "('Emparejar','Kengkürkénun, kengkürn')," +
            "('Emparentado (sust.)','Nguillañ')," +
            "('Empequeñecer, abreviar','Pichilkan')," +
            "('Empezar','Konn')," +
            "('Empinarse','Empfn')," +
            "('Emplear','Ein')," +
            "('Empleado, tener a alguno','Elnien')," +
            "('Empollar','Mollfüñein')," +
            "('Empujar','Peltün, pelün')," +
            "('Empujar, impulsar','Rëtren')," +
            "('En (adv.)','Kiñepële')," +
            "('En (prep.)','Meu, mo')," +
            "('En aquel tiempo (expr. adv.)','Feichiwe')," +
            "('En exceso (adj.)','Rumeñma')," +
            "('En frente','Itró tripa meu')," +
            "('En la tierra (exp. adv.)','Maputu')," +
            "('En lugar de','Welu')," +
            "('En medio de (prep.)','Rangui, pu rangui')," +
            "('En ninguna parte','Cheun rume')," +
            "('En parte (adv.)','Llaqkechi')," +
            "('En partes, en porciones','Trokitu, trokitroki')," +
            "('En realidad, de veras','Rëf, rëftu')," +
            "('En verdad','Mupinkechi')," +
            "('Enamorado, estar','Ayü lëmn')," +
            "('Encajado, dejar','Ukulkénun')," +
            "('Encajado, estar','Ütrafkëlen')," +
            "('Encajar','Ükultëkun, ukultun')," +
            "('Encaminar, guiar','Nguiyuin')," +
            "('Encanecer','Trürenn')," +
            "('Encararse con otro','Anguetun')," +
            "('Encargado (adj.)','Elfal, elfaltu')," +
            "('Encargado, dejar','Elfalkënun')," +
            "('Encargar','Chalintëkun')," +
            "('Encargar algo','Yefaln')," +
            "('Encargo','Yefaltu, elfaltu')," +
            "('Encender (fuego)','Lëpëmn')," +
            "('Encenderse, arder','Üin')," +
            "('Encías','Üdëm')," +
            "('Encima, sobre','Wente, wenche')," +
            "('Encogerse','Ngañchódün')," +
            "('Encomienda','Elfaltu')," +
            "('Encontrar, ver, adquirir','Pen')," +
            "('Encontrar (en otra parte)','Perpun')," +
            "('Encontrarse, concordar','Reñmawn')," +
            "('Encontrarse (en el camino)','Trafuwn')," +
            "('Encresparse','Trünüfn')," +
            "('Encubar, empollar','Llëpañn')," +
            "('Enderezar','Norkënun')," +
            "('Enemigo','Kaiñe')," +
            "('Enemigos (entre sí)','Kaiñewen')," +
            "('Enérgico, ser','Yafüduamn')," +
            "('Enfadarse','Chañiwn')," +
            "('Enfermedad','Kutran')," +
            "('Enfermizo, inválido','Kutranfe')," +
            "('Enfermo (adj. sust.)','Kutran')," +
            "('Enfermo (fingir)','Kitranufaluwn')," +
            "('Enfermo (terminal)','Lakutrankëlen')," +
            "('Engalanar','Aifiñtun')," +
            "('Engañar','Ngüenénkan, nguënéntun')," +
            "('Engañar a alguien','Ngüenénkaln, nguënéntuln')," +
            "('Engaño','Koila')," +
            "('Engaño, astucia, mentira','Nguënén')," +
            "('Engañoso, ser','Puñchulkachen, Puñchulnguen')," +
            "('Engendrar, multiplicarse','Yalln')," +
            "('Engordar','Motriln')," +
            "('Enjambre, estar en','Wiluwilunguen')," +
            "('Enjambres, bandadas','Lumpuamun')," +
            "('Enjugar','Ülpun, nguëllúdn')," +
            "('Enjutar, secar','Piwemn')," +
            "('Enjutarse, secarse','Piwen, piwn, piwün')," +
            "('Enjuto, estar','Piwelen')," +
            "('Enmohecerse','Perkañn, perkañkëlen')," +
            "('Ennoblecer','Ülmeneln')," +
            "('Enojado, estar','Illkulen')," +
            "('Enojar','Piaweln')," +
            "('Enojarse, encolerizarse','Illkun')," +
            "('Enojarse sin motivo','Illkupëdan')," +
            "('Enojón, rabioso (adj.)','Illkufe')," +
            "('Enredar','Ñidwen')," +
            "('Enredarse, turbarse','Ñidwewn, chürwawn')," +
            "('Enronquecerse','Kafim')," +
            "('Ensayar','Pepilpepiltun')," +
            "('Ensenada, recodo','Nguión')," +
            "('Enseñar','Kimëln')," +
            "('Enseñar a alguien','Kimëin')," +
            "('Ensordecer','Piluln')," +
            "('Ensuciar, manchar','Podëmn')," +
            "('Ensuciarse','Podn')," +
            "('Ensueño','Péuma')," +
            "('Entender mal','Welualkün')," +
            "('Entenderse con alguien','Adeln')," +
            "('Entendido (adj.)','Kim')," +
            "('Enterar, cumplir','Puüm')," +
            "('Entero, todo, completo (adj.)','Kom')," +
            "('Entero, sin lesión (adj.)','Mongkol')," +
            "('Entero, estar','Komkëlen')," +
            "('Enterrado (adj.)','Réngal')," +
            "('Enterrar','Rëmuln, rëngalkënun, rëngalin')," +
            "('Entibiarse','Lirkünaqn')," +
            "('Entrar','Feikon, konn')," +
            "('Entrar a la casa de alguien','Konman')," +
            "('Entregar','Chalintëkun')," +
            "('Entregar, dar, vender','Wëin')," +
            "('Entregar, pasar algo','Ruln')," +
            "('Entretenido (adj.)','Nütramkafe')," +
            "('Entreverar, mezclar','Reifún, reifütun, reipuin')," +
            "('Entristecer','Lladkülkan')," +
            "('Entristecerse','Lladkün')," +
            "('Entumido (adj.)','Chokon')," +
            "('Entumido (de frio)','Chokolen')," +
            "('Entumirse','Chokon')," +
            "('Enturbiar','Trufüin, trufültun')," +
            "('Enturbiarse','Trufüln')," +
            "('Envalentonarse','Konakonatun')," +
            "('Envarillar la casa (protecciones)','Wimülln, wimülltun')," +
            "('Envejecer, ser viejo','Kushén')," +
            "('Envejecer la mujer','Kushén, kuden')," +
            "('Envejecer el hombre','Füchen')," +
            "('Enviar, mandar algo','Werküln, werkülün')," +
            "('Enviar, despedir','Nguiyun, nguiyuin')," +
            "('Envidia','Ütrir')," +
            "('Envidiar (tener)','Ütrim, ütrintun')," +
            "('Envidioso (adj.)','Ütrife, künguefe')," +
            "('Enviudar','Lanputun')," +
            "('Envolver','Chümpoin, impoln, mënuin')," +
            "('Envuelto, estar','Iwëdkëlen, iyuwëdkëlen')," +
            "('Epílogo, conclusión','Afdëngu')," +
            "('Equilibrado','Renengnien')," +
            "('Equivocar algo, confundirlo','Welulkawn')," +
            "('Equivocarse','Welulkawn')," +
            "('Erguido (cuello)','Üwimien')," +
            "('Erguir','Üwirpramn')," +
            "('Erigir, emprender','Witrañpramn')," +
            "('Erizarse el cabello','Chünüllün')," +
            "('Eructar','Relün')," +
            "('Escalera (indígena)','Përaprawe')," +
            "('Escalofríos, tener','Yayáfün, yanchin')," +
            "('Escamas (pez)','Lëli')," +
            "('Escamar, destripar pescado','Rochaliwan')," +
            "('Escapar, librarse, salvarse','Montun')," +
            "('Escarbar','Kaipün, keipün')," +
            "('Escarmentado, estar','Kufkëlen')," +
            "('Escarmentar','Kufn')," +
            "('Escasez, hambruna','Filia')," +
            "('Escatimar algo','Rëkün')," +
            "('Escoba (mapuche)','Lepüwe')," +
            "('Escocerle, dar comezón','Ñikëdün')," +
            "('Escoger, elegir','Dullin')," +
            "('Escoger entre','Dullinentun')," +
            "('Esconder, ocultar','Elkatun, elkan')," +
            "('Esconderse','Elkawn')," +
            "('Escopeta','Tralka')," +
            "('Escopeta, estallar la','Tralkan')," +
            "('Escoria','Mëpañilwe')," +
            "('Escribir, leer','Chillkatun')," +
            "('Escribir, pintar, dibujar','Wirin')," +
            "('Escuchar, poner atención','Allkütun')," +
            "('Escudarse con otro','Furiluwn')," +
            "('Escupir','Tofkün')," +
            "('Escupir a alguien','Tofküman')," +
            "('Escurrirse (líquidos)','Weyun, weyun nguen')," +
            "('Escurrirse, gotear','Tayin, trayintripan')," +
            "('Esófago, tragadero','Rumelwe')," +
            "('Espacio (atmósfera)','Senchu')," +
            "('Espalda (parte posterior)','Furi')," +
            "('Espaldas, ponerse de','Pailakenun')," +
            "('Espaldas, estar de','Pailalen')," +
            "('Espaldas, caerse de','Pailanagn')," +
            "('Espantarse, asustarse','Trepen')," +
            "('Espantarse mucho','Pellken')," +
            "('Espanto, con (adv.)','Pelikenkëchi')," +
            "('Espantoso, ser horrible','Yamn nguen, yañn nguen')," +
            "('Esparcir','Pachün, pachüün')," +
            "('Expectativa, estar a la','Peütulen')," +
            "('Espejo','Komütuwe')," +
            "('Esperar, aguardar','Üguein, ünguëmn')," +
            "('Espeso, condensado','Pëd')," +
            "('Espiga','Longko')," +
            "('Espiga de trigo','Longko kachilla')," +
            "('Espinas del pescado','Fodü challwa')," +
            "('Espinas, clavarse','Wayuntun')," +
            "('Espino (árbol)','Wayun')," +
            "('Espino (arbusto, matorral)','Wayunentu')," +
            "('Espinazo (sust.)','Wingkül')," +
            "('Espíritu humano, alma','Am, pëllü, pëllí')," +
            "('Espíritu del muerto, su alma','Pilláñ')," +
            "('Esponja','Poñpoñ')," +
            "('Espontáneamente (expr. adv.)','Kiduam, kishuduam')," +
            "('Esposo, marido (sust.)','Fëta')," +
            "('Esposa (sust.)','Kure')," +
            "('Esposos entre sí','Kurewen')," +
            "('Espuma','Tror, trorfan')," +
            "('Espumar','Trofanünn')," +
            "('Esputo (sust.)','Tofken')," +
            "('Esqueleto (sust.)','Réforo')," +
            "('Establecerse, echar raíces','Anün')," +
            "('Estaca, poste','Ungko')," +
            "('Estallar (armas de fuego)','Trofn')," +
            "('Estampido, dar','Trüwn')," +
            "('Estancado (agua), charco','Dawüll, dawüll ko')," +
            "('Estancar la sangre','Ñüngn')," +
            "('Estar, haber','Mëlen')," +
            "('Estar todavía','Mëlekan')," +
            "('Estar con','Nguen')," +
            "('Estar sobre algo','Shenchulen')," +
            "('Estatutos','Ngülam')," +
            "('Este (pron. dem.)','Téfa, fá')," +
            "('Este (adj.)','Tëfachi, fachi')," +
            "('Este día, hoy','Fachantü (fachi antü)')," +
            "('Este, esta, esa, ese, eso','Fei')," +
            "('Este mismo','Fei tefá')," +
            "('Estimar, amar','Poyen')," +
            "('Estimarse, amarse','Poyewn')," +
            "('Estómago','Piuke')," +
            "('Estómago, vientre, barriga','Pütra')," +
            "('Estornudar','Echiun')," +
            "('Estrechar (firmemente)','Nguëtraftrapëmn')," +
            "('Estrecho (adj.)','Nguëtraf')," +
            "('Estrechez, angostura (sust.)','Trafme')," +
            "('Estrella','Wanguelen')," +
            "('Estregar, desgastar','Ünguern, ünguerün')," +
            "('Estregar, refregar','Pinguëdün')," +
            "('Estrujar, exprimir','Pëtrün, këtrün')," +
            "('Estupido','Ñoi')," +
            "('Evacuar','Mén, mémen')," +
            "('Evaporizarse','Trukütripan')," +
            "('Exagerar, agrandar','Fucháin')," +
            "('Examinar','Inákitun')," +
            "('Exclusivamente, sin mezcla, puro','Ré')," +
            "('Excrementos','Porché, nguechinche')," +
            "('Exhalación, vaho','Orken')," +
            "('Éxito, tener','Tripan')," +
            "('Expectorar algo','Kaqülentun')," +
            "('Explicar, expresar','Tranánentun')," +
            "('Expuesto, dejar','Tranákenun')," +
            "('Extender, desdoblar','Lafpëmn')," +
            "('Extender a lo largo','Ñëtrünkënun, nëtrüngkün')," +
            "('Extenderse, cundir, propagarse','Püdn')," +
            "('Estendido, estar','Wifkëlen')," +
            "('Exterminar','Cheupëdün')," +
            "('Extranjero, forastero','Witran')," +
            "('Extranjero (no mapuche)','Wingka')," +
            "('Extraños, de otra familia','Kákeche')," +
            "('Extremidad, punta','Wechu, wechun')," +
            "('Extremo, lo más (adv.)','Wechuntu, wechuñuma')" +
            ";";


    public static final String INSERTAR_LETRA_F = "INSERT INTO " + TABLE_LETRA_F + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Falsear','Ñüngkün')," +
            "('Falta, Delito, pecado','Werineluwn')," +
            "('Fallo, pleito, negocio','Dëngu')," +
            "('Familia','Künga')," +
            "('Familia, mi','Kuñül')," +
            "('Familia, descendencia','Küpal')," +
            "('Fanático de las carreras','Kudefe')," +
            "('Fastidiar, cansar','Afein')," +
            "('Fastidiarle (un asunto)','Ñon')," +
            "('Fastidio, causar','Afelnwn nguen')," +
            "('Fastigado, estar débil','Trëllfun')," +
            "('Fauces, las (sust.)','Nguiñngo')," +
            "('Felicitación','Pentëku')," +
            "('Felicitar a uno','Pentëkun')," +
            "('Fermentar','Fain')," +
            "('Fermentar, hervir','Fain yëmn')," +
            "('Fértil (adj.)','Mon')," +
            "('Fértil año','Mon tripantu')," +
            "('Fértil tierra','Mon mapu')," +
            "('Fiebre','Are')," +
            "('Fiel, a algo o alguien','Angkünien')," +
            "('Fierro, metal (sust.)','Pañiwe')," +
            "('Fiesta','Kawiñ')," +
            "('Fiesta, celebrar la','Kawiñtun')," +
            "('Fijarse en algo','Lelinien')," +
            "('Fila (sust.)','Wif')," +
            "('Fila, en','Winwin, wiñwiñ')," +
            "('Fila, poner en','Pitülkélen')," +
            "('Finalizar, poner fin','Afel apemn')," +
            "('Fingir enfermedad','Kutranufaluwn')," +
            "('Fino, tierno, delgado (adj.)','Péllüf')," +
            "('Firme (adj.)','Newen')," +
            "('Firme, duro (adj.)','Yafü')," +
            "('Firmeza, tener fuerzas','Newenkëlen')," +
            "('Flauta (mapuche)','Pifilka, pifëlka')," +
            "('Flecha','Pülki, pëlki')," +
            "('Flechas, disparar','Pëlkitun')," +
            "('Flema, sonar las','Kanülün')," +
            "('Flexible (adj.)','Üñad')," +
            "('Flojera, pereza','Chonfünguen')," +
            "('Flojera, trabajar con','Chöfun, chofünguen')," +
            "('Flojo, perezoso (adj.)','Chofün')," +
            "('Flojo, ser perezoso','Chonfünguen')," +
            "('Flor (sust.)','Rayen')," +
            "('Flor copihue','Kodkëlla')," +
            "('Florecer','Rayün')," +
            "('Fluir','Witrun')," +
            "('Fogón (dentro de la ruca)','Kütralwe')," +
            "('Forcejear','Newentun')," +
            "('Forjar el metal','Rëtran')," +
            "('Forjar, golpear, martillar','Tranán')," +
            "('Forjador de metal','Rëtrafe')," +
            "('Formal, serio (adj.)','Nguenel')," +
            "('Formar, educar, instruir','Yimëmn')," +
            "('Fornicar','Pënen, üñamtun')," +
            "('Forrar (algo)','Püñëmeln')," +
            "('Forzar, violentar','Newenman, newentun')," +
            "('Fosa (sust.)','Rengan')," +
            "('Frazada (mapuche)','Pontro')," +
            "('Fregar, refregar','Pinguëdün')," +
            "('Frente a frente, enfrente','Puñma, puñ meu')," +
            "('Frente, de (expr. adv.)','Reñma')," +
            "('Frente, la (sust.)','Itrótripa')," +
            "('Fresco (adj.)','Fidkü, füdkü')," +
            "('Frío (sust.), frío (adj.)','Wëtrë')," +
            "('Frío, hacer','wëtrenguen')," +
            "('Frío, tener','Wëtren')," +
            "('Frío, ser muy frío','Nengwëtré')," +
            "('Frotar, refregar (ropa)','Ngëñkün')," +
            "('Fructificar, echar semilla','Fénn')," +
            "('Fruta o fruto de árbol','Fénmamell')," +
            "('Fruto, músculo, carne (del cuerpo)','Fën')," +
            "('Frutilla','Kelleñ')," +
            "('Fuego','Kütral')," +
            "('Fuego, hacer','Kütraltun')," +
            "('Fuelle','Pimuwe')," +
            "('Fuente de agua, manantial','Wéfko, wüfko')," +
            "('Fuerte (adj.)','Kona')," +
            "('Fuerte, ser resistente','Yafün')," +
            "('Fuerza, la (sust.)','Newen')," +
            "('Fuerza, tener firmeza','Newenkëlen')," +
            "('Fuerza, estar sin','Trëllfun')," +
            "('Fumar','Pëtremtun')," +
            "('Furúnculo, divieso','Moi')" +
            ";";



    public static final String INSERTAR_LETRA_G = "INSERT INTO " + TABLE_LETRA_G + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Galopar','Wiraf, wirafün')," +
            "('Gallina, gallo','Achawall, achawal, achau')," +
            "('Gallo','Alka achawall')," +
            "('Ganar, merecer','Weunentun, weunien')," +
            "('Ganas (sust.)','Apill')," +
            "('Gana, de buena (adv.)','Ayüwnkechi')," +
            "('Ganancia (sust.)','Weu')," +
            "('Gancho, rama','Chang')," +
            "('Ganso','Kagnkeñ')," +
            "('Gargajo','Kaqül, kagül')," +
            "('Garganta, cuello','Pel')," +
            "('Garganta, obstruir la','Merlín')," +
            "('Gastar el filo, arromar', 'Trunguëmn')," +
            "('Gastos, hacer','Afmayewn')," +
            "('Gatas, andar a','Winolkiawn')," +
            "('Gatear','Winoln, ekopran')," +
            "('Gato, gata','Narki, nadki')," +
            "('Gato montes','Wiña')," +
            "('Gavilla','Peñad, kongka')," +
            "('Gaviota','Chëlle')," +
            "('Gemelos, mellizos','Küñe')," +
            "('Gemelos, parir','Küñen')," +
            "('Gemir, sollozar','Nëkürün, nikü, nikürün')," +
            "('Generación, la descendencia','Yallel')," +
            "('Generalmente (adv.)','Fillkechi')," +
            "('Gente de la tierra, indígena','Mapuche')," +
            "('Genuino, sin mezcla','Ré')," +
            "('Girar, rondar','Wallotiawn')," +
            "('Globo, bola','Mongko, mongkol')," +
            "('Globo, forma de (adj.)','Mongko, mongkol')," +
            "('Glotón (adj.)','Ife, Ifue')," +
            "('Glutinosas (sustancias)','Üpe')," +
            "('Gobernar, mandar, cuidar','Nguenn')," +
            "('Golondrina','Pillmaikëñ')," +
            "('Golpear','Tralofn, tralofün')," +
            "('Golpear, dar golpes','Mëtróngn, mëtrongün')," +
            "('Golpear, martillar','Tranán')," +
            "('Golpearse','Chefkün')," +
            "('Golpes, dar martillazos','Traiain, traiaiün')," +
            "('Golpes, dar','Trawautun')," +
            "('Gordo (adj.)','Motri')," +
            "('Gordura, grasa','Iwiñ')," +
            "('Gotear','Chüdkün, chidkün')," +
            "('Gotear, destilar','Lüikün')," +
            "('Gotera de la casa','Waq')," +
            "('Gozo, dar','Trüyüwëin')," +
            "('Gozo, tener','Trüyüwëlkaukëlen')," +
            "('Gracioso, payaso (adj.)','Ayekafe')," +
            "('Grande, viejo (adj.)','Fücha')," +
            "('Grande, ser','Füchán')," +
            "('Granizar','Piren')," +
            "('Granizo, nieve','Pire')," +
            "('Gratis, de balde','Réantü')," +
            "('Greda','Raq')," +
            "('Grieta, hendidura','Trou')," +
            "('Grillo, insecto','Kuningkuning')," +
            "('Gris, ceniciento (adj.)','Kadü, kashü')," +
            "('Gris, tener color','Kadun, kadunguen')," +
            "('Griterío, hacer mucho','Ngouingonyün')," +
            "('Grito, emitirlo','Yapen')," +
            "('Grueso, ancho (adj.)','Fuchárume')," +
            "('Grueso, ser','Shünguen, rünguen')," +
            "('Guagua','Shushun')," +
            "('Guapo','Kona')," +
            "('Guardar algo para otro','Elkaln')," +
            "('Guardar comida','Echeln')," +
            "('Guata, la (sust.)','Pütra')," +
            "('Guerra, la (sust.)','Weichan')," +
            "('Guerrear, batirse, pelear','Weichan')," +
            "('Guerrero (sust.)','Weichafe')," +
            "('Guía, el','Nguiyufe')," +
            "('Guía, pastor, artesano','Kamañ')," +
            "('Guiar, endilgar, encaminar','Nguiyuln')," +
            "('Guiñar a alguien','Umërütukënun')," +
            "('Gusano','Piru')," +
            "('Gustarle','Kümentun')," +
            "('Gustosamente (adv.)','Ayüwnkechi')" +
            ";";

    public static final String INSERTAR_LETRA_H = "INSERT INTO " + TABLE_LETRA_H + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Haber, estar','Mëlen')," +
            "('Haber luz, estar claro','Pelónguelen')," +
            "('Habitación, pieza','Mëlewe')," +
            "('Hablador (adj., sust)','Dëngufe')," +
            "('Hablar','Dëngun, dungun')," +
            "('Hablar oportunamente','Addëngun')," +
            "('Hablar, interceder a favor','Dënguñpen')," +
            "('Hablar con palabras selectas','Dullindenun')," +
            "('Hablar correctamente','Nordëngun')," +
            "('Hablar consigo mismo','Dënguluwn')," +
            "('Hablar de otro, murmurar','Dënguyen')," +
            "('Hablar al oído','Kafkün, kalkü dëngun')," +
            "('Hacer hablar','Dënguln')," +
            "('Hace rato','Tayi, chay')," +
            "('Hacer, construir, realizar','Deuman')," +
            "('Hacerse','Nguetun')," +
            "('Hacer algo con empeño','Deumadeuman, deumatun, deumayen')," +
            "('Hacer así, en la forma indicada','Femn')," +
            "('Hacer bien una función','Kümelkan')," +
            "('Hacer brujería a alguien','Kalkuntun')," +
            "('Hacerle el favor','Fërénen')," +
            "('Hacer fuego (primitivamente)','Repun, repuntun')," +
            "('Hacer frente, contrariar, replicar','Traftun')," +
            "('Hacer harina','Rëngorl, rëngun')," +
            "('Hacer harina tostada','Mürken')," +
            "('Hacer oración, rogar','Dënguñpewn')," +
            "('Hacer pan','Kofken')," +
            "('Hacer pasar','Rulpan')," +
            "('Hacer rabiar, encolerizar','Illkuln')," +
            "('Hacer sogas','Defn')," +
            "('Hacer señales con la mano','Mefüm, mefürün')," +
            "('Hacer sufrir, atormentar','Kutranka')," +
            "('Hacia, por, en, a un lado','Kiñepële')," +
            "('Hacia donde','Cheu pële')," +
            "('Hacia allá','Eyepële')," +
            "('Hacia acá','Tefá pële, chi pële')," +
            "('Hacia arriba','Wentepële')," +
            "('Hacha de piedra, el (sust.)','Toki, tokikura')," +
            "('Hálito, resuello','Neyen')," +
            "('Hambre','Nguëñün')," +
            "('Hambre, tener','Nguënün')," +
            "('Hambre, dar','Nguëñüin, nguëñulchen')," +
            "('Hambruna','Filla')," +
            "('Harina cruda','Rëngo')," +
            "('Harina tostada','Mürke')," +
            "('Hartar, satisfacer','Wedaln')," +
            "('Hartarse','Wedan')," +
            "('Hasta, aún, así como (prep.)','Keyü, kei, kenü')," +
            "('Hasta tanto (dar fin)','Fente, fentré')," +
            "('Hasta la muerte (expr., adv.)','Lanpu')," +
            "('Hastiarse, fastidiarle un asunto','Ñon')," +
            "('Hebra de hilo (sust.)','Wiñu füu')," +
            "('Hechicero, hechicera (sust.)','Kalku')," +
            "('Helada, la (sust.)','Piliñ, trangliñ')," +
            "('Helado, frío (adj.)','Wëtré')," +
            "('Helar, caer heladas','Piliñn, trangliñ')," +
            "('Helarse','Trangliñman')," +
            "('Helecho','Añpe')," +
            "('Hembra','Domo kulliñ')," +
            "('Hemisférico, redondo','Chingked, chünked')," +
            "('Henderse, partirse','Trëlan, trüran')," +
            "('Hendedura, grieta','Trou')," +
            "('Herida, llaga (sust.)','Allfen')," +
            "('Herir, perjudicar','Allfüln')," +
            "('Herir con arma blanca','Chungarün')," +
            "('Herido, ser lastimado','Allfün')," +
            "('Hermano','Peñi')," +
            "('Hermana','Lamnguen')," +
            "('Hermoso, sano (adj.)','Tremo')," +
            "('Herrero, joyero, platero','Rétrafe')," +
            "('Hervido (adj.)','Wadkün')," +
            "('Hervido, haber','Wadkün')," +
            "('Hijo, vástago (sust.)','Choyin, choyün')," +
            "('Hijo','Fótëm')," +
            "('Hijo mayor, padre (sust.)','Chau')," +
            "('Hijos, hijas','Koñünkoñi, koñintu')," +
            "('Hija (sólo respecto al padre)','Nawe, ñawe')," +
            "('Hijo o hija y madre','Pëñeñwén')," +
            "('Hijo primero de una mujer','Üllchapëñeñ')," +
            "('Hijo, hija respecto al padre','Yall')," +
            "('Hijos naturales','Yalltëku')," +
            "('Hilandera (sust.)','Füufe, füwefe')," +
            "('Hilar','Füun')," +
            "('Hilo (sust.)','Füu')," +
            "('Hincharse','Poin')," +
            "('Hogar, el (sust.)','Kütralwe')," +
            "('Hoja vegetal','Tapël')," +
            "('Hojas (caerse hojas, flores, frutas)','Llangkon')," +
            "('Hollar, pisotear, conculcar','Pënokëtuyen')," +
            "('Hombre, masculino (sust.)','Wentru')," +
            "('Homicida, asesino (sust.)','Languëmchefe')," +
            "('Hondo, profundo (adj.)','Llufü')," +
            "('Hongo (comestible)','Changdi')," +
            "('Honrar, respetar, apreciar','Shakin, rakin')," +
            "('Hormiga (sust.)','Kollella, kollalla')," +
            "('Horrible, ser espantoso','Yamn nguen, yañn nguen')," +
            "('Hospitalario, ser','Poyéwitrann nguen')," +
            "('Hostilizar','Kaiñetun')," +
            "('Hoy, este día','Fachantü, fachiantü')," +
            "('Hoyo, cueva subterránea','Lolo')," +
            "('Hoyos, surcos en el camino','Lolëmrëpu')," +
            "('Hueco (adj. sust.)','Trotol')," +
            "('Huérfano (adj.)','Kulme')," +
            "('Huérfano, pobre, desgraciado (adj.)','Kuñifal, kuñifall')," +
            "('Hueso, diente','Foro')," +
            "('Huevo','Kuram')," +
            "('Huevos, poner','Kuramn')," +
            "('Huir, correr','Lefn, leftripan')," +
            "('Humanitario, filántropo','Poyéchen nguen')," +
            "('Humedecer, mojar','Narfümn')," +
            "('Humedecer, regar','Üremn')," +
            "('Humedecerse','Üren')," +
            "('Húmedo, estar','Narfülen')," +
            "('Humilde, dócil, ser','Pëñeñwn')," +
            "('Humillado, haberse','Llellipufen')," +
            "('Humillarse','Nguillawn')," +
            "('Humo','Fitruñ')," +
            "('Hundirse','Lann, lannaqn')," +
            "('Hundirse en el agua','Ürfin')," +
            "('Hurtar, robar','Chukin, weñen')," +
            "('Huso (para hilar o tejer) (sust.)','Ñimkun')" +
            ";";

    public static final String INSERTAR_LETRA_I = "INSERT INTO " + TABLE_LETRA_I + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Idea','Duam')," +
            "('Idioma, lengua, voz','Dëngun, dungun')," +
            "('Idioma mapuche, lengua araucana','Mapudëngun, mapudungun')," +
            "('Ignorante, tonto, demente (adj.)','Kimno')," +
            "('Igual, igualmente, perfecto, cabalmente (adj., adv.)','Trür')," +
            "('Igual, ser','Trüm')," +
            "('Igualar','Chaqëm')," +
            "('Igualmente (adv.)','Chaq, trafme')," +
            "('Igualmente, al mismo tiempo (adv.)','Chaq, üiaq')," +
            "('Iluminar algo','Pelongueln')," +
            "('Imagen, silueta','Aiwiñ')," +
            "('Imaginarse personas o cosas','Peikiñn, peikuñn, peikiñtun')," +
            "('Imitar, copiar','Inádentun')," +
            "('Impacientar','Ningayüln')," +
            "('Impacientarse','Ningayün')," +
            "('Impaciente (adj.)','Ningayüfe, ningayüluufe')," +
            "('Impeler, empujar','Rëtren')," +
            "('Imperfecto, defectuoso, incompleto','Web')," +
            "('Imponerse, dar solución, saber manejar','Pepiln')," +
            "('Impúdico','Ñua')," +
            "('Imputar, acusar a alguno de robo','Weñafaln')," +
            "('Incendiar','Kulan, pëtrentëkun')," +
            "('Incendios, hacer','Kulatun')," +
            "('Incitar, instigar, azuzar','Nguëchaln, nguëdaln')," +
            "('Inclinado, estar','Këlün')," +
            "('Inclinar','Këlüruln, këlüwëln')," +
            "('Inclinarse','Pitrongnaqn')," +
            "('Incorrecto, ser','Welulen')," +
            "('Incurrir o cometer un delito, o falta','Werineluwn')," +
            "('Indeciso, estar','Ñuin')," +
            "('Independencia, libertad','Kidungüneun')," +
            "('Independencia, vivir en','Kidunguënwn nguen')," +
            "('Independiente, ser','Kidunguë neukëlen, kishunguëneukëlen')," +
            "('Indicar, aludir, nombrar','Üitun, ümtun')," +
            "('Indicar algo con señas, o designar','Üwëmn')," +
            "('Indígena, indio','Mapuche')," +
            "('Indio guerrero','Kona')," +
            "('Indio pacifico','Ufchinche')," +
            "('Indio valiente','Konawentru')," +
            "('Indiscretamente, incorrectamente','Pekan, pekankechi, pengam')," +
            "('Ingle, pubis','Llawepütra, llaweangka')," +
            "('Injuriar (ofender, tratar de animal)','Trewalkan')," +
            "('Inquirir, registrar, reconocer','Malün')," +
            "('Insecto, grillo','Kuningkuning')," +
            "('Inseguro (adj.)','Ran')," +
            "('Insistir, precisar, apremiar','Nguenñikan')," +
            "('Insistir, acomodar, acostumbrar','Përëmn')," +
            "('Insistir, molestar, enojar','Piawëln, pérëmn')," +
            "('Insistir mucho, andar apurado','Yayün')," +
            "('Insistir en alcanzar algo','Nganguewn')," +
            "('Insolarse','Antütun')," +
            "('Inspirar, aspirar','Neyüntëkun')," +
            "('Instigar, incitar, azuzar','Nguëchaln, nguëdaln')," +
            "('Instigar contra alguien','Aukañpen')," +
            "('Instruir','Trürëm dëngu')," +
            "('Instruir, formar, educar','Yimmn, mumëln, mëmëln')," +
            "('Insultar','Pimuntëkun')," +
            "('Insultar, retar insultando','Lukatun')," +
            "('Inteligencia, mente','Rakiduam')," +
            "('Inteligible','Kimfal')," +
            "('Integrar, suplir','Puümtun')," +
            "('Integro, ser','Trüm')," +
            "('Intención','Rakiduam')," +
            "('Intencionado, ser bien','Küme duamnguen')," +
            "('Interceder a favor de alguien','Dënguñpen')," +
            "('Interior, en el (adv.)','Ponwitu')," +
            "('Interrogatorio','Ramtudëngun')," +
            "('Interrumpir una conversación','Inádëngun')," +
            "('Interrumpir, hacer divisiones','Katrüntëkun')," +
            "('Intestinos, tripas','Küllche')," +
            "('Intimidar a alguien','Llükatuln')," +
            "('Introducir, meter, encajar','Nguëdëfkënun')," +
            "('Inútilmente','Nguenópëda, nguëllunguëman, réantü')," +
            "('Inválido (adj.)','Añken')," +
            "('Invertir','Waichëfrulpan')," +
            "('Invierno (sust.)','Pukem')," +
            "('Invierno, ser','Pukemn, pukemnguen')," +
            "('Invitado, el (sust.)','Mëtrém')," +
            "('Ir, irse, andar, avanzar','Amun')," +
            "('Ir a dejar','Elmen')," +
            "('Ir también','Ináamun')," +
            "('Ir a entrar','Konman')," +
            "('Ir de mal en peor','Inautun')," +
            "('Ir de paso, ir a dar','Ngueman')," +
            "('Ir a encontrar','Trafmen')," +
            "('Ir, pasar','Run')," +
            "('Irse a brincos','Chongkatuamun')," +
            "('Irse abajo, hundirse','Lann, lannaqn')," +
            "('Irse al fondo, aconcharse','Llidn, Ilidnaqn')," +
            "('Iris del ojo (sust.)','Relmungué')," +
            "('Isla, la','Wapi')," +
            "('Izquierdo (adj.)','Wele')" +
            ";";

    public static final String INSERTAR_LETRA_J = "INSERT INTO " + TABLE_LETRA_J + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Jabalí, cerdo salvaje','Kütrekütre')," +
            "('Jactancioso, ser','Málmanguen')," +
            "('Jactarse, vanagloriarse','Malmakawn, malmawn')," +
            "('Jadear','Karkárün')," +
            "('Jefe','Longko')," +
            "('Jefe, superior, el principal','Ñidol')," +
            "('Jefe de guerra (cacique)','Toki')," +
            "('Jefe, cacique de paz','Ülmen')," +
            "('Jefe de un trabajo en común','Külla')," +
            "('Joroba','Nguëtrufuri')," +
            "('Joven, el (sust.)','Weche')," +
            "('Jote (pájaro)','Kanin')," +
            "('Juego','Kudewe')," +
            "('Jugada, la','Utrëfn')," +
            "('Jugar, apostar (en carrera)','Kuden')," +
            "('Jugar traveseando','Aukantun')," +
            "('Jugo','Korü')," +
            "('Junco (planta)','Rëme')," +
            "('Junta, la (sust.)','Trawn, trawëln')," +
            "('Junta, la reunión','Trapëmuwn')," +
            "('Junta, lugar de la','Trafwe')," +
            "('Juntamente, juntos (adv.)','Kiñerun, kiñewn')," +
            "('Juntar','Nguelëmn')," +
            "('Juntarse, unirse, reunirse','Trapëmuwn')," +
            "('Junto a (pref. de sust.)','Iná')," +
            "('Junto a, unido a, al lado de','Traf')," +
            "('Juntos, ambos, ambas (sust.)','Chaq, üiaq')," +
            "('Juntos, juntamente (adv.)','Kiñerun, kiñewn')," +
            "('Justificado, encontrarlo','Kümentun')," +
            "('Juzgar para sí de algo','Trokiukëlen')" +
            ";";
    /*
    public static final String INSERTAR_LETRA_K = "INSERT INTO " + TABLE_LETRA_K + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('','')," +
            "('','')" +
            ";";
    */


    public static final String INSERTAR_LETRA_L = "INSERT INTO " + TABLE_LETRA_L + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Labio','Mëllfü, mellfüwen')," +
            "('Labio superior','Wentemellfü')," +
            "('Labio inferior','Minchemellfü')," +
            "('Labores de mano','Ñëmife')," +
            "('Labor de bordar dibujos','Ñemin')," +
            "('Labrado (adj.)','Kaf')," +
            "('Labrador, el (sust.)','Ketrafe')," +
            "('Labrar, desbastar','Kafn')," +
            "('Labrar la tierra (cavar con azadón)','Kaikün')," +
            "('Labrar un palo','Mayáfnentun')," +
            "('Labrar con hachazos','Repukëtuyen')," +
            "('Labrar piedras','Rütrin')," +
            "('Lacre (color)','Liqkelü')," +
            "('Ladeado, estar','Këlün')," +
            "('Lado y cara de las cosas','Ad')," +
            "('Lado, el lado de una persona (sust.)','Ad')," +
            "('Lado, al otro (adv.)','Nopun, nome, nometu')," +
            "('Lado (una lado de cualquier cosa)','Kadil')," +
            "('Lado (el costado)','Kadi')," +
            "('Lado (tener a uno al lado)','Kadilmanien')," +
            "('Lado (al otro lado del agua: río, lago, mar) (adv.)','Karku')," +
            "('Ladrar','Warkün')," +
            "('Ladrar a uno','Warküln')," +
            "('Ladrón','Chukife, weñefe')," +
            "('Lagartija','Fillkun')," +
            "('Lagarto','Kirke')," +
            "('Lago, llanura, planicie, mar','Lafken')," +
            "('Laguna','Dawüll, dawüllko')," +
            "('Lágrima','Këlleñu')," +
            "('Lagrimar','Kelleñumeken')," +
            "('Lámpara, fuente de luz','Pelomtuwe')," +
            "('Lana, vello','Kal')," +
            "('Lana, el copo de (sust.)','Wüto')," +
            "('Lana gruesa','Wentrukal')," +
            "('Langosta','Chori')," +
            "('Lanudo (adj.)','Kalki, weke')," +
            "('Lanza, coligüe (sust.)','Rëngui')," +
            "('Lanzar, tirar algo, rechazar','Ütrëfn')," +
            "('Lapidar piedras','Rütrín')," +
            "('Largar, soltar','Neln, nelëmn, neltun')," +
            "('Largo tiempo (adv.)','Kuifiwëla')," +
            "('Largo, derecho (adj.)','Wif')," +
            "('Largo, el (sust.)','Wif')," +
            "('Laringe','Trëkotrëko')," +
            "('Laringe con tráquea y bronquios','Këlolkëlol')," +
            "('Lastimado (adj.)','Allfen')," +
            "('Latido de un músculo (sust.)','Wüta')," +
            "('Latir fuerte y seguido el corazón','Treftrëfun')," +
            "('Latir un músculo','Wütan')," +
            "('Laurel (árbol)','Triwe')," +
            "('Lavandera, la (sust.)','Kechakafe, kechatufe')," +
            "('Lavar','Kechan, kechakan')," +
            "('Lavarse la cara','Këllumtun')," +
            "('Lazo, blandirlo (igual las armas)','Wifüyün')," +
            "('Lazo (sust.)','Kuñall, lashu')," +
            "('Lechuza','Chiwëd')," +
            "('Leer, escribir','Chillkatun')," +
            "('Leer','Dënguln')," +
            "('Lejano, lejos (adj. adv.)','Alümapu')," +
            "('Lejos, desde','Alütripa')," +
            "('Lengua, la (órgano) (sust.)','Kewen')," +
            "('Leña, buscar o hacer leña','Mamëll')," +
            "('Lerdo, perezoso (adj.)','Nape')," +
            "('Levadura (sust.)','Podkol')," +
            "('Levantar, subir','Përamn')," +
            "('Levantar cosas caídas, tirar de algo','Witrakënun')," +
            "('Levantarse, ponerse en pie','Witran')," +
            "('Leyenda, narración, relato, historia','Nutram')," +
            "('Lezna, la','Damituwe')," +
            "('Libertad, independencia','Kidungüneun')," +
            "('Libertad, andar en','Mënalkiawn')," +
            "('Libertad, dejar o poner en','Menalkenun')," +
            "('Libertar, soltar, despedir','Meñaln, meñaltun')," +
            "('Libertar, salvar, redimir','Montuln')," +
            "('Librarse, salvarse, escapar','Montun')," +
            "('Libro, carta, noticia','Chillka')," +
            "('Licor, aguardiente','Wingkapülku')," +
            "('Liendre, la (sust.)','Ütren')," +
            "('Ligero (adj. adv.)','Lef')," +
            "('Ligero, pronto, corredor (adj.)','Nekul')," +
            "('Ligero, diestro, alentado (adj.)','Turf')," +
            "('Ligero (adv.)','Awe')," +
            "('Límite, final de las cosas, punto extremo','Afpeyüm')," +
            "('Límites del mar','Aflafken')," +
            "('Límites de la tierra','Afmapu')," +
            "('Limpiar, limpiarse','Liftun, lipëmn')," +
            "('Limpio, despejado (el cielo)','Lif')," +
            "('Linaje, familia, apellido','Künga')," +
            "('Linaje, antepasados de uno','Mütre, mütren')," +
            "('Líquido, ser','Konguen')," +
            "('Líquidos, escurrirse o salirse','Weyutripan, weyun, weyun nguen')," +
            "('Liso (adj.)','Yud')," +
            "('Liso, lustroso, pulido (adj.)','Luyëf, luyüf')," +
            "('Liso, pulido (adj.)','Meyud, meyush')," +
            "('Listo, estar','Pepiukëlen, pepiwn')," +
            "('Listo, estar o estar dispuesto','Pilelkaukëlen')," +
            "('Listo, tener preparado','Trürëmnien')," +
            "('Llaga','Allfen')," +
            "('Llama de fuego','Weiwiñkütral')," +
            "('Llamas (echar llamas al fuego)','Weiwiñpran kütral')," +
            "('Llamado, el (o el invitado) (sust.)','Metrëm')," +
            "('Llamar, zumbar (el oído)','Mëtrëmn, mëtrëmün')," +
            "('Llamarada, la (sust.)','Keulun')," +
            "('Llano, plano (adj.)','Laf, llüngued')," +
            "('Llano, parejo','Lür')," +
            "('Llanura, planicie, lago, mar','Lafken')," +
            "('Llegar (acá)','Akun')," +
            "('Llegar allá, llegar a su fin','Puwn, pun')," +
            "('Llegar (hacer llegar allá)','Puwëln')," +
            "('Llegar, hacer, traer','Akuln')," +
            "('Llegar cerca allá','Fëlpun')," +
            "('Llegar muy cerca','Ináfëlpun')," +
            "('Llegar a tiempo para algo','Tren')," +
            "('Llegar de regreso','Akutun')," +
            "('Llenarse, estar lleno','Apolen')," +
            "('Lleno (adj.)','Apon')," +
            "('Llevar consigo','Yenien, miawëln')," +
            "('Llevar a cabo, concluir, terminar','Wechulkan')," +
            "('Llevar a cabo, ejecutar','Deumanentun')," +
            "('Llevar fruto','Fënn')," +
            "('Llorar','Këlleñutun, ngüman')," +
            "('Llorar amargamente','Ngümangügüen')," +
            "('Llover','Mawënn')," +
            "('Lloverle a uno la casa','Mawënman')," +
            "('Llover, me llovió','Naqman majen')," +
            "('Llover nieve con agua (sust.)','Ilkupire')," +
            "('Llover con granizo','Ilkupiren')," +
            "('Lluvia, la','Majen, maun')," +
            "('Lo mismo (adv.)','Minchetu')," +
            "('Lobo marino','Lame')," +
            "('Locamente, de una manera loca (adv.)','Wedwedkechi')," +
            "('Loco, travieso, desobediente','')," +
            "('Loco, volverse','Wedwedn')," +
            "('Locuaz, ser','Dëngunten nen')," +
            "('Locura','Ñuakutran')," +
            "('Lodo, barro','Chapad, pele')," +
            "('Loma, pampa, terreno sin árboles','Lelfüm')," +
            "('Lombriz de tierra','Dellwi')," +
            "('Lucero','Wünyelfe')," +
            "('Luciérnaga, candelilla','Küdellkiñ, küdellkiñ')," +
            "('Luego (adv.)','Müchai')," +
            "('Lugar de la junta','Trafwe')," +
            "('Luna, la (sust.) el mes','Küyen')," +
            "('Luna, hay','Alenguei')," +
            "('Luna, llenarse la','Pürn')," +
            "('Luna, menguarse la luna','Pürnaqn')," +
            "('Luz, claridad','Pelo')," +
            "('Luz de la luna','Ale')," +
            "('Luz, fuente de','Pelomtuwe')," +
            "('Luz, haber o estar claro','Pelónguelen')," +
            "('Luz, iluminar algo','Pelongueln')" +
            ";";


    public static final String INSERTAR_LETRA_M = "INSERT INTO " + TABLE_LETRA_M + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Machacar','Tranán')," +
            "('Macho (sexo)','Alka')," +
            "('Macollar','Choyin, choyün')," +
            "('Madera','Mamëll')," +
            "('Madera, palo, árbol','Mamëll, mamill')," +
            "('Madrastra','Ñeñeñuke')," +
            "('Madre, mamá','Papai')," +
            "('Madrugador (adj.)','Liwen witrafe')," +
            "('Madurar, cocer','Afuln, afün, afümn')," +
            "('Maduro, cocido (adj.)','Afün')," +
            "('Maduro, no (adj.)','Karü')," +
            "('Maíz','Üwa, uwa,wa')," +
            "('Mal, el (sust.), Malo (adj.)','Wedá, werá, wedáche')," +
            "('Males, desgracias','wedáke dëngu')," +
            "('Malamente, a malas (adv.)','Wedákechi')," +
            "('Maldad (un mal, una maldad) (sust.)','Wedádëngun')," +
            "('Malhechor (sust.), muy malo, perverso (adj.)','Wedáñma')," +
            "('Malo, pícaro, traicionero (adj.)','Üñfi')," +
            "('Malo, el (el demonio)','Wekufü')," +
            "('Malo, un malo','Wedá ché')," +
            "('Malo, hacerse (corromperse)','Wedawn')," +
            "('Maltratar','Adkan, awükan')," +
            "('Mama, pecho o ubre','Moyo, moyu')," +
            "('Mamar','Moyon')," +
            "('Manantial de agua, fuente','Wüfko, wëfko')," +
            "('Mancebo','Üñam')," +
            "('Manchar, ensuciar','Podëmn')," +
            "('Mandar, repartir','Trokin')," +
            "('Mandar, enviar','Werkün, werküln, werkülün')," +
            "('Mandar, gobernar, disponer','Nguenn')," +
            "('Mandar, enviar, despedir','Nguiyun, nguiyuln')," +
            "('Mandar decir algo','Pin')," +
            "('Mando, tener el','Nguendëngun')," +
            "('Manejar, saber, imponerse, dar solución','Pepiln')," +
            "('Mango, manubrio, asa','Tunguepeyüm, tupeyüm')," +
            "('Mango, puño, astil','Anüm')," +
            "('Manifestar','Entun, nentun')," +
            "('Manifestar, enseñar algo','Kimëln')," +
            "('Manifiesto, ser o claro','Chañalen, tranalen')," +
            "('Mano, la (sust.)','Kuq')," +
            "('Manojo, atado (sust.)','Kéchüng')," +
            "('Manso, amasado (adj.)','Ñom')," +
            "('Manta (poncho del hombre)','Makuñ')," +
            "('Manta, ponerse la','Makuñtun')," +
            "('Manteca','Iwiñ')," +
            "('Mantener, dar de comer','Ileln')," +
            "('Mañas, vicios de las cosas','Ad')," +
            "('Mañana, la (sust.)','Liwen')," +
            "('Mañana, en la','Pu liwen')," +
            "('Mañana, muy de (o temprano)','Rëf pu liwen')," +
            "('Mañana, de (adv.)','Liwen')," +
            "('Mañana, al día siguiente','Wüle meu')," +
            "('Mañana, pasado (en dos días) (adv.)','Epuwe')," +
            "('Maqui (arbusto)','Këlon')," +
            "('Mar, lago, llanura, planicie','Lafken')," +
            "('Mar, crecida del','Tripanko')," +
            "('Marcar, los animales','Chilkan')," +
            "('Marcha, la (o el paso)','Trekan')," +
            "('Marchar, dar pasos','Trekan')," +
            "('Marearse, aturdirse','Ayün')," +
            "('Mareo, dar (o vértigo)','Ayüln')," +
            "('Margen, borde, orillas','Üpël')," +
            "('Marido y esposa, matrimonio','Fétawen')," +
            "('Mariposas','Llamkellamke, llampëdken')," +
            "('Mariscos','Kufüll')," +
            "('Martillar, golpear, forjar','Tránan')," +
            "('Martillazos, dar (dar golpes)','Traiain, traiaiün')," +
            "('Más (adv.)','Doy, doi, yom')," +
            "('Más (conj.)','Welu')," +
            "('Más, hacer, aumentar','Doikënun')," +
            "('Más, ser, sobrar','yafn')," +
            "('Mascar, rumiar','Kaimutun')," +
            "('Máscara','Takuanguewe')," +
            "('Masculino, hombre','Wentru')," +
            "('Mata (de cualquier planta)','Kallwe')," +
            "('Matar','Languëmfaln')," +
            "('Matar (mandar a matar)','Languëmfaln')," +
            "('Matorral','Rëtronentu, rëtrontu')," +
            "('Mecer','Nguikun, nguikülln, ngueikëllün')," +
            "('Mecerse, estremecerse','Ngueikufün')," +
            "('Mediador, abogado','Ranguiñelwe')," +
            "('Medianamente, no muy, poco a poco (adv.)','Allwe')," +
            "('Mediano (adj.)','Ellá')," +
            "('Medianoche, la (o a medianoche)','Ranguipun')," +
            "('Mediar','Katrü dëngun')," +
            "('Médicos, médicas (mapuches)','Machi')," +
            "('Medidas y semajantes, división, porción','Trokiñ')," +
            "('Medio (sust. adj.)','Ranguiñ')," +
            "('Medio, en el (o por la mitad)','Ranguiñma, ranguiñtu')," +
            "('Mediodía, a mediodía','Ranguiantü')," +
            "('Mejillas, carrillos','Paltraangue')," +
            "('Mellizos','Kuñe')," +
            "('Menear','Mëlpüwn')," +
            "('Menguarse','Konmen')," +
            "('Menos (a lo menos), siquiera','Rume')," +
            "('Mensaje','Werken')," +
            "('Mensajero','Werken, werkün')," +
            "('Menstruación, tener la','Küyentun')," +
            "('Mentar','Konëmpan, konümpan')," +
            "('Mente, pensamiento, inteligencia','Rakiduam')," +
            "('Mentir','Koilatun')," +
            "('Mentira','Koila')," +
            "('Mentira, astucia, engaño','Nguënén')," +
            "('Menton, barba','Ketre')," +
            "('Menudo, pequeño (adj.)','Pichi')," +
            "('Mercaderías, objetos, cosas','Wéshakelu')," +
            "('Merecer, ganar','Weunentun, weunien, wewn')," +
            "('Merecer la muerte','Lafaln, languëmfaln')," +
            "('Mes, el (sust.)','Küyen')," +
            "('Metal, fierro','Pañilwe')," +
            "('Metales, caldear','Kofilln, kofilmn, kofilman, kofilñn')," +
            "('Meter, encajar, introducir','Nguëdëfkenün')," +
            "('Mezclado, estar','Reyilen')," +
            "('Mezcla, sin','Re')," +
            "('Mezclar, entreverar','Relfün')," +
            "('Mezclar, juntar','Reyiln, retimn')," +
            "('Mezclarse','Reyin, reyün')," +
            "('Mezquino, cicatero (adj.)','Rëku, reküfe')," +
            "('Miedo','Llükan')," +
            "('Miedo, dar (ser temible)','Yamn, yañn')," +
            "('Miedoso (adj.)','Llükanchen, llükanten')," +
            "('Mil (núm.)','Warangka')," +
            "('Mirada','Leliruln')," +
            "('Mirar','Kintun, kintunien, kintuñmanien, lelin')," +
            "('Mirar, echar mirada','Kinturuln, kintuwëln')," +
            "('Mirar bien, con atención','Lelinien')," +
            "('Mirar o tocar con curiosidad','Fiñmatun')," +
            "('Mirar con toda atención, registrar','Malün')," +
            "('Mirar con agrado','Komütun')," +
            "('Mirar a lo lejos','Adkintulen, adkintumeken')," +
            "('Mirar por atrás','Weñokintun')," +
            "('Mismo, propio, solo (adj. sust.)','Kidu, kishu')," +
            "('Mitad, la (o el medio) (sust. adj.)','Ranguiñ')," +
            "('Mitad, la media parte','Llaq')," +
            "('Mitad (en la mitad de)','Angka')," +
            "('Moho, orín','Meñmau, perkañ')," +
            "('Mojado, estar muy','Këltrafkëlen')," +
            "('Mojar, humedecer','Narfümn')," +
            "('Mojarse mucho, destilar','Wilfodün')," +
            "('Molde','Adentu')," +
            "('Moler bien','Chad')," +
            "('Molestar','Piawëln')," +
            "('Molido (adj. sust.)','Kekün')," +
            "('Molido, bien','Chad')," +
            "('Molinero, o fontanela','Llafkëñ')," +
            "('Montañoso, quebrada','Wingkulentu')," +
            "('Montar, subir','Përan, pran')," +
            "('Montón','Wirko, futrul')," +
            "('Montón (de cosas)','Wëtrun')," +
            "('Montura','Chañuntëku')," +
            "('Moño, trenzas','Nguëtro')," +
            "('Morder','Ünan, ünantun')," +
            "('Morir, estar muriendo','Lalen')," +
            "('Morir de hambre','Entrin')," +
            "('Mosca','Pëlü')," +
            "('Moscardón, abejón','Duilliñ')," +
            "('Mostrar algo','Pekënun, pengueln')," +
            "('Mover','Nenguëmn')," +
            "('Moverse','Nenguen, ñüngkün')," +
            "('Mozo, ser','Konan')," +
            "('Mucha distancia (a mucha distancia)','Alüpu')," +
            "('Muchacho, niño','Weñi')," +
            "('Muchísimo, en sumo grado (adv.)','Kadel, kadeltu')," +
            "('Mucho (adv.)','Alü')," +
            "('Mucho (adv. y adj.)','Alün')," +
            "('Mucho, muy, bien','Mëná')," +
            "('Mucho, muy','Mëté')," +
            "('Mucho, en abundancia','Petrü')," +
            "('Muchos (adj. y adv.)','Fentén, fentrén')," +
            "('Mudarse, mandarse cambiar','Welukënuwn')," +
            "('Muela, cada diente','Ülnga')," +
            "('Muerte, ir a la','Lakonn')," +
            "('Muerte, merecer la','Lafaln, languëmfaln')," +
            "('Muerte (lo que causa la muerte)','Lapeyüm')," +
            "('Muerto (adj. sust.)','La')," +
            "('Muerto, alma del muerto','Alwe')," +
            "('Multiplicarse, dar interes el dinero','Yalln')," +
            "('Multiplicarse (familia, animales)','Yillëmn, yillüm')," +
            "('Mujer, la','Domo')," +
            "('Mujer, persona femenina','Domo che')," +
            "('Mujer joven','Wé domo')," +
            "('Muñeca (de la mano)','Troikup')," +
            "('Murciélago','Piñüike')," +
            "('Murmurar','Dëngúyen')," +
            "('Músculo','Fën')," +
            "('Músculo, tendón, nervio','Chúllfën')," +
            "('Musgos','Poñpoñ')," +
            "('Músico (adj.)','Mushántufe')," +
            "('Mutilado, imperfecto, defectuoso','Well')," +
            "('Mutuamente','Epuñpële')," +
            "('Mutuamente, alternativamente','Weluke, welukon')," +
            "('Muy de noche','Alüpun')," +
            "('Muy de mañana','We liwén')," +
            "('Muy de cerca, seguidamente','Inau')," +
            "('Muy cerca de','Ináfel')," +
            "('Muy grande (adj.)','Fúchañma')" +
            ";";

    public static final String INSERTAR_LETRA_N = "INSERT INTO " + TABLE_LETRA_N + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Nacer','Choyin, choyün')," +
            "('Nacido, recién','Lludu')," +
            "('Nadador','Weyelfe')," +
            "('Nadar','Weyeln')," +
            "('Nadie','Ineino rumer')," +
            "('Nalgas','Paftraanüwe')," +
            "('Nariz, la','Yüu')," +
            "('Narración, relato','Nütram')," +
            "('Narrador','Nütramkafe')," +
            "('Nata','Iwiñlichi')," +
            "('Natural (adj.)','Yalltëku')," +
            "('Neblina','Chiwai')," +
            "('Neblina, niebla','Trakür')," +
            "('Neblina, haber, niebla','Traküm, trakümguen')," +
            "('Nebuloso, el día (sust.)','Chiwal antü')," +
            "('Necesario, ser o ser deseable','Duamfal nguen')," +
            "('Necesidad, intensión, urgencia','Duam')," +
            "('Necesitar','Duamn, duamyen')," +
            "('Necesitar, querer, desear','Duamnien')," +
            "('Necio, tonto, estúpido (adj.)','Ñoi')," +
            "('Negociar, tratar con alguno','Waichëfkawn, dëngutukënun')," +
            "('Negro (adj.)','Küru')," +
            "('Negro, ser','Kürün')," +
            "('Negro, teñir de','Kurütun')," +
            "('Nervio','Chüllfën')," +
            "('Nevar','Piren')," +
            "('Nido, el','Dañe, dañeüñëm')," +
            "('Nido, hacer su','Dañeñ')," +
            "('Nido, hacerle','Dañeln')," +
            "('Nietos del abuelo materno','Cheche')," +
            "('Nietos, nietas de la abuela materna','Chuchu')," +
            "('Nieve, granizo','Pire')," +
            "('Ninguna parte, en','Cheun rume')," +
            "('Niña y toda persona del sexo femenino','Malen')," +
            "('Niña joven (casta)','Üllcha')," +
            "('Niño, muchacho','Weñi')," +
            "('No','Keno')," +
            "('Noble, rico (sust.)','Ülmen')," +
            "('Noche, la (sust.)','Pun, trafuya')," +
            "('Nombrar, indicar, aludir','Üitun, ümtun')," +
            "('Nombre, el (sust.)','Üi')," +
            "('Nombre, poner (bautizar)','Üieln, üieltun')," +
            "('Normas de una casa o club','Ngülam')," +
            "('Norte, el (sust.)','Piku')," +
            "('Norte, hacia el','Pikumpële, piku pële')," +
            "('Notar, advertir algo','Lliwan')," +
            "('Notar, observar','Nguenuamn')," +
            "('Notar la diferencia','Kangueltun')," +
            "('Noticia, carta, libro','Chillka')," +
            "('Novedad, asunto','Dëngu')," +
            "('Nube, la (sust.)','Tromü')," +
            "('Nublarse','Tromün')," +
            "('Nudillo, articulación','Troi')," +
            "('Nudo (sust.)','Përon')," +
            "('Nudo, hacer (anudar)','Përonn')," +
            "('Nuera, la y su suegra (sust.)','Nanëng')," +
            "('Nuera de un hombre','Püñma')," +
            "('Nuevo, reciente (adj.)','Wé')," +
            "('Nuevo, estar nuevo, tierno (ramas, tallos)','Wellon')" +
            ";";

    /*
    public static final String INSERTAR_LETRA_Ñ = "INSERT INTO " + TABLE_LETRA_Ñ + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('','')," +
            "('','')" +
            ";";
    */

    public static final String INSERTAR_LETRA_O = "INSERT INTO " + TABLE_LETRA_O + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Obedecer','Yedëngun, main, méngueltun, feyentun')," +
            "('Obedecer, hacer caso','Tangkün')," +
            "('Obediente','Maife')," +
            "('Objeto, cosa, bienes, mercadería','Weshakelu')," +
            "('Observar, notar, reconocer','Nengduamn')," +
            "('Obstruido, muy angosto (adj.)','Ngëf')," +
            "('Obstruir','Nguëmpemn')," +
            "('Obstruirse (canales)','Trafn')," +
            "('Obtuso, ponerse (o perder filo)','Trungn')," +
            "('Ocultar, esconder','Elkaltun, elkan')," +
            "('Ocupar (cosas ajenas)','Dayen')," +
            "('Ocupar algo momentáneamente','Tutun')," +
            "('Ocupar, gastando, consumiendo','Pënen')," +
            "('Ocuparse en algo','Konn')," +
            "('Ocurrir, suceder','Rupan')," +
            "('Ocurrírsele algo','Koriman')," +
            "('Odiar, aborrecer','Üden, üdenentun, üdewëin')," +
            "('Ofender, pecar','Yafkan')," +
            "('Ofertas, hacerle a uno','Manaln')," +
            "('Oficiante (el que tiene un oficio)','Kamañ')," +
            "('Ofuscar, causar ofuscación','Tretin nguen')," +
            "('Ofuscársele la vista a uno','Tretrin')," +
            "('Oído, el (sust.)','Allküpeyün')," +
            "('Oído, zumbar el (o los oídos)','Trëmëmeln')," +
            "('Oír','Allkün')," +
            "('Oír, escuchar, poner atención','Allkutün')," +
            "('Oír, escuchar, novedades','Allkükadëngun')," +
            "('Ojalá (expres. de deseo)','Péumanguen')," +
            "('Ojo, el','Kuralngue, ngué')," +
            "('Ojo de la aguja','Pilun')," +
            "('Ola, resaca','Reu')," +
            "('Oler, oler mal','Nümün')," +
            "('Olvidadizo, ser','Ngoimánten nguen, upénten nguen')," +
            "('Olvidar','Upén, unguen, ungueln, rumeduamn')," +
            "('Olvidar, írsele de la memoria','Upéduamn')," +
            "('Olvidar algo, turbarse','Ngoiman')," +
            "('Olvidar, hacer','Ngoiwáln')," +
            "('Olvido (sust.)','Ngoimákon')," +
            "('Olla, la','Challa')," +
            "('Ombligo, el','Fedo')," +
            "('Omitir','Kiñepelekenun')," +
            "('Opinión, hacer cambiar de','Káduameln')," +
            "('Oponerse a alguien o contradecirle','Traqtun')," +
            "('Oprimir','Trañmanakemn')," +
            "('Oraciones fúnebres, hacer','Weupin')," +
            "('Oráculo','Peútuwe')," +
            "('Orador, parlamentario','Weupife')," +
            "('Orden, voluntad','Pipiel')," +
            "('Oreja','Pilun')," +
            "('Orgulloso','Kauchu')," +
            "('Oriente, el','Tripawe antü')," +
            "('Orilla, canto (de cosas tableadas)','Üllef')," +
            "('Orillas, margen, borde','Üpel')," +
            "('Orillas, estar a','Üpelkëlen')," +
            "('Orillas, las','Inal')," +
            "('Orillas, a','Inalmeu')," +
            "('Orillas, llegar a','Inalpun')," +
            "('Orín, moho','Meñmau')," +
            "('Orina, orines','Willeñ')," +
            "('Orinar','Willün')," +
            "('Oro, el','Mila')," +
            "('Oro, de (dorado)','Millan')," +
            "('Ortiga','Kuri')," +
            "('Oruga, cuncuna','Pëtreu')," +
            "('Oruga, convertirse en','Pëtreuutun')," +
            "('Orzuelo (del ojo)','Pedingué')," +
            "('Osar, no (no atreverse)','Yofün')," +
            "('Oscilar','Ñungkün')," +
            "('Oscuridad','Dumiñ')," +
            "('Oscuro (adj.)','Dumiñ')," +
            "('Oscuro, estar','Dumiñnguen, dumiñkëlen')," +
            "('Otoño','Chomünguen')," +
            "('Otro, otra (adj.)','Kanguelu, kánguechi')," +
            "('Otra persona (sust.)','Kanguelu')," +
            "('Otra (de otra manera) (adv.)','Kánguechi')," +
            "('Otro (adj.)','Ká')," +
            "('Otros, todos','Kaké')," +
            "('Otro (pref. de sust.)','Welu')," +
            "('Oveja, carnero, vellón, lanudo','Weke')," +
            "('Oveja','Ofida, ofisa, ofisha')," +
            "('Ovejero','Ofisha kamañ')," +
            "('Ovillarse','Trëkown')," +
            "('Ovillo, el (sust.)','Trëko')" +
            ";";


    public static final String INSERTAR_LETRA_P = "INSERT INTO " + TABLE_LETRA_P + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Pacer','Ütan')," +
            "('Pacer andando','Ütatuyekümn')," +
            "('Paciencia, con. Tranquilamente (adv.)','Kümelka, kümelkalechi')," +
            "('Paciente, apacible','Nochiduamnguen, nochiduamkëlen')," +
            "('Pactar','Dakeltun')," +
            "('Padrastro','Malle chau')," +
            "('Padre, hijo mayor','Chau')," +
            "('Padre y su hijo','Fotëmwen')," +
            "('Padre celestial (cristiano)','Ranguiñwenu chau')," +
            "('Pagar, pagar algo','Kullin')," +
            "('Pago o paga','Kulliñ')," +
            "('País, la patria, terreno, tierra','Admapu')," +
            "('Paja','Ichu')," +
            "('Palabra, la','Nemël')," +
            "('Palabra, narración','Nütram')," +
            "('Paladar (sust.)','Fidáfida')," +
            "('Palma de la mano','Pëlaikuq')," +
            "('Palo, madera, árbol','Mamëll')," +
            "('Paloma torcaza','Kono')," +
            "('Palpar, registrar','Malün')," +
            "('Pampa, loma','Lelfüm')," +
            "('Pan (sust.)','Kofken')," +
            "('Pan, hacer','Kofken')," +
            "('Pan, comer','Kofketun')," +
            "('Panadero','Kofkefe')," +
            "('Pantano','Fotra, kulpad')," +
            "('Papa, la (sust.)','Poñu')," +
            "('Papas, cosechar las','Poñün')," +
            "('Papas, comer','Poñütun')," +
            "('Par, el (sust.)','Mür')," +
            "('Par (formar un par con otro)','Mürëmn')," +
            "('Parado, estar','Retrülen')," +
            "('Para siempre, desde siempre (adv.)','Rumel')," +
            "('Parálisis, tener','Waifüng')," +
            "('Paralítico (adj.)','Waifü')," +
            "('Parapetarse, resguardarse','Relmantuñmawn')," +
            "('Pararse','Witrawn')," +
            "('Parcharse','Witrawn')," +
            "('Parchar','Kupetun')," +
            "('Parecido a, como (adv. suf.)','Reke')," +
            "('Parejo, llano (adj.)','Lür')," +
            "('Parejo, estar','Lürkëlen, kengkürkëlen')," +
            "('Pariente','Mongueyel, kiñeche')," +
            "('Parientes entre sí','Mongueyelwen')," +
            "('Parientes cercanos entre sí','Adwen')," +
            "('Parir','Koñün')," +
            "('Parir gemelos','Küñen')," +
            "('Parir, dar a luz','Lleqëmn')," +
            "('Parpadear','Umérkëlentun, umértun')," +
            "('Parte, pedazo','Wëdkan')," +
            "('Partidarios','Ingkawen')," +
            "('Partido (adj.)','Wëdkan')," +
            "('Partir, salir','Tripan')," +
            "('Partir, distribuir','Wëdamn')," +
            "('Partir, dividir','Wëdkan')," +
            "('Partir (leña)','Iran, iratun')," +
            "('Partirse, dividirse, separarse','Wëdan')," +
            "('Partirse, henderse','Trelan, truran')," +
            "('Parrillas','Kawitu, pañilwe')," +
            "('Particularidad de las cosas','Ad')," +
            "('Párvulo','Pichiche')," +
            "('Pasado mañana','Epuwe')," +
            "('Pasar, ir','run')," +
            "('Pasar algo, dar, entregar','Ruln, weln')," +
            "('Pasar la palabra, traducir, referir','Rulpan')," +
            "('Pasar algo a otra mano','Traqn')," +
            "('Pasar allá','Rumen')," +
            "('Pasar al otro lado (adv.)','Nopun, nome, nometu')," +
            "('Paso, el','Trekan')," +
            "('Pasos, dar (marchar)','Trekan')," +
            "('Pasto, yerba','Kachu')," +
            "('Pasto, cubrirse','Kachutun')," +
            "('Pastor, el guía','Kamañ')," +
            "('Pastorear, cuidar ganado','Weñimn')," +
            "('Pata, la','Namun')," +
            "('Patada, coz','Mangkün')," +
            "('Patear a alguien','Mangkün')," +
            "('Patente, estar (estar claro)','Tranálen')," +
            "('Patilla, barba','Payun')," +
            "('Pato, el (sust.)','Kaqe')," +
            "('Patrón del trabajo','Nengküdau')," +
            "('Payaso, el','Ayekafe')," +
            "('Pecado, cometer','Werineluwn')," +
            "('Pecar','Werilkan')," +
            "('Pecar, ofender','Yafkan')," +
            "('Pecho','Rëku, ruku')," +
            "('Pedazo','Trelëf, pëntü')," +
            "('Pedir','Puñmatun')," +
            "('Pedir ayuda','Ingkatun')," +
            "('Pedir algo, rogar','Nguillatun')," +
            "('Pedir, buscar, comprar alimentos','Wüfkün, wifkün')," +
            "('Pedir prestado','Welutun')," +
            "('Pedregal, el','Kurantu')," +
            "('Pedo','Perkü')," +
            "('Pegadizo (adj.)','Ñipëd, ñüpëd')," +
            "('Pegamento (sustancia glutinosa para pegar)','Üpe')," +
            "('Pegar, unir cosas con pegamento','Wilan')," +
            "('Pegar','kewan, kewatun')," +
            "('Pegar, castigar','Wirafn, wirafün')," +
            "('Pegar, aporrear','Trëpun, trawawn')," +
            "('Peinarse','Rënatun')," +
            "('Peine, peineta','Rëña')," +
            "('Pelar, quitar la corteza','Chafn, chafnentun')," +
            "('Pelar, descascarar, descascararse','Shollkin, dollkün')," +
            "('Pelea, reyerta (sust.)','Kewan, kewa')," +
            "('Peleador, ser','Adkawn nguen')," +
            "('Pelear, batirse, guerrear','Weichan')," +
            "('Pelear por diversión','Kewatun')," +
            "('Pelo, cabellos (pelos de la pubis)','Kalcha')," +
            "('Peligro, el','Kuñiwn')," +
            "('Peligroso, ser','Kuniunguën')," +
            "('Pellejo, cuero','Trelke')," +
            "('Pellizcar','Rutrëtun, rutrütun')," +
            "('Pena (sust.)','Afiduam, afuduam')," +
            "('Pena, tener (arrepentimiento)','Afkiduamn, afküduamn')," +
            "('Pena, causar','Awün')," +
            "('Pendencia, pleito, fallo','Dëngu')," +
            "('Pensamiento, mente, inteligencia','Rakiduam')," +
            "('Pensar','Rakiduamn')," +
            "('Pensar hacer algo','Duamtunien')," +
            "('Peñasco (sust.)','Lil')," +
            "('Pequeño, menudo, chico (adj.)','Pichi, pechi, püchi')," +
            "('Pequeño, ser','Pichin')," +
            "('Perder, borrar, deshacer','Ñamëmn')," +
            "('Perderse, desaparecer, borrarse','Ñamn')," +
            "('Perderse, acabarse','Pesan, pëdan')," +
            "('Perdiz, la (sust.)','Fëdü')," +
            "('Perecedero, ser','Ñarrifaln, ñamfalnguen')," +
            "('Pereza, flojera','Chofünguen')," +
            "('Perezoso, flojo','Chofü')," +
            "('Perfecto (adj.)','Trür')," +
            "('Perforar algo','Katan')," +
            "('Perfumar','Nümüln')," +
            "('Perjudicar, herir','Allfüln')," +
            "('Perro, el (sust.)','Trewa')," +
            "('Persona, ser humano, gente','Ché')," +
            "('Perverso, corrupto, malhechor','Medáñma, weráñma')," +
            "('Pervertir','Ngoimáln')," +
            "('Pesado, ser','Fanen')," +
            "('Pesar','Fanen')," +
            "('Pesar algo','Fanetun')," +
            "('Pescado, pez','Challwa')," +
            "('Pescado, comer','Challwatun')," +
            "('Pescador, el','Challwafe')," +
            "('Pescar','Challwan')," +
            "('Pezón del pecho','Longko moyo')," +
            "('Piar','Pirpirün, pishpíshün')," +
            "('Picaflor','Pinda')," +
            "('Picante, agrio','Mutrü, füré')," +
            "('Picante, ser','Fürén')," +
            "('Picar (los insectos)','Üpirn, Üpünn')," +
            "('Pícaro, ser','Adkawn nguen')," +
            "('Picotear','Shikon, dikon')," +
            "('Pie','Namun')," +
            "('Pie, a (adv.)','Namuntu')," +
            "('Pie, ir a','Namuntun')," +
            "('Piedra','Kura')," +
            "('Piedras, labrar','Rütrín')," +
            "('Piel, cutis, cáscara','Trawa')," +
            "('Pierna, ramo, gancho','Chang')," +
            "('Pinta, mancha','Tropa')," +
            "('Pintar, rayar, dibujar, escribir','Wirin')," +
            "('Piñón','Pehuen, peweñ')," +
            "('Piojo','Tën, tün')," +
            "('Piojos, buscar','Tënn')," +
            "('Pisar','Peñón')," +
            "('Pisotear, hollar, conculcar','Pënokëtuyen')," +
            "('Placenta, la','Këdiñ')," +
            "('Planicie, llanura','Lafken')," +
            "('Plano, llano (adj.)','Laf, llünguëd')," +
            "('Plano, ser','Lafkëlen')," +
            "('Plantas','Fuchen')," +
            "('Planta del pie','Pënowe-namun')," +
            "('Plata (metal)','Lien')," +
            "('Platero, joyero','Rëtrafe')," +
            "('Playa, la','Inal-lafken')," +
            "('Pleito, fallo, pendencia','Dëngu')," +
            "('Plumas de las aves','Pichun, pichuñ')," +
            "('Poblado, denso, tupido (adj. adv)','Trongue')," +
            "('Poblado, estar','Trongn')," +
            "('Pobre, huérfano (adj.)','Kuñifal, kuñifall')," +
            "('Poco, ser','Pichin')," +
            "('Poco, un poco (adv.)','Pichi')," +
            "('Poco, un. No mucho (adv.)','Aimeñ, aimün')," +
            "('Poco tiempo (adv.)','Pichitu')," +
            "('Poderoso, ser. Saber ganar a la vida','Pepiukëlen, pepiwn')," +
            "('Podrido (adj.)','Funa, funan, ifun')," +
            "('Podrirse','Funan')," +
            "('Poesía, canción','Üi')," +
            "('Poeta, orador','Nguenpin')," +
            "('Polvo, el. La tierra','Trufür')," +
            "('Polvillo, tizón','Kodüu')," +
            "('Poner atención','Allkütun')," +
            "('Poner, dejar','Eln')," +
            "('Poner, dejar al borde','Inalkënun')," +
            "('Poner en apuro','Fiñmau eln')," +
            "('Poner de costado','Kadikënun')," +
            "('Poner, dejar puesto','Tëkukënun')," +
            "('Poner','Kënun')," +
            "('Poner huevos','Kuramn')," +
            "('Ponerse de pie, levantarse','Witran')," +
            "('Por, hacia, en (adv.)','Kiñepële')," +
            "('Por casualidad','Adno')," +
            "('Por eso','Lei meu')," +
            "('Por ahí mismo','Fei tié pële')," +
            "('Por la tarde','Ináiantü')," +
            "('Por todas partes','Mungku')," +
            "('Propagar por todas partes','Ungkun')," +
            "('Porción, parte, división','Trokiñ')," +
            "('Porfiado, necio','Roi')," +
            "('Poroto, frijol','Dengüll, külwi')," +
            "('Poseer, tener','Nien')," +
            "('Posible, ser','Pepilfaln, pepilnguen')," +
            "('Poste, estaca','Üngko')," +
            "('Postes, hacer','Üngkon')," +
            "('Postema, la','Paf')," +
            "('Posteridad, la','Iñanguechi che')," +
            "('Posterior (adj.)','Iñanguechi')," +
            "('Posteriormente, atrasadamente (adv.)','Iñangue, iñangueichi')," +
            "('Postura, tomar tal','Tripan')," +
            "('Pozo, el','Réngalnko')," +
            "('Precisamente (adv.)','Ménguelkechi')," +
            "('Precisar, apremiar, insistir','Ngueñikan')," +
            "('Preguntar, consultar','Ramtu')," +
            "('Premiar, recompensar, agradecer','Mañumn, mañumtun')," +
            "('Premio, recompensa','Mañum')," +
            "('Prendedor, el','Rëtriñtuwe')," +
            "('Prendedor (de un vestido)','Chülltuwe')," +
            "('Prender','Chülltun')," +
            "('Prender fuego, encender','Lëpëmn')," +
            "('Preparar, poner en orden','Pepi, pepilkan')," +
            "('Presagio, mal','Perimol')," +
            "('Presentar una acusación','Dalfunln')," +
            "('Presentarse, aparecer, producirse','Wefn')," +
            "('Presentimiento','Wüta')," +
            "('Prestada, cosa (sust.)','Arétu')," +
            "('Prestado (adj.)','Aré')," +
            "('Presentimiento','Wüta')," +
            "('Prestar algo','Arenguelëmn')," +
            "('Prestar algo a alguien','Areln')," +
            "('Prestarse, darse, rendirse','Wëluwn')," +
            "('Primavera','Pewünguen')," +
            "('Primer, primera. Superior (adj.)','Wënén')," +
            "('Primeramente','Wënétu')," +
            "('Primero, de antemano','Wema')," +
            "('Primero (adv.)','Wëné')," +
            "('Primero, ser el','Wënélen, wënélkëlen')," +
            "('Primos, primas','Mëna')," +
            "('Principiar','Yechin, ñidoln')," +
            "('Principiar algo, avanzar en algo','Tuwëln')," +
            "('Principio de algo','Ñidolpeyüm')," +
            "('Principio, dar','Yechilkan, yechiln')," +
            "('Prisa, tener','Ngueñikaukëlen')," +
            "('Privarse de algo','Katrütuwn')," +
            "('Probar','Pepilpepitun')," +
            "('Proceder de, salir de','Tuwn')," +
            "('Profundidad','Llufü')," +
            "('Profundo','Llufü')," +
            "('Prohibir','Katrün')," +
            "('Prometer, designar','Üwëmn')," +
            "('Prometido, tener','Pinien')," +
            "('Pronto (adv.)','Awe, peqka, peqkachi')," +
            "('Pronto, ligero (adv.)','Matu, matumatu')," +
            "('Pronunciar bien, explicar, expresar','Tranánentun')," +
            "('Propagarse, extenderse, desparramarse','Püdn')," +
            "('Propagar por todas partes','Mungkun')," +
            "('Propósito, a (adv.)','Wif')," +
            "('Proveerse de víveres','Rokiñtun')," +
            "('Provisión para el viaje','Rokiñ')," +
            "('Provocar','Rumeduamn')," +
            "('Prudente (adj.)','Nguenduam')," +
            "('Púa, la','Waillil')," +
            "('Pubis, la ingle','Llawëputra, llaweanka')," +
            "('Pueblo, el. El poblado','Kara')," +
            "('Puente (de madera)','Kuikui')," +
            "('Puente, hacer un','Kuikuitun')," +
            "('Pues. Sí (adv.)','Mai')," +
            "('Pues bien','Yamai')," +
            "('Pugilato','Chope')," +
            "('Pujos del parto','Kon pakutan')," +
            "('Pulga','Nerém, nerüm')," +
            "('Pulido, liso, lustroso','Luyëf, luyüf')," +
            "('Pulir','Iyúdün')," +
            "('Pulmón, bofes','Pinu, ponon')," +
            "('Pulseras (joyas mapuches)','Trarükuq, trarükuqwe')," +
            "('Pus, la','Trar')," +
            "('Punta de lanza, aguijón','Waiki')," +
            "('Punta, cumbre, extremidad','Wechu, wechun')," +
            "('Puntiagudo (adj.)','Yung')," +
            "('Punto extremo de las cosas','Af peyüm')," +
            "('Puñado a dos manos','Truna')," +
            "('Puñados, sacar a','Trunanentun')," +
            "('Punzadas en los oídos','Ringülpilun')," +
            "('Punzón (sust.)','Katáwe')" +
            ";";

    public static final String INSERTAR_LETRA_Q = "INSERT INTO " + TABLE_LETRA_Q + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('¿Qué?, ¿qué cosa?','¿Chem?')," +
            "('¿Qué hacer?','¿Chumn?')," +
            "('¿Qué hacer con alguien o algo?','¿Chumkënun?')," +
            "('Quebrado (adj.)','Trafon, watron')," +
            "('Quebrado, montañoso ','Wingkulentu')," +
            "('Quebrar, quebrarse','Trafon, watron')," +
            "('Quedar atrás por descuido (un animal)','Llaikëlen, llaiyün')," +
            "('Quedarse, estar todavía','Mëlekan')," +
            "('Quemar, quemarse','Pëtren')," +
            "('Quemar, incendiar','Kulan')," +
            "('Quemar','Kütraln')," +
            "('Quemar, hacer fuego','Kütraltun')," +
            "('Quemar, chamuscar','Kuipëdn, kuipëln')," +
            "('Quemar mucho (la piel)','Lëfün')," +
            "('Quemarse, arder','Lëfn, lëfkëlen')," +
            "('Querer','Main')," +
            "('Quere, desear, necesitar','Duamn')," +
            "('Quere con más intensidad','Duamnien')," +
            "('¿Quién?','¿Inei?, ¿Iñie?')," +
            "('¿Quién será? No lo conozco','¿Ineipeichi mai? Kimlafiñ')," +
            "('Quijada, la','Këliwen')," +
            "('Quillay (árbol)','Küllai, këllai')," +
            "('Quitar','Entun, nentun')," +
            "('Quitar raspando','Yifédentun, yifëdnentun')," +
            "('Quitar quebrando','Watronentun')" +
            ";";


    public static final String INSERTAR_LETRA_R = "INSERT INTO " + TABLE_LETRA_R + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Rabiar, hacer','Illkuln')," +
            "('Rabioso, enojón (adj.)','Illkufe')," +
            "('Rabo, cola (sust.)','Kélen')," +
            "('Racionar','Rakiduamn')," +
            "('Raer, raspar','Rueln, ruen')," +
            "('Raíz, la','Folil')," +
            "('Raíces, prender las','Foliln')," +
            "('Raíces, sacar las','Folitun')," +
            "('Rajar, rajarse','Chafodün')," +
            "('Rajar, hender','Witráfun')," +
            "('Rama, gancho, pierna','Chang')," +
            "('Rama, la','Rou')," +
            "('Rama, pequeña','Pichi rou')," +
            "('Rama (del árbol)','Roumamëll')," +
            "('Ramaje del árbol','changkiñ')," +
            "('Ramillete','Këtrün, këtrüng')," +
            "('Ramillete de flores','Këtrün/këtrüng rayen')," +
            "('Rapar (el pelo)','Nguedunentun')," +
            "('Rapaz, salteador (adj.)','Mëntufe')," +
            "('Rascar, raspar, raer','Ruefn, ruen')," +
            "('Reconsiderar','Kimkimtun')," +
            "('Recordar','Kimniekan')," +
            "('Recordar algo','Konëmpamnien, konümpanien')," +
            "('Rectamente, derechamente (adv.)','Norkechi')," +
            "('Recto, derecho (adj.)','Itró')," +
            "('Recto, derecho, derechamente (adv.)','Nor')," +
            "('Rechazar, lanzar, tirar algo','Ütrefn')," +
            "('Rechinar, crujir','Tritürún')," +
            "('Red para pescar','Ñeweñ')," +
            "('Rededor, en (adj.)','Wallke, wallkechi')," +
            "('Redimir, salvar, liberar','Motuln')," +
            "('Redondo, hemisférico','Chingked, chüngkëd')," +
            "('Reducirse, encogerse, retirarse','Witrakonn')," +
            "('Reducirse a ceniza, exterminar','Cheupëdün')," +
            "('Referir, contar, revelar','Nütramentun')," +
            "('Referir algo','Rupaln')," +
            "('Reflejarse','Aiwiñ alewn')," +
            "('Reflexionar','Piukentëkun')," +
            "('Refregar','Këtoyün, këtrodün, ketrorün')," +
            "('Refregar, frotar (ropa)','Nguënkün')," +
            "('Refregar, restregar','Pingüedün')," +
            "('Refrescar','Firkümn')," +
            "('Refrescarse','Firkü luwn')," +
            "('Regar, humedecer','Üremn')," +
            "('Región, terreno, tierra','Mapu')," +
            "('Registrar, palpar','Malün')," +
            "('Regresar','Akutun')," +
            "('Reír','Ayen')," +
            "('Reír siempre','Ayekan')," +
            "('Reírse de alguien','Ayetun')," +
            "('Reír, hacer reír a la gente','Ayelchen')," +
            "('Relámpago','Llëfke, lüfke')," +
            "('Relampaguear','Llëfken')," +
            "('Relinchar','Ngaingáyün')," +
            "('Relumbrante, brillante (adj.)','Wilëf')," +
            "('Relumbrar','Alofn, alofkëlen, alofün')," +
            "('Relumbrar, brillar','Lüfkümn')," +
            "('Remangar','Mëchampramn')," +
            "('Remar','Kawen')," +
            "('Remedio (yerba medicinal)','Lawen')," +
            "('Remedios, tomar','Lawenn')," +
            "('Remedios, tomarlos','Orkülawenn')," +
            "('Remendar','Ñidëttun')," +
            "('Remo','Kawewe')," +
            "('Renacuajo','Kolchau')," +
            "('Rendirse','Wëluwn')," +
            "('Repasar con la vista','Inárumen')," +
            "('Repartir, distribuir, mandar','Trokin')," +
            "('Repeler, rechazar, ahuyentar','Wemun, wemün')," +
            "('Repetir lo que se ha dicho','Iná fei pin')," +
            "('Replicar, contradecir','Traftun')," +
            "('Representarle (estar en lugar de otro)','Welukonkëlen')," +
            "('Repugnancia, tener','Wënun')," +
            "('Repugnar, dar asco','Ünun')," +
            "('Resaca, ola','Reu')," +
            "('Resbalar','Melkain, melkaün, melkayün')," +
            "('Resbalarse','Kaipëdn')," +
            "('Resbaloso (adj.)','Kaipëd, melkai')," +
            "('Rescoldo','Awiñkütral, awiñtrufken')," +
            "('Resguardarse, parapetarse','Relmantuñmawn')," +
            "('Resguardarse de la lluvia','Chütulen')," +
            "('Resistente, fuerte','Yafün')," +
            "('Resistente, ser','Yafün')," +
            "('Resistir, forcejear','Newentun')," +
            "('Resolana','Pañu, pañüaq')," +
            "('Resolver','Elduamn')," +
            "('Resonar, dar eco','Aukin, aukiñn')," +
            "('Respetable, venerable (adj.)','Ekufal')," +
            "('Respetar','Ekun, yeweltun')," +
            "('Respetar, apreciar, honrar','Shakin, rakin')," +
            "('Respeto, ser digno (de aprecio)','Shakinguen')," +
            "('Respirar, resollar','Neyün')," +
            "('Responder, contestar','Llowdëngun, lloudëngun')," +
            "('Restituir','Wëltun, weñóltun')," +
            "('Resucitar, hacer revivir','Mongueltun')," +
            "('Resuelto, estar','Ad duamkëlen')," +
            "('Resuello, hálito','Neyen')," +
            "('Resultar bien','Ad tripan')," +
            "('Retar, insultando','Lukatun')," +
            "('Retener (tener aún)','Niekan')," +
            "('Retirado, ser','Üwelen')," +
            "('Retirar algo','Weñówitrarun')," +
            "('Retornar algo','Weñóln')," +
            "('Retratar','Adentuln')," +
            "('Retratar a alguien','Ináadentun')," +
            "('Retumbar, zumbar','Pomomün, ponomün')," +
            "('Reunión','Kawiñ')," +
            "('Reunión, la (sust.)','Trapëmuwn')," +
            "('Reunir','Nguëlëmn')," +
            "('Reunir, unir, juntar','Trapëmn')," +
            "('Reunirse, unirse, juntarse','Trapëmuwn')," +
            "('Reventar','Pafn')," +
            "('Revés, en el','Ká ad meu')," +
            "('Revisar, advertir','Ngueneltun')," +
            "('Revolcarse, andar rodando','Imelkanun, imelkiawn')," +
            "('Revolver, desordenar, confundir','Reifütun')," +
            "('Rico, noble (adj.)','Ülmen')," +
            "('Rio (sust.)','Leufü')," +
            "('Rincón, recodo (sust.)','Nguión')," +
            "('Risa, la (sust.)','Ayén, ayé')," +
            "('Risa','Ayelen')," +
            "('Risco (sust.)','Lil')," +
            "('Robar','Chukin, weñen')," +
            "('Robar animales','Wingkün')," +
            "('Roble (árbol)','Pelliñ')," +
            "('Rociar, perfumar','Nümüln')," +
            "('Rocío, el','Mëlfem, mëlfen, mëlum')," +
            "('Rodar, volcarse','Imeln')," +
            "('Rodilla, la','Luku')," +
            "('Rodillas, de (exp. adv.)','Lukutu')," +
            "('Roer, corroer','Üngalün')," +
            "('Rogar, suplicar','Llellipun, nguellipun')," +
            "('Rojo (color)','Kelü')," +
            "('Rojo, ser','Kelün')," +
            "('Romper, comprimir','Nguëtrálün')," +
            "('Romper, rasgar','Wikër, wkür')," +
            "('Roncar','Traltalün')," +
            "('Ronco, sin voz (adj.)','Kafir')," +
            "('Rondar','Wallotiawn')," +
            "('Rostro, el','Angue')," +
            "('Rotación, estar en','Chiwëd, chiwëdnen')," +
            "('Roto, rasgado (adj.)','Wikër, wikür')," +
            "('Rozar con algo','Fëlman')," +
            "('Ruborizarse','Kelü tripan, kelü ripañman')," +
            "('Ruido, tono','Dëngun, dungun')," +
            "('Ruido confuso','Wakeñ')," +
            "('Rumiar (mascar detenidamente)','Kaimutun')" +
            ";";


    public static final String INSERTAR_LETRA_S = "INSERT INTO " + TABLE_LETRA_S + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Saber, conocer, aprender','Kimn')," +
            "('Saber todavía','Kimniekan')," +
            "('Sabido, entendido (adj.)','Kim')," +
            "('Sabor, aliño (sust.)','Ünel')," +
            "('Sacar, quitar','Mëntunentun')," +
            "('Sacar las raíces','Foliltun')," +
            "('Sacar escarbando','Kaipünentin, keipünentun')," +
            "('Sacar a puñados','Trunanentun')," +
            "('Sacudir','Mëtrün, mëtrürun')," +
            "('Sacudirse','Mëtroutun, mëtrown')," +
            "('Sagaz','Lliwafe, lliwatufe')," +
            "('Sahumar, ahumar','Fëchotun')," +
            "('Sal, la (sust.)','Chadi')," +
            "('Salado, agrio (adj.)','Kotrü')," +
            "('Salado, ser (o agrio)','Kotrün')," +
            "('Salar','Chadiñman, chaditun')," +
            "('Salero (sust.)','Elchadiwe')," +
            "('Salir, partir','Tripan')," +
            "('Salir de, proceder de','Tuwn')," +
            "('Salir acá, salir hacia allá','Tripapan, tripapun')," +
            "('Salirse, escurrirse (líquidos)','Weyun, weyun nguen')," +
            "('Saliva (sust.)','Kowën')," +
            "('Saliva, mezclar con','Kowëmn')," +
            "('Salpicar, rociar','Pëtéfeln, pëtéfman')," +
            "('Salpicarse, salpicar a otro','Widpüñman')," +
            "('Saltar','Chefkün, rüngkün, rüngkütun')," +
            "('Saltar (de salpicar)','Püfn')," +
            "('Saltar (andar a saltos)','Püfkiawn')," +
            "('Saltar (andar con un pie, cojear)','Küntrotun')," +
            "('Salto (sust.)','Rüngkü')," +
            "('Salud (sust.)','Mongueln')," +
            "('Saludar','Chalin')," +
            "('Saludo, el','Chalichén')," +
            "('Salvador de los hombres','Montulchefe')," +
            "('Salvar, libertar, redimir','Montuln')," +
            "('Salvarse, librarse, escapar','Montun')," +
            "('Sanado, haber','Llaftun')," +
            "('Sanar','Llapëmn')," +
            "('Sangrar','Mollfunm, mollfüñn')," +
            "('Sangre, la','Mollfüñ')," +
            "('Sano, sin defecto','Tremo')," +
            "('Sano, estar','Llafkëlen')," +
            "('Saqueo','Malón, malokontun')," +
            "('Sarna, la','Pitru')," +
            "('Satisfacer, hartar','Wedaln')," +
            "('Savia, jugo, caldo (sust.)','Korü')," +
            "('Sazonarse (estar en sazón)','Trewn')," +
            "('Secar, enjutar','Piwemn')," +
            "('Secarse, estar seco','Angkülen, angkelen')," +
            "('Seco (adj.)','Angken, angkün, piwën')," +
            "('Sed, la','Wiwün')," +
            "('Sed, tener','Wiwün')," +
            "('Sed, dar','Wiwüln')," +
            "('Seguidamente, muy cerca (exp. adv.)','Inau')," +
            "('Seguir, seguir a alguien','Inán')," +
            "('Seguir una dirección','Rëpüyen')," +
            "('Seguir los rastros','Inápënonn')," +
            "('Seguir atrás de','Ináiawëln')," +
            "('Semblante, cara, rostro','Angue')," +
            "('Sembrado, el (sust.)','Ngankonguife')," +
            "('Sembrar','Tëkun')," +
            "('Sembrar esparciendo la semilla','Ngann')," +
            "('Sembrar a trechos','Nguëdëfn')," +
            "('Sembrar maíz','Awëdn')," +
            "('Sembrar algo en hileras','Winwinn, wiñwiñn')," +
            "('Semilla, fruto','Fén')," +
            "('Semilla, echar','Tëkufënn')," +
            "('Sentado  (una persona)','Anülen')," +
            "('Sentar, plantar','Anümn')," +
            "('Sentarse, establecerse','Anün')," +
            "('Sentimientos','Duam')," +
            "('Señal, presagio (mal)','Perimol')," +
            "('Señalado, contado (adj.)','rakin')," +
            "('Separar, apartar','Pëntüln')," +
            "('Separarse','Pëntün')," +
            "('Separarse de alguien','Pëntüwn')," +
            "('Separarse, partirse, dividirse','Wëdan')," +
            "('Separados, estar (Haber distancia)','Wëdalen')," +
            "('Sepultar (dar sepultura)','Eln')," +
            "('Ser, estar','Nguen, ngueln, len')," +
            "('Ser, estar con','Nguen')," +
            "('Ser igual, coincidir','Kiñentrür, kiñentrürkëlen')," +
            "('Ser necesario','Duamfaln, duamfalnguen')," +
            "('ser así, estar así','Felen')," +
            "('Ser, estar todavía así, ser lo mismo','Felekan')," +
            "('Ser así en adelante','Felerpun')," +
            "('Ser, suceder así','Femnguen')," +
            "('Ser tan grande','Fentenn')," +
            "('Ser capaz de algo','Fituwn, fituwnnguen')," +
            "('Ser otra cosa','Kanguen')," +
            "('Ser más','Yafn')," +
            "('Serio, formal (adj.)','Nguenel')," +
            "('Serpiente','Filu, vilu')," +
            "('Servicial, ser','Puwënfaln')," +
            "('Sesos, cerebro','Mëllo')," +
            "('Sí (adv.)','Mai')," +
            "('Sí. El es. Eso es','Feille mai')," +
            "('Sí, así es','Itrólle ka')," +
            "('Sien, las sienes','Umaqwe')," +
            "('Silbar (el viento)','Férfërün')," +
            "('Silvar a alguien','Üweñüln')," +
            "('Silueta','Aiwiñ')," +
            "('Sin (prep.)','Ngueno')," +
            "('Sin cesar (adv.)','Afkentun')," +
            "('Siquiera, sumamente, sobremanera','Rume')," +
            "('Sirvienta, la','Dëngupeye')," +
            "('Situar, crear','Eln')," +
            "('Sobar, amasar, masajear','Ilürn, ülërün')," +
            "('Sobrar','Puchun')," +
            "('Sobras, dejar','Puchuln')," +
            "('Sobre, arriba','Wente, wenche')," +
            "('Sobrellevar, sufrir con paciencia','Kúmelkayen')," +
            "('Sobrellevar, llevar algo, sufrir','Yen')," +
            "('Socio, aliado (sust. y adj.)','Wichan')," +
            "('Sofocado, asfixiado','Trëfn, trëfün')," +
            "('Sofocar, ahogar','Nguëtrün')," +
            "('Soga (sust.)','Def')," +
            "('Sogas, hacer','Maumawn')," +
            "('Sol, día','Antü')," +
            "('Solamente (adv. suf.)','Mëtén')," +
            "('Solo (adv.)','Kidutu')," +
            "('Soltar, desatar','Ñaitun')," +
            "('Soltar, libertar, despedir','Mëñaln, mëñalntün')," +
            "('Soltar, largar','Neln, nelëmn, neltun')," +
            "('Soltar','Lelëmn, leikümn')," +
            "('Soltero, soltera','Kauchu')," +
            "('Solución, dar','Pepiln')," +
            "('Sollozar, gemir','Nëkürün, nikürn')," +
            "('Sombra','Llaufeñ')," +
            "('Sombra, estar en la','Llaufeñtulen')," +
            "('Sombrero (sust.)','Chumpiru')," +
            "('Sonar, hablar, cantar','Déngun')," +
            "('Sonar ruidos','Traipin')," +
            "('Soñador (adj. y sust.)','Péumafe')," +
            "('Soñar con algo','Péuman')," +
            "('Soplar','Pimun')," +
            "('Sorber','Ofëln, ofüln')," +
            "('Sordo (adj.)','Pilu')," +
            "('Sordera, la','Pilunguen')," +
            "('Sorprender','Lloftun')," +
            "('Sorprender en flagrante','Túntëkun')," +
            "('Sorpresa, de','Lloftukechi')," +
            "('Sortija, anillo','Iwëlkuq')," +
            "('Sosegado, estar','Nguenelkëlen, ngüenelkëlewen')," +
            "('Sosegar','Llakóln')," +
            "('Sosegar, tranquilizar','Tünguëmn')," +
            "('Sosegarse','Llakónaqtun, llakón')," +
            "('Sosiego, tener','Tünguëmuukëlen')," +
            "('Sostén, bastón','Retrüpeyüm')," +
            "('Suave, blando (ropa)','Pañud')," +
            "('Subir, levantar','Përamn')," +
            "('Subir, montar','Përan, pran')," +
            "('Sublevarse','Aukan')," +
            "('Suceder, ocurrir','Rupan')," +
            "('Sucedido','Rupamon, rupamoyün')," +
            "('Suciedad, mancha','Pod')," +
            "('Sucio (adj.)','Pod')," +
            "('Sucio, asqueroso (adj.)','Ükaipue')," +
            "('Sucio, andar','Podkiawn')," +
            "('Sudadero de caballo','Chañu')," +
            "('Suelo, el','Tue')," +
            "('suelo de la casa','Tafü')," +
            "('Sueño','Umaq')," +
            "('Sueño (soñar)','Péuma')," +
            "('Sufrir necesidad, escazes','Afman')," +
            "('Sufrir daño','Awünguellan')," +
            "('Sufrir, sobrellevar','Kümelkayen')," +
            "('Sugerir','Tëkuduamn')," +
            "('Sujetar comprimiendo','Nguëtrarn, nguëtrarün')," +
            "('Sujeto, quedarse','Tangkünien')," +
            "('Sumergido, estar','Ñamkëlen')," +
            "('Superficie, sobre la','Wente, wenche')," +
            "('Suplicar, rogar','Nguellipun, nguelliputun')," +
            "('Suplir, integrar','Puümtun')," +
            "('Sur','Willi')," +
            "('Surcar, hacer surcos','Wirilüm')," +
            "('Surcarse, acanalarse','Loln')," +
            "('Sustento, víveres','Monguewe')," +
            "('Sustento, dar el','Mongueln')," +
            "('Suspirar, tener pena','Afkiduamn, afküduamn')" +
            ";";


    public static final String INSERTAR_LETRA_T = "INSERT INTO " + TABLE_LETRA_T + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Tabaco','Pëtrem')," +
            "('Tabaco, fumar','Pëtremtun')," +
            "('Tal (adj.); así (adv.)','Femnguechi')," +
            "('Talón, calcañar','Rüngkoinamun')," +
            "('Tallar piedras','Rütrín')," +
            "('Tallo','Foron')," +
            "('Tambalear','Ngueikülln, ngueikëllün')," +
            "('Tangible, ser','Fëlfan')," +
            "('Tanta distancia, a (adv.)','Fentépu, fentrépu')," +
            "('Tantear','Shumpatun')," +
            "('Tanto, hasta tanto. Dar fin (adv.)','Fenté, fentré')," +
            "('Tanto, mucho (adv.)','Fentén, fentrén')," +
            "('Tanto, mucho (adv.)','Fentén, fentrén')," +
            "('Tanto tiempo (adv.)','Fentépu, fentrépu')," +
            "('Tapa, vestido','Takun')," +
            "('Tapar, cubrir','Takun')," +
            "('Tapar','Nguëdífün, nguëdífn')," +
            "('Tapón (sust.)','Nguëdifwe')," +
            "('Tartamudo (adj.)','Ketro, këfüll')," +
            "('Tatuaje','Kopawe')," +
            "('Tatuar','Kopan')," +
            "('Tejedora (sust.)','Düwekafe, ngërékafe')," +
            "('Tejer','Düwen, nguërén')," +
            "('Telar, el','Witral')," +
            "('Temblar','Nüyün')," +
            "('Temer, temor','Llükan')," +
            "('Temer algo','Llükatëkun')," +
            "('Temible, ser','Yamn, yañn')," +
            "('Tender','Kénün, kënükënun')," +
            "('Tendido, dejar (o expuesto)','Trañakënun')," +
            "('Tendido, estar','Tranálen')," +
            "('Tendido boca abajo','Kopëdkëlen')," +
            "('Tendón, nervio, músculo','Chüllfen')," +
            "('Tener, poseer','Nien')," +
            "('Tener aún','Niekan')," +
            "('Tener en mano, tener ocupado, Ñunien','')," +
            "('Teñido (adj.)','Pürn, pürëm')," +
            "('Teñidura, la','Pürn')," +
            "('Terminar, llevar a cabo','Wechulkan')," +
            "('Terminar allá','Fentépun')," +
            "('Terreno, tierra','Mapu')," +
            "('Terrón','Kepe')," +
            "('Testículo','Këtrau')," +
            "('Tibio (adj.)','Allush')," +
            "('Tibio, estar','Allush, allushkëlen')," +
            "('Tiempo, clima (sust.)','Wenu')," +
            "('Tierno, fino, delgado (adj.)','Pëllüf')," +
            "('Tierno (adj.)','Wellon')," +
            "('Tierra, terreno','Mapu')," +
            "('Tierra, la. El suelo','Tue')," +
            "('Tierra, la tierra. El polvo','Trüfur')," +
            "('Torcido','Trëfël')," +
            "('Tranquilamente','Külmelka, külmelkalechi')," +
            "('Tranquilizar','Tünguëmn')," +
            "('Tranquilizar ánimos','Llakóduameln')," +
            "('Transparente, claro (adj.)','Ailiñ')," +
            "('Tras (tras algo o alguien)','Relmalen, relmantulen')," +
            "('Trasladar','Wiñam, wiñamtum')," +
            "('Trasquila, la','Kedin')," +
            "('Trasquilar','Kedin, kedintun')," +
            "('Traspasar','Katárumen')," +
            "('Traspasar a otro','Rultëkun')," +
            "('Transportar en brazos','Metaiaweln')," +
            "('Transportar allá','Puwëln')," +
            "('Traspiés, dar','Tretraikiawn, trentrayüwn')," +
            "('Tratar (tratar bien)','Adelchen')," +
            "('Tratar, negociar','Dëngutukënun')," +
            "('Tratarse, versar de','Rumen')," +
            "('Tratarse bien, cuidarse','Kuñültuwn')," +
            "('Travieso, desobediente (adj.)','Wedwed')," +
            "('Trenza (sust.)','Chape')," +
            "('Trenzas, hacer las','Chapetun')," +
            "('Trenzas, moño','Nguëtro')," +
            "('Trenzar','Chapekan')," +
            "('Trepar','Ekonpran')," +
            "('Trigal','Kachillawe')," +
            "('Trigo','Kachilla')," +
            "('Tripas','Küllche')," +
            "('Triste, afligido (adj.)','Lladkünkeni, Lladkünkechi')," +
            "('Trizarse','Chillfun')," +
            "('Tronar (la escopeta)','Tralkan')," +
            "('Tronchar','Mutrung')," +
            "('Tropezar','Mëtrórün, mëtrúrün')," +
            "('Tropezar con algo','Mëtrurkonn')," +
            "('Trotar','Trelpongkëlen, tralpogün')," +
            "('Trote (sust.), al trote (adv.)','Trelpong')," +
            "('Tuerto, ciego (adj.)','Trauma')," +
            "('Tullirse','Waifüng')," +
            "('Tu (Pron. pers.)','Eymi, eimi')," +
            "('Tupidas, estar muy','Nguënkúdkëlen, nguënkúlen')," +
            "('Tupido, denso (adj.)','Trongue')," +
            "('Tupido, estar','Trongn')," +
            "('Turbarse','Chürwawn, ngoimán')," +
            "('Turbio','Trufün')" +
            ";";


    public static final String INSERTAR_LETRA_U = "INSERT INTO " + TABLE_LETRA_U + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Ubre (sust.)','Moyo')," +
            "('Ulpo','Ullpéd, wilpëd, wilpud')," +
            "('Último día','Af antü')," +
            "('Últimos confines de la tierra','Af mapu')," +
            "('Último, venir el último, en el último','Iñalen')," +
            "('Un, uno, aun (num.)','Kiñe')," +
            "('Uno más','Kákiñe')," +
            "('Uno por uno, aparte (adv.)','Wichuke')," +
            "('Uno por uno, en fila (adv.)','Winwin, wiñwiñ')," +
            "('Ungir','Nguëlfün')," +
            "('Ungüento','Nguëlfuntëkun')," +
            "('Unánimemente (adv.)','Kiñe kënu')," +
            "('Unido (adj.)','Trapëmn')," +
            "('Unido a, junto a (prep.)','Traf')," +
            "('Unir, juntar, reunir','Trapëmn')," +
            "('Unirse, reunirse, juntarse','Trapëmuwn')," +
            "('Unirse, reunirse','Trawëluwn')," +
            "('Untar','Iwiñman, iwiñtun')," +
            "('Uña, la','Wili')," +
            "('Urdimbre, la','Witral')," +
            "('Urdir','Witraln, witralün')," +
            "('Urgencia, necesidad','Duam')," +
            "('Usado (adj.)','Llud')," +
            "('Usar','Lludn, dayen')," +
            "('Utensilios','Fül, fël')," +
            "('Útil, apto (adj)','Küme')," +
            "('Útil, ser','Kümen')" +
            ";";

    public static final String INSERTAR_LETRA_V = "INSERT INTO " + TABLE_LETRA_V + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Vaciar','Wellimn')," +
            "('Vaciarse','Wellin')," +
            "('Vacilar sin resolución','Ñuiduamn')," +
            "('Vado, el','Nguilawe')," +
            "('Vado, pasar en el','Nguilan')," +
            "('Vagabundo','Miawpëdan, miawpran')," +
            "('Vaho, exhalación','Orken')," +
            "('Vaho, expedir','Orkün')," +
            "('Vaho, vapor (sust.)','Wërwan')," +
            "('Vaho, echar','Wërwann, wërwenn')," +
            "('Vaho de la tierra y de las montañas','Këpuka')," +
            "('Vaina de legumbres','Kapi')," +
            "('Valiente (adj.)','Kona')," +
            "('Valle, el (sust.)','Wau')," +
            "('Vanagloriarse, jactarse','Malmakawn, malmawn')," +
            "('Vanidoso, orgulloso (sust. y adj.)','Kauchu')," +
            "('Vara, varilla','wima')," +
            "('Vaso de greda','Charu')," +
            "('Vaso','Pëtokopeyüm')," +
            "('Vaso, empinar el','Waitron, waitrontëkun')," +
            "('Vástago, hijo','Choyin, choyün')," +
            "('Vasto (adj.)','Ingaf')," +
            "('Vejiga','Shuka willeñ')," +
            "('Velar sobre algo, estar pendiente','Lliwatun, lliwatunien')," +
            "('Vello, lana','Kal')," +
            "('Velludo, ser','Kalnguen')," +
            "('Vencer (a alguien)','Yerpun')," +
            "('Vender, dar, entregar','Wëln, ruln')," +
            "('Vender, ceder','Wëltëkun')," +
            "('Veneno','Languëmchewe')," +
            "('Venido muy cerca (adj.)','Fëlpa')," +
            "('Venir','Küpan')," +
            "('Venir de paso','Nguepan')," +
            "('Venir a dejar','Elpan')," +
            "('Venir muy cerca acá','Fëlpan')," +
            "('Venir en el último momento','Iñalen')," +
            "('Venir a ver','Pepan')," +
            "('Venir a encontrar','Trafpan')," +
            "('Venir cerca','Pëllélepan')," +
            "('Ver, mirar, buscar','Kintun')," +
            "('Ver, encontrar','Pen')," +
            "('Ver, ir a','Pemen')," +
            "('Ver (haber visto algo)','Perpan')," +
            "('Ver o encontrar (en otra parte)','Pepun, perpun')," +
            "('Verano, sol, haber sol','Antüguen')," +
            "('Verdad, la (sust.)','Mupiñ')," +
            "('Verdad, decir la','Mupin')," +
            "('Verdad, en (adv.)','Mupinkechi')," +
            "('Verdadero (adj.)','Mupiñ')," +
            "('Verde, no maduro (adj.)','Karü')," +
            "('Verde, ser (o volverse verde)','Karün, karülen, karünkëlen')," +
            "('Vergüenza, sin (adj.)','Nguenóyewen')," +
            "('Verruga (sust.)','Pelleñ, pellken')," +
            "('Versar de, tratarse de','Rumen')," +
            "('Vertical (adj.)','Retrü')," +
            "('Vertical, derecho (adj.)','Üngkü')," +
            "('Vertical, estar, estar parado','Retrülen')," +
            "('Vértigo, dar','Uyüln')," +
            "('Vestido','Takun')," +
            "('Vestidos, los','Tëkuluwn')," +
            "('Vestirse','Tëkuluwn')," +
            "('Vez, la (sust.)','Naq')," +
            "('Vía láctea (sust.)','Rëpüapeu')," +
            "('Viajar','Amukan')," +
            "('Viajar al extranjero','Nampëlkan')," +
            "('Viajero (sust.)','Nampëlkafe')," +
            "('Vicios o mañas','Ad')," +
            "('Vida','Monguen')," +
            "('Vida, dar su','Lakonn')," +
            "('Vigilar','Llaituchen, llaitun')," +
            "('Viejo (adj.)','Füchá')," +
            "('Viejo (adj. mujeres o cosas)','Kudé')," +
            "('Viejo, el (anciano) (sust.)','Fücha')," +
            "('Viejo, ser','Füchan')," +
            "('Viento, el','Kurëf')," +
            "('Viento, haber','Kürefkëlen')," +
            "('Vientre, cuerpo (sust.)','Angka, kalül')," +
            "('Vientre','Pütra')," +
            "('Violentar, forzar','Newenman, newentun')," +
            "('Visible, ser','Pefaln, pefalnguen')," +
            "('Visión, la','Perimontu')," +
            "('Visita, hacer','Llallitun')," +
            "('Visitar, ir a','Llallituiawn, llallitumen')," +
            "('Vista, la','Kintun')," +
            "('Víveres, sustento','Monguewe')," +
            "('Vivir, sanar','Monguen')," +
            "('Vivir, estar vivo','Monguelen')," +
            "('Viuda','Lanpu domo')," +
            "('Viudo','Lanpu wentru')," +
            "('Vocear','Mëtrëmtun')," +
            "('Volar','Mëpün, mëpütun')," +
            "('Volar (pájaros)','Üpënn')," +
            "('Volcado, estar','Waichëfkëlen')," +
            "('Volcán','Deqiñ')," +
            "('Volcar, rodar','Imeln')," +
            "('Volcar, dar vuelta','Sëkülln, shëkülln')," +
            "('Volver','Waichëfn')," +
            "('Voluntad, orden (sust.)','Pipiel, piel')," +
            "('Volver a estar bien','Kümetun')," +
            "('Volver a verse','Peútun')," +
            "('Volver a irse','Weñó amutun')," +
            "('Vomitar','Rapin')," +
            "('Vómito','Lolonn')," +
            "('Vómito (provocarse a sí mismo)','Rapilchen, rapiln')," +
            "('Voz, dar su; hablar','Dëngun')," +
            "('Vuelta, darse la','Waichëfwn')" +
            ";";


    /*
    public static final String INSERTAR_LETRA_W = "INSERT INTO " + TABLE_LETRA_W + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('','')," +
            "('','')" +
            ";";

    public static final String INSERTAR_LETRA_X = "INSERT INTO " + TABLE_LETRA_X + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('','')," +
            "('','')" +
            ";";
    */


    public static final String INSERTAR_LETRA_Y = "INSERT INTO " + TABLE_LETRA_Y + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Y (conj.)','Ka, kai')," +
            "('Ya (adv.)','Deu')," +
            "('Yegua','Auka')," +
            "('Yema del huevo','Chod kuram')," +
            "('Yerba, pasto','Kachu')," +
            "('Yerba medicinal','Lawen kachu')," +
            "('Yerno (y suegro)','Chedkui')," +
            "('Yo (pron. pers.)','Iñche, inche')," +
            "('Yugo de labranza','Yuku')" +
            ";";

    public static final String INSERTAR_LETRA_Z = "INSERT INTO " + TABLE_LETRA_Z + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Zambullirse','Rëmun, rëlun')," +
            "('Zancudo','Rofi')," +
            "('Zanjón','Lol')," +
            "('Zapalli, calabaza (instrumento)','Wada')," +
            "('Zarcillos, aros', 'Chawai, chawaitu')," +
            "('Zorro, zorra','Nguërü')," +
            "('Zumbar','Trëmëmkëlen, trëmëmün')," +
            "('Zumbar, retumbarse','Ponomün')" +
            ";";


}
