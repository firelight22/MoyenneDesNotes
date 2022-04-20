fun main(args: Array<String>) {
    println("moyenne4Notes")
    moyenne4Notes()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    //
}
fun moyenne4Notes(){
    println("Entrez le nombre de valeurs :")
    val nbNoteMax = readLine()!!.toInt();
    var indexNbNote = 0;

    val listeNote = mutableListOf<Int>()
    while (indexNbNote <nbNoteMax){
        indexNbNote++
        listeNote.add(readLine()!!.toInt())
    }
    println(listeNote.sum()/nbNoteMax)

}

//fun moyenneNotesTillMinus1(){
//    println("Note (-1 pour terminer) ?")
//    var noteInput = readLine()?.toInt()!!;
//    val listeNote = mutableListOf<Int>()
//
//    listeNote.add(noteInput)
//    while(noteInput != -1){
//        noteInput = readLine()?.toInt()!!;
//        listeNote.add(noteInput)
//    }
//
//    val nbNoteMax = readLine()!!.toInt();
//
//    while (indexNbNote <nbNoteMax){
//        indexNbNote++
//        listeNote.add(readLine()!!.toInt())
//    }
//    println("La moyenne des notes est de "listeNote.sum()/nbNoteMax)
//}

//Saisir une note
fun saisirNote (){
    println("Veuillez saisir une note (-1 pour terminer)");
    var note : Float = readLine()!!.toFloat();
    val notes : MutableList<Float> = mutableListOf();
    while ( note >= 0){
        //L'on ajoute la note dans la liste avec la fonction ajouterNote
        notes.add(note)
        println("Veuillez saisir une note (-1 pour terminer)");
        note = readLine()!!.toFloat();
    }

    //L'on fait la moyenne de toutes les notes
    val moyenne : Float = notes.sum() / notes.count();
    println("La moyenne est de $moyenne")
}
