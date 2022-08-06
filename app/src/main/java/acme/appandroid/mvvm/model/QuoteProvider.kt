package acme.appandroid.mvvm.model

class QuoteProvider {

    companion object {
        fun getQuoteRandom(): QuoteModel {
            val position = (0..8).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(quote = "The first place for learning to ", author = "bryan"),
            QuoteModel(quote = "The first place for learning tos", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Android Docs", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Android Docs", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development ", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Android Docs", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Android Docs", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Docs", author = "bryan"),
            QuoteModel(quote = "The first place for learning to development is Android Docs", author = "bryan"),
            )
    }
}