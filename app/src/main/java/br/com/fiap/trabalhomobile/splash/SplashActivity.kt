package br.com.fiap.trabalhomobile.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import br.com.fiap.trabalhomobile.R
import br.com.fiap.trabalhomobile.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashActivity : AppCompatActivity() {
    private val TEMPO_AGUARDO_SPLASHSCREEN = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }
    private fun carregar(){
    //carregar a animacao
    val anim = AnimationUtils.loadAnimation(this,R.anim.animacao_splash)
    anim.reset()
    ivLogo.clearAnimation()
    //Rodar a animacao
    ivLogo.startAnimation(anim)
    //Chamar a proxima tela apos 3,5 segundos da animacao
    Handler().postDelayed({
        val proximaTela = Intent(this@SplashActivity, LoginActivity::class.java)
        startActivity(proximaTela)
        finish()
    }, TEMPO_AGUARDO_SPLASHSCREEN)
}
}