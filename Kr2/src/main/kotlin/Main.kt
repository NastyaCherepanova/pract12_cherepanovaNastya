fun main() {
    print("Введите название насекомого - ")
    val name = readln().toString()

    val insects1 = Insects(name, 5, "оранжевый", "цветы", "улей");

    insects1.getName();

    insects1.getFullInfo()
}