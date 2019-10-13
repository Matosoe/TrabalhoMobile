package br.com.fiap.trabalhomobile.ui.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.trabalhomobile.R
import br.com.fiap.trabalhomobile.ui.about.AboutActivity
import br.com.fiap.trabalhomobile.ui.delete.DeleteActivity
import br.com.fiap.trabalhomobile.ui.edit.EditActivity
import br.com.fiap.trabalhomobile.ui.insert.InsertActivity
import br.com.fiap.trabalhomobile.ui.list.ListActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btMenuInsert.setOnClickListener{
            startActivityForResult(
                Intent(this, InsertActivity::class.java),1)
        }

        btMenuList.setOnClickListener{
            startActivityForResult(
                Intent(this, ListActivity::class.java),1)
        }

        btMenuEdit.setOnClickListener{
            startActivityForResult(
                Intent(this, EditActivity::class.java),1)
        }

        btMenuDelete.setOnClickListener{
            startActivityForResult(
                Intent(this, DeleteActivity::class.java),1)
        }

        btMenuExit.setOnClickListener{
            finish()
        }

        btMenuAbout.setOnClickListener{
            startActivityForResult(
                Intent(this, AboutActivity::class.java),1)
        }
    }
}
