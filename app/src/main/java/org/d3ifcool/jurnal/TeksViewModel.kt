package org.d3ifcool.latihan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3ifcool.jurnal.databinding.ActivityMainBinding

class TeksViewModel : ViewModel(){
    private lateinit var binding: ActivityMainBinding
    private val _teks= MutableLiveData<String>()

    val teks : LiveData<String>
        get() = _teks
    init {
        _teks.value="helo aku sedang LiveData"
    }


    fun ubahTeks(){
        binding.btResult.setOnClickListener {
            if (binding.nilaiA > binding.nilaiB){
                _teks.value ="TIM A MENANG TIM B KALAH"
            }else if (binding.nilaiA < binding.nilaiB){
                _teks.value ="TIM A MENANG TIM B KALAH"
            }
        }
    }
}
