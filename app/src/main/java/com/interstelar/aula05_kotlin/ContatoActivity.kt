package com.interstelar.aula05_kotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.interstelar.aula05_kotlin.databinding.ActivityContatoBinding

class ContatoActivity : AppCompatActivity() {
    lateinit var binding: ActivityContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonIr.setOnClickListener {
            val msg = "${getString(R.string.nome)}: ${binding.name.text} ${getString(R.string.telefone)} ${binding.tel.text} ${getString(R.string.Email)} ${binding.email.text} Contato por Telefone: ${if (binding.checkTel.isChecked) "Sim" else "Nao"} Contato por Email: ${if(binding.checkEmail.isChecked) "Sim" else "Nao"}  "

            alert("Confirmacao", msg)
        }


    }

    fun alert(title: String, msg: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}