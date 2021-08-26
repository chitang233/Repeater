fun repeater(inputText: String, inputTimes: String?) {
    for (i in 1..inputTimes!!.toInt()) {
        println(inputText)
    }
}
fun main() {
    print("iNpUt SoMe AwEsOmE tExTs PlEaSe: ")
    val inputText = readLine()
    print("hOw MaNy TiMeS dO yOu WaNt To RePeAt: ")
    val inputTimes = readLine()
    repeater(inputText.toString(), inputTimes)
}
