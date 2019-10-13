package br.com.fiap.trabalhomobile.ui.insert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.trabalhomobile.R
import kotlinx.android.synthetic.main.activity_insert.*

class InsertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)

        btInsertInsert.setOnClickListener{
            finish()
        }
        btInsertBack.setOnClickListener{
            finish()
        }
    }
}
