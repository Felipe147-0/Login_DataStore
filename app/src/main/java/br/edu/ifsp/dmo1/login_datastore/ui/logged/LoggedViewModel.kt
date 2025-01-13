package br.edu.ifsp.dmo1.login_datastore.ui.logged

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import br.edu.ifsp.dmo1.login_datastore.data.DataStoreRepository
import kotlinx.coroutines.launch

class LoggedViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = DataStoreRepository(application)

    fun logout() {
        logoutPreference()
    }

    private fun logoutPreference() {
        viewModelScope.launch {
            repository.logoutChange()
        }
    }
}