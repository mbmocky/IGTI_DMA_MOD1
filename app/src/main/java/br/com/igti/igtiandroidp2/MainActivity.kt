package br.com.igti.igtiandroidp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
const val EXTRA_MESSAGE = "br.com.igti.igtiandroidp2.MENSAGEM"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensgamem(view: View){
        Log.i("IGTI", "Método enviarMensagem chamado.")
        val editText = findViewById<EditText>(R.id.etMensagem)
        val mensagem = editText.text.toString()
        val intent = Intent(this, ExibirMensagemActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}