fun main() {
    var name = "julliet"
    var age = "22"
    var sentence = "i am $name i am $age years old "
    println(sentence)
    var myself = "nakayiza"
    var notmyself = "berna"
    if (myself == notmyself) {
        println(true)
    } else {
        println(false)
    }
    var g = "thankyou jesus for your love and favour upon me"
    println(g.toUpperCase())
    println(g.toLowerCase())
    println(g.capitalize())
    println(g.decapitalize())
    var empty1 = ""
    var blank = " "
    println(empty1.isBlank())
    println(blank.isEmpty())
    println(empty1.isEmpty())
    println(blank.isBlank())
    var i = " Ochieng Emmanuel "
    println(i.trim())
    println(i.trimStart())
    println(i.trimEnd())
    var location = "kampala"
    println(location.startsWith("r"))
    println(location.endsWith("a"))
    var text = "BTS is the best boy band group in kpop music."+
            "they are the best in dancing too in kpop music"
    println(text.replace("best","most wonderful"))
    var word = "eagle,crow,hen,peacock,chick"
    var birds = word.split(",")
    println(birds)
    println(birds[2])

}


