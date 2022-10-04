package com.example.myquizgame

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_poland,
            "San Marino",
            "Poland",
            "Monaco",
            "Norway",
            2)
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_norway,
            "Estonia",
            "Sweden",
            "Norway",
            "Finland",
            3)
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_france,
            "France",
            "Germany",
            "Portugal",
            "Switzerland",
            1)
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_finland,
            "Norway",
            "Finland",
            "Nicaragua",
            "Netherlands",
            2)
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_georgia,
            "Syria",
            "Switzerland",
            "Georgia",
            "Poland",
            3)
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_germany,
            "Germany",
            "Spain",
            "Romania",
            "Egypt",
            1)
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_greece,
            "Guatemala",
            "Honduras",
            "El Salvador",
            "Greece",
            4)
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_kenya,
            "Iraq",
            "Jordan",
            "Kuwait",
            "Kenya",
            4)
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_newzealand,
            "Australia",
            "U.S.",
            "New Zealand",
            "United Kingdom",
            3)
        questionList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_russia,
            "Poland",
            "Russia",
            "Italy",
            "Slovakia",
            2)
        questionList.add(que10)

        return questionList
    }
}