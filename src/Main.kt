import java.io.File
import java.io.FileReader
import java.io.FileWriter

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("============================1============================")

    val file = "E://Учёба Kotlin/TextFile"
    writeToFile(file)
    readFile(file)
    println("============================2============================")
    val textFile = "NewTextFile"
    val wayToFile = "E://Учёба Kotlin/"
    val newFile = "$wayToFile$textFile"
    val number = 18
    File(newFile)
    val writer = FileWriter(newFile, true)
    for (i in 0..number){
        if (i % 2 == 0) writer.write("$i ")
    }
    writer.close()
    readFile(newFile)

    println()

    println("============================3============================")

    val numberFile = File("E://Учёба Kotlin/numberFile")
   numberFile.writeText("2578963452")

    var content = numberFile.readText()
    for (i in content){
        if ( i == content.first()  || i == content.last() || i == content[content.length - 2] || i == content[1]  )
            println(i)
    }


}


fun writeToFile(file: String){
    println("Введите информацию")
    File(file)
    var text = readln()
    val writer = FileWriter(file, true)
    writer.write(text + "\n")
    while (true){
        println("Новая строка:")
        text = readln()
        if (text == 0.toString()){
            writer.close()
            break
        }
        writer.write(text + "\n")
    }
}

fun readFile(address: String){
    val file = File(address)
    val reader = FileReader(file)
    val array = CharArray(200)
    reader.read(array)
    for (i in array){
        if (i == '\u0000') break
        print(i)
    }
    reader.close()
}
