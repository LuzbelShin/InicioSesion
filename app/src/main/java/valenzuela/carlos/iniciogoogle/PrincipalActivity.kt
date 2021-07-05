package valenzuela.carlos.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            var tvName = findViewById(R.id.tv_name) as TextView
            tvName.setText(name)
            var tv_email = findViewById(R.id.tv_email) as TextView
            tv_email.setText(email)
        }

        var btn_cerrar = findViewById(R.id.btn_cerrar) as Button
        btn_cerrar.setOnClickListener{
            finish()
        }

    }
}