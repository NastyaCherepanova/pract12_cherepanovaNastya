class Insects(_name: String, _speed: Int, _color: String, _eat: String, _home: String) :
    AInsects(_name, _speed, _color, _eat, _home) {

    fun getName() {
        println("Имя насекомого - ${name}");
    }
}