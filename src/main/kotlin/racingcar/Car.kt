package racingcar
import camp.nextstep.edu.missionutils.Randoms.pickNumberInRange

class Car(name: String, position: Int = 0) {
    val name: String
    var position: Int

    init {
        this.name = name
        this.position = position
    }

    fun moveForwardRandomly() {
        val point = pickNumberInRange(0, 9)
        move(point)
    }

    fun move(point: Int) {
        if (point >= 4) {
            this.position += 1
        }
    }
}