package acme.appandroid.mvvm.viewmodel

import acme.appandroid.mvvm.model.QuoteModel
import acme.appandroid.mvvm.model.QuoteProvider
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel: ViewModel() {

    /* LiveData permite que una activity se suscriba a una modelo de datos, y
     * que se llame automaticamente cuando se realicen cambios en dicho model
     */

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.getQuoteRandom()
        quoteModel.postValue(currentQuote)
    }
}