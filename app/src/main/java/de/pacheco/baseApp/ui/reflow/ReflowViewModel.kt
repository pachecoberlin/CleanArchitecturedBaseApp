package de.pacheco.baseApp.ui.reflow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import de.pacheco.baseApp.data.reflow.ReflowRepository
import javax.inject.Inject

@HiltViewModel
class ReflowViewModel @Inject constructor(private val reflowRepository: ReflowRepository
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = reflowRepository.getReflows().first().name
    }
    val text: LiveData<String> = _text
}