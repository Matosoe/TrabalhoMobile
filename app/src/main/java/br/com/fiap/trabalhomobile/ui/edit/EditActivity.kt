package br.com.fiap.trabalhomobile.ui.edit

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.trabalhomobile.R
import kotlinx.android.synthetic.main.activity_edit.*


class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        btEditSave.setOnClickListener{
            //falta colocar a ação de salvar o item
            finish()
        }

        btEditBack.setOnClickListener{
            finish()
        }

    }
}
