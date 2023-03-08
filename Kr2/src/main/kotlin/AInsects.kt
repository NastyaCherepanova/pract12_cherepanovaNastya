abstract class AInsects (_name:String, _speed: Int, _color: String, _eat: String, _home: String): IInsects {
    override val name: String = _name;
    override val speed : Int = _speed;
    override val color: String = _color
    override val eat: String = _eat
    override val home: String = _home

    override fun getFullInfo() {
        println("Имя - ${name}. Скорость полета - ${speed}. Окрас - ${color}. Питается - ${eat}")
    }

    override fun getInfoAboutSpeed() {
        when(speed) {
            7 -> println("Низкая скорость")
            12 -> println("Средняя скорость")
            15 -> println("Большая скорость")
        }
    }
}