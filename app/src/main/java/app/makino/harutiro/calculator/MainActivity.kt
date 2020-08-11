package app.makino.harutiro.calculator

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firstNumber = 0.0
    var secondNumber = 0.0
    var totalNumber = 1.0
    var operator = "empty"
    var i = 0.0
    var ataiP = 1.0
    var ataiR = 1.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150, 150, 150))
        rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
        nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

        plusButton.isEnabled = false
        minusButton.isEnabled = false
        multiplyButton.isEnabled = false
        equalButton.isEnabled = false
        waruButton.isEnabled = false
        nprButton.isEnabled = false
        ncrButton.isEnabled = false
        rButton.isEnabled = false

        numberText.text = firstNumber.toString()

        //00botton
        numberButton00.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 100 + 0

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 100 + 0

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //0ボタン
        numberButton0.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 0

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 0

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //1ボタン
        numberButton1.setOnClickListener {
            if (operator == "empty"){
                firstNumber = firstNumber * 10 + 1

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            }else{
                secondNumber = secondNumber * 10 + 1

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                equalButton.isEnabled = true

            }
        }

        //２ボタン
        numberButton2.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 2

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 2

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //3botton
        numberButton3.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 3

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 3

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //4botton
        numberButton4.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 4

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled =true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 4

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //5botton
        numberButton5.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 5

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled =true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 5

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //6botton
        numberButton6.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 6

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 6

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //7botton
        numberButton7.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 7

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled =true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 7

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //8botton
        numberButton8.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 8

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 8

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //9botton
        numberButton9.setOnClickListener {
            if (operator == "empty") {
                firstNumber = firstNumber * 10 + 9

                numberText.text = firstNumber.toString()

                plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240, 240, 240))
                rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))
                ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(240,240,240)))
                nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(240,240,240))

                plusButton.isEnabled = true
                minusButton.isEnabled = true
                multiplyButton.isEnabled = true
                equalButton.isEnabled = false
                waruButton.isEnabled = true
                nprButton.isEnabled = true
                ncrButton.isEnabled = true
                rButton.isEnabled = true


            } else {
                secondNumber = secondNumber * 10 + 9

                numberText.text = secondNumber.toString()

                equalButton.backgroundTintList =
                    ColorStateList.valueOf(Color.rgb(240, 240, 240))

                equalButton.isEnabled = true

            }
        }

        //+botton
        plusButton.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "plus"

            numberText.text = secondNumber.toString()

        }

        //-botton
        minusButton.setOnClickListener {
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "minus"

            numberText.text = secondNumber.toString()

        }

        //*botton
        multiplyButton.setOnClickListener {
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "multiply"

            numberText.text = secondNumber.toString()

        }

        // /botton
        waruButton.setOnClickListener {
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            operator = "waru"

            numberText.text = secondNumber.toString()

        }

        // r!botton
        rButton.setOnClickListener {

            operator = "r"

            totalNumber = 1.0

            equalButton.isEnabled = true

            i = firstNumber
            while (i > 0) {
                totalNumber *= i
                i--
            }

            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber = 0.0
            secondNumber = 0.0
            ataiP = 1.0
            ataiR = 1.0
            operator = "empty"
            numberText.text = totalNumber.toString()

            plusButton.isEnabled = false
            minusButton.isEnabled = false
            multiplyButton.isEnabled = false
            equalButton.isEnabled = false
            waruButton.isEnabled = false
            ncrButton.isEnabled = false
            nprButton.isEnabled = false
            rButton.isEnabled = false




        }

        //nprbutton
        nprButton.setOnClickListener {
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))


            operator = "npr"

            numberText.text = secondNumber.toString()

            totalNumber = 1.0


        }

        //ncrbutton
        ncrButton.setOnClickListener {
            ncrButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))



            operator = "ncr"

            numberText.text = secondNumber.toString()

            totalNumber = 1.0


        }

        //=botton
        equalButton.setOnClickListener {
            if (operator == "plus"){
                totalNumber = firstNumber + secondNumber
            }else if (operator == "minus"){
                totalNumber = firstNumber - secondNumber
            }else if (operator == "multiply"){
                totalNumber = firstNumber * secondNumber
            }else if (operator == "waru"){
                totalNumber = firstNumber / secondNumber
            }else if (operator == "r"){

                i = firstNumber
                while (i > 0) {
                    totalNumber *= i
                    i--
                }

            }else if (operator =="npr"){
                i = secondNumber
                while (i > 0) {
                    totalNumber = totalNumber * firstNumber
                    firstNumber--
                    i--
                }
            }else if (operator == "ncr"){

                i = secondNumber
                while (i > 0) {
                    ataiP = ataiP * firstNumber
                    firstNumber--
                    i--
                }


                i = secondNumber
                while (i > 0) {
                    ataiR = ataiR * i
                    i--
                }

                totalNumber = ataiP / ataiR
            }

            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf((Color.rgb(150,150,150)))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))

            firstNumber = 0.0
            secondNumber = 0.0
            ataiP = 1.0
            ataiR = 1.0
            operator = "empty"
            numberText.text = totalNumber.toString()

            plusButton.isEnabled = false
            minusButton.isEnabled = false
            multiplyButton.isEnabled = false
            equalButton.isEnabled = false
            waruButton.isEnabled = false
            ncrButton.isEnabled = false
            nprButton.isEnabled = false
            rButton.isEnabled = false

        }

        //C,botton
        clearBotton.setOnClickListener {
            plusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            minusButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            multiplyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            equalButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            waruButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            rButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            nprButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            ncrButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))


            firstNumber = 0.0
            secondNumber = 0.0
            totalNumber = 1.0
            ataiP = 1.0
            ataiR =1.0

            operator = "empty"

            numberText.text = firstNumber.toString()


        }


    }

}