package br.com.fiap.trabalhomobile.ui.delete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.trabalhomobile.R
import kotlinx.android.synthetic.main.activity_delete.*


class DeleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        btDeleteDelete.setOnClickListener{
            //falta colocar a ação de deletar o item
            finish()
        }

        btDeleteBack.setOnClickListener{
            finish()
        }

    }

}
