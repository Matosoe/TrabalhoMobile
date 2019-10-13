package br.com.fiap.trabalhomobile.ui.delete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.trabalhomobile.R
import kotlinx.android.synthetic.main.activity_delete.*
import kotlinx.android.synthetic.main.activity_menu.*

class DeleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        btDelete.setOnClickListener{
            //falta colocar a ação de deletar o item
            finish()
        }

        btBack.setOnClickListener{
            finish()
        }

    }

}
